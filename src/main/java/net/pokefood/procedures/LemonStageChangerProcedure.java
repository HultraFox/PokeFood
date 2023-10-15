package net.pokefood.procedures;

import net.pokefood.init.PokefoodModBlocks;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

public class LemonStageChangerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double LocalRandomNumber = 0;
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putDouble("cblmfdGrowthTimer", (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "cblmfdGrowthTimer") + 1));
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		if (Mth.nextInt(RandomSource.create(), 1, 3) == 2 && (world.getBlockState(new BlockPos(x, y, z))).getBlock() == PokefoodModBlocks.LEMON_STAGE_0.get()
				&& ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.CAVE_AIR)) {
			world.setBlock(new BlockPos(x, y, z), PokefoodModBlocks.LEMON_STAGE_1.get().defaultBlockState(), 3);
		} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 2 && (world.getBlockState(new BlockPos(x, y, z))).getBlock() == PokefoodModBlocks.LEMON_STAGE_1.get()
				&& ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.CAVE_AIR)) {
			world.setBlock(new BlockPos(x, y, z), PokefoodModBlocks.LEMON_STAGE_2.get().defaultBlockState(), 3);
		} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 2 && (world.getBlockState(new BlockPos(x, y, z))).getBlock() == PokefoodModBlocks.LEMON_STAGE_2.get()) {
			world.setBlock(new BlockPos(x, y, z), PokefoodModBlocks.LEMON_STAGE_3.get().defaultBlockState(), 3);
		} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 2 && (world.getBlockState(new BlockPos(x, y, z))).getBlock() == PokefoodModBlocks.LEMON_STAGE_3.get()) {
			world.setBlock(new BlockPos(x, y, z), PokefoodModBlocks.LEMON_STAGE_4.get().defaultBlockState(), 3);
		} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 2 && (world.getBlockState(new BlockPos(x, y, z))).getBlock() == PokefoodModBlocks.LEMON_STAGE_4.get()) {
			world.setBlock(new BlockPos(x, y, z), PokefoodModBlocks.LEMON_STAGE_5.get().defaultBlockState(), 3);
		} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 2 && (world.getBlockState(new BlockPos(x, y, z))).getBlock() == PokefoodModBlocks.LEMON_STAGE_5.get()) {
			world.setBlock(new BlockPos(x, y, z), PokefoodModBlocks.LEMON_STAGE_6.get().defaultBlockState(), 3);
		}
	}
}
