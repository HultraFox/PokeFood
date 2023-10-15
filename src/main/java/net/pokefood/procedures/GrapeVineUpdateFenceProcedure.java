package net.pokefood.procedures;

import net.pokefood.init.PokefoodModBlocks;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

public class GrapeVineUpdateFenceProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty("fence") instanceof IntegerProperty _getip1 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip1) : -1) == 1) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 0;
					final ItemStack _setstack = new ItemStack(Blocks.OAK_FENCE);
					_setstack.setCount(1);
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable)
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
					});
				}
			}
		} else if (((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty("fence") instanceof IntegerProperty _getip4 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip4) : -1) == 2) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 0;
					final ItemStack _setstack = new ItemStack(Blocks.SPRUCE_FENCE);
					_setstack.setCount(1);
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable)
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
					});
				}
			}
		} else if (((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty("fence") instanceof IntegerProperty _getip7 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip7) : -1) == 3) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 0;
					final ItemStack _setstack = new ItemStack(Blocks.BIRCH_FENCE);
					_setstack.setCount(1);
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable)
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
					});
				}
			}
		} else if (((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty("fence") instanceof IntegerProperty _getip10 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip10) : -1) == 4) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 0;
					final ItemStack _setstack = new ItemStack(Blocks.JUNGLE_FENCE);
					_setstack.setCount(1);
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable)
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
					});
				}
			}
		} else if (((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty("fence") instanceof IntegerProperty _getip13 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip13) : -1) == 5) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 0;
					final ItemStack _setstack = new ItemStack(Blocks.ACACIA_FENCE);
					_setstack.setCount(1);
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable)
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
					});
				}
			}
		} else if (((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty("fence") instanceof IntegerProperty _getip16 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip16) : -1) == 6) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 0;
					final ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_FENCE);
					_setstack.setCount(1);
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable)
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
					});
				}
			}
		} else if (((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty("fence") instanceof IntegerProperty _getip19 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip19) : -1) == 7) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 0;
					final ItemStack _setstack = new ItemStack(Blocks.CRIMSON_FENCE);
					_setstack.setCount(1);
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable)
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
					});
				}
			}
		} else if (((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty("fence") instanceof IntegerProperty _getip22 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip22) : -1) == 8) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 0;
					final ItemStack _setstack = new ItemStack(Blocks.WARPED_FENCE);
					_setstack.setCount(1);
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable)
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
					});
				}
			}
		} else if (((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty("fence") instanceof IntegerProperty _getip25 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip25) : -1) == 9) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 0;
					final ItemStack _setstack = new ItemStack(Blocks.MANGROVE_FENCE);
					_setstack.setCount(1);
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable)
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
					});
				}
			}
		} else if (((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty("fence") instanceof IntegerProperty _getip28 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip28) : -1) == 10) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 0;
					final ItemStack _setstack = new ItemStack(PokefoodModBlocks.BANANA_FENCE.get());
					_setstack.setCount(1);
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable)
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
					});
				}
			}
		}
	}
}
