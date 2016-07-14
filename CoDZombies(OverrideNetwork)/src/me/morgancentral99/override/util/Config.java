package me.morgancentral99.override.util;

import java.io.File;

import me.morgancentral99.override.Main;

public class Config {
	private Main instance;
	
	public Config(Main instance) {
		this.instance = instance;
	}
	
	public void createConfig(String name) {
		try {
			if(!instance.getDataFolder().exists()) {
				instance.getDataFolder().mkdirs();
			}
			File file = new File(instance.getDataFolder(), name);
			if(!file.exists()) {
				instance.saveDefaultConfig();
			} else {
				return;
			}
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}
