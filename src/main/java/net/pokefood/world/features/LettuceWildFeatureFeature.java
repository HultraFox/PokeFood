
package net.pokefood.world.features;

import net.pokefood.procedures.LettuceWildValidPlacementProcedure;

import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.RandomPatchFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

public class LettuceWildFeatureFeature extends RandomPatchFeature {
	public LettuceWildFeatureFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!LettuceWildValidPlacementProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}
