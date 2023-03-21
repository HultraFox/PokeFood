
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

public abstract class BlackTeaFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> PokefoodModFluidTypes.BLACK_TEA_TYPE.get(),
			() -> PokefoodModFluids.BLACK_TEA.get(), () -> PokefoodModFluids.FLOWING_BLACK_TEA.get()).explosionResistance(100f)
			.bucket(() -> PokefoodModItems.BLACK_TEA_BUCKET.get()).block(() -> (LiquidBlock) PokefoodModBlocks.BLACK_TEA.get());

	private BlackTeaFluid() {
		super(PROPERTIES);
	}

	public static class Source extends BlackTeaFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends BlackTeaFluid {
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
