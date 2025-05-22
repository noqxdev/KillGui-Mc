package noqx.menuapi.menuApi.test;

import net.kyori.adventure.text.format.NamedTextColor;
import noqx.menuapi.menuApi.menu.SimpleMenu;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import net.kyori.adventure.text.Component;

import java.awt.*;

public class KillMenu extends SimpleMenu {
    public KillMenu() {
        super(Rows.THREE, "Kill Menu");
    }

    @Override
    public void onSetItems() {
        final ItemStack killItem = new ItemStack(Material.BARRIER);
        final ItemMeta meta = killItem.getItemMeta();
        meta.displayName(Component.text("kys", NamedTextColor.RED));
        killItem.setItemMeta(meta);

        setItem(13, killItem, player -> {
            player.sendRichMessage("<red> dead");
            player.setHealth(0);
        });
    }
}
