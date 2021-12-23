package org.crackedkittys.faghax;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.LiteralText;
import org.crackedkittys.faghax.ui.ClickGui;
import org.lwjgl.*;
import org.lwjgl.glfw.GLFW;

import static org.lwjgl.glfw.GLFW.*;



public class Main implements ModInitializer {
    public static KeyBinding keyBinding;
    protected static final MinecraftClient mc = MinecraftClient.getInstance();

   /* public void keyInput(){
        long window = MinecraftClient.getInstance().getWindow().getHandle();

        glfwSetKeyCallback(window, (window, key, scancode, action, mods) -> {
            if ( key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE )
                glfwSetWindowShouldClose(window, true); // We will detect this n the rendering loop
        });
    }
    */
    @Override
    public void onInitialize() {
        keyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.example.test",
                InputUtil.Type.KEYSYM,
                org.lwjgl.glfw.GLFW.GLFW_KEY_Y,
                "test"
        ));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (keyBinding.wasPressed()) {
                assert client.player != null;
                client.player.sendMessage(new LiteralText("Enabled ClickGui!"), false);
                mc.openScreen(ClickGui.INSTANCE);
            }
        });
    }
}
