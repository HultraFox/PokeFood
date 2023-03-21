
package net.pokefood.block;

import net.pokefood.init.PokefoodModFluids;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

public class CherryCalcuimBeerBlock extends LiquidBlock {
	public CherryCalcuimBeerBlock() {
		super(() -> PokefoodModFluids.CHERRY_CALCUIM_BEER.get(),
				BlockBehaviour.Properties.of(Material.WATER, MaterialColor.SNOW).strength(100f).noCollission().noLootTable());
	}
}
