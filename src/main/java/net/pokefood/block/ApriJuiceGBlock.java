
package net.pokefood.block;

import net.pokefood.init.PokefoodModFluids;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

public class ApriJuiceGBlock extends LiquidBlock {
	public ApriJuiceGBlock() {
		super(() -> PokefoodModFluids.APRI_JUICE_G.get(),
				BlockBehaviour.Properties.of(Material.WATER, MaterialColor.COLOR_GREEN).strength(100f).noCollission().noLootTable());
	}
}
