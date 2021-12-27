package org.crackedkittys.faghax.mod.movement;

import net.minecraft.client.option.KeyBinding;
import net.minecraft.text.Text;
import org.crackedkittys.faghax.mod.Category;
import org.crackedkittys.faghax.mod.Module;
import org.lwjgl.glfw.GLFW;

public class AutoSprint extends Module {

    public AutoSprint() {
        super("Auto Sprint!", "Makes you go speedy", Category.MOVEMENT, true);
        this.setKey(GLFW.GLFW_KEY_B);
    }

    public void onEnable() {
        KeyBinding.setKeyPressed(mc.options.keySprint.getDefaultKey(), true);
        mc.player.sendMessage(Text.of("Enabled AutoSprint"), false);
    }

    public void onDisable() {
        KeyBinding.setKeyPressed(mc.options.keySprint.getDefaultKey(), false);
        mc.player.sendMessage(Text.of("Disabled AutoSprint"), false);
    }
}
