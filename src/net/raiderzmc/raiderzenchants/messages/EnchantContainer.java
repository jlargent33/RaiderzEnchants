package net.raiderzmc.raiderzenchants.messages;

import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.List;

public class EnchantContainer {
    /*
    Auto feed 1 | Atatched to helmets | Feeds you as you walk/run around
FrostWalker 1 |Attached to Boots | Freezes water as you walk over it
Hate 1 | Attached to Chestplates | Constant Haste II
Lava God 1 | Attacthed to leggings | Constant Fire Resistance
Jumping 1 | Attacthed to Boots | Contant Jump boost 2
Sonic 1 | Attached to boots | Constant Speed bost
Trench 1 | Attached to pickaxes | Breaks blocks in a 5x5x5 cube where you mined
Trench 2 | Applies to pickaxes | Breaks blocks in a 7x7x7 cubne where mined
Volley 1 | Applied to Bows | Shoots several arrows at once
Withering 1 | A chance to wither your enemy when hitting them | Applied to swords, axes
Force 1 | Attached to bows | Pull players towards you when you hit them with a bow
Snow bull gun | Attached to sticks | Shoots snowballs for fun! (Cosmetic) [No Damage, justa  fun item]
     */

    public static String auto_feed_displayname = ChatColor.RED + "" + ChatColor.UNDERLINE + "Auto Feed I";
    public static String frostwalker_displayname = ChatColor.RED + "" + ChatColor.UNDERLINE + "Frostwalker I";
    public static String hate_displayname = ChatColor.RED + "" + ChatColor.UNDERLINE + "Hate I";
    public static String lava_god_displayname = ChatColor.RED + "" + ChatColor.UNDERLINE + "Lava God I";
    public static String jumping_displayname = ChatColor.RED + "" + ChatColor.UNDERLINE + "Jumping I";
    public static String sonic_displayname = ChatColor.RED + "" + ChatColor.UNDERLINE + "Sonic I";
    public static String trench_one_displayname = ChatColor.RED + "" + ChatColor.UNDERLINE + "Trench I";
    public static String trench_two_displayname = ChatColor.RED + "" + ChatColor.UNDERLINE + "Trench II";
    public static String volley_displayname = ChatColor.RED + "" + ChatColor.UNDERLINE + "Volley I";
    public static String withering_displayname = ChatColor.RED + "" + ChatColor.UNDERLINE + "Withering";
    public static String force_displayname = ChatColor.RED + "" + ChatColor.UNDERLINE + "Force I";
    public static String snow_bull_gun_displayname = ChatColor.RED + "" + ChatColor.UNDERLINE + "Snowball Gun I";

    public static List getLore(String enchantment_name) {
        List<String> lore = new ArrayList<>();
        switch (enchantment_name) {
            case "auto_feed":
                lore.add(ChatColor.GRAY + "Feeds you as you walk or run around");
                break;
            case "frostwalker":
                lore.add(ChatColor.GRAY + "Freezes water as you walk over it");
                break;
            case "hate":
                lore.add(ChatColor.GRAY + "Gives you haste II");
                break;
            case "lava_god":
                lore.add(ChatColor.GRAY + "Gives you fire resistance");
                break;
            case "jumping":
                lore.add(ChatColor.GRAY + "Gives you jump boost II");
                break;
            case "sonic":
                lore.add(ChatColor.GRAY + "Gives you speed");
                break;
            case "trench_one":
                lore.add(ChatColor.GRAY + "Breaks blocks in a 5x5 radius");
                break;
            case "trench_two":
                lore.add(ChatColor.GRAY + "Breaks blocks in a 7x7 radius");
                break;
            case "volley":
                lore.add(ChatColor.GRAY + "Shoots several arrows at once");
                break;
            case "withering":
                lore.add(ChatColor.GRAY + "Has a chance to give your enemy the wither effect");
                break;
            case "force":
                lore.add(ChatColor.GRAY + "Pulls players towards you when you hit them with an arrow");
                break;
            case "snowball_gun":
                lore.add(ChatColor.GRAY + "Shoots snowballs for fun (Does zero damage)");
                break;
        }
        lore.add(ChatColor.GRAY + "To apply this to your item, click and drop it on the item you wish to apply it to");
        return lore;
    }


}
