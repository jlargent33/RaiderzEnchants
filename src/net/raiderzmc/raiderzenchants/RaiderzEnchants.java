package net.raiderzmc.raiderzenchants;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public class RaiderzEnchants extends JavaPlugin {

    @EventHandler
    public void onEnable() {
        getCommand("raiderzenchants").setExecutor(new net.raiderzmc.raiderzenchants.commands.RaiderzEnchants());
        System.out.println("RaiderzEnchants has successfully initialized.");
    }

    @EventHandler
    public void onDisable() {

    }

    public static ItemStack getEnchantBook() {
        ItemStack enchantbook = new ItemStack(Material.BOOK);
        /*
        This enchantment is used for nothing else besides making the book glow
         */
        enchantbook.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);
        ItemMeta bookmeta = enchantbook.getItemMeta();
        bookmeta.setDisplayName("Enchant Book");
        /*
        Used to avoid showing the useless Infinite enchant, to clean it up
         */
        bookmeta.hasItemFlag(ItemFlag.HIDE_ENCHANTS);
        bookmeta.setLore(Arrays.asList("Right click this enchant book to receive a random custom enchantment book"));
        enchantbook.setItemMeta(bookmeta);
        return enchantbook;
    }

}
