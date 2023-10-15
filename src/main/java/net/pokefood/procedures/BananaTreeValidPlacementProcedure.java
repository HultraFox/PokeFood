package net.pokefood.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class BananaTreeValidPlacementProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean returned = false;
		returned = false;
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.DIRT) {
			returned = true;
			if ((world.getBlockState(new BlockPos(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("pokefood:banana_wood_blocks")))
					|| (world.getBlockState(new BlockPos(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("pokefood:banana_wood_blocks")))
					|| (world.getBlockState(new BlockPos(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("pokefood:banana_wood_blocks")))
					|| (world.getBlockState(new BlockPos(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("pokefood:banana_wood_blocks")))) {
				returned = false;
			}
		}
		return returned;
	}
}
