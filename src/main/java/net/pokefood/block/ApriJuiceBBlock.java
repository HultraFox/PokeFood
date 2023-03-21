
package net.pokefood.block;

import net.pokefood.init.PokefoodModFluids;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

public class ApriJuiceBBlock extends LiquidBlock {
	public ApriJuiceBBlock() {
		super(() -> PokefoodModFluids.APRI_JUICE_B.get(),
				BlockBehaviour.Properties.of(Material.WATER, MaterialColor.COLOR_BLUE).strength(100f).noCollission().noLootTable());
	}
}
