package net.pokefood.procedures;

import net.pokefood.init.PokefoodModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class PotLemonadeCookedDestroyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z), PokefoodModBlocks.LEMONADE.get().defaultBlockState(), 3);
	}
}
