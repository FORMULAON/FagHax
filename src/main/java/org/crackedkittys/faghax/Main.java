package org.crackedkittys.faghax;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.client.MinecraftClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.crackedkittys.faghax.mod.Module;
import org.crackedkittys.faghax.mod.ModuleManager;
import org.crackedkittys.faghax.mod.client.ClickGuiModule;

import static org.lwjgl.glfw.GLFW.*;

public class Main implements ModInitializer {

    public static final Logger log = LogManager.getLogger("FagHax");
    protected static final MinecraftClient mc = MinecraftClient.getInstance();
    public ModuleManager modman = new ModuleManager();
    long window;

    public void keyInput(Module modRef) { // Keybind system ig
        glfwSetKeyCallback(window, (window, key, scancode, action, mods) -> {


            if (key == modRef.getKey() && action == 1) {
                log.info("ACTION = " + key);
                log.info("correct");
                modRef.KeyAction();
                modRef.onEnable();
            } else {
                log.info("no");
                log.info("ACTION = " + key);
                log.info(action);
            }
        });
    }

    @Override
    public void onInitialize() {
        ClickGuiModule click = new ClickGuiModule();

        ServerLifecycleEvents.SERVER_STARTED.register(client -> {
            window = MinecraftClient.getInstance().getWindow().getHandle();
            for (Module mod : modman.mods) {
                keyInput(click);
            }

            // Random dumb fucking key input function that probably won't even work.
            log.info("WOW FAGHAX IS GREAT");
        });
    }
}
