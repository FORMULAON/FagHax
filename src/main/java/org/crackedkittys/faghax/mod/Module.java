package org.crackedkittys.faghax.mod;

import net.minecraft.client.MinecraftClient;

public class Module {
    private String name;
    private String description;
    private Category c;

    protected static final MinecraftClient mc = MinecraftClient.getInstance();

    public Module(String name, String description, Category c) {
        this.name = name;
        this.description = description;
        this.c = c;
    }
}
