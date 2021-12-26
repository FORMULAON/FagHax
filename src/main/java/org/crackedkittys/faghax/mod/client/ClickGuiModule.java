package org.crackedkittys.faghax.mod.client;

import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.ingame.CraftingScreen;
import net.minecraft.client.gui.screen.ingame.ShulkerBoxScreen;
import org.crackedkittys.faghax.Main;
import org.crackedkittys.faghax.mod.Category;
import org.crackedkittys.faghax.mod.Module;
import org.crackedkittys.faghax.ui.ClickGui;
import org.crackedkittys.faghax.util.ScreenUtil;

public class ClickGuiModule extends Module {
    public ClickGuiModule() {
        super("Click Gui!", "Enabled the ClickGui", Category.CLIENT, true);
        this.setKey(89);
    }

    public void onEnable() {
        if (!(mc.currentScreen instanceof ClickGui) && (ScreenUtil.isValidScreen())) {
            mc.openScreen(ClickGui.INSTANCE);
            assert mc.player != null;
            mc.player.sendChatMessage("enabling clickgui");
        } else {
            this.onDisable();
        }
    }

    public void onDisable() {
        if (mc.currentScreen instanceof ClickGui) {
            ClickGui.INSTANCE.onClose();
            assert mc.player != null;
            mc.player.sendChatMessage("closing");
        } else {
            this.onEnable();
        }
    }
}
