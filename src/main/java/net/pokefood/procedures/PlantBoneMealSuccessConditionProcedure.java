package net.pokefood.procedures;

import net.pokefood.init.PokefoodModBlocks;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class PlantBoneMealSuccessConditionProcedure {
	public static boolean execute(BlockState blockstate) {
		boolean returned = false;
		if ((blockstate.getBlock() == PokefoodModBlocks.GREEN_TEA_PLANT.get() || blockstate.getBlock() == PokefoodModBlocks.BLACK_TEA_PLANT.get() || blockstate.getBlock() == PokefoodModBlocks.CALCUIM_CROP.get())
				&& Mth.nextInt(RandomSource.create(), 1, 10) <= 7) {
			returned = true;
		} else if ((blockstate.getBlock() == PokefoodModBlocks.LEEK_PLANT.get() || blockstate.getBlock() == PokefoodModBlocks.LETTUCE_PLANT.get() || blockstate.getBlock() == PokefoodModBlocks.GRAPE_VINE_2.get())
				&& Mth.nextInt(RandomSource.create(), 1, 10) <= 4) {
			returned = true;
		} else if (blockstate.getBlock() == PokefoodModBlocks.ONION_PLANT.get()) {
			returned = true;
		} else {
			returned = false;
		}
		return returned;
	}
}
