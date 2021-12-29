package org.crackedkittys.faghax.ui.component;

import net.minecraft.client.gui.AbstractParentElement;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.util.math.MatrixStack;

public class Component {
    private final double x;
    private final double y;

    public Component(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void doStuff() {
    }

    public void updateComponent() {
    }

    public void renderComponent(MatrixStack matrices) {
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
