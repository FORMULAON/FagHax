package org.crackedkittys.faghax.ui;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import org.crackedkittys.faghax.ui.component.Component;
import org.crackedkittys.faghax.ui.component.NewFrame;
import org.crackedkittys.faghax.util.RenderUtil;

import static org.crackedkittys.faghax.Main.mc;

public class ClickGui extends Screen {
    public static ClickGui INSTANCE = new ClickGui(Text.of("ClickGui Screen"));
    NewFrame nf = new NewFrame();
    protected ClickGui(Text title) {
        super(title);
    }

    @Override
    public void init(MinecraftClient client, int width, int height) {
        super.init(client, width, height);
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        super.render(matrices, mouseX, mouseY, delta);
        this.renderBackground(matrices);
        RenderUtil.drawRect(20, 20, 20, 20, 0xff00ff, 0.5f);
        this.fillGradient(matrices, 90, 90, 10, 10, 0xff00ff, 0xff00ff);

        for (Component c : nf.getComponents()) { // rendering all components
            c.renderComponent(matrices);
            if (isMouseOver(mouseX, mouseY)) {
                mc.player.sendMessage(Text.of("You are over component"), false);
            }
        }

        matrices.pop();
    }

    @Override
    public void onClose() {
        super.onClose();
    }
}
