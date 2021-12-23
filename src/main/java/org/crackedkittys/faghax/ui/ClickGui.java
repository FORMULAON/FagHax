package org.crackedkittys.faghax.ui;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;

public class ClickGui extends Screen {
    public static ClickGui INSTANCE = new ClickGui(Text.of("ClickGui Screen"));
    protected ClickGui(Text title) {
        super(title);
    }

    @Override
    public void init(MinecraftClient client, int width, int height) {
        super.init(client, width, height);
        assert client.player != null;
        client.player.sendMessage(new LiteralText("From Init"), false);
    }

    @Override
    public boolean isPauseScreen() {
        return true;
    }

    @Override
    public void renderBackground(MatrixStack matrices) {
        super.renderBackground(matrices);
    }
}
