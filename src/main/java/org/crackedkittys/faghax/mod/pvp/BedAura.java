package org.crackedkittys.faghax.mod.pvp;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.fabricmc.fabric.api.event.registry.BlockConstructedCallback;
import net.minecraft.item.BedItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.crackedkittys.faghax.mod.Category;
import org.crackedkittys.faghax.mod.Module;
import org.lwjgl.glfw.GLFW;

public class BedAura extends Module {

    public BedAura() {
        super("Bed Aura!", "Does bed shit", Category.PVP, true);
        this.setKey(GLFW.GLFW_KEY_B);

    }

    public void onEnable() {
        ClientTickEvents.END_CLIENT_TICK.register(Client -> {
            bedSleep();

        });
    }

    public void bedSleep() {
//           UseItemCallback.EVENT.register((player, world, hand) -> {
//               ItemStack i = new ItemStack(Items.RED_BED);
//               mc.player.sendMessage(Text.of("using item"), false);
//
//                if (world.getRegistryKey() == World.NETHER) {
//                    if (player.getActiveItem().isItemEqual(i)) {
//                        if (player.isUsingItem()) {
//                            mc.player.sendMessage(Text.of("can do somethin bud"), false);
//                        }
//                    } else {
//                        mc.player.sendMessage(Text.of("not working"), false);
//                    }
//                } else {
//                    mc.player.sendMessage(Text.of("You have to be in nether"), false);
//                }
//
//               return TypedActionResult.pass(i);
//           });

           BlockConstructedCallback.EVENT.register((block, world)-> {
               mc.player.sendMessage(Text.of("Block placed"), false);
           });
    }
}
