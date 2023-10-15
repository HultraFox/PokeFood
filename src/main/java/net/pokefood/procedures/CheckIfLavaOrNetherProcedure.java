package net.pokefood.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.BlockState;
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
		BlockState changeToBlock = Blocks.AIR.defaultBlockState();
		boolean changeBlock = false;
		double yChange = 0;
		double zChange = 0;
		double xChange = 0;
		if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == Level.NETHER) {
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
		} else {
			if ((world.getBlockState(new BlockPos(x + 1, y + 0, z + 0))).getBlock() == Blocks.LAVA || (world.getBlockState(new BlockPos(x + 1, y + 0, z + 0))).getBlock() == Blocks.LAVA) {
				xChange = x + 1;
				yChange = y + 0;
				zChange = z + 0;
				changeBlock = true;
			} else if ((world.getBlockState(new BlockPos(x + 0, y + 1, z + 0))).getBlock() == Blocks.LAVA || (world.getBlockState(new BlockPos(x + 0, y + 1, z + 0))).getBlock() == Blocks.LAVA) {
				xChange = x + 0;
				yChange = y + 0;
				zChange = z + 0;
				changeBlock = true;
			} else if ((world.getBlockState(new BlockPos(x + 0, y + 0, z + 1))).getBlock() == Blocks.LAVA || (world.getBlockState(new BlockPos(x + 0, y + 0, z + 1))).getBlock() == Blocks.LAVA) {
				xChange = x + 0;
				yChange = y + 0;
				zChange = z + 1;
				changeBlock = true;
			} else if ((world.getBlockState(new BlockPos(x - 1, y - 0, z - 0))).getBlock() == Blocks.LAVA || (world.getBlockState(new BlockPos(x - 1, y - 0, z - 0))).getBlock() == Blocks.LAVA) {
				xChange = x - 1;
				yChange = y - 0;
				zChange = z - 0;
				changeBlock = true;
			} else if ((world.getBlockState(new BlockPos(x - 0, y - 1, z - 0))).getBlock() == Blocks.LAVA || (world.getBlockState(new BlockPos(x - 0, y - 1, z - 0))).getBlock() == Blocks.LAVA) {
				xChange = x - 0;
				yChange = y - 1;
				zChange = z - 0;
				changeBlock = true;
			} else if ((world.getBlockState(new BlockPos(x - 0, y - 0, z - 1))).getBlock() == Blocks.LAVA || (world.getBlockState(new BlockPos(x - 0, y - 0, z - 1))).getBlock() == Blocks.LAVA) {
				xChange = x - 0;
				yChange = y - 0;
				zChange = z - 1;
				changeBlock = true;
			}
			if (changeBlock == true) {
				if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("pokefood:to_cobble")))) {
					changeToBlock = Blocks.COBBLESTONE.defaultBlockState();
				} else if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("pokefood:to_dripstone")))) {
					changeToBlock = Blocks.DRIPSTONE_BLOCK.defaultBlockState();
				} else if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("pokefood:to_tuff")))) {
					changeToBlock = Blocks.TUFF.defaultBlockState();
				} else if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("pokefood:to_calcite")))) {
					changeToBlock = Blocks.CALCITE.defaultBlockState();
				} else if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("pokefood:to_deepslate")))) {
					changeToBlock = Blocks.DEEPSLATE.defaultBlockState();
				} else if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("pokefood:to_andesite")))) {
					changeToBlock = Blocks.ANDESITE.defaultBlockState();
				} else if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("pokefood:to_diorite")))) {
					changeToBlock = Blocks.DIORITE.defaultBlockState();
				} else if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("pokefood:to_granite")))) {
					changeToBlock = Blocks.GRANITE.defaultBlockState();
				} else if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("pokefood:to_stone")))) {
					changeToBlock = Blocks.STONE.defaultBlockState();
				}
				world.setBlock(new BlockPos(xChange, yChange, zChange), changeToBlock, 3);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(xChange, yChange, zChange), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.extinguish")), SoundSource.BLOCKS, (float) 0.5, 1);
					} else {
						_level.playLocalSound(xChange, yChange, zChange, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.extinguish")), SoundSource.BLOCKS, (float) 0.5, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.LARGE_SMOKE, (xChange + 0.5), (yChange + 0.5), (zChange + 0.5), 5, 0, 0, 0, 0.1);
			}
		}
	}
}
