package net.pokefood.procedures;

import net.pokefood.init.PokefoodModItems;
import net.pokefood.init.PokefoodModBlocks;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicReference;

public class CheeseMakingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double time = 0;
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == PokefoodModItems.BAG_CURD.get()) {
			time = ((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip3 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip3) : -1) + 1;
			{
				int _value = (int) time;
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if (time >= 6) {
			if (((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty("cheese_type") instanceof IntegerProperty _getip6 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip6) : -1) == 1) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _slotid = 0;
						final ItemStack _setstack = new ItemStack(PokefoodModBlocks.CHEESE_FULL_0.get());
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			} else if (((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty("cheese_type") instanceof IntegerProperty _getip9 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip9) : -1) == 2) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _slotid = 0;
						final ItemStack _setstack = new ItemStack(PokefoodModBlocks.CHEESE_FULL_1.get());
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			} else if (((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty("cheese_type") instanceof IntegerProperty _getip12 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip12) : -1) == 3) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _slotid = 0;
						final ItemStack _setstack = new ItemStack(PokefoodModBlocks.CHEESE_FULL_2.get());
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			} else if (((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty("cheese_type") instanceof IntegerProperty _getip15 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip15) : -1) == 4) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _slotid = 0;
						final ItemStack _setstack = new ItemStack(PokefoodModBlocks.CHEESE_FULL_3.get());
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			} else if (((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty("cheese_type") instanceof IntegerProperty _getip18 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip18) : -1) == 5) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _slotid = 0;
						final ItemStack _setstack = new ItemStack(PokefoodModBlocks.CHEESE_FULL_4.get());
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			} else if (((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty("cheese_type") instanceof IntegerProperty _getip21 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip21) : -1) == 6) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _slotid = 0;
						final ItemStack _setstack = new ItemStack(PokefoodModBlocks.CHEESE_FULL_5.get());
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
}
