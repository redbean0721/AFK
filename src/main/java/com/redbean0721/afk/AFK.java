package com.redbean0721.afk;

import org.bukkit.plugin.java.JavaPlugin;

public final class AFK extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("\u001b[36m插件已啟用!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("\u001b[31m插件已禁用!");
    }
}
