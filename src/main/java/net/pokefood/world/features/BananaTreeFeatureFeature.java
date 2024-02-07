
package net.pokefood.world.features;

import net.pokefood.world.features.configurations.StructureFeatureConfiguration;
import net.pokefood.procedures.BananaTreeValidPlacementProcedure;

import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

public class BananaTreeFeatureFeature extends StructureFeature {
	public BananaTreeFeatureFeature() {
		super(StructureFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<StructureFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!BananaTreeValidPlacementProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}
