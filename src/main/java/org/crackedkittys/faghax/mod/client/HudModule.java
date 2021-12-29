package org.crackedkittys.faghax.mod.client;

import net.minecraft.client.MinecraftClient;
import org.crackedkittys.faghax.hud.HUD;
import org.crackedkittys.faghax.mod.Category;
import org.crackedkittys.faghax.mod.Module;
import org.crackedkittys.faghax.ui.ClickGui;
import org.crackedkittys.faghax.util.ScreenUtil;
import org.lwjgl.glfw.GLFW;

public class HudModule extends Module {
    public HudModule() {
        super("Hud Module", "Shows the hud", Category.CLIENT, true);
        this.setKey(GLFW.GLFW_KEY_RIGHT_SHIFT);
        //this.setToggled(true);
    }

   /* public void onEnable() {
   if (!(mc.currentScreen instanceof HUD) && (ScreenUtil.isValidScreen())) {
        mc.openScreen(HUD.INSTANCE);
        assert mc.player != null;
    } else {
        this.onDisable();
    }
}

    public void onDisable() {
        if (mc.currentScreen instanceof HUD) {
            HUD.INSTANCE.onClose();
            assert mc.player != null;

        } else {
            if (ScreenUtil.isValidScreen()) {
                this.onEnable();
            }
        }
    }

    */
}
