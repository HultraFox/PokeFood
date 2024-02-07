package net.pokefood.procedures;

import net.pokefood.init.PokefoodModItems;
import net.pokefood.init.PokefoodModBlocks;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class PlantOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		boolean returned = false;
		if (blockstate.getBlock() == PokefoodModBlocks.GREEN_TEA_PLANT.get()) {
			if ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip3 ? blockstate.getValue(_getip3) : -1) < 2) {
				{
					int _value = (int) ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip5 ? blockstate.getValue(_getip5) : -1) + 1);
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else {
				for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 1, 3); index0++) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(PokefoodModItems.TEA_LEAF.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sweet_berry_bush.pick_berries")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sweet_berry_bush.pick_berries")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		} else if (blockstate.getBlock() == PokefoodModBlocks.BLACK_TEA_PLANT.get()) {
			if ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip13 ? blockstate.getValue(_getip13) : -1) < 2) {
				{
					int _value = (int) ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip15 ? blockstate.getValue(_getip15) : -1) + 1);
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else {
				for (int index1 = 0; index1 < Mth.nextInt(RandomSource.create(), 1, 3); index1++) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(PokefoodModItems.BLACK_TEA_LEAF.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sweet_berry_bush.pick_berries")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sweet_berry_bush.pick_berries")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		} else if (blockstate.getBlock() == PokefoodModBlocks.CALCUIM_CROP.get()) {
			if ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip23 ? blockstate.getValue(_getip23) : -1) < 3) {
				{
					int _value = (int) ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip25 ? blockstate.getValue(_getip25) : -1) + 1);
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else {
				for (int index2 = 0; index2 < Mth.nextInt(RandomSource.create(), 1, 2); index2++) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(PokefoodModItems.CALCUIM.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sweet_berry_bush.pick_berries")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sweet_berry_bush.pick_berries")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		} else if (blockstate.getBlock() == PokefoodModBlocks.GRAPE_VINE_2.get()) {
			if ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip33 ? blockstate.getValue(_getip33) : -1) < 5) {
				{
					int _value = (int) ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip35 ? blockstate.getValue(_getip35) : -1) + 1);
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else {
				for (int index3 = 0; index3 < Mth.nextInt(RandomSource.create(), 2, 7); index3++) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(PokefoodModItems.BLACK_GRAPES.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sweet_berry_bush.pick_berries")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sweet_berry_bush.pick_berries")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		} else if (blockstate.getBlock() == PokefoodModBlocks.ONION_PLANT.get()) {
			if ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip43 ? blockstate.getValue(_getip43) : -1) < 2
					|| (blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip45 ? blockstate.getValue(_getip45) : -1) >= 3
							&& (blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip47 ? blockstate.getValue(_getip47) : -1) < 5) {
				{
					int _value = (int) ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip49 ? blockstate.getValue(_getip49) : -1) + Mth.nextInt(RandomSource.create(), 1, 2));
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else if ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip53 ? blockstate.getValue(_getip53) : -1) < 3
					|| (blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip55 ? blockstate.getValue(_getip55) : -1) == 5) {
				{
					int _value = (int) ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip57 ? blockstate.getValue(_getip57) : -1) + 1);
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		} else if (blockstate.getBlock() == PokefoodModBlocks.LEEK_PLANT.get() || blockstate.getBlock() == PokefoodModBlocks.LETTUCE_PLANT.get() || blockstate.getBlock() == PokefoodModBlocks.RICE_STAGE_5.get()) {
			{
				int _value = (int) ((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip66 ? blockstate.getValue(_getip66) : -1) + 1);
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
	}
}
