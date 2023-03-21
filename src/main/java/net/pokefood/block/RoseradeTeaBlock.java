
package net.pokefood.block;

import net.pokefood.init.PokefoodModFluids;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

public class RoseradeTeaBlock extends LiquidBlock {
	public RoseradeTeaBlock() {
		super(() -> PokefoodModFluids.ROSERADE_TEA.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f).noCollission().noLootTable());
	}
}
