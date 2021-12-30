package org.crackedkittys.faghax.mod.client;

import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;
import org.crackedkittys.faghax.mod.Category;
import org.crackedkittys.faghax.mod.Module;
import org.crackedkittys.faghax.ui.ClickGui;
import org.crackedkittys.faghax.util.ScreenUtil;

public class ClickGuiModule extends Module {

    public ClickGuiModule() {
        super("Click Gui!", "Enabled the ClickGui", Category.CLIENT, true);
        this.setKey(89);
        ClickGui.INSTANCE.registerClose(() -> {
            this.setToggled(false);
            MinecraftClient.getInstance().player.sendMessage(Text.of("IS OFF FAG"), false);

        });
    }

    @Override
    public void onEnable() {
        if (!(mc.currentScreen instanceof ClickGui) && (ScreenUtil.isValidScreen())) {
            mc.openScreen(ClickGui.INSTANCE);
            assert mc.player != null;
        } else {
            this.onDisable();
        }
    }

    @Override
    public void onDisable() {
        if (mc.currentScreen instanceof ClickGui) {
            ClickGui.INSTANCE.onClose();

        } else {
            /*if (ScreenUtil.isValidScreen()) {
                this.onEnable();

             */
        }
    }
}
