package io.github.zohiu.smplytallgrassshears;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class SMPlyTallGrassShears extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new BreakEvent(), this);
        this.getLogger().log(Level.INFO, ChatColor.GREEN + "Enabled.");
    }
}
