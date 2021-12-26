package org.crackedkittys.faghax.mod.client;

import org.crackedkittys.faghax.mod.Category;
import org.crackedkittys.faghax.mod.Module;
import org.crackedkittys.faghax.ui.ClickGui;

public class ClickGuiModule extends Module {
    public ClickGuiModule() {
        super("Click Gui!", "Enabled the ClickGui", Category.CLIENT);
        this.setKey(89);
    }

    public void onEnable() {
        mc.openScreen(ClickGui.INSTANCE);
        assert mc.player != null;
        mc.player.sendChatMessage("enabling clickgui");
    }

    public void onDisable() {
        ClickGui.INSTANCE.onClose();
        assert mc.player != null;
        mc.player.sendChatMessage("closing");
    }
}
