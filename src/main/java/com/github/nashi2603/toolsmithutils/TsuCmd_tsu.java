package com.github.nashi2603.toolsmithutils;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class TsuCmd_tsu implements CommandExecutor {
    private final Toolsmithutils plugin;
    public TsuCmd_tsu(Toolsmithutils plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Inventory topmenuinv = Bukkit.createInventory(null, 27, "§6ToolsmithUtils - Menu");
            topmenuinv.setItem(26, new TsuMenuItems().exitbtn());
            ((Player) sender).openInventory(topmenuinv);
            return true;
        } else return false;
    }
}
