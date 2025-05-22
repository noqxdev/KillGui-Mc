package noqx.menuapi.menuApi;

import noqx.menuapi.menuApi.commands.killCommand;
import noqx.menuapi.menuApi.listeners.InventoryListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class MenuApi extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new InventoryListener(), this);
        getCommand("killgui").setExecutor(new killCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
