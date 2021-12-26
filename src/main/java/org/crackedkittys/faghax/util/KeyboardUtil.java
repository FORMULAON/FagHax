package org.crackedkittys.faghax.util;

import net.minecraft.client.option.KeyBinding;
import org.crackedkittys.faghax.Main;
import org.crackedkittys.faghax.mod.Module;
import org.crackedkittys.faghax.mod.ModuleManager;
import org.lwjgl.glfw.GLFWKeyCallback;

import static org.lwjgl.glfw.GLFW.*;

public class KeyboardUtil {

    public static void KeyInputRegister(ModuleManager _ModManager, long _windowHandler) {
        // --- Keybind System ---
        // The current keybind system links directly into library calls for input
        // its slightly jank but wgaf

        GLFWKeyCallback newCall = new GLFWKeyCallback() {
            // Setting up invoke for the new call we want
            @Override
            public void invoke(long window, int key, int scancode, int action, int mods) {

                // Load all modules from the manager
                for (Module mod : _ModManager.mods) {
                    Main.log.info("Mod Registered: " + mod.getName());

                    if (key == mod.getKey() && action == GLFW_PRESS) {
                        if(mod.isToggleable()) {
                            mod.setToggled(!mod.getToggle());
                        } else {
                            mod.onEnable();
                        }

                    } else {
                        // Update states outside of hooked keys
                        KeyBinding.updatePressedStates();
                    }
                }

                // Spit out that a key has been registered
                Main.log.info("  - Mod Key Registered");
            }
        };

        // Fetching the default minecraft calls
        GLFWKeyCallback oldCall = glfwSetKeyCallback(_windowHandler, newCall);

        // Applying both calls in a new callback
        GLFWKeyCallback mergeCall = new GLFWKeyCallback() {
            @Override
            public void invoke(long window, int key, int scancode, int action, int mods) {
                if(oldCall != null)
                    oldCall.invoke(window, key, scancode, action, mods);
                    newCall.invoke(window, key, scancode, action, mods);
            }
        };

        // Assigning the final callback configuration
        glfwSetKeyCallback(_windowHandler, mergeCall);
    }
}
