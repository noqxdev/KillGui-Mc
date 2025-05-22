package noqx.menuapi.menuApi.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;


import java.awt.*;
import noqx.menuapi.menuApi.menu.Menu;

public class InventoryListener implements Listener {
    @EventHandler
    public void onclick(InventoryClickEvent event){
        final Inventory clickedInventory = event.getClickedInventory();

        if (clickedInventory == null)
            return;

        if (!(clickedInventory.getHolder() instanceof final Menu menu)) {
            // If clicked inventory is not a Menu
            return;
        }

        // Clicked a custom GUI
        event.setCancelled(true);
        menu.click((Player) event.getWhoClicked(), event.getSlot());
    }
}
