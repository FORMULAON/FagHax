package org.crackedkittys.faghax.util;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import org.crackedkittys.faghax.ui.component.Component;
import org.crackedkittys.faghax.ui.component.sub.Rect;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;

import java.util.ArrayList;

public class RenderUtil {

    public static void drawRect(float x, float y, float w, float h, int color, float alpha) { // TODO rewrite
        float red = (float) (color >> 16 & 255) / 255.0F;
        float green = (float) (color >> 8 & 255) / 255.0F;
        float blue = (float) (color & 255) / 255.0F;


        final Tessellator tessellator = Tessellator.getInstance();
        final BufferBuilder bufferbuilder = tessellator.getBuffer();

        GlStateManager.enableBlend();
        GlStateManager.disableTexture();
        GlStateManager.blendFuncSeparate(770, 771, 1, 0);

        bufferbuilder.begin(7, VertexFormats.POSITION_COLOR);
        bufferbuilder.vertex((double) w+x, (double) y+h, 0.0D).color(red, green, blue, alpha).next();
        bufferbuilder.vertex((double) w+x, (double) y, 0.0D).color(red, green, blue, alpha).next();
        bufferbuilder.vertex((double) x, (double) y, 0.0D).color(red, green, blue, alpha).next();
        bufferbuilder.vertex((double) x, (double) y+h, 0.0D).color(red, green, blue, alpha).next();

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

    public static void drawOutline(Rect i, ArrayList<Component> list, float size, int color) { // Draws outline
        list.add(new Rect(i.x - size,  i.y - size, i.w + size * 2, size, color, 1));
        list.add(new Rect(i.x - size,  i.y, size, i.h, color, 1));
        list.add(new Rect(i.x + i.w,  i.y, size, i.h, color, 1));
        list.add(new Rect(i.x - size,  i.y + i.h, i.w + size * 2, size, color, 1));
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
