
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

public abstract class WhiteWineFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> PokefoodModFluidTypes.WHITE_WINE_TYPE.get(), () -> PokefoodModFluids.WHITE_WINE.get(), () -> PokefoodModFluids.FLOWING_WHITE_WINE.get())
			.explosionResistance(100f).bucket(() -> PokefoodModItems.WHITE_WINE_BUCKET.get()).block(() -> (LiquidBlock) PokefoodModBlocks.WHITE_WINE.get());

	private WhiteWineFluid() {
		super(PROPERTIES);
	}

	public static class Source extends WhiteWineFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends WhiteWineFluid {
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
