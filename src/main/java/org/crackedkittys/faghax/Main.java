package org.crackedkittys.faghax;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.event.server.ServerStartCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.LiteralText;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.crackedkittys.faghax.ui.ClickGui;
import org.lwjgl.*;
import org.lwjgl.glfw.GLFW;

import static org.lwjgl.glfw.GLFW.*;



public class Main implements ModInitializer {
    public static KeyBinding keyBinding;
    public static final Logger log = LogManager.getLogger("FagHax");
    protected static final MinecraftClient mc = MinecraftClient.getInstance();
    long window;

    public void keyInput(){
        glfwSetKeyCallback(window, (window, key, scancode, action, mods) -> {
            log.info("Key Pressed = " + key);
            if (key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE )
                glfwSetWindowShouldClose(window, true); // We will detect this n the rendering loop
        });
    }

    @Override
    public void onInitialize() {
        keyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "",
                InputUtil.Type.KEYSYM,
                org.lwjgl.glfw.GLFW.GLFW_KEY_Y,
                "hidden"
        ));

        // Random dumb fucking key input function that probably won't even work.


        ServerLifecycleEvents.SERVER_STARTED.register(client -> {
            log.info("WOW FAGHAX IS BULLSHIT");
            window = MinecraftClient.getInstance().getWindow().getHandle();
            keyInput();
        });
//

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (keyBinding.wasPressed()) {
                assert client.player != null;
                client.player.sendMessage(new LiteralText("Enabled ClickGui!"), false);
                mc.openScreen(ClickGui.INSTANCE);
            }
        });
    }
}
