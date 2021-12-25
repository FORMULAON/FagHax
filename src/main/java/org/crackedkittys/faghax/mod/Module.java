package org.crackedkittys.faghax.mod;

import net.minecraft.client.MinecraftClient;

public class Module {
    private final String name;
    private final String description;
    private final Category c;
    private int key = 0;

    protected static final MinecraftClient mc = MinecraftClient.getInstance();

    public Module(String name, String description, Category c, int key) {
        this.name = name;
        this.description = description;
        this.c = c;
        this.key = key;
    }

    public void KeyAction() {

    }

    public int getKey() {
        return key;
    }

    public void onEnable() {


    }
}
