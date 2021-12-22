package org.crackedkittys.faghax;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;
import org.lwjgl.*;

import static org.lwjgl.glfw.GLFW.*;

public class Main implements ModInitializer {

    public void keyInput(){
        long window = MinecraftClient.getInstance().getWindow().getHandle();

        glfwSetKeyCallback(window, (window, key, scancode, action, mods) -> {
            if ( key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE )
                glfwSetWindowShouldClose(window, true); // We will detect this n the rendering loop
        });
    }

    @Override
    public void onInitialize() {
        for (int i=32; i < keys.length; i++) {
            if (keys[i] != (GLFW.glfwGetKey(MinecraftClient.getInstance().getWindow().getHandle(), i) == GLFW.GLFW_PRESS)) {
                keys[i] = !keys[i];
                if (keys[i]) {
                    if (i == ClickGUIModule.keybind.getKey()) {
                        if (Utils.isWrongScreen()) {
                            MinecraftClient mc = MinecraftClient.getInstance();
                            if (mc != null) {
                                gui.enterGUI();
                            }
                        }
                    }

                    if (i==HUDEditorModule.keybind.getKey()) gui.enterHUDEditor();
                    gui.handleKeyEvent(i);
                }
            }
        }
    }
}
