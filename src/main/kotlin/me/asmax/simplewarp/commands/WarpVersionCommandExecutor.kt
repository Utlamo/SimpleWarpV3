package me.***REMOVED***.simplewarp.commands

import me.***REMOVED***.simplewarp.SimpleWarp
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class WarpVersionCommandExecutor : CommandExecutor {

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {

        sender.sendMessage("${SimpleWarp.instance.prefix} §a${SimpleWarp.instance.VERSION}")
        return true
    }
}