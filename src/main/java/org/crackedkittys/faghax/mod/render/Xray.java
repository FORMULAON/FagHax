package org.crackedkittys.faghax.mod.render;

import org.crackedkittys.faghax.mod.Category;
import org.crackedkittys.faghax.mod.Module;
import org.lwjgl.glfw.GLFW;

public class Xray extends Module {
    public Xray() {
        super("Xray!", "Shows some goods!", Category.RENDER, false);
        this.setKey(GLFW.GLFW_KEY_X);
    }

    @Override
    public void onEnable() {
        assert mc.player != null;
        mc.player.sendChatMessage(this.getName());
    }
}
