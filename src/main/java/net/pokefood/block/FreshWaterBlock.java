
package net.pokefood.block;

import net.pokefood.init.PokefoodModFluids;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

public class FreshWaterBlock extends LiquidBlock {
	public FreshWaterBlock() {
		super(() -> PokefoodModFluids.FRESH_WATER.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f).noCollission().noLootTable());
	}
}
