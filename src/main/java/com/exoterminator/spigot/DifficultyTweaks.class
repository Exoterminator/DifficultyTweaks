package com.exoterminator.spigot;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.exoterminator.spigot.commands.PlayerDifficultyCommand;
import com.exoterminator.spigot.commands.SetDifficultyCommand;
import com.exoterminator.spigot.gui.CustomInventoryManager;
import com.exoterminator.spigot.listeners.DamageListener;
import com.exoterminator.spigot.listeners.HungerListener;
import com.exoterminator.spigot.listeners.MobListener;

public class difficultytweaks extends JavaPlugin {

	private DifficultyManager difficultyManager = new DifficultyManager(this);
	private ConfigManager configManager = new ConfigManager(this, difficultyManager);

	public void onEnable() {
		PluginManager pm = Bukkit.getPluginManager();

		pm.registerEvents(new CustomInventoryManager(), this);
		pm.registerEvents(new DamageListener(difficultyManager), this);
		pm.registerEvents(new HungerListener(difficultyManager), this);
		pm.registerEvents(new MobListener(difficultyManager), this);

		getCommand("setdifficulty").setExecutor(new SetDifficultyCommand(configManager, difficultyManager));
		getCommand("playerdifficulties").setExecutor(new PlayerDifficultyCommand(configManager));
	}

}
