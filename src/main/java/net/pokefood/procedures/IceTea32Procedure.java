package net.pokefood.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class IceTea32Procedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double fluid_quantity = 0;
		String fluid_name = "";
		fluid_quantity = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "tank_3_quantity");
		fluid_name = new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "tank_3_name");
		if ((fluid_name).equals("tea") && fluid_quantity == 2) {
			return true;
		}
		return false;
	}
}
