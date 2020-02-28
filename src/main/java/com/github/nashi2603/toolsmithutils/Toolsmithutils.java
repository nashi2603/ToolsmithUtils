package com.github.nashi2603.toolsmithutils;

import com.github.nashi2603.toolsmithutils.cmds.*;
import com.github.nashi2603.toolsmithutils.listeners.*;

import org.bukkit.plugin.java.JavaPlugin;

public final class Toolsmithutils extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.saveDefaultConfig();

        // Load command
        getCommand("tsu").setExecutor(new Tsu(this));

        // Load listener
        new Topmenu(this);

        getLogger().info("ToolsmithUtils enabled. Hello!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        this.saveConfig();
        getLogger().info("ToolsmithUtils disabled. GoodBye!");
    }
}
