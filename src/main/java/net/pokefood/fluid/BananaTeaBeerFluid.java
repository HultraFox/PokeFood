
package net.pokefood.fluid;

import net.pokefood.init.PokefoodModItems;
import net.pokefood.init.PokefoodModFluids;
import net.pokefood.init.PokefoodModFluidTypes;
import net.pokefood.init.PokefoodModBlocks;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

public abstract class BananaTeaBeerFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> PokefoodModFluidTypes.BANANA_TEA_BEER_TYPE.get(), () -> PokefoodModFluids.BANANA_TEA_BEER.get(),
			() -> PokefoodModFluids.FLOWING_BANANA_TEA_BEER.get()).explosionResistance(100f).bucket(() -> PokefoodModItems.BANANA_TEA_BEER_BUCKET.get()).block(() -> (LiquidBlock) PokefoodModBlocks.BANANA_TEA_BEER.get());

	private BananaTeaBeerFluid() {
		super(PROPERTIES);
	}

	public static class Source extends BananaTeaBeerFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends BananaTeaBeerFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
