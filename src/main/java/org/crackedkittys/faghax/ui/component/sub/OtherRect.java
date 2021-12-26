package org.crackedkittys.faghax.ui.component.sub;

import net.minecraft.client.util.math.MatrixStack;
import org.crackedkittys.faghax.ui.component.Component;
import org.crackedkittys.faghax.util.RenderUtil;

public class OtherRect extends Component {

    @Override
    public void renderComponent(MatrixStack matrices) {
        RenderUtil.drawRect(20, 54, 40, 40, 0xff00ff, 1.0f);
    }
}
