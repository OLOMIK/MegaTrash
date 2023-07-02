package com.olomowo.megatrash;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public final class MegaTrash extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(command.getName().equalsIgnoreCase("trash")){
            // tworzymy inventory o nazwie smietnik z 27 slotami
            Inventory smietnik = Bukkit.createInventory(null, 27, "&c&lTrash");
            // deklarujemy zmienną określającą gracza
            Player p = (Player) sender;
            // otwieramy inventory graczowi
            p.openInventory(smietnik);

        }
        return super.onCommand(sender, command, label, args);
    }
}
