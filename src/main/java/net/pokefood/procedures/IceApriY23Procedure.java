package net.pokefood.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class IceApriY23Procedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		String fluid_name = "";
		double fluid_quantity = 0;
		fluid_name = new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, BlockPos.containing(x, y, z), "tank_2_name");
		fluid_quantity = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "tank_2_quantity");
		if ((fluid_name).equals("apri_y") && fluid_quantity == 3) {
			return true;
		}
		return false;
	}
}
