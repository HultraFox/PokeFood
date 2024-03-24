package net.pokefood.procedures;

import net.pokefood.init.PokefoodModItems;
import net.pokefood.init.PokefoodModBlocks;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlaceJarsProcedure {
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
		boolean returned = false;
		if (entity.isShiftKeyDown() == true && (world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("forge:replaceable_blocks")))) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("pokefood:jars")))) {
				returned = false;
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.JAR.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.JAM_JAR.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.LEMON_JAM.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.LEMON_JAR.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.LIME_JAM.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.LIME_JAR.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.GREEN_GRAPES_JAM.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.GREEN_GRAPES_JAR.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.BLACK_GRAPES_JAM.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.BLACK_GRAPES_JAR.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.BANANA_JAM.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.BANANA_JAR.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.CHERRY_JAM.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.CHERRY_JAR.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.APPLE_JAM.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.APPLE_JAR.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.MELON_JAM.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.MELON_JAR.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.SWEET_BERRIES_JAM.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.SWEET_BERRIES_JAR.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.GLOW_BERRIES_JAM.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.GLOW_BERRIES_JAR.get().defaultBlockState(), 3);
					returned = true;
				}
				if (returned == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.place")), SoundSource.BLOCKS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.place")), SoundSource.BLOCKS, 1, 1, false);
						}
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					if (!(new Object() {
						public boolean checkGamemode(Entity _ent) {
							if (_ent instanceof ServerPlayer _serverPlayer) {
								return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
							} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
								return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
										&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
							}
							return false;
						}
					}.checkGamemode(entity))) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
				}
			}
		}
	}
}
