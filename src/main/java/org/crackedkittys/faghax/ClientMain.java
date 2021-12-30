package org.crackedkittys.faghax;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.gui.screen.Overlay;
import org.crackedkittys.faghax.hud.HUD;
import org.crackedkittys.faghax.mod.ModuleManager;
import org.crackedkittys.faghax.ui.ClickGui;
import org.crackedkittys.faghax.util.KeyboardUtil;
import org.crackedkittys.faghax.util.ScreenUtil;

import java.util.concurrent.atomic.AtomicBoolean;

import static org.crackedkittys.faghax.Main.mc;

public class ClientMain implements ClientModInitializer {
    public ModuleManager modMan = new ModuleManager();
    private HUD hud;
    long window;

    @Override
    public void onInitializeClient() {
        AtomicBoolean hasInitialized = new AtomicBoolean(false);
        ClientTickEvents.START_CLIENT_TICK.register(client -> {
                    if(!hasInitialized.get()) {
                        hasInitialized.set(true);

                        // Get the minecraft window handler for later calls to glfw;
                        window = MinecraftClient.getInstance().getWindow().getHandle();

                        // Register HUD;
                        hud = new HUD();
                        hud.register(modMan);

                        // Register KeyboardInput;
                        KeyboardUtil.KeyInputRegister(modMan, window);

                    }
                }
        );

    }




}
