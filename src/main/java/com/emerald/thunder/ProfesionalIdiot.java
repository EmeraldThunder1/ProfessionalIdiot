package com.emerald.thunder;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Villager.Profession;

public class ProfesionalIdiot extends JavaPlugin{
    @Override
    public void onEnable() {
        getServer().getScheduler().scheduleSyncRepeatingTask(
            this,
            new Runnable() {
                public void run() {
                    updateVillagers();
                }
            },
            0L, 
            1L
        );
    }

    public void updateVillagers() {
        for (World world: Bukkit.getWorlds()) {
            for (Entity entity: world.getLivingEntities()) {
                if (entity instanceof Villager) {
                    Villager villager = (Villager) entity;
                    if (villager.getProfession() != Profession.NITWIT) {
                        villager.setProfession(Profession.NITWIT);
                    }
                }
            }
        }
    }
}
