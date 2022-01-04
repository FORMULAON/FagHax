package org.crackedkittys.faghax.mod.render;

import net.minecraft.client.render.WorldRenderer;
import org.crackedkittys.faghax.mod.Category;
import org.crackedkittys.faghax.mod.Module;
import org.lwjgl.glfw.GLFW;

public class Xray extends Module {
    public Xray() {
        super("Xray!", "Shows some goods!", Category.RENDER, true);
        this.setKey(GLFW.GLFW_KEY_X);
    }

    @Override
    public void onEnable() {//
        assert mc.player != null;
    }


    public void Render() {
    }
}
