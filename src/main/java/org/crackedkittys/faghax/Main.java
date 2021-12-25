package org.crackedkittys.faghax;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.client.MinecraftClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.crackedkittys.faghax.mod.Module;
import org.crackedkittys.faghax.mod.ModuleManager;

import static org.lwjgl.glfw.GLFW.*;

public class Main implements ModInitializer {

    public static final Logger log = LogManager.getLogger("FagHax");
    protected static final MinecraftClient mc = MinecraftClient.getInstance();
    public ModuleManager modman = new ModuleManager();
    long window;

    public void keyInput(Module modRef) { // Keybind system ig
        glfwSetKeyCallback(window, (window, key, scancode, action, mods) -> {

            if (key == modRef.getKey() && action == GLFW_PRESS){
                log.info("ACTION = " + key);
                modRef.onEnable();
            } // We will detect this n the rendering loop
        });
    }

    @Override
    public void onInitialize() {

        ServerLifecycleEvents.SERVER_STARTED.register(client -> {
            for (Module mod : modman.mods) {
                keyInput(mod);
            }

            // Random dumb fucking key input function that probably won't even work.
            log.info("WOW FAGHAX IS GREAT");

            window = MinecraftClient.getInstance().getWindow().getHandle();
        });
    }
}
