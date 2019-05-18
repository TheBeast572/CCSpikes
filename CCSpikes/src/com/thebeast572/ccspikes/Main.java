package com.thebeast572.ccspikes;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.thebeast572.ccspikes.handlers.Spikes;

public class Main extends JavaPlugin {
	
	Plugin plugin;
	
	public void onEnable() {
		registerEvents();
		plugin = this;
	}
	
	public void onDisable() {
		plugin = null;
	}
	
	public void registerEvents() {
		PluginManager pm = Bukkit.getServer().getPluginManager();
		
		pm.registerEvents(new Spikes(), this);
	}

}
