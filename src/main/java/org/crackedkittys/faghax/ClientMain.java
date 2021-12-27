package org.crackedkittys.faghax;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import org.crackedkittys.faghax.mod.ModuleManager;
import org.crackedkittys.faghax.util.KeyboardUtil;

import java.util.concurrent.atomic.AtomicBoolean;

public class ClientMain implements ClientModInitializer {
    public ModuleManager modMan = new ModuleManager();
    long window;

    @Override
    public void onInitializeClient()
    {
        AtomicBoolean hasInitialized = new AtomicBoolean(false);
        ClientTickEvents.START_CLIENT_TICK.register(client ->
                {
                    if(!hasInitialized.get()) {
                        hasInitialized.set(true);
                        // Get the minecraft window handler for later calls to glfw
                        window = MinecraftClient.getInstance().getWindow().getHandle();

                        // Register KeyboardInput
                        KeyboardUtil.KeyInputRegister(modMan, window);
                    }
                }
        );

    }




}
