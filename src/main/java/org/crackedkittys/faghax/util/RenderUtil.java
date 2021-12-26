package org.crackedkittys.faghax.util;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;

public class RenderUtil {

    public static void drawRect(float x, float y, float w, float h, int color, float alpha) {
        float red = (float) (color >> 16 & 255) / 255.0F;
        float green = (float) (color >> 8 & 255) / 255.0F;
        float blue = (float) (color & 255) / 255.0F;

        final Tessellator tessellator = Tessellator.getInstance();
        final BufferBuilder bufferbuilder = tessellator.getBuffer();

        GlStateManager.enableBlend();
        GlStateManager.disableTexture();
        GlStateManager.blendFuncSeparate(770, 771, 1, 0);


        bufferbuilder.begin(7, VertexFormats.POSITION_COLOR);
        bufferbuilder.vertex((double) x, (double) h, 0.0D).color(red, green, blue, alpha).next();
        bufferbuilder.vertex((double) w, (double) h, 0.0D).color(red, green, blue, alpha).next();
        bufferbuilder.vertex((double) w, (double) y, 0.0D).color(red, green, blue, alpha).next();
        bufferbuilder.vertex((double) x, (double) y, 0.0D).color(red, green, blue, alpha).next();

        /*
        alpha = 0.5f;
        bufferbuilder1.begin(7, VertexFormats.POSITION_COLOR);
        bufferbuilder1.vertex((double) x, (double) h, 0.0D).color(red, green, blue, alpha).next();
        bufferbuilder1.vertex((double) w, (double) h, 0.0D).color(red, green, blue, alpha).next();
        bufferbuilder1.vertex((double) w, (double) y, 0.0D).color(red, green, blue, alpha).next();
        bufferbuilder1.vertex((double) x, (double) y, 0.0D).color(red, green, blue, alpha).next();
        bufferbuilder1.vertex((double) x+5, (double) h+5, 0.0D).color(red, green, blue, alpha).next();
        bufferbuilder1.vertex((double) w-5, (double) h+5, 0.0D).color(red, green, blue, alpha).next();
        bufferbuilder1.vertex((double) w-5, (double) y-5, 0.0D).color(red, green, blue, alpha).next();
        bufferbuilder1.vertex((double) x+5, (double) y-5, 0.0D).color(red, green, blue, alpha);
         */

        tessellator.draw();
        GlStateManager.enableTexture();
        GlStateManager.disableBlend();
    }


    public static void drawRect(float x, float y, float w, float h, int color, float alpha, float outlineThickness) {
        float red = (float) (color >> 16 & 255) / 255.0F;
        float green = (float) (color >> 8 & 255) / 255.0F;
        float blue = (float) (color & 255) / 255.0F;

        final Tessellator tessellator = Tessellator.getInstance();
        final BufferBuilder bufferbuilderOutline = tessellator.getBuffer();
        final BufferBuilder bufferbuilder = tessellator.getBuffer();

        GlStateManager.enableBlend();
        GlStateManager.disableTexture();
        GlStateManager.blendFuncSeparate(770, 771, 1, 0);

        bufferbuilder.begin(7, VertexFormats.POSITION_COLOR);
        bufferbuilder.vertex((double) x, (double) h, 0.0D).color(red, green, blue, alpha).next();
        bufferbuilder.vertex((double) w, (double) h, 0.0D).color(red, green, blue, alpha).next();
        bufferbuilder.vertex((double) w, (double) y, 0.0D).color(red, green, blue, alpha).next();
        bufferbuilder.vertex((double) x, (double) y, 0.0D).color(red, green, blue, alpha).next();

        tessellator.draw();
        GlStateManager.enableTexture();
        GlStateManager.disableBlend();
    }
}
