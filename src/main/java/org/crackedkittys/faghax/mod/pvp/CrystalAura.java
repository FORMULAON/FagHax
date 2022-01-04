package org.crackedkittys.faghax.mod.pvp;

import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import org.crackedkittys.faghax.mod.Category;
import org.crackedkittys.faghax.mod.Module;
import org.lwjgl.glfw.GLFW;

public class CrystalAura extends Module {
    public CrystalAura() {
        super("Crystal Aura!", "Auto Destroys Crystals", Category.PVP, true);
        this.setKey(GLFW.GLFW_KEY_C);
    }

    public void onEnable() {
        crystalPlace();

    }

    public void crystalPlace() {
        UseEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            player.sendMessage(Text.of("Test"), false);

            return ActionResult.PASS;
        });
    }
}
