package net.raiderzmc.raiderzenchants.commands;

import com.massivecraft.factions.Faction;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RaiderzEnchants implements CommandExecutor {

    Player player;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (sender instanceof Player) player = (Player) sender;

        if (cmd.getLabel().equalsIgnoreCase("raiderzenchants")) {
            if (args.length == 0) {
                player.sendMessage(new String[]{"Usages:", "/raiderzenchants give (playername) (item) (amount)",
                        "/raiderzenchants givebook (playername) (count)"});
            } else if (args.length == 1) {


            } /*
                Called when /raiderzenchants 1 2 3 is called
                 */ else if (args.length == 3) {
                if (args[0].equalsIgnoreCase("givebook")) {
                    Player target = Bukkit.getPlayer(args[1]);
                    if (target.isOnline()) {
                        int count = Integer.parseInt(args[2]);
                        for (int i = 0; i < count; i++) {
                            target.getInventory().addItem(net.raiderzmc.raiderzenchants.RaiderzEnchants.getEnchantBook());
                        }
                        player.sendMessage("Added " + count + " books to " + target.getDisplayName() + "'s inventory!");
                    }
                }
            } else {
                player.sendMessage("Improper use. Use /raiderzenchants for a list of commands");
            }
        }
        return false;
    }
}
