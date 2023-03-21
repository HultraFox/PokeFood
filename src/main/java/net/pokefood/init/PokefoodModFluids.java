
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.pokefood.init;

import net.pokefood.fluid.TeaFluid;
import net.pokefood.fluid.RoseradeTeaFluid;
import net.pokefood.fluid.MaltFluid;
import net.pokefood.fluid.LemonadeFluid;
import net.pokefood.fluid.FreshWaterFluid;
import net.pokefood.fluid.CidronadeFluid;
import net.pokefood.fluid.CherryCalcuimBeerFluid;
import net.pokefood.fluid.BrandyFluid;
import net.pokefood.fluid.BlackTeaFluid;
import net.pokefood.fluid.BeerFluid;
import net.pokefood.fluid.BananaTeaBeerFluid;
import net.pokefood.fluid.ArceumFluid;
import net.pokefood.fluid.ApriJuiceYFluid;
import net.pokefood.fluid.ApriJuiceWFluid;
import net.pokefood.fluid.ApriJuiceRFluid;
import net.pokefood.fluid.ApriJuicePFluid;
import net.pokefood.fluid.ApriJuiceGFluid;
import net.pokefood.fluid.ApriJuiceDFluid;
import net.pokefood.fluid.ApriJuiceBFluid;
import net.pokefood.fluid.ApriAlcoholYFluid;
import net.pokefood.fluid.ApriAlcoholWFluid;
import net.pokefood.fluid.ApriAlcoholRFluid;
import net.pokefood.fluid.ApriAlcoholPFluid;
import net.pokefood.fluid.ApriAlcoholGFluid;
import net.pokefood.fluid.ApriAlcoholDFluid;
import net.pokefood.fluid.ApriAlcoholBFluid;
import net.pokefood.PokefoodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

