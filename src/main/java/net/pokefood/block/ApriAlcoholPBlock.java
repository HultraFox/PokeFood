
package net.pokefood.block;

import net.pokefood.init.PokefoodModFluids;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

public class ApriAlcoholPBlock extends LiquidBlock {
	public ApriAlcoholPBlock() {
		super(() -> PokefoodModFluids.APRI_ALCOHOL_P.get(),
				BlockBehaviour.Properties.of(Material.WATER, MaterialColor.SNOW).strength(100f).noCollission().noLootTable());
	}
}
