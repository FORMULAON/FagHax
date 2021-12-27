package org.crackedkittys.faghax.mod.pvp;

import ca.weblite.objc.Client;
import com.google.common.collect.Streams;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Box;
import net.minecraft.world.EntityView;
import net.minecraft.world.World;
import org.crackedkittys.faghax.mod.Category;
import org.crackedkittys.faghax.mod.Module;
import org.lwjgl.glfw.GLFW;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class KillAura extends Module {
    private boolean switch1;
    World world;

    {
        if (mc.player != null)
        world = mc.player.world;
    }


    public KillAura() {
        super("Kill Aura!", "Hits things lol", Category.PVP, true);
        this.setKey(GLFW.GLFW_KEY_K);
    }

    public void onEnable() {
        switch1 = true;
        ClientTickEvents.END_CLIENT_TICK.register(Client -> {
                    filter();
                });
    }

    public void onDisable() {
        switch1 = false;
    }

    public void filter() { //TODO holy shit this sucks, Scritpyure plz fix.
        if (switch1) {
            List<Entity> ent = Streams.stream(mc.world.getEntities())
                    .filter(e -> (e instanceof PlayerEntity)
                            || (e instanceof Monster)
                            || (e instanceof AnimalEntity)
                            || (e instanceof ArmorStandEntity))
                    .sorted((a, b) -> Float.compare(a.distanceTo(mc.player), b.distanceTo(mc.player))).collect(Collectors.toList());
            for (Entity e : ent) {
                if (mc.player.distanceTo(e) < 2) continue;
                mc.player.sendMessage(Text.of("can attack"), false);
                mc.interactionManager.attackEntity(mc.player, e);
                mc.player.swingHand(Hand.MAIN_HAND);
            }
        }
    }
}
