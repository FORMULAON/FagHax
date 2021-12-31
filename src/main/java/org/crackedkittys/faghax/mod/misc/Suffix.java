package org.crackedkittys.faghax.mod.misc;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.event.network.C2SPacketTypeCallback;
import net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket;
import net.minecraft.util.ActionResult;
import org.crackedkittys.faghax.mod.Category;
import org.crackedkittys.faghax.mod.Module;
import org.lwjgl.glfw.GLFW;


public class Suffix extends Module {

    public Suffix() {
        super("SuffixModule", "enables suffix in chat", Category.MISC, true);
        this.setKey(GLFW.GLFW_KEY_Z);
    }

//    public void onEnable() {
//        Event<ChatMessageC2SPacket> EVENT = EventFactory.createArrayBacked(ChatMessageC2SPacket.class, (listeners) -> {
//            for (ChatMessageC2SPacket listener : listeners) {
//                String chat = listener.getChatMessage();
//
//                return chat;
//            }
//            return null;
//        });
//        ChatMessageC2SPacket().
//    }
}
