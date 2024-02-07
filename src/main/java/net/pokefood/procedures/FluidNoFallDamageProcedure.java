package net.pokefood.procedures;

import net.minecraft.world.entity.Entity;

public class FluidNoFallDamageProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.fallDistance = 0;
	}
}
