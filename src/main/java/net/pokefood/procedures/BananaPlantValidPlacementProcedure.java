package net.pokefood.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class BananaPlantValidPlacementProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean returned = false;
		returned = false;
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.DIRT) {
			returned = true;
		}
		return returned;
	}
}
