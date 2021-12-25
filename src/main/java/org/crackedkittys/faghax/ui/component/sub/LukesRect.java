package org.crackedkittys.faghax.ui.component.sub;

import org.crackedkittys.faghax.ui.component.Component;
import org.crackedkittys.faghax.util.RenderUtil;

public class LukesRect extends Component {

    @Override
    public void renderComponent() {
        super.renderComponent();
        RenderUtil.drawRect(40, 40, 90, 200, 0x87b2d5, 0.35f);
    }
}
