package net.pokefood.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class BerriesCalculate2Procedure {
	public static String execute(LevelAccessor world, double x, double y, double z) {
		double dry = 0;
		double spicy = 0;
		double sweet = 0;
		double sour = 0;
		double bitter = 0;
		String result = "";
		String result2 = "";
		result = new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "result");
		spicy = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "spicy");
		dry = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "dry");
		sweet = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "sweet");
		bitter = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "bitter");
		sour = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "sour");
		if ((result).equals("spicy")) {
			if (dry > sweet && dry > bitter && dry > sour) {
				if (spicy / 2 <= dry) {
					result2 = "dry";
				}
			} else if (sweet > dry && sweet > bitter && sweet > sour) {
				if (spicy / 2 <= sweet) {
					result2 = "sweet";
				}
			} else if (bitter > dry && bitter > sweet && bitter > sour) {
				if (spicy / 2 <= bitter) {
					result2 = "bitter";
				}
			} else if (sour > dry && sour > sweet && sour > bitter) {
				if (spicy / 2 <= sour) {
					result2 = "sour";
				}
			}
		} else if ((result).equals("dry")) {
			if (spicy > sweet && spicy > bitter && spicy > sour) {
				if (dry / 2 <= spicy) {
					result2 = "spicy";
				}
			} else if (sweet > spicy && sweet > bitter && sweet > sour) {
				if (dry / 2 <= sweet) {
					result2 = "sweet";
				}
			} else if (bitter > spicy && bitter > sweet && bitter > sour) {
				if (dry / 2 <= bitter) {
					result2 = "bitter";
				}
			} else if (sour > spicy && sour > sweet && sour > bitter) {
				if (dry / 2 <= sour) {
					result2 = "sour";
				}
			}
		} else if ((result).equals("sweet")) {
			if (spicy > sweet && spicy > bitter && spicy > sour) {
				if (sweet / 2 <= spicy) {
					result2 = "spicy";
				}
			} else if (dry > spicy && dry > bitter && dry > sour) {
				if (sweet / 2 <= dry) {
					result2 = "dry";
				}
			} else if (bitter > spicy && bitter > dry && bitter > sour) {
				if (sweet / 2 <= bitter) {
					result2 = "bitter";
				}
			} else if (sour > spicy && sour > dry && sour > bitter) {
				if (sweet / 2 <= sour) {
					result2 = "sour";
				}
			}
		} else if ((result).equals("bitter")) {
			if (spicy > dry && spicy > sweet && spicy > sour) {
				if (bitter / 2 <= spicy) {
					result2 = "spicy";
				}
			} else if (dry > spicy && dry > sweet && dry > sour) {
				if (bitter / 2 <= dry) {
					result2 = "dry";
				}
			} else if (sweet > spicy && sweet > dry && sweet > sour) {
				if (bitter / 2 <= sweet) {
					result2 = "sweet";
				}
			} else if (sour > spicy && sour > dry && sour > sweet) {
				if (bitter / 2 <= sour) {
					result2 = "sour";
				}
			}
		} else if ((result).equals("sour")) {
			if (spicy > dry && spicy > sweet && spicy > bitter) {
				if (sour / 2 <= spicy) {
					result2 = "spicy";
				}
			} else if (dry > spicy && dry > sweet && dry > bitter) {
				if (sour / 2 <= dry) {
					result2 = "dry";
				}
			} else if (sweet > spicy && sweet > dry && sweet > bitter) {
				if (sour / 2 <= sweet) {
					result2 = "sweet";
				}
			} else if (bitter > spicy && bitter > dry && bitter > sweet) {
				if (sour / 2 <= bitter) {
					result2 = "bitter";
				}
			}
		}
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putString("result2", result2);
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		return result2;
	}
}
