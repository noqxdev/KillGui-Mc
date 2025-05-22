package noqx.menuapi.menuApi.commands;

import net.kyori.adventure.text.Component;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import noqx.menuapi.menuApi.test.KillMenu;

public class killCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender,
                             @NotNull Command command,
                             @NotNull String label,
                             String[] args) {
        if (!(sender instanceof final Player player)) {
            sender.sendMessage("§cOnly players can use this");
            return true;
        }

        new KillMenu().open(player);
        return true;
    }
}
