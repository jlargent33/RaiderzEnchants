package net.raiderzmc.raiderzenchants.listeners;

import com.inkzzz.spigot.armorevent.PlayerArmorEquipEvent;
import com.inkzzz.spigot.armorevent.PlayerArmorUnequipEvent;
import com.massivecraft.factions.FPlayer;
import com.massivecraft.factions.event.FactionPlayerEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerItemBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.List;

public class ArmorManager implements Listener {

    ItemStack item;
    Player player;
    ItemMeta itemMeta;
    List<String> lores;
    int infinite = 999999999;

    @EventHandler
    public void onArmorEquip(PlayerArmorEquipEvent e) {
        item = e.getItemStack();
        player = e.getPlayer();
        if(e.getItemStack().hasItemMeta()) {
            itemMeta = e.getItemStack().getItemMeta();
            if(itemMeta.hasLore()) {
                lores = itemMeta.getLore();
                for (String lore : lores) {
                    if (lore.contains("Hate I")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, infinite, 2));
                    }
                }
            }
        }
    }

    @EventHandler
    public void onArmorUnequip(PlayerArmorUnequipEvent e) {
        item = e.getItemStack();
        player = e.getPlayer();
        if(e.getItemStack().hasItemMeta()) {
            itemMeta = e.getItemStack().getItemMeta();
            if(itemMeta.hasLore()) {
                lores = itemMeta.getLore();
                for (String lore : lores) {
                    if (lore.equalsIgnoreCase("Hate I")) {
                        if (player.hasPotionEffect(PotionEffectType.FAST_DIGGING)) {
                            player.removePotionEffect(PotionEffectType.FAST_DIGGING);
                        }
                    }
                    if (lore.equalsIgnoreCase("Hate I")) {

                    }
                }
            }
        }
    }

}
