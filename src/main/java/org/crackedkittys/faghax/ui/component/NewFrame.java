package org.crackedkittys.faghax.ui.component;

import org.crackedkittys.faghax.ui.component.sub.Rectangle;

import java.util.ArrayList;

public class NewFrame {

    public ArrayList<Component> components;

    public NewFrame() {
        this.components = new ArrayList<>();
        // Component add
        components.add(new Rectangle());
    }

    public ArrayList<Component> getComponents() {
        return components;
    }
}
