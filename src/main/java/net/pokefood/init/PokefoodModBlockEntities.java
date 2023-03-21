
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.pokefood.init;

import net.pokefood.block.entity.TeaStage2BlockEntity;
import net.pokefood.block.entity.TeaStage1BlockEntity;
import net.pokefood.block.entity.TeaStage0BlockEntity;
import net.pokefood.block.entity.PotWaterSugarBlockEntity;
import net.pokefood.block.entity.PotWaterLemonBlockEntity;
import net.pokefood.block.entity.PotWaterFiredBlockEntity;
import net.pokefood.block.entity.PotWaterBlockEntity;
import net.pokefood.block.entity.PotTeaFiredBlockEntity;
import net.pokefood.block.entity.PotTeaCookedBlockEntity;
import net.pokefood.block.entity.PotTeaBlockEntity;
import net.pokefood.block.entity.PotRoseradeTeaFiredBlockEntity;
import net.pokefood.block.entity.PotRoseradeTeaCookedBlockEntity;
import net.pokefood.block.entity.PotRoseradeTeaBlockEntity;
import net.pokefood.block.entity.PotMaltFiredBlockEntity;
import net.pokefood.block.entity.PotMaltCookedBlockEntity;
import net.pokefood.block.entity.PotMaltBlockEntity;
import net.pokefood.block.entity.PotLemonadeCookedBlockEntity;
import net.pokefood.block.entity.PotLemonadeBlockEntity;
import net.pokefood.block.entity.PotFreshWaterBlockEntity;
import net.pokefood.block.entity.PotEmptyBlockEntity;
import net.pokefood.block.entity.PotBlackTeaFiredBlockEntity;
import net.pokefood.block.entity.PotBlackTeaCookedBlockEntity;
import net.pokefood.block.entity.PotBlackTeaBlockEntity;
import net.pokefood.block.entity.MixerYellowBlockEntity;
import net.pokefood.block.entity.MixerRedBlockEntity;
import net.pokefood.block.entity.MixerPinkBlockEntity;
import net.pokefood.block.entity.MixerGreenBlockEntity;
import net.pokefood.block.entity.MixerBlueBlockEntity;
import net.pokefood.block.entity.LemonStage6BlockEntity;
import net.pokefood.block.entity.LemonStage5BlockEntity;
import net.pokefood.block.entity.LemonStage4BlockEntity;
import net.pokefood.block.entity.LemonStage3BlockEntity;
import net.pokefood.block.entity.LemonStage2BlockEntity;
import net.pokefood.block.entity.LemonStage1BlockEntity;
import net.pokefood.block.entity.LemonStage0BlockEntity;
import net.pokefood.block.entity.KegFunnelUpBlockEntity;
import net.pokefood.block.entity.KegFunnelFrontBlockEntity;
import net.pokefood.block.entity.KegFunnelBlockEntity;
import net.pokefood.block.entity.KegBlockEntity;
import net.pokefood.block.entity.Keg7BlockEntity;
import net.pokefood.block.entity.Keg6BlockEntity;
import net.pokefood.block.entity.Keg5BlockEntity;
import net.pokefood.block.entity.Keg4BlockEntity;
import net.pokefood.block.entity.Keg3BlockEntity;
import net.pokefood.block.entity.Keg2BlockEntity;
import net.pokefood.block.entity.IceCreamMakerBlockEntity;
import net.pokefood.block.entity.IceCreamExtentionTeaRBlockEntity;
import net.pokefood.block.entity.IceCreamExtentionTeaBlockEntity;
import net.pokefood.block.entity.IceCreamExtentionTeaBBlockEntity;
import net.pokefood.block.entity.IceCreamExtentionLemonadeBlockEntity;
import net.pokefood.block.entity.IceCreamExtentionBlockEntity;
import net.pokefood.block.entity.IceCreamExtentionApriYBlockEntity;
import net.pokefood.block.entity.IceCreamExtentionApriWBlockEntity;
import net.pokefood.block.entity.IceCreamExtentionApriRBlockEntity;
import net.pokefood.block.entity.IceCreamExtentionApriPBlockEntity;
import net.pokefood.block.entity.IceCreamExtentionApriGBlockEntity;
import net.pokefood.block.entity.IceCreamExtentionApriDBlockEntity;
import net.pokefood.block.entity.IceCreamExtentionApriBBlockEntity;
import net.pokefood.block.entity.FryerBlockEntity;
import net.pokefood.block.entity.CarbonizerBottleBlockEntity;
import net.pokefood.block.entity.CalcuimStage3BlockEntity;
import net.pokefood.block.entity.CalcuimStage2BlockEntity;
import net.pokefood.block.entity.CalcuimStage1BlockEntity;
import net.pokefood.block.entity.CalcuimStage0BlockEntity;
import net.pokefood.block.entity.BlackTeaStage2BlockEntity;
import net.pokefood.block.entity.BlackTeaStage1BlockEntity;
import net.pokefood.block.entity.BlackTeaStage0BlockEntity;
import net.pokefood.block.entity.BigOvenOnBlockEntity;
import net.pokefood.block.entity.BigOvenBlockEntity;
import net.pokefood.PokefoodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class PokefoodModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES,
			PokefoodMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> POT_EMPTY = register("pot_empty", PokefoodModBlocks.POT_EMPTY, PotEmptyBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CARBONIZER_BOTTLE = register("carbonizer_bottle", PokefoodModBlocks.CARBONIZER_BOTTLE,
			CarbonizerBottleBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BIG_OVEN = register("big_oven", PokefoodModBlocks.BIG_OVEN, BigOvenBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MIXER_RED = register("mixer_red", PokefoodModBlocks.MIXER_RED, MixerRedBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MIXER_PINK = register("mixer_pink", PokefoodModBlocks.MIXER_PINK,
			MixerPinkBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MIXER_YELLOW = register("mixer_yellow", PokefoodModBlocks.MIXER_YELLOW,
			MixerYellowBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MIXER_GREEN = register("mixer_green", PokefoodModBlocks.MIXER_GREEN,
			MixerGreenBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MIXER_BLUE = register("mixer_blue", PokefoodModBlocks.MIXER_BLUE,
			MixerBlueBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> KEG = register("keg", PokefoodModBlocks.KEG, KegBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FRYER = register("fryer", PokefoodModBlocks.FRYER, FryerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ICE_CREAM_MAKER = register("ice_cream_maker", PokefoodModBlocks.ICE_CREAM_MAKER,
			IceCreamMakerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> KEG_FUNNEL = register("keg_funnel", PokefoodModBlocks.KEG_FUNNEL,
			KegFunnelBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ICE_CREAM_EXTENTION = register("ice_cream_extention",
			PokefoodModBlocks.ICE_CREAM_EXTENTION, IceCreamExtentionBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TEA_STAGE_0 = register("tea_stage_0", PokefoodModBlocks.TEA_STAGE_0,
			TeaStage0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TEA_STAGE_1 = register("tea_stage_1", PokefoodModBlocks.TEA_STAGE_1,
			TeaStage1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TEA_STAGE_2 = register("tea_stage_2", PokefoodModBlocks.TEA_STAGE_2,
			TeaStage2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BLACK_TEA_STAGE_0 = register("black_tea_stage_0", PokefoodModBlocks.BLACK_TEA_STAGE_0,
			BlackTeaStage0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BLACK_TEA_STAGE_1 = register("black_tea_stage_1", PokefoodModBlocks.BLACK_TEA_STAGE_1,
			BlackTeaStage1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BLACK_TEA_STAGE_2 = register("black_tea_stage_2", PokefoodModBlocks.BLACK_TEA_STAGE_2,
			BlackTeaStage2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LEMON_STAGE_0 = register("lemon_stage_0", PokefoodModBlocks.LEMON_STAGE_0,
			LemonStage0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LEMON_STAGE_1 = register("lemon_stage_1", PokefoodModBlocks.LEMON_STAGE_1,
			LemonStage1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LEMON_STAGE_2 = register("lemon_stage_2", PokefoodModBlocks.LEMON_STAGE_2,
			LemonStage2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LEMON_STAGE_3 = register("lemon_stage_3", PokefoodModBlocks.LEMON_STAGE_3,
			LemonStage3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LEMON_STAGE_4 = register("lemon_stage_4", PokefoodModBlocks.LEMON_STAGE_4,
			LemonStage4BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LEMON_STAGE_5 = register("lemon_stage_5", PokefoodModBlocks.LEMON_STAGE_5,
			LemonStage5BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LEMON_STAGE_6 = register("lemon_stage_6", PokefoodModBlocks.LEMON_STAGE_6,
			LemonStage6BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CALCUIM_STAGE_0 = register("calcuim_stage_0", PokefoodModBlocks.CALCUIM_STAGE_0,
			CalcuimStage0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CALCUIM_STAGE_1 = register("calcuim_stage_1", PokefoodModBlocks.CALCUIM_STAGE_1,
			CalcuimStage1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CALCUIM_STAGE_2 = register("calcuim_stage_2", PokefoodModBlocks.CALCUIM_STAGE_2,
			CalcuimStage2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CALCUIM_STAGE_3 = register("calcuim_stage_3", PokefoodModBlocks.CALCUIM_STAGE_3,
			CalcuimStage3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> POT_WATER = register("pot_water", PokefoodModBlocks.POT_WATER, PotWaterBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> POT_WATER_FIRED = register("pot_water_fired", PokefoodModBlocks.POT_WATER_FIRED,
			PotWaterFiredBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> POT_TEA = register("pot_tea", PokefoodModBlocks.POT_TEA, PotTeaBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> POT_TEA_FIRED = register("pot_tea_fired", PokefoodModBlocks.POT_TEA_FIRED,
			PotTeaFiredBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> POT_BLACK_TEA = register("pot_black_tea", PokefoodModBlocks.POT_BLACK_TEA,
			PotBlackTeaBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> POT_BLACK_TEA_FIRED = register("pot_black_tea_fired",
			PokefoodModBlocks.POT_BLACK_TEA_FIRED, PotBlackTeaFiredBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> POT_TEA_COOKED = register("pot_tea_cooked", PokefoodModBlocks.POT_TEA_COOKED,
			PotTeaCookedBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> POT_BLACK_TEA_COOKED = register("pot_black_tea_cooked",
			PokefoodModBlocks.POT_BLACK_TEA_COOKED, PotBlackTeaCookedBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> POT_FRESH_WATER = register("pot_fresh_water", PokefoodModBlocks.POT_FRESH_WATER,
			PotFreshWaterBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> POT_WATER_SUGAR = register("pot_water_sugar", PokefoodModBlocks.POT_WATER_SUGAR,
			PotWaterSugarBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> POT_WATER_LEMON = register("pot_water_lemon", PokefoodModBlocks.POT_WATER_LEMON,
			PotWaterLemonBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> POT_LEMONADE = register("pot_lemonade", PokefoodModBlocks.POT_LEMONADE,
			PotLemonadeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> POT_LEMONADE_COOKED = register("pot_lemonade_cooked",
			PokefoodModBlocks.POT_LEMONADE_COOKED, PotLemonadeCookedBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BIG_OVEN_ON = register("big_oven_on", PokefoodModBlocks.BIG_OVEN_ON,
			BigOvenOnBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> POT_ROSERADE_TEA = register("pot_roserade_tea", PokefoodModBlocks.POT_ROSERADE_TEA,
			PotRoseradeTeaBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> POT_ROSERADE_TEA_FIRED = register("pot_roserade_tea_fired",
			PokefoodModBlocks.POT_ROSERADE_TEA_FIRED, PotRoseradeTeaFiredBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> POT_ROSERADE_TEA_COOKED = register("pot_roserade_tea_cooked",
			PokefoodModBlocks.POT_ROSERADE_TEA_COOKED, PotRoseradeTeaCookedBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> KEG_2 = register("keg_2", PokefoodModBlocks.KEG_2, Keg2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> KEG_3 = register("keg_3", PokefoodModBlocks.KEG_3, Keg3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> KEG_4 = register("keg_4", PokefoodModBlocks.KEG_4, Keg4BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> KEG_5 = register("keg_5", PokefoodModBlocks.KEG_5, Keg5BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> KEG_6 = register("keg_6", PokefoodModBlocks.KEG_6, Keg6BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> KEG_7 = register("keg_7", PokefoodModBlocks.KEG_7, Keg7BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> POT_MALT = register("pot_malt", PokefoodModBlocks.POT_MALT, PotMaltBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> POT_MALT_FIRED = register("pot_malt_fired", PokefoodModBlocks.POT_MALT_FIRED,
			PotMaltFiredBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> POT_MALT_COOKED = register("pot_malt_cooked", PokefoodModBlocks.POT_MALT_COOKED,
			PotMaltCookedBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> KEG_FUNNEL_UP = register("keg_funnel_up", PokefoodModBlocks.KEG_FUNNEL_UP,
			KegFunnelUpBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> KEG_FUNNEL_FRONT = register("keg_funnel_front", PokefoodModBlocks.KEG_FUNNEL_FRONT,
			KegFunnelFrontBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ICE_CREAM_EXTENTION_APRI_B = register("ice_cream_extention_apri_b",
			PokefoodModBlocks.ICE_CREAM_EXTENTION_APRI_B, IceCreamExtentionApriBBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ICE_CREAM_EXTENTION_APRI_D = register("ice_cream_extention_apri_d",
			PokefoodModBlocks.ICE_CREAM_EXTENTION_APRI_D, IceCreamExtentionApriDBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ICE_CREAM_EXTENTION_APRI_G = register("ice_cream_extention_apri_g",
			PokefoodModBlocks.ICE_CREAM_EXTENTION_APRI_G, IceCreamExtentionApriGBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ICE_CREAM_EXTENTION_APRI_P = register("ice_cream_extention_apri_p",
			PokefoodModBlocks.ICE_CREAM_EXTENTION_APRI_P, IceCreamExtentionApriPBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ICE_CREAM_EXTENTION_APRI_R = register("ice_cream_extention_apri_r",
			PokefoodModBlocks.ICE_CREAM_EXTENTION_APRI_R, IceCreamExtentionApriRBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ICE_CREAM_EXTENTION_APRI_W = register("ice_cream_extention_apri_w",
			PokefoodModBlocks.ICE_CREAM_EXTENTION_APRI_W, IceCreamExtentionApriWBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ICE_CREAM_EXTENTION_APRI_Y = register("ice_cream_extention_apri_y",
			PokefoodModBlocks.ICE_CREAM_EXTENTION_APRI_Y, IceCreamExtentionApriYBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ICE_CREAM_EXTENTION_LEMONADE = register("ice_cream_extention_lemonade",
			PokefoodModBlocks.ICE_CREAM_EXTENTION_LEMONADE, IceCreamExtentionLemonadeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ICE_CREAM_EXTENTION_TEA = register("ice_cream_extention_tea",
			PokefoodModBlocks.ICE_CREAM_EXTENTION_TEA, IceCreamExtentionTeaBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ICE_CREAM_EXTENTION_TEA_B = register("ice_cream_extention_tea_b",
			PokefoodModBlocks.ICE_CREAM_EXTENTION_TEA_B, IceCreamExtentionTeaBBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ICE_CREAM_EXTENTION_TEA_R = register("ice_cream_extention_tea_r",
			PokefoodModBlocks.ICE_CREAM_EXTENTION_TEA_R, IceCreamExtentionTeaRBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
