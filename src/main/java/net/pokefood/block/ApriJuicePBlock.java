
package net.pokefood.block;

import net.pokefood.init.PokefoodModFluids;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

public class ApriJuicePBlock extends LiquidBlock {
	public ApriJuicePBlock() {
		super(() -> PokefoodModFluids.APRI_JUICE_P.get(),
				BlockBehaviour.Properties.of(Material.WATER, MaterialColor.COLOR_PINK).strength(100f).noCollission().noLootTable());
	}
}
