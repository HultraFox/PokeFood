package net.pokefood.procedures;

import net.pokefood.init.PokefoodModItems;
import net.pokefood.init.PokefoodModBlocks;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
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
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlaceToGoSmallProcedure {
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
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("pokefood:small_to_go_boxes")))) {
				returned = false;
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_FRIES_0.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_FRIES_B_0.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_FRIES_1.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_FRIES_B_1.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_FRIES_2.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_FRIES_B_2.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_FRIES_3.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_FRIES_B_3.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_FRIES_4.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_FRIES_B_4.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_FRIES_5.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_FRIES_B_5.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_FRIES_6.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_FRIES_B_6.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_FRIES_7.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_FRIES_B_7.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_FRIES_8.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_FRIES_B_8.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_FRIES_9.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_FRIES_B_9.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_FRIES_10.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_FRIES_B_10.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_FRIES_11.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_FRIES_B_11.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_FRIES_12.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_FRIES_B_12.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_FRIES_13.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_FRIES_B_13.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_FRIES_14.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_FRIES_B_14.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_FRIES_15.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_FRIES_B_15.get().defaultBlockState(), 3);
					returned = true;
				}
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_LEEK_0.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_LEEK_B_0.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_LEEK_1.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_LEEK_B_1.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_LEEK_2.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_LEEK_B_2.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_LEEK_3.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_LEEK_B_3.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_LEEK_4.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_LEEK_B_4.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_LEEK_5.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_LEEK_B_5.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_LEEK_6.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_LEEK_B_6.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_LEEK_7.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_LEEK_B_7.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_LEEK_8.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_LEEK_B_8.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_LEEK_9.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_LEEK_B_9.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_LEEK_10.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_LEEK_B_10.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_LEEK_11.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_LEEK_B_11.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_LEEK_12.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_LEEK_B_12.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_LEEK_13.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_LEEK_B_13.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_LEEK_14.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_LEEK_B_14.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.TO_GO_LEEK_15.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TO_GO_LEEK_B_15.get().defaultBlockState(), 3);
					returned = true;
				}
				if (returned == true) {
					{
						Direction _dir = ((entity.getDirection()).getOpposite());
						BlockPos _pos = BlockPos.containing(x, y + 1, z);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
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
