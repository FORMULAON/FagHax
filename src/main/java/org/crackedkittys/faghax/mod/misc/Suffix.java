package org.crackedkittys.faghax.mod.misc;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.event.network.C2SPacketTypeCallback;
import net.minecraft.network.Packet;
import net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import org.crackedkittys.faghax.mod.Category;
import org.crackedkittys.faghax.mod.Module;
import org.lwjgl.glfw.GLFW;


public class Suffix extends Module {
    private boolean status;

    public Suffix() {
        super("SuffixModule", "enables suffix in chat", Category.MISC, true);
        this.setKey(GLFW.GLFW_KEY_Z);
    }

    public void onEnable() {
        status = true;
    }

    public void onDisable() {
        status = false;
    }

    public void onChatMessage(Packet<?> evt) {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (stat) {
                if (evt instanceof ChatMessageC2SPacket) {
                    ChatMessageC2SPacket packet = (ChatMessageC2SPacket) evt;

                    String chat = packet.getChatMessage();

                    mc.player.sendMessage(Text.of(chat), false);
                }
            }
        });
    }
}
