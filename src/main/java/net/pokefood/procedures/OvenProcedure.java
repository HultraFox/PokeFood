package net.pokefood.procedures;

import net.pokefood.world.inventory.BigOvenGUIMenu;
import net.pokefood.init.PokefoodModItems;
import net.pokefood.init.PokefoodModBlocks;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicReference;
import java.util.Map;
import java.util.Comparator;

import io.netty.buffer.Unpooled;

public class OvenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == PokefoodModItems.COOKIE_DOUGH.get() && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == PokefoodModItems.COOKIE_DOUGH.get() && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 2)).getItem() == PokefoodModItems.COOKIE_DOUGH.get() && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == PokefoodModItems.COOKIE_DOUGH.get() && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == PokefoodModItems.COOKIE_DOUGH.get() && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 5)).getItem() == PokefoodModItems.COOKIE_DOUGH.get() && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 6)).getItem() == PokefoodModItems.COOKIE_DOUGH.get() && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 7)).getItem() == PokefoodModItems.COOKIE_DOUGH.get() && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 8)).getItem() == PokefoodModItems.COOKIE_DOUGH.get() && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 9)).is(ItemTags.create(new ResourceLocation("forge:fuel")))) {
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "craftingProgress") == 0) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = PokefoodModBlocks.BIG_OVEN_ON.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					BlockEntity _be = world.getBlockEntity(_bp);
					CompoundTag _bnbt = null;
					if (_be != null) {
						_bnbt = _be.saveWithFullMetadata();
						_be.setRemoved();
					}
					world.setBlock(_bp, _bs, 3);
					if (_bnbt != null) {
						_be = world.getBlockEntity(_bp);
						if (_be != null) {
							try {
								_be.load(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).isEmpty()) {
					if ((world.getBlockState(new BlockPos(((Entity) world
							.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).level
							.clip(new ClipContext(((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f),
									((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
											.sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f)
											.add(((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null)).getViewVector(1f).scale(5)),
									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
									((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
											.sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf(x, y, z)).findFirst().orElse(null))))
							.getBlockPos().getX(),
							((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
									.sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.clip(new ClipContext(
											((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f),
											((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f)
													.add(((Entity) world
															.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
															.stream().sorted(new Object() {
																Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																	return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																}
															}.compareDistOf(x, y, z)).findFirst().orElse(null)).getViewVector(1f).scale(5)),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
											((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null))))
									.getBlockPos().getY(),
							((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
									.sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.clip(new ClipContext(
											((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f),
											((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f)
													.add(((Entity) world
															.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
															.stream().sorted(new Object() {
																Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																	return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																}
															}.compareDistOf(x, y, z)).findFirst().orElse(null)).getViewVector(1f).scale(5)),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
											((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null))))
									.getBlockPos().getZ())))
							.getBlock() == PokefoodModBlocks.BIG_OVEN_ON.get()) {
						{
							if (((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
									.sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof ServerPlayer _ent) {
								BlockPos _bpos = new BlockPos(
										((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
												.sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
													}
												}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.clip(new ClipContext(((Entity) world
														.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
														.sorted(new Object() {
															Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
															}
														}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f),
														((Entity) world
																.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
																.stream().sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator
																				.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf(x, y,
																		z))
																.findFirst().orElse(null))
																.getEyePosition(1f)
																.add(((Entity) world.getEntitiesOfClass(Player.class,
																		AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
																		.sorted(new Object() {
																			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																				return Comparator.comparingDouble(
																						_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																			}
																		}.compareDistOf(x, y, z)).findFirst().orElse(null))
																		.getViewVector(1f).scale(5)),
														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
														((Entity) world
																.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
																.stream().sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator
																				.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf(x, y, z)).findFirst().orElse(null))))
												.getBlockPos().getX(),
										((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
												.sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
													}
												}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.clip(new ClipContext(((Entity) world
														.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
														.sorted(new Object() {
															Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
															}
														}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f),
														((Entity) world
																.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
																.stream().sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator
																				.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf(x, y,
																		z))
																.findFirst().orElse(null))
																.getEyePosition(1f)
																.add(((Entity) world.getEntitiesOfClass(Player.class,
																		AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
																		.sorted(new Object() {
																			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																				return Comparator.comparingDouble(
																						_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																			}
																		}.compareDistOf(x, y, z)).findFirst().orElse(null))
																		.getViewVector(1f).scale(5)),
														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
														((Entity) world
																.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
																.stream().sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator
																				.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf(x, y, z)).findFirst().orElse(null))))
												.getBlockPos().getY(),
										((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
												.sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
													}
												}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.clip(new ClipContext(((Entity) world
														.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
														.sorted(new Object() {
															Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
															}
														}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f),
														((Entity) world
																.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
																.stream().sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator
																				.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf(x, y,
																		z))
																.findFirst().orElse(null))
																.getEyePosition(1f)
																.add(((Entity) world.getEntitiesOfClass(Player.class,
																		AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
																		.sorted(new Object() {
																			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																				return Comparator.comparingDouble(
																						_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																			}
																		}.compareDistOf(x, y, z)).findFirst().orElse(null))
																		.getViewVector(1f).scale(5)),
														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
														((Entity) world
																.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
																.stream().sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator
																				.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf(x, y, z)).findFirst().orElse(null))))
												.getBlockPos().getZ());
								NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
									@Override
									public Component getDisplayName() {
										return Component.literal("BigOvenGUI");
									}

									@Override
									public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
										return new BigOvenGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
									}
								}, _bpos);
							}
						}
					}
				} else if (!world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).isEmpty()) {
					if ((world.getBlockState(new BlockPos(((Entity) world
							.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.clip(new ClipContext(
									((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
											.stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f),
									((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
											.stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f)
											.add(((Entity) world
													.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null)).getViewVector(1f).scale(5)),
									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
									((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
											.stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf(x, y, z)).findFirst().orElse(null))))
							.getBlockPos().getX(),
							((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
									.sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.clip(new ClipContext(
											((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f),
											((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(
															1f)
													.add(((Entity) world.getEntitiesOfClass(ServerPlayer.class,
															AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream().sorted(new Object() {
																Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																	return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																}
															}.compareDistOf(x, y, z)).findFirst().orElse(null)).getViewVector(1f).scale(5)),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
											((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null))))
									.getBlockPos().getY(),
							((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
									.sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.clip(new ClipContext(
											((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f),
											((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(
															1f)
													.add(((Entity) world.getEntitiesOfClass(ServerPlayer.class,
															AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream().sorted(new Object() {
																Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																	return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																}
															}.compareDistOf(x, y, z)).findFirst().orElse(null)).getViewVector(1f).scale(5)),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
											((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null))))
									.getBlockPos().getZ())))
							.getBlock() == PokefoodModBlocks.BIG_OVEN_ON.get()) {
						{
							if (((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
									.sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof ServerPlayer _ent) {
								BlockPos _bpos = new BlockPos(
										((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
												.stream().sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
													}
												}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.clip(new ClipContext(((Entity) world
														.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
														.stream().sorted(new Object() {
															Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
															}
														}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f),
														((Entity) world.getEntitiesOfClass(ServerPlayer.class,
																AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream().sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator
																				.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf(x, y,
																		z))
																.findFirst().orElse(null))
																.getEyePosition(1f)
																.add(((Entity) world
																		.getEntitiesOfClass(ServerPlayer.class,
																				AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
																		.stream().sorted(new Object() {
																			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																				return Comparator.comparingDouble(
																						_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																			}
																		}.compareDistOf(x, y, z)).findFirst().orElse(null)).getViewVector(1f)
																		.scale(5)),
														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
														((Entity) world.getEntitiesOfClass(ServerPlayer.class,
																AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream().sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator
																				.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf(x, y, z)).findFirst().orElse(null))))
												.getBlockPos().getX(),
										((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
												.stream().sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
													}
												}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.clip(new ClipContext(((Entity) world
														.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
														.stream().sorted(new Object() {
															Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
															}
														}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f),
														((Entity) world.getEntitiesOfClass(ServerPlayer.class,
																AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream().sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator
																				.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf(x, y,
																		z))
																.findFirst().orElse(null))
																.getEyePosition(1f)
																.add(((Entity) world
																		.getEntitiesOfClass(ServerPlayer.class,
																				AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
																		.stream().sorted(new Object() {
																			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																				return Comparator.comparingDouble(
																						_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																			}
																		}.compareDistOf(x, y, z)).findFirst().orElse(null)).getViewVector(1f)
																		.scale(5)),
														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
														((Entity) world.getEntitiesOfClass(ServerPlayer.class,
																AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream().sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator
																				.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf(x, y, z)).findFirst().orElse(null))))
												.getBlockPos().getY(),
										((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
												.stream().sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
													}
												}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.clip(new ClipContext(((Entity) world
														.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
														.stream().sorted(new Object() {
															Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
															}
														}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f),
														((Entity) world.getEntitiesOfClass(ServerPlayer.class,
																AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream().sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator
																				.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf(x, y,
																		z))
																.findFirst().orElse(null))
																.getEyePosition(1f)
																.add(((Entity) world
																		.getEntitiesOfClass(ServerPlayer.class,
																				AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
																		.stream().sorted(new Object() {
																			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																				return Comparator.comparingDouble(
																						_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																			}
																		}.compareDistOf(x, y, z)).findFirst().orElse(null)).getViewVector(1f)
																		.scale(5)),
														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
														((Entity) world.getEntitiesOfClass(ServerPlayer.class,
																AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream().sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator
																				.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf(x, y, z)).findFirst().orElse(null))))
												.getBlockPos().getZ());
								NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
									@Override
									public Component getDisplayName() {
										return Component.literal("BigOvenGUI");
									}

									@Override
									public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
										return new BigOvenGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
									}
								}, _bpos);
							}
						}
					}
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SMOKE, x, y, z, Mth.nextInt(RandomSource.create(), 5, 10), 0.5, 0.5, 0.5, 0.01);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.furnace.fire_crackle")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.furnace.fire_crackle")),
							SoundSource.BLOCKS, 1, 1, false);
				}
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("craftingTime", 60);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "craftingProgress") + 1));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "craftingTime")) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _slotid = 0;
						final ItemStack _setstack = CookiesRandomizerProcedure.execute();
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _slotid = 1;
						final ItemStack _setstack = CookiesRandomizerProcedure.execute();
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _slotid = 2;
						final ItemStack _setstack = CookiesRandomizerProcedure.execute();
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _slotid = 3;
						final ItemStack _setstack = CookiesRandomizerProcedure.execute();
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _slotid = 4;
						final ItemStack _setstack = CookiesRandomizerProcedure.execute();
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _slotid = 5;
						final ItemStack _setstack = CookiesRandomizerProcedure.execute();
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _slotid = 6;
						final ItemStack _setstack = CookiesRandomizerProcedure.execute();
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _slotid = 7;
						final ItemStack _setstack = CookiesRandomizerProcedure.execute();
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _slotid = 8;
						final ItemStack _setstack = CookiesRandomizerProcedure.execute();
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _slotid = 9;
						final int _amount = 1;
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								ItemStack _stk = capability.getStackInSlot(_slotid).copy();
								_stk.shrink(_amount);
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
							}
						});
					}
				}
			}
		} else {
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "craftingTime") > 0) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("craftingTime", 0);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.bell")), SoundSource.BLOCKS, 1, 2);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.bell")),
								SoundSource.BLOCKS, 1, 2, false);
					}
				}
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = PokefoodModBlocks.BIG_OVEN.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					BlockEntity _be = world.getBlockEntity(_bp);
					CompoundTag _bnbt = null;
					if (_be != null) {
						_bnbt = _be.saveWithFullMetadata();
						_be.setRemoved();
					}
					world.setBlock(_bp, _bs, 3);
					if (_bnbt != null) {
						_be = world.getBlockEntity(_bp);
						if (_be != null) {
							try {
								_be.load(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).isEmpty()) {
					if ((world.getBlockState(new BlockPos(((Entity) world
							.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).level
							.clip(new ClipContext(((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f),
									((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
											.sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f)
											.add(((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null)).getViewVector(1f).scale(5)),
									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
									((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
											.sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf(x, y, z)).findFirst().orElse(null))))
							.getBlockPos().getX(),
							((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
									.sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.clip(new ClipContext(
											((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f),
											((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f)
													.add(((Entity) world
															.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
															.stream().sorted(new Object() {
																Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																	return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																}
															}.compareDistOf(x, y, z)).findFirst().orElse(null)).getViewVector(1f).scale(5)),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
											((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null))))
									.getBlockPos().getY(),
							((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
									.sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.clip(new ClipContext(
											((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f),
											((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f)
													.add(((Entity) world
															.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
															.stream().sorted(new Object() {
																Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																	return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																}
															}.compareDistOf(x, y, z)).findFirst().orElse(null)).getViewVector(1f).scale(5)),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
											((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null))))
									.getBlockPos().getZ())))
							.getBlock() == PokefoodModBlocks.BIG_OVEN.get()) {
						{
							if (((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
									.sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof ServerPlayer _ent) {
								BlockPos _bpos = new BlockPos(
										((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
												.sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
													}
												}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.clip(new ClipContext(((Entity) world
														.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
														.sorted(new Object() {
															Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
															}
														}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f),
														((Entity) world
																.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
																.stream().sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator
																				.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf(x, y,
																		z))
																.findFirst().orElse(null))
																.getEyePosition(1f)
																.add(((Entity) world.getEntitiesOfClass(Player.class,
																		AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
																		.sorted(new Object() {
																			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																				return Comparator.comparingDouble(
																						_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																			}
																		}.compareDistOf(x, y, z)).findFirst().orElse(null))
																		.getViewVector(1f).scale(5)),
														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
														((Entity) world
																.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
																.stream().sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator
																				.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf(x, y, z)).findFirst().orElse(null))))
												.getBlockPos().getX(),
										((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
												.sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
													}
												}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.clip(new ClipContext(((Entity) world
														.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
														.sorted(new Object() {
															Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
															}
														}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f),
														((Entity) world
																.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
																.stream().sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator
																				.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf(x, y,
																		z))
																.findFirst().orElse(null))
																.getEyePosition(1f)
																.add(((Entity) world.getEntitiesOfClass(Player.class,
																		AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
																		.sorted(new Object() {
																			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																				return Comparator.comparingDouble(
																						_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																			}
																		}.compareDistOf(x, y, z)).findFirst().orElse(null))
																		.getViewVector(1f).scale(5)),
														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
														((Entity) world
																.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
																.stream().sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator
																				.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf(x, y, z)).findFirst().orElse(null))))
												.getBlockPos().getY(),
										((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
												.sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
													}
												}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.clip(new ClipContext(((Entity) world
														.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
														.sorted(new Object() {
															Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
															}
														}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f),
														((Entity) world
																.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
																.stream().sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator
																				.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf(x, y,
																		z))
																.findFirst().orElse(null))
																.getEyePosition(1f)
																.add(((Entity) world.getEntitiesOfClass(Player.class,
																		AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
																		.sorted(new Object() {
																			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																				return Comparator.comparingDouble(
																						_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																			}
																		}.compareDistOf(x, y, z)).findFirst().orElse(null))
																		.getViewVector(1f).scale(5)),
														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
														((Entity) world
																.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
																.stream().sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator
																				.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf(x, y, z)).findFirst().orElse(null))))
												.getBlockPos().getZ());
								NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
									@Override
									public Component getDisplayName() {
										return Component.literal("BigOvenGUI");
									}

									@Override
									public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
										return new BigOvenGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
									}
								}, _bpos);
							}
						}
					}
				} else if (!world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).isEmpty()) {
					if ((world.getBlockState(new BlockPos(((Entity) world
							.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.clip(new ClipContext(
									((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
											.stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f),
									((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
											.stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f)
											.add(((Entity) world
													.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null)).getViewVector(1f).scale(5)),
									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
									((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
											.stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf(x, y, z)).findFirst().orElse(null))))
							.getBlockPos().getX(),
							((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
									.sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.clip(new ClipContext(
											((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f),
											((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(
															1f)
													.add(((Entity) world.getEntitiesOfClass(ServerPlayer.class,
															AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream().sorted(new Object() {
																Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																	return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																}
															}.compareDistOf(x, y, z)).findFirst().orElse(null)).getViewVector(1f).scale(5)),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
											((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null))))
									.getBlockPos().getY(),
							((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
									.sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.clip(new ClipContext(
											((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f),
											((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(
															1f)
													.add(((Entity) world.getEntitiesOfClass(ServerPlayer.class,
															AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream().sorted(new Object() {
																Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																	return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																}
															}.compareDistOf(x, y, z)).findFirst().orElse(null)).getViewVector(1f).scale(5)),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
											((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null))))
									.getBlockPos().getZ())))
							.getBlock() == PokefoodModBlocks.BIG_OVEN.get()) {
						{
							if (((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream()
									.sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof ServerPlayer _ent) {
								BlockPos _bpos = new BlockPos(
										((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
												.stream().sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
													}
												}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.clip(new ClipContext(((Entity) world
														.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
														.stream().sorted(new Object() {
															Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
															}
														}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f),
														((Entity) world.getEntitiesOfClass(ServerPlayer.class,
																AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream().sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator
																				.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf(x, y,
																		z))
																.findFirst().orElse(null))
																.getEyePosition(1f)
																.add(((Entity) world
																		.getEntitiesOfClass(ServerPlayer.class,
																				AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
																		.stream().sorted(new Object() {
																			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																				return Comparator.comparingDouble(
																						_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																			}
																		}.compareDistOf(x, y, z)).findFirst().orElse(null)).getViewVector(1f)
																		.scale(5)),
														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
														((Entity) world.getEntitiesOfClass(ServerPlayer.class,
																AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream().sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator
																				.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf(x, y, z)).findFirst().orElse(null))))
												.getBlockPos().getX(),
										((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
												.stream().sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
													}
												}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.clip(new ClipContext(((Entity) world
														.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
														.stream().sorted(new Object() {
															Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
															}
														}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f),
														((Entity) world.getEntitiesOfClass(ServerPlayer.class,
																AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream().sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator
																				.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf(x, y,
																		z))
																.findFirst().orElse(null))
																.getEyePosition(1f)
																.add(((Entity) world
																		.getEntitiesOfClass(ServerPlayer.class,
																				AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
																		.stream().sorted(new Object() {
																			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																				return Comparator.comparingDouble(
																						_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																			}
																		}.compareDistOf(x, y, z)).findFirst().orElse(null)).getViewVector(1f)
																		.scale(5)),
														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
														((Entity) world.getEntitiesOfClass(ServerPlayer.class,
																AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream().sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator
																				.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf(x, y, z)).findFirst().orElse(null))))
												.getBlockPos().getY(),
										((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
												.stream().sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
													}
												}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.clip(new ClipContext(((Entity) world
														.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
														.stream().sorted(new Object() {
															Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
															}
														}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1f),
														((Entity) world.getEntitiesOfClass(ServerPlayer.class,
																AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream().sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator
																				.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf(x, y,
																		z))
																.findFirst().orElse(null))
																.getEyePosition(1f)
																.add(((Entity) world
																		.getEntitiesOfClass(ServerPlayer.class,
																				AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true)
																		.stream().sorted(new Object() {
																			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																				return Comparator.comparingDouble(
																						_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																			}
																		}.compareDistOf(x, y, z)).findFirst().orElse(null)).getViewVector(1f)
																		.scale(5)),
														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
														((Entity) world.getEntitiesOfClass(ServerPlayer.class,
																AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream().sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator
																				.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf(x, y, z)).findFirst().orElse(null))))
												.getBlockPos().getZ());
								NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
									@Override
									public Component getDisplayName() {
										return Component.literal("BigOvenGUI");
									}

									@Override
									public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
										return new BigOvenGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
									}
								}, _bpos);
							}
						}
					}
				}
			} else {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("craftingTime", 0);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		}
	}
}
