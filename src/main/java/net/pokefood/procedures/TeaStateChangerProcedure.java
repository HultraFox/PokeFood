package net.pokefood.procedures;

import net.pokefood.init.PokefoodModBlocks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class TeaStateChangerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double tickNumber = 0;
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == PokefoodModBlocks.TEA_STAGE_0.get()) {
			world.setBlock(new BlockPos(x, y, z), PokefoodModBlocks.TEA_STAGE_1.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == PokefoodModBlocks.TEA_STAGE_1.get()) {
			world.setBlock(new BlockPos(x, y, z), PokefoodModBlocks.TEA_STAGE_2.get().defaultBlockState(), 3);
		}
		if (!((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK) && !((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.DIRT)) {
			world.levelEvent(2001, new BlockPos(x, y, z), Block.getId((world.getBlockState(new BlockPos(x, y, z)))));
			{
				BlockPos _pos = new BlockPos(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
	}
}
