package xyz.nucleoid.disguiselib.mixin.accessor;

import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

@Mixin(PlayerListS2CPacket.class)
public interface PlayerListS2CPacketAccessor {
    @Accessor("entries")
    void setEntries(List<PlayerListS2CPacket.Entry> entries);
    @Accessor("entries")
    List<PlayerListS2CPacket.Entry> getEntries();
    @Accessor("action")
    void setAction(PlayerListS2CPacket.Action action);
    @Accessor("action")
    PlayerListS2CPacket.Action getAction();
}
