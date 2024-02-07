
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.pokefood.init;

import net.pokefood.world.features.LettuceWildFeatureFeature;
import net.pokefood.world.features.GrapeSproutFeatureFeature;
import net.pokefood.world.features.BananaTreeFeatureFeature;
import net.pokefood.PokefoodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class PokefoodModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, PokefoodMod.MODID);
	public static final RegistryObject<Feature<?>> LETTUCE_WILD_FEATURE = REGISTRY.register("lettuce_wild_feature", LettuceWildFeatureFeature::new);
	public static final RegistryObject<Feature<?>> BANANA_TREE_FEATURE = REGISTRY.register("banana_tree_feature", BananaTreeFeatureFeature::new);
	public static final RegistryObject<Feature<?>> GRAPE_SPROUT_FEATURE = REGISTRY.register("grape_sprout_feature", GrapeSproutFeatureFeature::new);
}
