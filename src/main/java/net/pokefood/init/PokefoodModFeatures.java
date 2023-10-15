
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.pokefood.init;

import net.pokefood.world.features.plants.LettuceWildFeature;
import net.pokefood.world.features.plants.LemonStage3Feature;
import net.pokefood.world.features.plants.LemonStage2Feature;
import net.pokefood.world.features.plants.LemonStage1Feature;
import net.pokefood.world.features.plants.LemonStage0Feature;
import net.pokefood.world.features.plants.CalcuimPlantFeature;
import net.pokefood.world.features.BananaTreeFeature;
import net.pokefood.PokefoodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class PokefoodModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, PokefoodMod.MODID);
	public static final RegistryObject<Feature<?>> LEMON_STAGE_0 = REGISTRY.register("lemon_stage_0", LemonStage0Feature::feature);
	public static final RegistryObject<Feature<?>> LEMON_STAGE_1 = REGISTRY.register("lemon_stage_1", LemonStage1Feature::feature);
	public static final RegistryObject<Feature<?>> LEMON_STAGE_2 = REGISTRY.register("lemon_stage_2", LemonStage2Feature::feature);
	public static final RegistryObject<Feature<?>> LEMON_STAGE_3 = REGISTRY.register("lemon_stage_3", LemonStage3Feature::feature);
	public static final RegistryObject<Feature<?>> CALCUIM_PLANT = REGISTRY.register("calcuim_plant", CalcuimPlantFeature::feature);
	public static final RegistryObject<Feature<?>> LETTUCE_WILD = REGISTRY.register("lettuce_wild", LettuceWildFeature::feature);
	public static final RegistryObject<Feature<?>> BANANA_TREE = REGISTRY.register("banana_tree", BananaTreeFeature::feature);
}
