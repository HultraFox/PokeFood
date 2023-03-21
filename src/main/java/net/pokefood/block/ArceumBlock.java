
package net.pokefood.block;

import net.pokefood.init.PokefoodModFluids;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

public class ArceumBlock extends LiquidBlock {
	public ArceumBlock() {
		super(() -> PokefoodModFluids.ARCEUM.get(),
				BlockBehaviour.Properties.of(Material.WATER, MaterialColor.SNOW).strength(100f).noCollission().noLootTable());
	}
}
