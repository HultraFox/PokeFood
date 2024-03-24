package net.pokefood.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class CoffeeBoardTallUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		CoffeeBoardCleanProcedure.execute(world, x, y, z);
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("shape") instanceof IntegerProperty _getip1 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip1) : -1) == 0) {
			if (!((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock())) {
				world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x + 0.5, y, z + 0.5)))));
				{
					BlockPos _pos = BlockPos.containing(x + 0.5, y, z + 0.5);
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y, z + 0.5), null);
					world.destroyBlock(_pos, false);
				}
			}
		} else if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("shape") instanceof IntegerProperty _getip9 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip9) : -1) == 1) {
			if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock())) {
				world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x + 0.5, y, z + 0.5)))));
				{
					BlockPos _pos = BlockPos.containing(x + 0.5, y, z + 0.5);
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y, z + 0.5), null);
					world.destroyBlock(_pos, false);
				}
			}
		}
	}
}
