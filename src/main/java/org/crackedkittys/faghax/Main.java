package org.crackedkittys.faghax;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.crackedkittys.faghax.mod.Module;
import org.crackedkittys.faghax.mod.ModuleManager;
import org.crackedkittys.faghax.mod.client.ClickGuiModule;
import org.lwjgl.glfw.GLFWKeyCallback;

import static org.lwjgl.glfw.GLFW.*;

public class Main implements ModInitializer {
    public static final Logger log = LogManager.getLogger("FagHax");
    public static final MinecraftClient mc = MinecraftClient.getInstance();
    public ModuleManager modman = new ModuleManager();``
    long window;

    public void keyInput(ModuleManager _modman) { // Keybind system ig


        GLFWKeyCallback newCall = new GLFWKeyCallback() {
            @Override
            public void invoke(long window, int key, int scancode, int action, int mods) {
                oldCall.invoke(window, key, scancode, action, mods);
                for (Module mod : _modman.mods) {
                    log.info("Mod Registered: " + mod.getName());
                    if (key == mod.getKey() && action == 1) {
                        log.info("ACTION = " + key);
                        log.info("correct");
                        mod.KeyAction();

                        if (mod.getToggle()) {
                            mod.setToggled(false);
                        } else {
                            mod.setToggled(true);
                        }
                    } else {
                        log.info("You pressed: " + key);
                        KeyBinding.updatePressedStates();
                    }
                }

                log.info("  - Mod Key Registered");
            }
        };
        oldCall = glfwSetKeyCallback(window, newCall);
    }

    @Override
    public void onInitialize() {
        ClickGuiModule click = new ClickGuiModule();

        ServerLifecycleEvents.SERVER_STARTED.register(client -> {
            window = MinecraftClient.getInstance().getWindow().getHandle();
            keyInput(modman);

            // Random dumb fucking key input function that probably won't even work.
            log.info("WOW FAGHAX IS GREAT");
        });

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
        });
    }
}