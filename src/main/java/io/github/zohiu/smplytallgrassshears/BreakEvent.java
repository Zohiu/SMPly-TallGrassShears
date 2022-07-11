package io.github.zohiu.smplytallgrassshears;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BreakEvent implements Listener {
    @EventHandler
    public void onBlockBreakEvent(BlockBreakEvent event) {
        if (event.getPlayer().getGameMode() == GameMode.SURVIVAL && event.getBlock().getBlockData().getMaterial() == Material.TALL_GRASS) {
            if (event.getPlayer().getInventory().getItemInMainHand().getType() == Material.SHEARS) {
                event.setDropItems(false);
                event.getPlayer().getWorld().dropItem(event.getBlock().getLocation(), new ItemStack(Material.TALL_GRASS));
            }
        }
    }
}
