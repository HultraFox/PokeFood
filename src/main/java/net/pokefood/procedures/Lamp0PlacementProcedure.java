package net.pokefood.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class Lamp0PlacementProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean returned = false;
		if (!(world.getBlockState(new BlockPos(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))) {
			returned = true;
		}
		return returned;
	}
}
