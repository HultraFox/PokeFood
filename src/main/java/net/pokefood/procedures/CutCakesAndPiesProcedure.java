package net.pokefood.procedures;

import net.pokefood.init.PokefoodModItems;
import net.pokefood.init.PokefoodModBlocks;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CutCakesAndPiesProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PokefoodModBlocks.CHOCOLATE_CAKE.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PokefoodModBlocks.CHERRY_CAKE.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PokefoodModBlocks.BANANA_CAKE.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PokefoodModBlocks.BLACK_GRAPES_CAKE.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PokefoodModBlocks.LEMON_PIE.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PokefoodModBlocks.LIME_PIE.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PokefoodModBlocks.SWEET_BERRIES_PIE.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PokefoodModBlocks.APPLE_PIE.get()) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PokefoodModBlocks.CHOCOLATE_CAKE.get()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(PokefoodModItems.CHOCOLATE_CAKE_SLICE.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PokefoodModBlocks.CHERRY_CAKE.get()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(PokefoodModItems.CHERRY_CAKE_SLICE.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PokefoodModBlocks.BANANA_CAKE.get()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(PokefoodModItems.BANANA_CAKE_SLICE.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PokefoodModBlocks.BLACK_GRAPES_CAKE.get()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(PokefoodModItems.BLACK_GRAPES_CAKE_SLICE.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PokefoodModBlocks.LEMON_PIE.get()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(PokefoodModItems.LEMON_PIE_SLICE.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PokefoodModBlocks.LIME_PIE.get()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(PokefoodModItems.LIME_PIE_SLICE.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PokefoodModBlocks.SWEET_BERRIES_PIE.get()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(PokefoodModItems.SWEET_BERRIES_PIE_SLICE.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PokefoodModBlocks.APPLE_PIE.get()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(PokefoodModItems.APPLE_PIE_SLICE.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
			if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("parts") instanceof IntegerProperty _getip41 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip41) : -1) < 3) {
				{
					int _value = (int) (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("parts") instanceof IntegerProperty _getip43
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip43)
							: -1) + 1);
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("parts") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else {
				world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.place")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.place")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
		}
	}
}
