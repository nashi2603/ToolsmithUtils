package com.github.nashi2603.toolsmithutils.inventorys;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MenuItems {
    // Exit button ItemStack
    public ItemStack exitbtn() {
        ItemStack itemexitbtn = new ItemStack(Material.BARRIER);
        ItemMeta itemexitbtnmeta = itemexitbtn.getItemMeta();
        itemexitbtnmeta.setDisplayName("§cExit");
        itemexitbtn.setItemMeta(itemexitbtnmeta);
        return itemexitbtn;
    }
}
