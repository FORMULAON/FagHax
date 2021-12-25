package org.crackedkittys.faghax.mod.client;

import org.crackedkittys.faghax.mod.Category;
import org.crackedkittys.faghax.mod.Module;
import org.crackedkittys.faghax.ui.ClickGui;
import org.lwjgl.glfw.GLFW;

public class ClickGuiModule extends Module {
    public ClickGuiModule() {
        super("Click Gui!", "Enabled the ClickGui", Category.CLIENT, GLFW.GLFW_KEY_Y);
    }

    public void onEnable() {
        mc.openScreen(ClickGui.INSTANCE);
        assert mc.player != null;
        mc.player.sendChatMessage("test");
    }
}
