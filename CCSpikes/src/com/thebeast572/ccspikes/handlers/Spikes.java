package com.thebeast572.ccspikes.handlers;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Spikes implements Listener {
	
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent e) {
		Player player = e.getPlayer();
	     Block b = e.getPlayer().getLocation().getBlock();
	     Block b1 = e.getPlayer().getLocation().add(0, 1, 0).getBlock();
		
		if(b.getType().equals(Material.DEAD_HORN_CORAL_FAN ) || b.getType().equals(Material.DEAD_HORN_CORAL_WALL_FAN)) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 1));
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 1));
			player.sendMessage("§c§l§oYou are bleeding!");
		} else if(b1.getType().equals(Material.DEAD_HORN_CORAL_WALL_FAN)) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 1));
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 1));
			player.sendMessage("§c§l§oYou are bleeding!");
		}
	}

}
