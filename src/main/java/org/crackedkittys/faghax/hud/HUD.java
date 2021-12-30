package org.crackedkittys.faghax.hud;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.util.math.MatrixStack;
import org.crackedkittys.faghax.mod.Module;
import org.crackedkittys.faghax.mod.ModuleManager;

public class HUD {
    /*public static HUD INSTANCE = new HUD();

    public HUD() {
        super(MinecraftClient.getInstance());
    }

    public TextRenderer getTr() {
        return MinecraftClient.getInstance().textRenderer;
    }

    public void render(MatrixStack matrices, float tickDelta) {
        getTr().drawWithShadow(matrices, "FagHax v0.0.1", 3.0f, 3.0f, 0xff00ff);
    }

     */
    public void register(ModuleManager modMan) {
        HudRenderCallback.EVENT.register((matrixStack, tickDelta) -> {
            TextRenderer tr = MinecraftClient.getInstance().textRenderer;

            tr.drawWithShadow(new MatrixStack(), "FagHax\r\n v0.0.1", 3.0f, 3.0f, 0xff00ff);
            float y = 3.0f;

            for (Module m : modMan.mods ) {
                if (m.getToggle()) {
                    tr.drawWithShadow(new MatrixStack(), m.getName(), 350.0f, y, 0xff0000);
                    y += 10;
                }
            }
        });
    }
}
