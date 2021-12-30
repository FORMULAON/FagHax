package org.crackedkittys.faghax.ui.component.sub;

import net.minecraft.client.util.math.MatrixStack;
import org.crackedkittys.faghax.ui.component.Component;
import org.crackedkittys.faghax.util.RenderUtil;

public class Rect extends Component {
    public float x;
    public float y;
    public float w;
    public float h;
    public int color;
    public float alpha;


    public Rect(float x, float y, float w, float h, int color, float alpha) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.color = color;
        this.alpha = alpha;
    }



    @Override
    public void renderComponent(MatrixStack matrices) { // Drawing rectangle
        RenderUtil.drawRect(x, y, w, h, color, alpha);
        matrices.push();
    }
}
