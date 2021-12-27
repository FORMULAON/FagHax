package org.crackedkittys.faghax;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.client.MinecraftClient;
import org.crackedkittys.faghax.util.KeyboardUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.crackedkittys.faghax.mod.ModuleManager;

public class Main implements ModInitializer {
    public static final Logger log = LogManager.getLogger("FagHax");
    public static final MinecraftClient mc = MinecraftClient.getInstance();

    @Override
    public void onInitialize() {
        // --- On World / Server start ---
        // --- Tick Events ---
        ClientTickEvents.END_CLIENT_TICK.register(client -> {

        });
    }
}