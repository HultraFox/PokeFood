package net.pokefood.procedures;

import net.pokefood.init.PokefoodModBlocks;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class BananaWoodTreeControlProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double rNB = 0;
		if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x, y, z), "broken")) == false) {
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "age") == 1
					&& !((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == PokefoodModBlocks.BANANA_LOG_3.get() && (world.getBlockState(new BlockPos(x, y + 2, z))).getBlock() == PokefoodModBlocks.BANANA_TOP.get())) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putBoolean("broken", true);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "age") == 2 && !((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == PokefoodModBlocks.BANANA_LOG_2.get()
					&& (world.getBlockState(new BlockPos(x, y + 2, z))).getBlock() == PokefoodModBlocks.BANANA_LOG_2.get() && (world.getBlockState(new BlockPos(x, y + 3, z))).getBlock() == PokefoodModBlocks.BANANA_LOG_3.get()
					&& (world.getBlockState(new BlockPos(x, y + 4, z))).getBlock() == PokefoodModBlocks.BANANA_LOG_3.get() && (world.getBlockState(new BlockPos(x, y + 5, z))).getBlock() == PokefoodModBlocks.BANANA_TOP.get())) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putBoolean("broken", true);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
			if ((new Object() {
				public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getBoolean(tag);
					return false;
				}
			}.getValue(world, new BlockPos(x, y, z), "broken")) == false && new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "age") == 0 && Mth.nextInt(RandomSource.create(), 1, 5) == 2 && (world instanceof Level _lvl22 && _lvl22.isDay()) == true) {
				if ((world.getBlockState(new BlockPos(x + 1, y + 0, z - 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
						&& (world.getBlockState(new BlockPos(x + 1, y + 0, z + 0))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
						&& (world.getBlockState(new BlockPos(x + 1, y + 0, z + 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
						&& (world.getBlockState(new BlockPos(x - 1, y + 0, z - 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
						&& (world.getBlockState(new BlockPos(x - 1, y + 0, z + 0))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
						&& (world.getBlockState(new BlockPos(x - 1, y + 0, z + 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
						&& (world.getBlockState(new BlockPos(x + 0, y + 0, z - 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
						&& (world.getBlockState(new BlockPos(x + 0, y + 0, z + 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))) {
					if ((world.getBlockState(new BlockPos(x + 1, y + 1, z - 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
							&& (world.getBlockState(new BlockPos(x + 1, y + 1, z + 0))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
							&& (world.getBlockState(new BlockPos(x + 1, y + 1, z + 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
							&& (world.getBlockState(new BlockPos(x - 1, y + 1, z - 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
							&& (world.getBlockState(new BlockPos(x - 1, y + 1, z + 0))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
							&& (world.getBlockState(new BlockPos(x - 1, y + 1, z + 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
							&& (world.getBlockState(new BlockPos(x + 0, y + 1, z - 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
							&& (world.getBlockState(new BlockPos(x + 0, y + 1, z + 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))) {
						if ((world.getBlockState(new BlockPos(x + 1, y + 2, z - 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
								&& (world.getBlockState(new BlockPos(x + 1, y + 2, z + 0))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
								&& (world.getBlockState(new BlockPos(x + 1, y + 2, z + 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
								&& (world.getBlockState(new BlockPos(x - 1, y + 2, z - 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
								&& (world.getBlockState(new BlockPos(x - 1, y + 2, z + 0))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
								&& (world.getBlockState(new BlockPos(x - 1, y + 2, z + 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
								&& (world.getBlockState(new BlockPos(x + 0, y + 2, z - 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
								&& (world.getBlockState(new BlockPos(x + 0, y + 2, z + 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("pokefood", "banana_tree_small"));
								if (template != null) {
									template.placeInWorld(_serverworld, new BlockPos(x - 1, y, z - 1), new BlockPos(x - 1, y, z - 1), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putDouble("age", 1);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						}
					}
				}
			} else if ((new Object() {
				public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getBoolean(tag);
					return false;
				}
			}.getValue(world, new BlockPos(x, y, z), "broken")) == false && new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "age") == 1 && Mth.nextInt(RandomSource.create(), 1, 5) == 2 && (world instanceof Level _lvl76 && _lvl76.isDay()) == true) {
				if ((world.getBlockState(new BlockPos(x + 1, y + 0, z - 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
						&& (world.getBlockState(new BlockPos(x + 1, y + 0, z + 0))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
						&& (world.getBlockState(new BlockPos(x + 1, y + 0, z + 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
						&& (world.getBlockState(new BlockPos(x - 1, y + 0, z - 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
						&& (world.getBlockState(new BlockPos(x - 1, y + 0, z + 0))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
						&& (world.getBlockState(new BlockPos(x - 1, y + 0, z + 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
						&& (world.getBlockState(new BlockPos(x + 0, y + 0, z - 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
						&& (world.getBlockState(new BlockPos(x + 0, y + 0, z + 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))) {
					if ((world.getBlockState(new BlockPos(x + 1, y + 1, z - 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
							&& (world.getBlockState(new BlockPos(x + 1, y + 1, z + 0))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
							&& (world.getBlockState(new BlockPos(x + 1, y + 1, z + 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
							&& (world.getBlockState(new BlockPos(x - 1, y + 1, z - 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
							&& (world.getBlockState(new BlockPos(x - 1, y + 1, z + 0))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
							&& (world.getBlockState(new BlockPos(x - 1, y + 1, z + 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
							&& (world.getBlockState(new BlockPos(x + 0, y + 1, z - 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
							&& (world.getBlockState(new BlockPos(x + 0, y + 1, z + 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))) {
						if ((world.getBlockState(new BlockPos(x + 1, y + 2, z - 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
								&& ((world.getBlockState(new BlockPos(x + 1, y + 2, z + 0))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
										|| (world.getBlockState(new BlockPos(x + 1, y + 2, z + 0))).getBlock() == PokefoodModBlocks.BANANA_LEAVES.get())
								&& (world.getBlockState(new BlockPos(x + 1, y + 2, z + 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
								&& (world.getBlockState(new BlockPos(x - 1, y + 2, z - 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
								&& ((world.getBlockState(new BlockPos(x - 1, y + 2, z + 0))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
										|| (world.getBlockState(new BlockPos(x - 1, y + 2, z + 0))).getBlock() == PokefoodModBlocks.BANANA_LEAVES.get())
								&& (world.getBlockState(new BlockPos(x - 1, y + 2, z + 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
								&& ((world.getBlockState(new BlockPos(x + 0, y + 2, z - 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
										|| (world.getBlockState(new BlockPos(x + 0, y + 2, z - 1))).getBlock() == PokefoodModBlocks.BANANA_LEAVES.get())
								&& ((world.getBlockState(new BlockPos(x + 0, y + 2, z + 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
										|| (world.getBlockState(new BlockPos(x + 0, y + 2, z + 1))).getBlock() == PokefoodModBlocks.BANANA_LEAVES.get())) {
							if ((world.getBlockState(new BlockPos(x + 1, y + 3, z - 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
									&& (world.getBlockState(new BlockPos(x + 1, y + 3, z + 0))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
									&& (world.getBlockState(new BlockPos(x + 1, y + 3, z + 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
									&& (world.getBlockState(new BlockPos(x - 1, y + 3, z - 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
									&& (world.getBlockState(new BlockPos(x - 1, y + 3, z + 0))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
									&& (world.getBlockState(new BlockPos(x - 1, y + 3, z + 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
									&& (world.getBlockState(new BlockPos(x + 0, y + 3, z - 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
									&& (world.getBlockState(new BlockPos(x + 0, y + 3, z + 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
									&& (world.getBlockState(new BlockPos(x + 0, y + 3, z + 0))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))) {
								if ((world.getBlockState(new BlockPos(x + 1, y + 4, z - 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
										&& (world.getBlockState(new BlockPos(x + 1, y + 4, z + 0))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
										&& (world.getBlockState(new BlockPos(x + 1, y + 4, z + 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
										&& (world.getBlockState(new BlockPos(x - 1, y + 4, z - 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
										&& (world.getBlockState(new BlockPos(x - 1, y + 4, z + 0))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
										&& (world.getBlockState(new BlockPos(x - 1, y + 4, z + 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
										&& (world.getBlockState(new BlockPos(x + 0, y + 4, z - 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
										&& (world.getBlockState(new BlockPos(x + 0, y + 4, z + 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
										&& (world.getBlockState(new BlockPos(x + 0, y + 4, z + 0))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))) {
									if ((world.getBlockState(new BlockPos(x + 1, y + 5, z - 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
											&& (world.getBlockState(new BlockPos(x + 1, y + 5, z + 0))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
											&& (world.getBlockState(new BlockPos(x + 1, y + 5, z + 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
											&& (world.getBlockState(new BlockPos(x - 1, y + 5, z - 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
											&& (world.getBlockState(new BlockPos(x - 1, y + 5, z + 0))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
											&& (world.getBlockState(new BlockPos(x - 1, y + 5, z + 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
											&& (world.getBlockState(new BlockPos(x + 0, y + 5, z - 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
											&& (world.getBlockState(new BlockPos(x + 0, y + 5, z + 1))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))
											&& (world.getBlockState(new BlockPos(x + 0, y + 5, z + 0))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))) {
										if (world instanceof ServerLevel _serverworld) {
											StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("pokefood", "banana_tree"));
											if (template != null) {
												template.placeInWorld(_serverworld, new BlockPos(x - 1, y, z - 1), new BlockPos(x - 1, y, z - 1), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
														_serverworld.random, 3);
											}
										}
										if (!world.isClientSide()) {
											BlockPos _bp = new BlockPos(x, y, z);
											BlockEntity _blockEntity = world.getBlockEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_blockEntity != null)
												_blockEntity.getPersistentData().putDouble("age", 2);
											if (world instanceof Level _level)
												_level.sendBlockUpdated(_bp, _bs, _bs, 3);
										}
									}
								}
							}
						}
					}
				}
			} else if ((new Object() {
				public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getBoolean(tag);
					return false;
				}
			}.getValue(world, new BlockPos(x, y, z), "broken")) == false && new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "age") == 2 && Mth.nextInt(RandomSource.create(), 1, 3) == 2) {
				rNB = Mth.nextInt(RandomSource.create(), 1, 4);
				if ((world.getBlockState(new BlockPos(x + 1, y + 4, z - 0))).is(BlockTags.create(new ResourceLocation("forge:is_air"))) && rNB == 1) {
					world.setBlock(new BlockPos(x + 1, y + 4, z - 0), PokefoodModBlocks.BANANA_UNRIPED.get().defaultBlockState(), 3);
					{
						Direction _dir = Direction.EAST;
						BlockPos _pos = new BlockPos(x + 1, y + 4, z - 0);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
				}
				if ((world.getBlockState(new BlockPos(x - 1, y + 4, z - 0))).is(BlockTags.create(new ResourceLocation("forge:is_air"))) && rNB == 2) {
					world.setBlock(new BlockPos(x - 1, y + 4, z - 0), PokefoodModBlocks.BANANA_UNRIPED.get().defaultBlockState(), 3);
					{
						Direction _dir = Direction.WEST;
						BlockPos _pos = new BlockPos(x - 1, y + 4, z - 0);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
				}
				if ((world.getBlockState(new BlockPos(x - 0, y + 4, z + 1))).is(BlockTags.create(new ResourceLocation("forge:is_air"))) && rNB == 3) {
					world.setBlock(new BlockPos(x - 0, y + 4, z + 1), PokefoodModBlocks.BANANA_UNRIPED.get().defaultBlockState(), 3);
					{
						Direction _dir = Direction.SOUTH;
						BlockPos _pos = new BlockPos(x - 0, y + 4, z + 1);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
				}
				if ((world.getBlockState(new BlockPos(x - 0, y + 4, z - 1))).is(BlockTags.create(new ResourceLocation("forge:is_air"))) && rNB == 4) {
					world.setBlock(new BlockPos(x - 0, y + 4, z - 1), PokefoodModBlocks.BANANA_UNRIPED.get().defaultBlockState(), 3);
					{
						Direction _dir = Direction.NORTH;
						BlockPos _pos = new BlockPos(x - 0, y + 4, z - 1);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
				}
			}
		}
	}
}
