
package net.pokefood.world.features;

import net.pokefood.procedures.GrapeSproutValidPlacementProcedure;

import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.RandomPatchFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

public class GrapeSproutFeatureFeature extends RandomPatchFeature {
	public GrapeSproutFeatureFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!GrapeSproutValidPlacementProcedure.execute(y))
			return false;
		return super.place(context);
	}
}
