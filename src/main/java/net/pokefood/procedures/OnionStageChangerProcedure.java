package net.pokefood.procedures;

import net.pokefood.init.PokefoodModBlocks;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import java.util.Map;

public class OnionStageChangerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Mth.nextInt(RandomSource.create(), 1, 3) == 2 && (world.getBlockState(new BlockPos(x, y, z))).getBlock() == PokefoodModBlocks.ONION_STAGE_0.get()) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = PokefoodModBlocks.ONION_STAGE_1.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 2 && (world.getBlockState(new BlockPos(x, y, z))).getBlock() == PokefoodModBlocks.ONION_STAGE_1.get()) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = PokefoodModBlocks.ONION_STAGE_2.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 2 && (world.getBlockState(new BlockPos(x, y, z))).getBlock() == PokefoodModBlocks.ONION_STAGE_2.get()) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = PokefoodModBlocks.ONION_STAGE_3.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 2 && (world.getBlockState(new BlockPos(x, y, z))).getBlock() == PokefoodModBlocks.ONION_STAGE_3.get()) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = PokefoodModBlocks.ONION_STAGE_4.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 2 && (world.getBlockState(new BlockPos(x, y, z))).getBlock() == PokefoodModBlocks.ONION_STAGE_4.get()) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = PokefoodModBlocks.ONION_STAGE_5.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 2 && (world.getBlockState(new BlockPos(x, y, z))).getBlock() == PokefoodModBlocks.ONION_STAGE_5.get()) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = PokefoodModBlocks.ONION_STAGE_6.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
	}
}
