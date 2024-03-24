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
public class PlaceAlcoholProcedure {
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
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("pokefood:alcohol")))
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.BIG_GLASS.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.WINE_GLASS.get()) {
				returned = false;
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.BIG_GLASS.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.MUG_BLOCK.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.WINE_GLASS.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.WINE_GLASS_BLOCK.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.GLASS_BEER.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.BEER_BLOCK.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.GLASS_BANANA_TEA_BEER.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.TEANANA_BEER_BLOCK.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.GLASS_CHERRY_CALCUIM_BEER.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.CHERIUM_BEER_BLOCK.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.GLASS_BRANDY.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.BRANDY_BLOCK.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.GLASS_CIDRONADE.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.CIDRONADE_BLOCK.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.GLASS_ARCEUM.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.ARCEUM_BLOCK.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.GLASS_APRI_D.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.APRI_ALCOHOL_D_BLOCK.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.GLASS_APRI_B.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.APRI_ALCOHOL_B_BLOCK.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.GLASS_APRI_G.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.APRI_ALCOHOL_G_BLOCK.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.GLASS_APRI_Y.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.APRI_ALCOHOL_Y_BLOCK.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.GLASS_APRI_P.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.APRI_ALCOHOL_P_BLOCK.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.GLASS_APRI_R.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.APRI_ALCOHOL_R_BLOCK.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.GLASS_APRI_W.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.APRI_ALCOHOL_W_BLOCK.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.WINE_GLASS_RED.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.WINE_RED_BLOCK.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.WINE_GLASS_WHITE.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.WINE_WHITE.get().defaultBlockState(), 3);
					returned = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PokefoodModItems.WINE_GLASS_ROSE.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), PokefoodModBlocks.WINE_ROSE.get().defaultBlockState(), 3);
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