public class PokefoodModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, PokefoodMod.MODID);
	public static final RegistryObject<FlowingFluid> TEA = REGISTRY.register("tea", () -> new TeaFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_TEA = REGISTRY.register("flowing_tea", () -> new TeaFluid.Flowing());
	public static final RegistryObject<FlowingFluid> BLACK_TEA = REGISTRY.register("black_tea", () -> new BlackTeaFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_BLACK_TEA = REGISTRY.register("flowing_black_tea", () -> new BlackTeaFluid.Flowing());
	public static final RegistryObject<FlowingFluid> ROSERADE_TEA = REGISTRY.register("roserade_tea", () -> new RoseradeTeaFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_ROSERADE_TEA = REGISTRY.register("flowing_roserade_tea",
			() -> new RoseradeTeaFluid.Flowing());
	public static final RegistryObject<FlowingFluid> LEMONADE = REGISTRY.register("lemonade", () -> new LemonadeFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_LEMONADE = REGISTRY.register("flowing_lemonade", () -> new LemonadeFluid.Flowing());
	public static final RegistryObject<FlowingFluid> FRESH_WATER = REGISTRY.register("fresh_water", () -> new FreshWaterFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_FRESH_WATER = REGISTRY.register("flowing_fresh_water",
			() -> new FreshWaterFluid.Flowing());
	public static final RegistryObject<FlowingFluid> APRI_JUICE_D = REGISTRY.register("apri_juice_d", () -> new ApriJuiceDFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_APRI_JUICE_D = REGISTRY.register("flowing_apri_juice_d",
			() -> new ApriJuiceDFluid.Flowing());
	public static final RegistryObject<FlowingFluid> APRI_JUICE_B = REGISTRY.register("apri_juice_b", () -> new ApriJuiceBFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_APRI_JUICE_B = REGISTRY.register("flowing_apri_juice_b",
			() -> new ApriJuiceBFluid.Flowing());
	public static final RegistryObject<FlowingFluid> APRI_JUICE_G = REGISTRY.register("apri_juice_g", () -> new ApriJuiceGFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_APRI_JUICE_G = REGISTRY.register("flowing_apri_juice_g",
			() -> new ApriJuiceGFluid.Flowing());
	public static final RegistryObject<FlowingFluid> APRI_JUICE_Y = REGISTRY.register("apri_juice_y", () -> new ApriJuiceYFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_APRI_JUICE_Y = REGISTRY.register("flowing_apri_juice_y",
			() -> new ApriJuiceYFluid.Flowing());
	public static final RegistryObject<FlowingFluid> APRI_JUICE_R = REGISTRY.register("apri_juice_r", () -> new ApriJuiceRFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_APRI_JUICE_R = REGISTRY.register("flowing_apri_juice_r",
			() -> new ApriJuiceRFluid.Flowing());
	public static final RegistryObject<FlowingFluid> APRI_JUICE_P = REGISTRY.register("apri_juice_p", () -> new ApriJuicePFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_APRI_JUICE_P = REGISTRY.register("flowing_apri_juice_p",
			() -> new ApriJuicePFluid.Flowing());
	public static final RegistryObject<FlowingFluid> APRI_JUICE_W = REGISTRY.register("apri_juice_w", () -> new ApriJuiceWFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_APRI_JUICE_W = REGISTRY.register("flowing_apri_juice_w",
			() -> new ApriJuiceWFluid.Flowing());
	public static final RegistryObject<FlowingFluid> MALT = REGISTRY.register("malt", () -> new MaltFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_MALT = REGISTRY.register("flowing_malt", () -> new MaltFluid.Flowing());
	public static final RegistryObject<FlowingFluid> BEER = REGISTRY.register("beer", () -> new BeerFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_BEER = REGISTRY.register("flowing_beer", () -> new BeerFluid.Flowing());
	public static final RegistryObject<FlowingFluid> BANANA_TEA_BEER = REGISTRY.register("banana_tea_beer", () -> new BananaTeaBeerFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_BANANA_TEA_BEER = REGISTRY.register("flowing_banana_tea_beer",
			() -> new BananaTeaBeerFluid.Flowing());
	public static final RegistryObject<FlowingFluid> CHERRY_CALCUIM_BEER = REGISTRY.register("cherry_calcuim_beer",
			() -> new CherryCalcuimBeerFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_CHERRY_CALCUIM_BEER = REGISTRY.register("flowing_cherry_calcuim_beer",
			() -> new CherryCalcuimBeerFluid.Flowing());
	public static final RegistryObject<FlowingFluid> BRANDY = REGISTRY.register("brandy", () -> new BrandyFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_BRANDY = REGISTRY.register("flowing_brandy", () -> new BrandyFluid.Flowing());
	public static final RegistryObject<FlowingFluid> CIDRONADE = REGISTRY.register("cidronade", () -> new CidronadeFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_CIDRONADE = REGISTRY.register("flowing_cidronade", () -> new CidronadeFluid.Flowing());
	public static final RegistryObject<FlowingFluid> ARCEUM = REGISTRY.register("arceum", () -> new ArceumFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_ARCEUM = REGISTRY.register("flowing_arceum", () -> new ArceumFluid.Flowing());
	public static final RegistryObject<FlowingFluid> APRI_ALCOHOL_D = REGISTRY.register("apri_alcohol_d", () -> new ApriAlcoholDFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_APRI_ALCOHOL_D = REGISTRY.register("flowing_apri_alcohol_d",
			() -> new ApriAlcoholDFluid.Flowing());
	public static final RegistryObject<FlowingFluid> APRI_ALCOHOL_B = REGISTRY.register("apri_alcohol_b", () -> new ApriAlcoholBFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_APRI_ALCOHOL_B = REGISTRY.register("flowing_apri_alcohol_b",
			() -> new ApriAlcoholBFluid.Flowing());
	public static final RegistryObject<FlowingFluid> APRI_ALCOHOL_G = REGISTRY.register("apri_alcohol_g", () -> new ApriAlcoholGFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_APRI_ALCOHOL_G = REGISTRY.register("flowing_apri_alcohol_g",
			() -> new ApriAlcoholGFluid.Flowing());
	public static final RegistryObject<FlowingFluid> APRI_ALCOHOL_Y = REGISTRY.register("apri_alcohol_y", () -> new ApriAlcoholYFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_APRI_ALCOHOL_Y = REGISTRY.register("flowing_apri_alcohol_y",
			() -> new ApriAlcoholYFluid.Flowing());
	public static final RegistryObject<FlowingFluid> APRI_ALCOHOL_R = REGISTRY.register("apri_alcohol_r", () -> new ApriAlcoholRFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_APRI_ALCOHOL_R = REGISTRY.register("flowing_apri_alcohol_r",
			() -> new ApriAlcoholRFluid.Flowing());
	public static final RegistryObject<FlowingFluid> APRI_ALCOHOL_P = REGISTRY.register("apri_alcohol_p", () -> new ApriAlcoholPFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_APRI_ALCOHOL_P = REGISTRY.register("flowing_apri_alcohol_p",
			() -> new ApriAlcoholPFluid.Flowing());
	public static final RegistryObject<FlowingFluid> APRI_ALCOHOL_W = REGISTRY.register("apri_alcohol_w", () -> new ApriAlcoholWFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_APRI_ALCOHOL_W = REGISTRY.register("flowing_apri_alcohol_w",
			() -> new ApriAlcoholWFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(TEA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_TEA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(BLACK_TEA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_BLACK_TEA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ROSERADE_TEA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ROSERADE_TEA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(LEMONADE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LEMONADE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FRESH_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_FRESH_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(APRI_JUICE_D.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_APRI_JUICE_D.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(APRI_JUICE_B.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_APRI_JUICE_B.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(APRI_JUICE_G.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_APRI_JUICE_G.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(APRI_JUICE_Y.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_APRI_JUICE_Y.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(APRI_JUICE_R.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_APRI_JUICE_R.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(APRI_JUICE_P.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_APRI_JUICE_P.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(APRI_JUICE_W.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_APRI_JUICE_W.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(MALT.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_MALT.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(BEER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_BEER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(BANANA_TEA_BEER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_BANANA_TEA_BEER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(CHERRY_CALCUIM_BEER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CHERRY_CALCUIM_BEER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(BRANDY.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_BRANDY.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(CIDRONADE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CIDRONADE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ARCEUM.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ARCEUM.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(APRI_ALCOHOL_D.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_APRI_ALCOHOL_D.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(APRI_ALCOHOL_B.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_APRI_ALCOHOL_B.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(APRI_ALCOHOL_G.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_APRI_ALCOHOL_G.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(APRI_ALCOHOL_Y.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_APRI_ALCOHOL_Y.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(APRI_ALCOHOL_R.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_APRI_ALCOHOL_R.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(APRI_ALCOHOL_P.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_APRI_ALCOHOL_P.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(APRI_ALCOHOL_W.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_APRI_ALCOHOL_W.get(), RenderType.translucent());
		}
	}
}
