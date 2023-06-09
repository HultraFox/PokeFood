
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

public abstract class CherryCalcuimBeerFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> PokefoodModFluidTypes.CHERRY_CALCUIM_BEER_TYPE.get(), () -> PokefoodModFluids.CHERRY_CALCUIM_BEER.get(),
			() -> PokefoodModFluids.FLOWING_CHERRY_CALCUIM_BEER.get()).explosionResistance(100f).bucket(() -> PokefoodModItems.CHERRY_CALCUIM_BEER_BUCKET.get()).block(() -> (LiquidBlock) PokefoodModBlocks.CHERRY_CALCUIM_BEER.get());

	private CherryCalcuimBeerFluid() {
		super(PROPERTIES);
	}

	public static class Source extends CherryCalcuimBeerFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends CherryCalcuimBeerFluid {
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
