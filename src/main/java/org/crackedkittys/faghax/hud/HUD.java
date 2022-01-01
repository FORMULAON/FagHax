package org.crackedkittys.faghax.hud;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.resource.ResourceIndex;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.resource.Resource;
import net.minecraft.resource.ResourceManager;
import net.minecraft.text.Text;
import org.crackedkittys.faghax.Main;
import org.crackedkittys.faghax.mod.Module;
import org.crackedkittys.faghax.mod.ModuleManager;

import static org.crackedkittys.faghax.Main.mc;

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

            float h = mc.getWindow().getScaledHeight();
            float w = mc.getWindow().getScaledWidth();

            // Drawing FagHax String
            tr.drawWithShadow(new MatrixStack(), "FagHax v0.0.1", 3.0f, 3.0f, 0xff00ff);
            float y = 3.0f;

            // Drawing Coordinates
            tr.drawWithShadow(new MatrixStack(), formatLocation(), 3.0f, h - 10.5f, 0xff00ff);

            // Drawing mod arraylist
            for (Module m : modMan.getMods()) {
                if (m.getToggle()) {
                    tr.drawWithShadow(new MatrixStack(), m.getName(), w - 65.0f, y, 0xffffff);
                    //TODO somehow figure out how to align this stuff better.
                    y += 10;
                }
            }
        });
    }

    // Formatting coordinates so that it looks good.
    private String formatLocation() {
        double x = MinecraftClient.getInstance().player.getX();
        double y = MinecraftClient.getInstance().player.getY();
        double z = MinecraftClient.getInstance().player.getZ();

        int xI = (int) x;
        int yI = (int) y;
        int zI = (int) z;

        return "(" + xI + ", " + yI + ", " + zI + ")";
    }
}
