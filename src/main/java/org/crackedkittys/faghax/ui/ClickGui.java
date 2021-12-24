package org.crackedkittys.faghax.ui;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import org.crackedkittys.faghax.ui.component.Component;
import org.crackedkittys.faghax.ui.component.NewFrame;
import org.crackedkittys.faghax.util.RenderUtil;

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
        return false;
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        super.render(matrices, mouseX, mouseY, delta);
        this.renderBackground(matrices);
        this.textRenderer.drawWithShadow(matrices, "FagHax", 5, 5, 0xff00ff);
        //this.drawTexture(matrices, 45, 40, 5,5, 40, 110);
        RenderUtil.drawRect(40, 40, 90, 200, 0x87b2d5, 0.35f);

        //for (Component c : NewFrame.getC)
    }
}
