package net.pokefood.procedures;

import net.pokefood.init.PokefoodModBlocks;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.Map;

public class VineGrapeStateChangerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		double maxRange = 0;
		maxRange = 5;
		if (((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection((world.getBlockState(new BlockPos(x, y, z))))) == Direction.NORTH || (new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection((world.getBlockState(new BlockPos(x, y, z))))) == Direction.SOUTH) && (!(world.getBlockState(new BlockPos(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("pokefood:grapes_can_grow_next_to")))
				|| !(world.getBlockState(new BlockPos(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("pokefood:grapes_can_grow_next_to")))) || ((new Object() {
					public Direction getDirection(BlockState _bs) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp)
							return _bs.getValue(_dp);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
								? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
								: Direction.NORTH;
					}
				}.getDirection((world.getBlockState(new BlockPos(x, y, z))))) == Direction.WEST || (new Object() {
					public Direction getDirection(BlockState _bs) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp)
							return _bs.getValue(_dp);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
								? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
								: Direction.NORTH;
					}
				}.getDirection((world.getBlockState(new BlockPos(x, y, z))))) == Direction.EAST) && (!(world.getBlockState(new BlockPos(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("pokefood:grapes_can_grow_next_to")))
						|| !(world.getBlockState(new BlockPos(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("pokefood:grapes_can_grow_next_to"))))) {
			maxRange = 15;
		}
		if (Mth.nextInt(RandomSource.create(), 1, (int) maxRange) == 2 && (world.getBlockState(new BlockPos(x, y, z))).getBlock() == PokefoodModBlocks.GRAPE_VINE_0.get()) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = PokefoodModBlocks.GRAPE_VINE_1.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata();
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.load(_bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, (int) maxRange) == 2 && (world.getBlockState(new BlockPos(x, y, z))).getBlock() == PokefoodModBlocks.GRAPE_VINE_1.get()) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = PokefoodModBlocks.GRAPE_VINE_2.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata();
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.load(_bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, (int) maxRange) == 2 && (world.getBlockState(new BlockPos(x, y, z))).getBlock() == PokefoodModBlocks.GRAPE_VINE_2.get()) {
			if ((blockstate.getBlock().getStateDefinition().getProperty("grapes") instanceof IntegerProperty _getip32 ? blockstate.getValue(_getip32) : -1) != 3) {
				{
					int _value = (int) ((blockstate.getBlock().getStateDefinition().getProperty("grapes") instanceof IntegerProperty _getip34 ? blockstate.getValue(_getip34) : -1) + 1);
					BlockPos _pos = new BlockPos(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("grapes") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		}
		if (Mth.nextInt(RandomSource.create(), 1, (int) maxRange) == 2 && (world.getBlockState(new BlockPos(x, y, z))).getBlock() == PokefoodModBlocks.GRAPE_SPROUT.get()) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = PokefoodModBlocks.GRAPE_SPROUT_1.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata();
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.load(_bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, (int) maxRange) == 2 && (world.getBlockState(new BlockPos(x, y, z))).getBlock() == PokefoodModBlocks.GRAPE_SPROUT_1.get()) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = PokefoodModBlocks.GRAPE_SPROUT_2.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata();
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.load(_bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, (int) maxRange) == 2 && (world.getBlockState(new BlockPos(x, y, z))).getBlock() == PokefoodModBlocks.GRAPE_SPROUT_2.get()) {
			if ((blockstate.getBlock().getStateDefinition().getProperty("grapes") instanceof IntegerProperty _getip48 ? blockstate.getValue(_getip48) : -1) != 3) {
				{
					int _value = (int) ((blockstate.getBlock().getStateDefinition().getProperty("grapes") instanceof IntegerProperty _getip50 ? blockstate.getValue(_getip50) : -1) + 1);
					BlockPos _pos = new BlockPos(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("grapes") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		}
	}
}
