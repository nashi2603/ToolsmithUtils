package com.github.nashi2603.toolsmithutils;

import org.bukkit.plugin.java.JavaPlugin;

public final class Toolsmithutils extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
