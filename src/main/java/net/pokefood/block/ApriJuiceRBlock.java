
package net.pokefood.block;

import net.pokefood.init.PokefoodModFluids;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

public class ApriJuiceRBlock extends LiquidBlock {
	public ApriJuiceRBlock() {
		super(() -> PokefoodModFluids.APRI_JUICE_R.get(),
				BlockBehaviour.Properties.of(Material.WATER, MaterialColor.COLOR_RED).strength(100f).noCollission().noLootTable());
	}
}
