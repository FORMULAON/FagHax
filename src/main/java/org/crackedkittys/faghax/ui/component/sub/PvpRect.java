package org.crackedkittys.faghax.ui.component.sub;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import org.crackedkittys.faghax.ui.component.Component;
import org.crackedkittys.faghax.ui.component.NewFrame;
import org.crackedkittys.faghax.util.RenderUtil;

public class PvpRect extends Component {

    public PvpRect() {
        super(3.0, 3.0);
    }

    @Override
    public void renderComponent(MatrixStack matrices) { // Drawing rectangle
        RenderUtil.drawRect(40, 40, 90, 200, 0x87b2d5, 0.35f);
        //DrawableHelper.fill(matrices, 40, 40, 90, 200, 0x87b2d5);
        matrices.push();
    }
}
