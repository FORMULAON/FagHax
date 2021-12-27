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

public class ClickGui extends Screen {
    public static ClickGui INSTANCE = new ClickGui(Text.of("ClickGui Screen"));
    NewFrame nf = new NewFrame();
    protected ClickGui(Text title) {
        super(title);
    }

    @Override
    public void init(MinecraftClient client, int width, int height) {//
        super.init(client, width, height);
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        super.render(matrices, mouseX, mouseY, delta);
        this.renderBackground(matrices);
        RenderUtil.drawRect(20, 20, 20, 20, 0xff00ff, 0.5f);

        for (Component c : nf.getComponents()) { // rendering all components
            c.renderComponent(matrices);
        }

        matrices.pop();
    }

    @Override
    public void onClose() {
        super.onClose();
    }
}
