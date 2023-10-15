package net.pokefood.procedures;

import net.pokefood.init.PokefoodModItems;
import net.pokefood.init.PokefoodModBlocks;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

public class VineGrapeCollectingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double randomNbItems = 0;
		if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == PokefoodModBlocks.GRAPE_VINE_2.get() || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == PokefoodModBlocks.GRAPE_SPROUT_2.get())
				&& ((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty("grapes") instanceof IntegerProperty _getip5 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip5) : -1) == 2) {
			randomNbItems = Mth.nextInt(RandomSource.create(), 2, 7);
			for (int index0 = 0; index0 < (int) randomNbItems; index0++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(PokefoodModItems.GREEN_GRAPES.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			{
				int _value = 0;
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("grapes") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
		} else if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == PokefoodModBlocks.GRAPE_VINE_2.get() || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == PokefoodModBlocks.GRAPE_SPROUT_2.get())
				&& ((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty("grapes") instanceof IntegerProperty _getip15 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip15) : -1) == 3) {
			randomNbItems = Mth.nextInt(RandomSource.create(), 2, 7);
			for (int index1 = 0; index1 < (int) randomNbItems; index1++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(PokefoodModItems.BLACK_GRAPES.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			{
				int _value = 0;
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("grapes") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
		}
	}
}
