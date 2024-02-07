package net.pokefood.procedures;

import net.pokefood.init.PokefoodModBlocks;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;

public class PlantsCanBoneMealedProcedure {
	public static boolean execute(BlockState blockstate) {
		boolean returned = false;
		if (blockstate.getBlock() == PokefoodModBlocks.GREEN_TEA_PLANT.get() || blockstate.getBlock() == PokefoodModBlocks.BLACK_TEA_PLANT.get() || blockstate.getBlock() == PokefoodModBlocks.CALCUIM_CROP.get()
				|| blockstate.getBlock() == PokefoodModBlocks.LEEK_PLANT.get() && (blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip9 ? blockstate.getValue(_getip9) : -1) < 3
				|| blockstate.getBlock() == PokefoodModBlocks.ONION_PLANT.get() && (blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip13 ? blockstate.getValue(_getip13) : -1) < 6
				|| blockstate.getBlock() == PokefoodModBlocks.LETTUCE_PLANT.get() && (blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip17 ? blockstate.getValue(_getip17) : -1) < 3
				|| blockstate.getBlock() == PokefoodModBlocks.GRAPE_VINE_2.get() && (blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip21 ? blockstate.getValue(_getip21) : -1) < 2) {
			returned = true;
		} else {
			returned = false;
		}
		return returned;
	}
}
