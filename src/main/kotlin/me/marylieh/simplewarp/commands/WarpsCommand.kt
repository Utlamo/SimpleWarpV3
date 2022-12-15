package me.marylieh.simplewarp.commands

import me.marylieh.simplewarp.SimpleWarp
import me.marylieh.simplewarp.utils.Config
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.command.TabExecutor

class WarpsCommand : TabExecutor {

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender !is Player) {
            sender.sendMessage("${SimpleWarp.instance.prefix} §4Just a Player can execute this command!")
            return true
        }
        val player: Player = sender

        if (player.hasPermission("simplewarp.warps")) {
            player.sendMessage("${SimpleWarp.instance.prefix} ${Config.getConfig().getConfigurationSection(".Warps")?.getKeys(false)}")
        } else {
            player.sendMessage("${SimpleWarp.instance.prefix} §cYou don't have the permission to do that!")
        }
        return true
    }
    
    override fun onTabComplete(sender: CommandSender, command: Command, label: String, args: Array<out String>): MutableList<String>? {
        return ArrayList<String>()
    }
}