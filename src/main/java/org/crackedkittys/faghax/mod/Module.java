package org.crackedkittys.faghax.mod;

import net.minecraft.client.MinecraftClient;
import org.crackedkittys.faghax.Main;

public class Module {
    private final String name;
    private final String description;
    private final Category c;
    private int key;
    private boolean toggled;

    protected static final MinecraftClient mc = MinecraftClient.getInstance();

    public Module(String name, String description, Category c) {
        super();
        this.name = name;
        this.description = description;
        this.c = c;
        this.key = 0;
        this.toggled = false;
    }

    public void KeyAction() {
        Main.log.info("test");
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

    }

    public void toggle()  {
        this.toggled = !this.toggled;

        if (this.toggled) {
            this.onEnable();
        } else {
            this.onDisable();
        }
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
}
