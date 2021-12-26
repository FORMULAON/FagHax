package org.crackedkittys.faghax.util;

import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.CraftingScreen;
import net.minecraft.client.gui.screen.ingame.CreativeInventoryScreen;
import net.minecraft.client.gui.screen.ingame.ShulkerBoxScreen;

import static org.crackedkittys.faghax.Main.mc;

public class ScreenUtil {
    private Screen ChatScreen;
    private final Screen chat = null;

    public static boolean isValidScreen() { // Checking to make sure the clickgui screen is not interrupting something else.
        assert mc.player != null;
        return (mc.player.getEntityWorld() != null)
                && !(mc.currentScreen instanceof ChatScreen)
                && !(mc.currentScreen instanceof CraftingScreen)
                && !(mc.currentScreen instanceof ShulkerBoxScreen)
                && !(mc.currentScreen instanceof CreativeInventoryScreen);
    }
}
