package org.crackedkittys.faghax.ui.component.sub;

import net.minecraft.client.util.math.MatrixStack;
import org.crackedkittys.faghax.ui.component.Component;
import org.crackedkittys.faghax.util.RenderUtil;

public class PvpRect extends Component {

    @Override
    public void renderComponent(MatrixStack matrices) {
        RenderUtil.drawRect(40, 40, 90, 200, 0x87b2d5, 0.35f);
    }
}
