
package net.pokefood.network;

import net.pokefood.world.inventory.KegGUIMenu;
import net.pokefood.procedures.KegGUIEmptySlotProcedure;
import net.pokefood.procedures.KegGUIClosedProcedure;
import net.pokefood.PokefoodMod;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class KegGUISlotMessage {
	private final int slotID, x, y, z, changeType, meta;

	public KegGUISlotMessage(int slotID, int x, int y, int z, int changeType, int meta) {
		this.slotID = slotID;
		this.x = x;
		this.y = y;
		this.z = z;
		this.changeType = changeType;
		this.meta = meta;
	}

	public KegGUISlotMessage(FriendlyByteBuf buffer) {
		this.slotID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
		this.changeType = buffer.readInt();
		this.meta = buffer.readInt();
	}

	public static void buffer(KegGUISlotMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.slotID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		buffer.writeInt(message.changeType);
		buffer.writeInt(message.meta);
	}

	public static void handler(KegGUISlotMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int slotID = message.slotID;
			int changeType = message.changeType;
			int meta = message.meta;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleSlotAction(entity, slotID, changeType, meta, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleSlotAction(Player entity, int slot, int changeType, int meta, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = KegGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (slot == 0 && changeType == 1) {

			KegGUIEmptySlotProcedure.execute(world, x, y, z);
		}
		if (slot == 1 && changeType == 1) {

			KegGUIEmptySlotProcedure.execute(world, x, y, z);
		}
		if (slot == 2 && changeType == 1) {

			KegGUIEmptySlotProcedure.execute(world, x, y, z);
		}
		if (slot == 3 && changeType == 1) {

			KegGUIClosedProcedure.execute(world, x, y, z);
		}
		if (slot == 4 && changeType == 1) {

			KegGUIEmptySlotProcedure.execute(world, x, y, z);
		}
		if (slot == 5 && changeType == 1) {

			KegGUIEmptySlotProcedure.execute(world, x, y, z);
		}
		if (slot == 6 && changeType == 1) {

			KegGUIEmptySlotProcedure.execute(world, x, y, z);
		}
		if (slot == 7 && changeType == 1) {

			KegGUIEmptySlotProcedure.execute(world, x, y, z);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PokefoodMod.addNetworkMessage(KegGUISlotMessage.class, KegGUISlotMessage::buffer, KegGUISlotMessage::new, KegGUISlotMessage::handler);
	}
}
