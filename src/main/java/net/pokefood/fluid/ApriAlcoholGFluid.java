
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

public abstract class ApriAlcoholGFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(
			() -> PokefoodModFluidTypes.APRI_ALCOHOL_G_TYPE.get(), () -> PokefoodModFluids.APRI_ALCOHOL_G.get(),
			() -> PokefoodModFluids.FLOWING_APRI_ALCOHOL_G.get()).explosionResistance(100f).bucket(() -> PokefoodModItems.APRI_ALCOHOL_G_BUCKET.get())
			.block(() -> (LiquidBlock) PokefoodModBlocks.APRI_ALCOHOL_G.get());

	private ApriAlcoholGFluid() {
		super(PROPERTIES);
	}

	public static class Source extends ApriAlcoholGFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends ApriAlcoholGFluid {
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
