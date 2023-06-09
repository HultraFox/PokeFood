
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

public abstract class CoffeeIcedFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> PokefoodModFluidTypes.COFFEE_ICED_TYPE.get(), () -> PokefoodModFluids.COFFEE_ICED.get(), () -> PokefoodModFluids.FLOWING_COFFEE_ICED.get())
			.explosionResistance(100f).bucket(() -> PokefoodModItems.COFFEE_ICED_BUCKET.get()).block(() -> (LiquidBlock) PokefoodModBlocks.COFFEE_ICED.get());

	private CoffeeIcedFluid() {
		super(PROPERTIES);
	}

	public static class Source extends CoffeeIcedFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends CoffeeIcedFluid {
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
