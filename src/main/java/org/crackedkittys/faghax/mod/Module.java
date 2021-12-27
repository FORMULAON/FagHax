package org.crackedkittys.faghax.mod;

import net.minecraft.client.MinecraftClient;
import org.crackedkittys.faghax.util.ScreenUtil;

public class Module {
    private final String name;
    private final String description;
    private final Category c;
    private int key;
    private boolean toggled;
    private boolean toggleable;
    public boolean stat;

    protected static final MinecraftClient mc = MinecraftClient.getInstance();

    public Module(String name, String description, Category c, boolean toggleable) { // constructor for all modules to follow
        super();
        this.name = name;
        this.description = description;
        this.c = c;
        this.toggleable = toggleable;
        this.key = 0;
        this.toggled = false;
    }

    public int getKey() {
        return key;
    }

    public void onEnable() {
    }


    public String getName() {
        return this.name;
    }


    public void onDisable() {
        stat = false;

    }

    public void setToggled(boolean toggled) {
        this.toggled = toggled;

        if (this.toggled) {
            this.onEnable();
        } else {
            this.onDisable();
        }
    }

    public void setKey(int key) {
        this.key = key;
    }

    public boolean getToggle() {
        return this.toggled;
    }

    public boolean isToggleable() {
        return this.toggleable;
    }

    public boolean isOn() {
        return this.stat;
    }
}
