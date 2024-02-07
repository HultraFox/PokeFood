package net.pokefood.procedures;

import net.pokefood.init.PokefoodModBlocks;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PotDestroyProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PokefoodModBlocks.COOKING_POT.get()) {
			if (!(new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
					} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity))) {
				if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("fluid_type") instanceof IntegerProperty _getip4 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip4) : -1) != 0
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("processed") instanceof BooleanProperty _getbp6
								&& (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getbp6)) == false) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.WATER.defaultBlockState(), 3);
				} else if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("fluid_type") instanceof IntegerProperty _getip9
						? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip9)
						: -1) == 1
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("processed") instanceof BooleanProperty _getbp11
								&& (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getbp11)) == true) {
					world.setBlock(BlockPos.containing(x, y, z), PokefoodModBlocks.FRESH_WATER.get().defaultBlockState(), 3);
				} else if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("fluid_type") instanceof IntegerProperty _getip14
						? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip14)
						: -1) == 2
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("processed") instanceof BooleanProperty _getbp16
								&& (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getbp16)) == true) {
					world.setBlock(BlockPos.containing(x, y, z), PokefoodModBlocks.LEMONADE.get().defaultBlockState(), 3);
				} else if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("fluid_type") instanceof IntegerProperty _getip19
						? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip19)
						: -1) == 3
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("processed") instanceof BooleanProperty _getbp21
								&& (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getbp21)) == true) {
					world.setBlock(BlockPos.containing(x, y, z), PokefoodModBlocks.TEA.get().defaultBlockState(), 3);
				} else if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("fluid_type") instanceof IntegerProperty _getip24
						? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip24)
						: -1) == 4
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("processed") instanceof BooleanProperty _getbp26
								&& (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getbp26)) == true) {
					world.setBlock(BlockPos.containing(x, y, z), PokefoodModBlocks.BLACK_TEA.get().defaultBlockState(), 3);
				} else if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("fluid_type") instanceof IntegerProperty _getip29
						? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip29)
						: -1) == 5
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("processed") instanceof BooleanProperty _getbp31
								&& (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getbp31)) == true) {
					world.setBlock(BlockPos.containing(x, y, z), PokefoodModBlocks.ROSERADE_TEA.get().defaultBlockState(), 3);
				} else if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("fluid_type") instanceof IntegerProperty _getip34
						? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip34)
						: -1) == 6
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("processed") instanceof BooleanProperty _getbp36
								&& (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getbp36)) == true) {
					world.setBlock(BlockPos.containing(x, y, z), PokefoodModBlocks.MALT.get().defaultBlockState(), 3);
				} else if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("fluid_type") instanceof IntegerProperty _getip39
						? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip39)
						: -1) == 7
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("processed") instanceof BooleanProperty _getbp41
								&& (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getbp41)) == true) {
					world.setBlock(BlockPos.containing(x, y, z), PokefoodModBlocks.CHERRY_INFUSION.get().defaultBlockState(), 3);
				}
			} else {
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 0;
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, ItemStack.EMPTY);
						});
					}
				}
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 1;
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, ItemStack.EMPTY);
						});
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PokefoodModBlocks.CURRY_POT.get()) {
			if (!(new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
					} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity))) {
				if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("progress") instanceof IntegerProperty _getip49 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip49) : -1) != 0
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("progress") instanceof IntegerProperty _getip51
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip51)
								: -1) != 10) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.WATER.defaultBlockState(), 3);
				}
			} else {
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 0;
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, ItemStack.EMPTY);
						});
					}
				}
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 1;
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, ItemStack.EMPTY);
						});
					}
				}
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 2;
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, ItemStack.EMPTY);
						});
					}
				}
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 3;
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, ItemStack.EMPTY);
						});
					}
				}
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 4;
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, ItemStack.EMPTY);
						});
					}
				}
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 5;
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, ItemStack.EMPTY);
						});
					}
				}
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 6;
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, ItemStack.EMPTY);
						});
					}
				}
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 7;
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, ItemStack.EMPTY);
						});
					}
				}
			}
		}
	}
}
