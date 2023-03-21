
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.pokefood.init;

import net.pokefood.fluid.types.TeaFluidType;
import net.pokefood.fluid.types.RoseradeTeaFluidType;
import net.pokefood.fluid.types.MaltFluidType;
import net.pokefood.fluid.types.LemonadeFluidType;
import net.pokefood.fluid.types.FreshWaterFluidType;
import net.pokefood.fluid.types.CidronadeFluidType;
import net.pokefood.fluid.types.CherryCalcuimBeerFluidType;
import net.pokefood.fluid.types.BrandyFluidType;
import net.pokefood.fluid.types.BlackTeaFluidType;
import net.pokefood.fluid.types.BeerFluidType;
import net.pokefood.fluid.types.BananaTeaBeerFluidType;
import net.pokefood.fluid.types.ArceumFluidType;
import net.pokefood.fluid.types.ApriJuiceYFluidType;
import net.pokefood.fluid.types.ApriJuiceWFluidType;
import net.pokefood.fluid.types.ApriJuiceRFluidType;
import net.pokefood.fluid.types.ApriJuicePFluidType;
import net.pokefood.fluid.types.ApriJuiceGFluidType;
import net.pokefood.fluid.types.ApriJuiceDFluidType;
import net.pokefood.fluid.types.ApriJuiceBFluidType;
import net.pokefood.fluid.types.ApriAlcoholYFluidType;
import net.pokefood.fluid.types.ApriAlcoholWFluidType;
import net.pokefood.fluid.types.ApriAlcoholRFluidType;
import net.pokefood.fluid.types.ApriAlcoholPFluidType;
import net.pokefood.fluid.types.ApriAlcoholGFluidType;
import net.pokefood.fluid.types.ApriAlcoholDFluidType;
import net.pokefood.fluid.types.ApriAlcoholBFluidType;
import net.pokefood.PokefoodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

public class PokefoodModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, PokefoodMod.MODID);
	public static final RegistryObject<FluidType> TEA_TYPE = REGISTRY.register("tea", () -> new TeaFluidType());
	public static final RegistryObject<FluidType> BLACK_TEA_TYPE = REGISTRY.register("black_tea", () -> new BlackTeaFluidType());
	public static final RegistryObject<FluidType> ROSERADE_TEA_TYPE = REGISTRY.register("roserade_tea", () -> new RoseradeTeaFluidType());
	public static final RegistryObject<FluidType> LEMONADE_TYPE = REGISTRY.register("lemonade", () -> new LemonadeFluidType());
	public static final RegistryObject<FluidType> FRESH_WATER_TYPE = REGISTRY.register("fresh_water", () -> new FreshWaterFluidType());
	public static final RegistryObject<FluidType> APRI_JUICE_D_TYPE = REGISTRY.register("apri_juice_d", () -> new ApriJuiceDFluidType());
	public static final RegistryObject<FluidType> APRI_JUICE_B_TYPE = REGISTRY.register("apri_juice_b", () -> new ApriJuiceBFluidType());
	public static final RegistryObject<FluidType> APRI_JUICE_G_TYPE = REGISTRY.register("apri_juice_g", () -> new ApriJuiceGFluidType());
	public static final RegistryObject<FluidType> APRI_JUICE_Y_TYPE = REGISTRY.register("apri_juice_y", () -> new ApriJuiceYFluidType());
	public static final RegistryObject<FluidType> APRI_JUICE_R_TYPE = REGISTRY.register("apri_juice_r", () -> new ApriJuiceRFluidType());
	public static final RegistryObject<FluidType> APRI_JUICE_P_TYPE = REGISTRY.register("apri_juice_p", () -> new ApriJuicePFluidType());
	public static final RegistryObject<FluidType> APRI_JUICE_W_TYPE = REGISTRY.register("apri_juice_w", () -> new ApriJuiceWFluidType());
	public static final RegistryObject<FluidType> MALT_TYPE = REGISTRY.register("malt", () -> new MaltFluidType());
	public static final RegistryObject<FluidType> BEER_TYPE = REGISTRY.register("beer", () -> new BeerFluidType());
	public static final RegistryObject<FluidType> BANANA_TEA_BEER_TYPE = REGISTRY.register("banana_tea_beer", () -> new BananaTeaBeerFluidType());
	public static final RegistryObject<FluidType> CHERRY_CALCUIM_BEER_TYPE = REGISTRY.register("cherry_calcuim_beer",
			() -> new CherryCalcuimBeerFluidType());
	public static final RegistryObject<FluidType> BRANDY_TYPE = REGISTRY.register("brandy", () -> new BrandyFluidType());
	public static final RegistryObject<FluidType> CIDRONADE_TYPE = REGISTRY.register("cidronade", () -> new CidronadeFluidType());
	public static final RegistryObject<FluidType> ARCEUM_TYPE = REGISTRY.register("arceum", () -> new ArceumFluidType());
	public static final RegistryObject<FluidType> APRI_ALCOHOL_D_TYPE = REGISTRY.register("apri_alcohol_d", () -> new ApriAlcoholDFluidType());
	public static final RegistryObject<FluidType> APRI_ALCOHOL_B_TYPE = REGISTRY.register("apri_alcohol_b", () -> new ApriAlcoholBFluidType());
	public static final RegistryObject<FluidType> APRI_ALCOHOL_G_TYPE = REGISTRY.register("apri_alcohol_g", () -> new ApriAlcoholGFluidType());
	public static final RegistryObject<FluidType> APRI_ALCOHOL_Y_TYPE = REGISTRY.register("apri_alcohol_y", () -> new ApriAlcoholYFluidType());
	public static final RegistryObject<FluidType> APRI_ALCOHOL_R_TYPE = REGISTRY.register("apri_alcohol_r", () -> new ApriAlcoholRFluidType());
	public static final RegistryObject<FluidType> APRI_ALCOHOL_P_TYPE = REGISTRY.register("apri_alcohol_p", () -> new ApriAlcoholPFluidType());
	public static final RegistryObject<FluidType> APRI_ALCOHOL_W_TYPE = REGISTRY.register("apri_alcohol_w", () -> new ApriAlcoholWFluidType());
}
