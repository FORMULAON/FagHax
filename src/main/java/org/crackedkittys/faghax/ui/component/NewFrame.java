package org.crackedkittys.faghax.ui.component;

import org.crackedkittys.faghax.ui.component.sub.Rect;
import org.crackedkittys.faghax.ui.component.sub.Watermark;
import org.crackedkittys.faghax.util.RenderUtil;

import java.util.ArrayList;
import java.util.Collections;

public class NewFrame {

    public ArrayList<Component> components;

    public NewFrame() { //component registries
        this.components = new ArrayList<>();
        // Component add
        components.add(new Rect(40, 40, 55, 150, 0x00ffff, 0.35f));
        RenderUtil.drawOutline((Rect) getComponents().get(0), this.components, 1.5f, 0x0);
        components.add(new Watermark());

    }

    public ArrayList<Component> getComponents() {
        return components;
    }
}
