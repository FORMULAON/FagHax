package org.crackedkittys.faghax.mod.misc;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import org.crackedkittys.faghax.mod.Category;
import org.crackedkittys.faghax.mod.Module;
import org.lwjgl.glfw.GLFW;

public class Suffix extends Module {

    public Suffix() {
        super("SuffixModule", "enables suffix in chat", Category.MISC, true);
        this.setKey(GLFW.GLFW_KEY_Z);
    }

    public void onEnable() {
    }
}
