package net.pokefood.procedures;

import net.pokefood.init.PokefoodModBlocks;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class CoffeeMakerupdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == PokefoodModBlocks.COFFEE_MAKER_COOKED.get()) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 1), (z + 0.5), 10, 0, 0.5, 0, 0.05);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.candle.extinguish")), SoundSource.BLOCKS, 1, 2);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.candle.extinguish")), SoundSource.BLOCKS, 1, 2, false);
				}
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == PokefoodModBlocks.COFFEE_MAKER_COOKING.get()) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 1), (z + 0.5), 3, 0, 0.5, 0, 0.05);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.candle.extinguish")), SoundSource.BLOCKS, (float) 0.7, (float) 0.5);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.candle.extinguish")), SoundSource.BLOCKS, (float) 0.7, (float) 0.5, false);
				}
			}
		}
	}
}
