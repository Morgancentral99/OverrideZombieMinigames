package me.morgancentral99.override.zombie;

import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.MushroomCow;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Witch;
import org.bukkit.entity.Wither;
import org.bukkit.entity.Wolf;
import org.bukkit.entity.Zombie;

import me.morgancentral99.override.Main;

public class Mobs {
	
    LivingEntity e;
	Main m;
	public int typ;
	
	public Mobs() {
	    this.typ = getType(e);
	}
	
	
	  public static int getType(LivingEntity e)
	  {
	    if ((e instanceof Chicken)) {
	      return 1;
	    }
	    if ((e instanceof Sheep)) {
	      return 2;
	    }
	    if ((e instanceof Pig)) {
	      return 3;
	    }
	    if ((e instanceof Cow)) {
	      return 4;
	    }
	    if ((e instanceof Wolf)) {
	      return 5;
	    }
	    if ((e instanceof Villager)) {
	      return 6;
	    }
	    if ((e instanceof Skeleton)) {
	      return 7;
	    }
	    if ((e instanceof Zombie)) {
	      return 8;
	    }
	    if ((e instanceof MushroomCow)) {
	      return 9;
	    }
	    if ((e instanceof Creeper)) {
	      return 10;
	    }
	    if ((e instanceof Witch)) {
	      return 11;
	    }
	    if ((e instanceof IronGolem)) {
	      return 12;
	    }
	    if ((e instanceof Wither)) {
	      return 13;
	    }
	    return 0;
	  }
	  
	  public static EntityType getBukkitType(int typ)
	  {
	    if (typ == 1) {
	      return EntityType.CHICKEN;
	    }
	    if (typ == 2) {
	      return EntityType.SHEEP;
	    }
	    if (typ == 3) {
	      return EntityType.PIG;
	    }
	    if (typ == 4) {
	      return EntityType.COW;
	    }
	    if (typ == 5) {
	      return EntityType.WOLF;
	    }
	    if (typ == 6) {
	      return EntityType.VILLAGER;
	    }
	    if (typ == 7) {
	      return EntityType.SKELETON;
	    }
	    if (typ == 8) {
	      return EntityType.ZOMBIE;
	    }
	    if (typ == 9) {
	      return EntityType.MUSHROOM_COW;
	    }
	    if (typ == 10) {
	      return EntityType.CREEPER;
	    }
	    if (typ == 11) {
	      return EntityType.WITCH;
	    }
	    if (typ == 12) {
	      return EntityType.IRON_GOLEM;
	    }
	    if (typ == 13) {
	      return EntityType.WITHER;
	    }
	    return EntityType.CHICKEN;
	  }

}
