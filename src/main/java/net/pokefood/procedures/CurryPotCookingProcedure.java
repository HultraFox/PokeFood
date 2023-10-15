package net.pokefood.procedures;

import net.pokefood.init.PokefoodModBlocks;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class CurryPotCookingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty("cooking") instanceof IntegerProperty _getip1 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip1) : -1) == 1
				&& ((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty("nb_berries") instanceof IntegerProperty _getip3 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip3) : -1) == 6
				|| ((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty("cooking") instanceof IntegerProperty _getip5 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip5) : -1) == 0) {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("cooking_time", (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "cooking_time") + 1));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == PokefoodModBlocks.CURRY_POT_LIT.get()
				&& ((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty("cooking") instanceof IntegerProperty _getip11 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip11) : -1) == 0 && new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "cooking_time") == 3) {
			{
				int _value = 1;
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("cooking") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == PokefoodModBlocks.CURRY_POT_LIT.get()
				&& ((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty("cooking") instanceof IntegerProperty _getip17 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip17) : -1) == 1 && new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "cooking_time") == 6) {
			{
				int _value = 2;
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("cooking") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
	}
}
