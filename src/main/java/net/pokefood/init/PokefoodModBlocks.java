
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.pokefood.init;

import net.pokefood.block.TeaStage2Block;
import net.pokefood.block.TeaStage1Block;
import net.pokefood.block.TeaStage0Block;
import net.pokefood.block.TeaBlock;
import net.pokefood.block.RoseradeTeaBlock;
import net.pokefood.block.PotWaterSugarBlock;
import net.pokefood.block.PotWaterLemonBlock;
import net.pokefood.block.PotWaterFiredBlock;
import net.pokefood.block.PotWaterBlock;
import net.pokefood.block.PotTeaFiredBlock;
import net.pokefood.block.PotTeaCookedBlock;
import net.pokefood.block.PotTeaBlock;
import net.pokefood.block.PotRoseradeTeaFiredBlock;
import net.pokefood.block.PotRoseradeTeaCookedBlock;
import net.pokefood.block.PotRoseradeTeaBlock;
import net.pokefood.block.PotMaltFiredBlock;
import net.pokefood.block.PotMaltCookedBlock;
import net.pokefood.block.PotMaltBlock;
import net.pokefood.block.PotLemonadeCookedBlock;
import net.pokefood.block.PotLemonadeBlock;
import net.pokefood.block.PotFreshWaterBlock;
import net.pokefood.block.PotEmptyBlock;
import net.pokefood.block.PotBlackTeaFiredBlock;
import net.pokefood.block.PotBlackTeaCookedBlock;
import net.pokefood.block.PotBlackTeaBlock;
import net.pokefood.block.MixerYellowBlock;
import net.pokefood.block.MixerRedBlock;
import net.pokefood.block.MixerPinkBlock;
import net.pokefood.block.MixerGreenBlock;
import net.pokefood.block.MixerBlueBlock;
import net.pokefood.block.MaltBlock;
import net.pokefood.block.LemonadeBlock;
import net.pokefood.block.LemonStage6Block;
import net.pokefood.block.LemonStage5Block;
import net.pokefood.block.LemonStage4Block;
import net.pokefood.block.LemonStage3Block;
import net.pokefood.block.LemonStage2Block;
import net.pokefood.block.LemonStage1Block;
import net.pokefood.block.LemonStage0Block;
import net.pokefood.block.KegFunnelUpBlock;
import net.pokefood.block.KegFunnelFrontBlock;
import net.pokefood.block.KegFunnelBlock;
import net.pokefood.block.KegBlock;
import net.pokefood.block.Keg7Block;
import net.pokefood.block.Keg6Block;
import net.pokefood.block.Keg5Block;
import net.pokefood.block.Keg4Block;
import net.pokefood.block.Keg3Block;
import net.pokefood.block.Keg2Block;
import net.pokefood.block.IceCreamMakerBlock;
import net.pokefood.block.IceCreamExtentionTeaRBlock;
import net.pokefood.block.IceCreamExtentionTeaBlock;
import net.pokefood.block.IceCreamExtentionTeaBBlock;
import net.pokefood.block.IceCreamExtentionLemonadeBlock;
import net.pokefood.block.IceCreamExtentionBlock;
import net.pokefood.block.IceCreamExtentionApriYBlock;
import net.pokefood.block.IceCreamExtentionApriWBlock;
import net.pokefood.block.IceCreamExtentionApriRBlock;
import net.pokefood.block.IceCreamExtentionApriPBlock;
import net.pokefood.block.IceCreamExtentionApriGBlock;
import net.pokefood.block.IceCreamExtentionApriDBlock;
import net.pokefood.block.IceCreamExtentionApriBBlock;
import net.pokefood.block.FryerBlock;
import net.pokefood.block.FreshWaterBlock;
import net.pokefood.block.CidronadeBlock;
import net.pokefood.block.CherryCalcuimBeerBlock;
import net.pokefood.block.CarbonizerBottleBlock;
import net.pokefood.block.CalcuimStage3Block;
import net.pokefood.block.CalcuimStage2Block;
import net.pokefood.block.CalcuimStage1Block;
import net.pokefood.block.CalcuimStage0Block;
import net.pokefood.block.CalcuimPlantBlock;
import net.pokefood.block.BrandyBlock;
import net.pokefood.block.BlackTeaStage2Block;
import net.pokefood.block.BlackTeaStage1Block;
import net.pokefood.block.BlackTeaStage0Block;
import net.pokefood.block.BlackTeaBlock;
import net.pokefood.block.BigOvenOnBlock;
import net.pokefood.block.BigOvenBlock;
import net.pokefood.block.BeerBlock;
import net.pokefood.block.BananaTeaBeerBlock;
import net.pokefood.block.ArceumBlock;
import net.pokefood.block.ApriJuiceYBlock;
import net.pokefood.block.ApriJuiceWBlock;
import net.pokefood.block.ApriJuiceRBlock;
import net.pokefood.block.ApriJuicePBlock;
import net.pokefood.block.ApriJuiceGBlock;
import net.pokefood.block.ApriJuiceDBlock;
import net.pokefood.block.ApriJuiceBBlock;
import net.pokefood.block.ApriAlcoholYBlock;
import net.pokefood.block.ApriAlcoholWBlock;
import net.pokefood.block.ApriAlcoholRBlock;
import net.pokefood.block.ApriAlcoholPBlock;
import net.pokefood.block.ApriAlcoholGBlock;
import net.pokefood.block.ApriAlcoholDBlock;
import net.pokefood.block.ApriAlcoholBBlock;
import net.pokefood.PokefoodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class PokefoodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PokefoodMod.MODID);
	public static final RegistryObject<Block> POT_EMPTY = REGISTRY.register("pot_empty", () -> new PotEmptyBlock());
	public static final RegistryObject<Block> CARBONIZER_BOTTLE = REGISTRY.register("carbonizer_bottle", () -> new CarbonizerBottleBlock());
	public static final RegistryObject<Block> BIG_OVEN = REGISTRY.register("big_oven", () -> new BigOvenBlock());
	public static final RegistryObject<Block> MIXER_RED = REGISTRY.register("mixer_red", () -> new MixerRedBlock());
	public static final RegistryObject<Block> MIXER_PINK = REGISTRY.register("mixer_pink", () -> new MixerPinkBlock());
	public static final RegistryObject<Block> MIXER_YELLOW = REGISTRY.register("mixer_yellow", () -> new MixerYellowBlock());
	public static final RegistryObject<Block> MIXER_GREEN = REGISTRY.register("mixer_green", () -> new MixerGreenBlock());
	public static final RegistryObject<Block> MIXER_BLUE = REGISTRY.register("mixer_blue", () -> new MixerBlueBlock());
	public static final RegistryObject<Block> KEG = REGISTRY.register("keg", () -> new KegBlock());
	public static final RegistryObject<Block> FRYER = REGISTRY.register("fryer", () -> new FryerBlock());
	public static final RegistryObject<Block> ICE_CREAM_MAKER = REGISTRY.register("ice_cream_maker", () -> new IceCreamMakerBlock());
	public static final RegistryObject<Block> KEG_FUNNEL = REGISTRY.register("keg_funnel", () -> new KegFunnelBlock());
	public static final RegistryObject<Block> ICE_CREAM_EXTENTION = REGISTRY.register("ice_cream_extention", () -> new IceCreamExtentionBlock());
	public static final RegistryObject<Block> TEA = REGISTRY.register("tea", () -> new TeaBlock());
	public static final RegistryObject<Block> BLACK_TEA = REGISTRY.register("black_tea", () -> new BlackTeaBlock());
	public static final RegistryObject<Block> ROSERADE_TEA = REGISTRY.register("roserade_tea", () -> new RoseradeTeaBlock());
	public static final RegistryObject<Block> LEMONADE = REGISTRY.register("lemonade", () -> new LemonadeBlock());
	public static final RegistryObject<Block> FRESH_WATER = REGISTRY.register("fresh_water", () -> new FreshWaterBlock());
	public static final RegistryObject<Block> APRI_JUICE_D = REGISTRY.register("apri_juice_d", () -> new ApriJuiceDBlock());
	public static final RegistryObject<Block> APRI_JUICE_B = REGISTRY.register("apri_juice_b", () -> new ApriJuiceBBlock());
	public static final RegistryObject<Block> APRI_JUICE_G = REGISTRY.register("apri_juice_g", () -> new ApriJuiceGBlock());
	public static final RegistryObject<Block> APRI_JUICE_Y = REGISTRY.register("apri_juice_y", () -> new ApriJuiceYBlock());
	public static final RegistryObject<Block> APRI_JUICE_R = REGISTRY.register("apri_juice_r", () -> new ApriJuiceRBlock());
	public static final RegistryObject<Block> APRI_JUICE_P = REGISTRY.register("apri_juice_p", () -> new ApriJuicePBlock());
	public static final RegistryObject<Block> APRI_JUICE_W = REGISTRY.register("apri_juice_w", () -> new ApriJuiceWBlock());
	public static final RegistryObject<Block> MALT = REGISTRY.register("malt", () -> new MaltBlock());
	public static final RegistryObject<Block> BEER = REGISTRY.register("beer", () -> new BeerBlock());
	public static final RegistryObject<Block> BANANA_TEA_BEER = REGISTRY.register("banana_tea_beer", () -> new BananaTeaBeerBlock());
	public static final RegistryObject<Block> CHERRY_CALCUIM_BEER = REGISTRY.register("cherry_calcuim_beer", () -> new CherryCalcuimBeerBlock());
	public static final RegistryObject<Block> BRANDY = REGISTRY.register("brandy", () -> new BrandyBlock());
	public static final RegistryObject<Block> CIDRONADE = REGISTRY.register("cidronade", () -> new CidronadeBlock());
	public static final RegistryObject<Block> ARCEUM = REGISTRY.register("arceum", () -> new ArceumBlock());
	public static final RegistryObject<Block> APRI_ALCOHOL_D = REGISTRY.register("apri_alcohol_d", () -> new ApriAlcoholDBlock());
	public static final RegistryObject<Block> APRI_ALCOHOL_B = REGISTRY.register("apri_alcohol_b", () -> new ApriAlcoholBBlock());
	public static final RegistryObject<Block> APRI_ALCOHOL_G = REGISTRY.register("apri_alcohol_g", () -> new ApriAlcoholGBlock());
	public static final RegistryObject<Block> APRI_ALCOHOL_Y = REGISTRY.register("apri_alcohol_y", () -> new ApriAlcoholYBlock());
	public static final RegistryObject<Block> APRI_ALCOHOL_R = REGISTRY.register("apri_alcohol_r", () -> new ApriAlcoholRBlock());
	public static final RegistryObject<Block> APRI_ALCOHOL_P = REGISTRY.register("apri_alcohol_p", () -> new ApriAlcoholPBlock());
	public static final RegistryObject<Block> APRI_ALCOHOL_W = REGISTRY.register("apri_alcohol_w", () -> new ApriAlcoholWBlock());
	public static final RegistryObject<Block> TEA_STAGE_0 = REGISTRY.register("tea_stage_0", () -> new TeaStage0Block());
	public static final RegistryObject<Block> TEA_STAGE_1 = REGISTRY.register("tea_stage_1", () -> new TeaStage1Block());
	public static final RegistryObject<Block> TEA_STAGE_2 = REGISTRY.register("tea_stage_2", () -> new TeaStage2Block());
	public static final RegistryObject<Block> BLACK_TEA_STAGE_0 = REGISTRY.register("black_tea_stage_0", () -> new BlackTeaStage0Block());
	public static final RegistryObject<Block> BLACK_TEA_STAGE_1 = REGISTRY.register("black_tea_stage_1", () -> new BlackTeaStage1Block());
	public static final RegistryObject<Block> BLACK_TEA_STAGE_2 = REGISTRY.register("black_tea_stage_2", () -> new BlackTeaStage2Block());
	public static final RegistryObject<Block> LEMON_STAGE_0 = REGISTRY.register("lemon_stage_0", () -> new LemonStage0Block());
	public static final RegistryObject<Block> LEMON_STAGE_1 = REGISTRY.register("lemon_stage_1", () -> new LemonStage1Block());
	public static final RegistryObject<Block> LEMON_STAGE_2 = REGISTRY.register("lemon_stage_2", () -> new LemonStage2Block());
	public static final RegistryObject<Block> LEMON_STAGE_3 = REGISTRY.register("lemon_stage_3", () -> new LemonStage3Block());
	public static final RegistryObject<Block> LEMON_STAGE_4 = REGISTRY.register("lemon_stage_4", () -> new LemonStage4Block());
	public static final RegistryObject<Block> LEMON_STAGE_5 = REGISTRY.register("lemon_stage_5", () -> new LemonStage5Block());
	public static final RegistryObject<Block> LEMON_STAGE_6 = REGISTRY.register("lemon_stage_6", () -> new LemonStage6Block());
	public static final RegistryObject<Block> CALCUIM_STAGE_0 = REGISTRY.register("calcuim_stage_0", () -> new CalcuimStage0Block());
	public static final RegistryObject<Block> CALCUIM_STAGE_1 = REGISTRY.register("calcuim_stage_1", () -> new CalcuimStage1Block());
	public static final RegistryObject<Block> CALCUIM_STAGE_2 = REGISTRY.register("calcuim_stage_2", () -> new CalcuimStage2Block());
	public static final RegistryObject<Block> CALCUIM_STAGE_3 = REGISTRY.register("calcuim_stage_3", () -> new CalcuimStage3Block());
	public static final RegistryObject<Block> CALCUIM_PLANT = REGISTRY.register("calcuim_plant", () -> new CalcuimPlantBlock());
	public static final RegistryObject<Block> POT_WATER = REGISTRY.register("pot_water", () -> new PotWaterBlock());
	public static final RegistryObject<Block> POT_WATER_FIRED = REGISTRY.register("pot_water_fired", () -> new PotWaterFiredBlock());
	public static final RegistryObject<Block> POT_TEA = REGISTRY.register("pot_tea", () -> new PotTeaBlock());
	public static final RegistryObject<Block> POT_TEA_FIRED = REGISTRY.register("pot_tea_fired", () -> new PotTeaFiredBlock());
	public static final RegistryObject<Block> POT_BLACK_TEA = REGISTRY.register("pot_black_tea", () -> new PotBlackTeaBlock());
	public static final RegistryObject<Block> POT_BLACK_TEA_FIRED = REGISTRY.register("pot_black_tea_fired", () -> new PotBlackTeaFiredBlock());
	public static final RegistryObject<Block> POT_TEA_COOKED = REGISTRY.register("pot_tea_cooked", () -> new PotTeaCookedBlock());
	public static final RegistryObject<Block> POT_BLACK_TEA_COOKED = REGISTRY.register("pot_black_tea_cooked", () -> new PotBlackTeaCookedBlock());
	public static final RegistryObject<Block> POT_FRESH_WATER = REGISTRY.register("pot_fresh_water", () -> new PotFreshWaterBlock());
	public static final RegistryObject<Block> POT_WATER_SUGAR = REGISTRY.register("pot_water_sugar", () -> new PotWaterSugarBlock());
	public static final RegistryObject<Block> POT_WATER_LEMON = REGISTRY.register("pot_water_lemon", () -> new PotWaterLemonBlock());
	public static final RegistryObject<Block> POT_LEMONADE = REGISTRY.register("pot_lemonade", () -> new PotLemonadeBlock());
	public static final RegistryObject<Block> POT_LEMONADE_COOKED = REGISTRY.register("pot_lemonade_cooked", () -> new PotLemonadeCookedBlock());
	public static final RegistryObject<Block> BIG_OVEN_ON = REGISTRY.register("big_oven_on", () -> new BigOvenOnBlock());
	public static final RegistryObject<Block> POT_ROSERADE_TEA = REGISTRY.register("pot_roserade_tea", () -> new PotRoseradeTeaBlock());
	public static final RegistryObject<Block> POT_ROSERADE_TEA_FIRED = REGISTRY.register("pot_roserade_tea_fired",
			() -> new PotRoseradeTeaFiredBlock());
	public static final RegistryObject<Block> POT_ROSERADE_TEA_COOKED = REGISTRY.register("pot_roserade_tea_cooked",
			() -> new PotRoseradeTeaCookedBlock());
	public static final RegistryObject<Block> KEG_2 = REGISTRY.register("keg_2", () -> new Keg2Block());
	public static final RegistryObject<Block> KEG_3 = REGISTRY.register("keg_3", () -> new Keg3Block());
	public static final RegistryObject<Block> KEG_4 = REGISTRY.register("keg_4", () -> new Keg4Block());
	public static final RegistryObject<Block> KEG_5 = REGISTRY.register("keg_5", () -> new Keg5Block());
	public static final RegistryObject<Block> KEG_6 = REGISTRY.register("keg_6", () -> new Keg6Block());
	public static final RegistryObject<Block> KEG_7 = REGISTRY.register("keg_7", () -> new Keg7Block());
	public static final RegistryObject<Block> POT_MALT = REGISTRY.register("pot_malt", () -> new PotMaltBlock());
	public static final RegistryObject<Block> POT_MALT_FIRED = REGISTRY.register("pot_malt_fired", () -> new PotMaltFiredBlock());
	public static final RegistryObject<Block> POT_MALT_COOKED = REGISTRY.register("pot_malt_cooked", () -> new PotMaltCookedBlock());
	public static final RegistryObject<Block> KEG_FUNNEL_UP = REGISTRY.register("keg_funnel_up", () -> new KegFunnelUpBlock());
	public static final RegistryObject<Block> KEG_FUNNEL_FRONT = REGISTRY.register("keg_funnel_front", () -> new KegFunnelFrontBlock());
	public static final RegistryObject<Block> ICE_CREAM_EXTENTION_APRI_B = REGISTRY.register("ice_cream_extention_apri_b",
			() -> new IceCreamExtentionApriBBlock());
	public static final RegistryObject<Block> ICE_CREAM_EXTENTION_APRI_D = REGISTRY.register("ice_cream_extention_apri_d",
			() -> new IceCreamExtentionApriDBlock());
	public static final RegistryObject<Block> ICE_CREAM_EXTENTION_APRI_G = REGISTRY.register("ice_cream_extention_apri_g",
			() -> new IceCreamExtentionApriGBlock());
	public static final RegistryObject<Block> ICE_CREAM_EXTENTION_APRI_P = REGISTRY.register("ice_cream_extention_apri_p",
			() -> new IceCreamExtentionApriPBlock());
	public static final RegistryObject<Block> ICE_CREAM_EXTENTION_APRI_R = REGISTRY.register("ice_cream_extention_apri_r",
			() -> new IceCreamExtentionApriRBlock());
	public static final RegistryObject<Block> ICE_CREAM_EXTENTION_APRI_W = REGISTRY.register("ice_cream_extention_apri_w",
			() -> new IceCreamExtentionApriWBlock());
	public static final RegistryObject<Block> ICE_CREAM_EXTENTION_APRI_Y = REGISTRY.register("ice_cream_extention_apri_y",
			() -> new IceCreamExtentionApriYBlock());
	public static final RegistryObject<Block> ICE_CREAM_EXTENTION_LEMONADE = REGISTRY.register("ice_cream_extention_lemonade",
			() -> new IceCreamExtentionLemonadeBlock());
	public static final RegistryObject<Block> ICE_CREAM_EXTENTION_TEA = REGISTRY.register("ice_cream_extention_tea",
			() -> new IceCreamExtentionTeaBlock());
	public static final RegistryObject<Block> ICE_CREAM_EXTENTION_TEA_B = REGISTRY.register("ice_cream_extention_tea_b",
			() -> new IceCreamExtentionTeaBBlock());
	public static final RegistryObject<Block> ICE_CREAM_EXTENTION_TEA_R = REGISTRY.register("ice_cream_extention_tea_r",
			() -> new IceCreamExtentionTeaRBlock());
}
