
package net.pokefood.network;

import net.pokefood.world.inventory.IceCreaMakerGUIMenu;
import net.pokefood.procedures.IceCreamServing3Procedure;
import net.pokefood.procedures.IceCreamServing2Procedure;
import net.pokefood.procedures.IceCreamServing1Procedure;
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
public class IceCreaMakerGUIButtonMessage {
	private final int buttonID, x, y, z;

	public IceCreaMakerGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public IceCreaMakerGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(IceCreaMakerGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(IceCreaMakerGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = IceCreaMakerGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			IceCreamServing1Procedure.execute(world, x, y, z);
		}
		if (buttonID == 1) {

			IceCreamServing2Procedure.execute(world, x, y, z);
		}
		if (buttonID == 2) {

			IceCreamServing3Procedure.execute(world, x, y, z);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PokefoodMod.addNetworkMessage(IceCreaMakerGUIButtonMessage.class, IceCreaMakerGUIButtonMessage::buffer, IceCreaMakerGUIButtonMessage::new, IceCreaMakerGUIButtonMessage::handler);
	}
}
