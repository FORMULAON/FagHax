package org.crackedkittys.faghax.mod;

import net.minecraft.client.MinecraftClient;
import org.crackedkittys.faghax.Main;

public class Module {
    private final String name;
    private final String description;
    private final Category c;
    private int key;

    protected static final MinecraftClient mc = MinecraftClient.getInstance();

    public Module(String name, String description, Category c) {
        super();
        this.name = name;
        this.description = description;
        this.c = c;
        this.key = 0;
    }

    public void KeyAction() {
        Main.log.info("test");
    }

    public int getKey() {
        return key;
    }

    public void onEnable() {
    }

    public void setKey(int key) {
        this.key = key;
    }
}
