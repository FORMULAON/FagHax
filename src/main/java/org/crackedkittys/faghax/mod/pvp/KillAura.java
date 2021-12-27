package org.crackedkittys.faghax.mod.pvp;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.util.math.Box;
import net.minecraft.world.EntityView;
import net.minecraft.world.World;
import org.crackedkittys.faghax.mod.Category;
import org.crackedkittys.faghax.mod.Module;

import java.util.ArrayList;
import java.util.List;

public class KillAura extends Module {
    World world = mc.player.world;


    public KillAura() {
        super("Kill Aura!", "Hits things lol", Category.PVP, true);
    }

    public void onEnable() {
        while (isOn()) {
            //if (world.getEntitiesByType())
        }
    }

    public boolean canAttack(Entity e) {
        if (e instanceof AnimalEntity || e instanceof Monster) {
            return true;
        }
        return false;
    }

    public void filter(Entity e) { //TODO Plz fix this first thing tomorrow.
        ArrayList<Entity> entity = new ArrayList<>();
        assert mc.world != null;
        for (Entity e1 : mc.world.getEntities()) {
            entity.add(e1);
        }
        //if (mc.player.squaredDistanceTo() < 5) {

            //mc.player.world.getClosestEntity(entities, 20.0d, EntityType.COW, 90.d, 90.0d, 90.0d);

        }
    }
//}
