package net.pokefood.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class CheckIfLavaOrNetherProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x + 1, y + 0, z + 0))).getBlock() == Blocks.LAVA || (world.getBlockState(new BlockPos(x - 1, y + 0, z + 0))).getBlock() == Blocks.LAVA
				|| (world.getBlockState(new BlockPos(x + 0, y + 1, z + 0))).getBlock() == Blocks.LAVA || (world.getBlockState(new BlockPos(x + 0, y - 1, z + 0))).getBlock() == Blocks.LAVA
				|| (world.getBlockState(new BlockPos(x + 0, y + 0, z + 1))).getBlock() == Blocks.LAVA || (world.getBlockState(new BlockPos(x + 0, y + 0, z - 1))).getBlock() == Blocks.LAVA
				|| (world.getBlockState(new BlockPos(x + 1, y + 0, z + 0))).getBlock() == Blocks.LAVA || (world.getBlockState(new BlockPos(x - 1, y + 0, z + 0))).getBlock() == Blocks.LAVA
				|| (world.getBlockState(new BlockPos(x + 0, y + 1, z + 0))).getBlock() == Blocks.LAVA || (world.getBlockState(new BlockPos(x + 0, y - 1, z + 0))).getBlock() == Blocks.LAVA
				|| (world.getBlockState(new BlockPos(x + 0, y + 0, z + 1))).getBlock() == Blocks.LAVA || (world.getBlockState(new BlockPos(x + 0, y + 0, z - 1))).getBlock() == Blocks.LAVA) {
			if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("pokefood:to_cobble")))) {
				world.setBlock(new BlockPos(x, y, z), Blocks.COBBLESTONE.defaultBlockState(), 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("pokefood:to_dripstone")))) {
				world.setBlock(new BlockPos(x, y, z), Blocks.DRIPSTONE_BLOCK.defaultBlockState(), 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("pokefood:to_tuff")))) {
				world.setBlock(new BlockPos(x, y, z), Blocks.TUFF.defaultBlockState(), 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("pokefood:to_calcite")))) {
				world.setBlock(new BlockPos(x, y, z), Blocks.CALCITE.defaultBlockState(), 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("pokefood:to_deepslate")))) {
				world.setBlock(new BlockPos(x, y, z), Blocks.DEEPSLATE.defaultBlockState(), 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("pokefood:to_andesite")))) {
				world.setBlock(new BlockPos(x, y, z), Blocks.ANDESITE.defaultBlockState(), 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("pokefood:to_diorite")))) {
				world.setBlock(new BlockPos(x, y, z), Blocks.DIORITE.defaultBlockState(), 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("pokefood:to_granite")))) {
				world.setBlock(new BlockPos(x, y, z), Blocks.GRANITE.defaultBlockState(), 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("pokefood:to_stone")))) {
				world.setBlock(new BlockPos(x, y, z), Blocks.STONE.defaultBlockState(), 3);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.extinguish")), SoundSource.BLOCKS, (float) 0.5, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.extinguish")), SoundSource.BLOCKS, (float) 0.5, 1, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.LARGE_SMOKE, (x + 0.5), (y + 0.5), (z + 0.5), 5, 0, 0, 0, 0.1);
		} else if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == Level.NETHER) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.extinguish")), SoundSource.BLOCKS, (float) 0.5, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.extinguish")), SoundSource.BLOCKS, (float) 0.5, 1, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.LARGE_SMOKE, (x + 0.5), (y + 0.5), (z + 0.5), 5, 0, 0, 0, 0.1);
		}
	}
}
