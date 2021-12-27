package org.crackedkittys.faghax.util;

import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.CraftingScreen;
import net.minecraft.client.gui.screen.ingame.CreativeInventoryScreen;
import net.minecraft.client.gui.screen.ingame.ShulkerBoxScreen;
import org.crackedkittys.faghax.ui.ClickGui;

import static org.crackedkittys.faghax.Main.log;
import static org.crackedkittys.faghax.Main.mc;

public class ScreenUtil {
    private Screen ChatScreen;
    private final Screen chat = null;

    public static boolean isValidScreen() {
        log.info("Screen is:" + mc.currentScreen);
        // Checking to make sure the clickgui screen is not interrupting something else.
        return (mc.currentScreen == null);
    }
}
