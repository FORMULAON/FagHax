package org.crackedkittys.faghax.ui.component;

import org.crackedkittys.faghax.ui.component.sub.OtherRect;
import org.crackedkittys.faghax.ui.component.sub.PvpRect;
import org.crackedkittys.faghax.ui.component.sub.Watermark;

import java.util.ArrayList;

public class NewFrame {

    public ArrayList<Component> components;

    public NewFrame() { //component registries
        this.components = new ArrayList<>();
        // Component add
        components.add(new PvpRect());
        components.add(new Watermark());
        components.add(new OtherRect());
    }

    public ArrayList<Component> getComponents() {
        return components;
    }
}
