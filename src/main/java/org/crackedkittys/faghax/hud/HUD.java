package org.crackedkittys.faghax.hud;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.util.math.MatrixStack;

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
    public void register() {
        HudRenderCallback.EVENT.register((matrixStack, tickDelta) ->
        {
            TextRenderer tr = MinecraftClient.getInstance().textRenderer;

            tr.drawWithShadow(new MatrixStack(), "FagHax 0.0.1", 3.0f, 3.0f, 0xff00ff);
        });
    }
}
