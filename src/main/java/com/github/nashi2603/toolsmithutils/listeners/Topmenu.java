package com.github.nashi2603.toolsmithutils.listeners;

import com.github.nashi2603.toolsmithutils.*;
import com.github.nashi2603.toolsmithutils.inventorys.*;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class Topmenu implements Listener {
    private final Toolsmithutils plugin;
    public Topmenu(Toolsmithutils plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
        this.plugin = plugin;
    }

    @EventHandler
    public void tsuTopMenuClickEvent(InventoryClickEvent event) {
        if (event.getView().getTitle().equals("§6ToolsmithUtils - Menu")) {
            if (event.getCurrentItem() != null && event.getCurrentItem().equals(new MenuItems().exitbtn())) {
                // Exit button
                event.setCancelled(true);
                ((Player) event.getWhoClicked()).updateInventory();
                event.getView().close();
            }
        }
    }
}
