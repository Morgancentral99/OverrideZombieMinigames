package me.morgancentral99.override;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	Logger logger = Bukkit.getLogger();
	
	private static Main instance;
	
	public Main(Main instance) {
		Main.instance = instance;
	}
	
	@Override
	public void onLoad() {
		logger.log(Level.INFO, "Loading Mob data...");
		
		
	}
	
	@Override
	public void onEnable() {
		logger.log(Level.INFO ,"Loaded CoDZombies");
		
	}
	
	
    public static Main getInstance() {
        return instance;
    }
    public void registerEntities() {
    	
    }

}
