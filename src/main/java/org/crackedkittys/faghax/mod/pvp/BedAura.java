package org.crackedkittys.faghax.mod.pvp;

import org.crackedkittys.faghax.mod.Category;
import org.crackedkittys.faghax.mod.Module;
import org.lwjgl.glfw.GLFW;

public class BedAura extends Module {

    public BedAura() {
        super("Bed Aura!", "Does bed shit", Category.PVP, true);
        this.setKey(GLFW.GLFW_KEY_B);

    }
}
