package net.pokefood.procedures;

import net.pokefood.jei_recipes.CookingRecipe;
import net.pokefood.init.PokefoodModItems;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.SimpleContainer;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.NonNullList;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;

public class OvenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double slot = 0;
		ItemStack result = ItemStack.EMPTY;
		slot = 1;
		for (int index0 = 0; index0 < 9; index0++) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("slot", slot);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("lit") instanceof BooleanProperty _getbp2 && (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getbp2)) == true
					|| !((new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem() == ItemStack.EMPTY.getItem()) && ((new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, BlockPos.containing(x, y, z), (int) slot)).getItem() == PokefoodModItems.COOKIE_DOUGH.get() && new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
							return _retval.get();
						}
					}.getAmount(world, BlockPos.containing(x, y, z), (int) (slot + 9)) == 0 || !((new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, BlockPos.containing(x, y, z), (int) slot)).getItem() == PokefoodModItems.COOKIE_DOUGH.get()) && new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
							return _retval.get();
						}
					}.getAmount(world, BlockPos.containing(x, y, z), (int) slot) != 0 && (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
							return _retval.get();
						}
					}.getAmount(world, BlockPos.containing(x, y, z), (int) (slot + 9)) == 0 || !((new Object() {
						public ItemStack getResult() {
							if (world instanceof Level _lvl) {
								net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
								List<CookingRecipe> recipes = rm.getAllRecipesFor(CookingRecipe.Type.INSTANCE);
								for (CookingRecipe recipe : recipes) {
									NonNullList<Ingredient> ingredients = recipe.getIngredients();
									if (!ingredients.get(0).test((new Object() {
										public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
											return _retval.get();
										}
									}.getItemStack(world, BlockPos.containing(x, y, z), (int) (new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, BlockPos.containing(x, y, z), "slot"))))))
										continue;
									return recipe.getResultItem(null);
								}
							}
							return ItemStack.EMPTY;
						}
					}.getResult()).getItem() == ItemStack.EMPTY.getItem()) && (new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, BlockPos.containing(x, y, z), (int) (slot + 9))).getItem() == (new Object() {
						public ItemStack getResult() {
							if (world instanceof Level _lvl) {
								net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
								List<CookingRecipe> recipes = rm.getAllRecipesFor(CookingRecipe.Type.INSTANCE);
								for (CookingRecipe recipe : recipes) {
									NonNullList<Ingredient> ingredients = recipe.getIngredients();
									if (!ingredients.get(0).test((new Object() {
										public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
											return _retval.get();
										}
									}.getItemStack(world, BlockPos.containing(x, y, z), (int) (new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, BlockPos.containing(x, y, z), "slot"))))))
										continue;
									return recipe.getResultItem(null);
								}
							}
							return ItemStack.EMPTY;
						}
					}.getResult()).getItem() || !((world instanceof Level _lvlSmeltResult ? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer((new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, BlockPos.containing(x, y, z), (int) slot))), _lvlSmeltResult).map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY) : ItemStack.EMPTY)
							.getItem() == ItemStack.EMPTY.getItem()) && (new Object() {
								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
									return _retval.get();
								}
							}.getItemStack(world, BlockPos.containing(x, y, z), (int) (slot + 9)))
									.getItem() == (world instanceof Level _lvlSmeltResult ? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer((new Object() {
										public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
											return _retval.get();
										}
									}.getItemStack(world, BlockPos.containing(x, y, z), (int) slot))), _lvlSmeltResult).map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY) : ItemStack.EMPTY).getItem()
							|| (new Object() {
								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
									return _retval.get();
								}
							}.getItemStack(world, BlockPos.containing(x, y, z), (int) (slot + 9))).getItem() == PokefoodModItems.CARBON_POWDER.get()))) {
				if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("lit") instanceof BooleanProperty _getbp34 && (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getbp34)) == false) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
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
					{
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("lit") instanceof BooleanProperty _booleanProp)
							world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SMOKE, (x + 0.5), (y + 0.5), (z + 0.5), Mth.nextInt(RandomSource.create(), 5, 10), 0.5, 0.5, 0.5, 0.01);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.furnace.fire_crackle")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.furnace.fire_crackle")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("cookingTime", 81);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("cookingProgress", (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, BlockPos.containing(x, y, z), "cookingProgress") + 1));
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
				}.getValue(world, BlockPos.containing(x, y, z), "cookingProgress") >= new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "cookingTime")) {
					slot = 1;
					for (int index1 = 0; index1 < 9; index1++) {
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble("slot", slot);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						if (!((new Object() {
							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
								return _retval.get();
							}
						}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem() == ItemStack.EMPTY.getItem()) && ((new Object() {
							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
								return _retval.get();
							}
						}.getItemStack(world, BlockPos.containing(x, y, z), (int) slot)).getItem() == PokefoodModItems.COOKIE_DOUGH.get() && new Object() {
							public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
								return _retval.get();
							}
						}.getAmount(world, BlockPos.containing(x, y, z), (int) (slot + 9)) == 0 || !((new Object() {
							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
								return _retval.get();
							}
						}.getItemStack(world, BlockPos.containing(x, y, z), (int) slot)).getItem() == PokefoodModItems.COOKIE_DOUGH.get()) && new Object() {
							public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
								return _retval.get();
							}
						}.getAmount(world, BlockPos.containing(x, y, z), (int) slot) != 0 && (new Object() {
							public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
								return _retval.get();
							}
						}.getAmount(world, BlockPos.containing(x, y, z), (int) (slot + 9)) == 0 || !((new Object() {
							public ItemStack getResult() {
								if (world instanceof Level _lvl) {
									net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
									List<CookingRecipe> recipes = rm.getAllRecipesFor(CookingRecipe.Type.INSTANCE);
									for (CookingRecipe recipe : recipes) {
										NonNullList<Ingredient> ingredients = recipe.getIngredients();
										if (!ingredients.get(0).test((new Object() {
											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
												return _retval.get();
											}
										}.getItemStack(world, BlockPos.containing(x, y, z), (int) (new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, BlockPos.containing(x, y, z), "slot"))))))
											continue;
										return recipe.getResultItem(null);
									}
								}
								return ItemStack.EMPTY;
							}
						}.getResult()).getItem() == ItemStack.EMPTY.getItem()) && (new Object() {
							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
								return _retval.get();
							}
						}.getItemStack(world, BlockPos.containing(x, y, z), (int) (slot + 9))).getItem() == (new Object() {
							public ItemStack getResult() {
								if (world instanceof Level _lvl) {
									net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
									List<CookingRecipe> recipes = rm.getAllRecipesFor(CookingRecipe.Type.INSTANCE);
									for (CookingRecipe recipe : recipes) {
										NonNullList<Ingredient> ingredients = recipe.getIngredients();
										if (!ingredients.get(0).test((new Object() {
											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
												return _retval.get();
											}
										}.getItemStack(world, BlockPos.containing(x, y, z), (int) (new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, BlockPos.containing(x, y, z), "slot"))))))
											continue;
										return recipe.getResultItem(null);
									}
								}
								return ItemStack.EMPTY;
							}
						}.getResult()).getItem() || !((world instanceof Level _lvlSmeltResult ? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer((new Object() {
							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
								return _retval.get();
							}
						}.getItemStack(world, BlockPos.containing(x, y, z), (int) slot))), _lvlSmeltResult).map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY) : ItemStack.EMPTY)
								.getItem() == ItemStack.EMPTY.getItem()) && (new Object() {
									public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
										return _retval.get();
									}
								}.getItemStack(world, BlockPos.containing(x, y, z), (int) (slot + 9)))
										.getItem() == (world instanceof Level _lvlSmeltResult ? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer((new Object() {
											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
												return _retval.get();
											}
										}.getItemStack(world, BlockPos.containing(x, y, z), (int) slot))), _lvlSmeltResult).map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY) : ItemStack.EMPTY)
												.getItem()
								|| (new Object() {
									public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
										return _retval.get();
									}
								}.getItemStack(world, BlockPos.containing(x, y, z), (int) (slot + 9))).getItem() == PokefoodModItems.CARBON_POWDER.get()))) {
							{
								BlockPos _pos = BlockPos.containing(x, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("lit") instanceof BooleanProperty _booleanProp)
									world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
							}
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putDouble("cookingTime", 81);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putDouble("cookingProgress", 1);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						} else {
							{
								BlockPos _pos = BlockPos.containing(x, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("lit") instanceof BooleanProperty _booleanProp)
									world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
							}
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putDouble("cookingTime", 0);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putDouble("cookingProgress", 0);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putDouble(("craftingTime_" + (slot - 1)), 0);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putDouble(("craftingProgress_" + (slot - 1)), 0);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							slot = 1;
						}
					}
				}
				break;
			}
			slot = slot + 1;
		}
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("lit") instanceof BooleanProperty _getbp85 && (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getbp85)) == true) {
			slot = 1;
			for (int index2 = 0; index2 < 9; index2++) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("slot", slot);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if ((new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), (int) slot)).getItem() == PokefoodModItems.COOKIE_DOUGH.get() && new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
						return _retval.get();
					}
				}.getAmount(world, BlockPos.containing(x, y, z), (int) (slot + 9)) == 0 || !((new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), (int) slot)).getItem() == PokefoodModItems.COOKIE_DOUGH.get()) && new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
						return _retval.get();
					}
				}.getAmount(world, BlockPos.containing(x, y, z), (int) slot) != 0 && (new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
						return _retval.get();
					}
				}.getAmount(world, BlockPos.containing(x, y, z), (int) (slot + 9)) == 0 || !((new Object() {
					public ItemStack getResult() {
						if (world instanceof Level _lvl) {
							net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
							List<CookingRecipe> recipes = rm.getAllRecipesFor(CookingRecipe.Type.INSTANCE);
							for (CookingRecipe recipe : recipes) {
								NonNullList<Ingredient> ingredients = recipe.getIngredients();
								if (!ingredients.get(0).test((new Object() {
									public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
										return _retval.get();
									}
								}.getItemStack(world, BlockPos.containing(x, y, z), (int) (new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getPersistentData().getDouble(tag);
										return -1;
									}
								}.getValue(world, BlockPos.containing(x, y, z), "slot"))))))
									continue;
								return recipe.getResultItem(null);
							}
						}
						return ItemStack.EMPTY;
					}
				}.getResult()).getItem() == ItemStack.EMPTY.getItem()) && (new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), (int) (slot + 9))).getItem() == (new Object() {
					public ItemStack getResult() {
						if (world instanceof Level _lvl) {
							net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
							List<CookingRecipe> recipes = rm.getAllRecipesFor(CookingRecipe.Type.INSTANCE);
							for (CookingRecipe recipe : recipes) {
								NonNullList<Ingredient> ingredients = recipe.getIngredients();
								if (!ingredients.get(0).test((new Object() {
									public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
										return _retval.get();
									}
								}.getItemStack(world, BlockPos.containing(x, y, z), (int) (new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getPersistentData().getDouble(tag);
										return -1;
									}
								}.getValue(world, BlockPos.containing(x, y, z), "slot"))))))
									continue;
								return recipe.getResultItem(null);
							}
						}
						return ItemStack.EMPTY;
					}
				}.getResult()).getItem() || !((world instanceof Level _lvlSmeltResult ? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer((new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), (int) slot))), _lvlSmeltResult).map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY) : ItemStack.EMPTY).getItem() == ItemStack.EMPTY
						.getItem()) && (new Object() {
							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
								return _retval.get();
							}
						}.getItemStack(world, BlockPos.containing(x, y, z), (int) (slot + 9)))
								.getItem() == (world instanceof Level _lvlSmeltResult ? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer((new Object() {
									public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
										return _retval.get();
									}
								}.getItemStack(world, BlockPos.containing(x, y, z), (int) slot))), _lvlSmeltResult).map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY) : ItemStack.EMPTY).getItem()
						|| (new Object() {
							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
								return _retval.get();
							}
						}.getItemStack(world, BlockPos.containing(x, y, z), (int) (slot + 9))).getItem() == PokefoodModItems.CARBON_POWDER.get())) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble(("craftingTime_" + (slot - 1)), 21);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble(("craftingProgress_" + (slot - 1)), (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, BlockPos.containing(x, y, z), ("craftingProgress_" + (slot - 1))) + 1));
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
					}.getValue(world, BlockPos.containing(x, y, z), ("craftingProgress_" + (slot - 1))) >= new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, BlockPos.containing(x, y, z), ("craftingTime_" + (slot - 1)))) {
						if ((new Object() {
							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
								return _retval.get();
							}
						}.getItemStack(world, BlockPos.containing(x, y, z), (int) slot)).getItem() == PokefoodModItems.COOKIE_DOUGH.get()) {
							{
								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
								if (_ent != null) {
									final int _slotid = (int) (slot + 9);
									final ItemStack _setstack = CookiesRandomizerProcedure.execute();
									_setstack.setCount((int) (new Object() {
										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicInteger _retval = new AtomicInteger(0);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
											return _retval.get();
										}
									}.getAmount(world, BlockPos.containing(x, y, z), (int) (slot + 9)) + 1));
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable)
											((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
									});
								}
							}
							{
								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
								if (_ent != null) {
									final int _slotid = (int) slot;
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
						} else if (!((new Object() {
							public ItemStack getResult() {
								if (world instanceof Level _lvl) {
									net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
									List<CookingRecipe> recipes = rm.getAllRecipesFor(CookingRecipe.Type.INSTANCE);
									for (CookingRecipe recipe : recipes) {
										NonNullList<Ingredient> ingredients = recipe.getIngredients();
										if (!ingredients.get(0).test((new Object() {
											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
												return _retval.get();
											}
										}.getItemStack(world, BlockPos.containing(x, y, z), (int) (new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, BlockPos.containing(x, y, z), "slot"))))))
											continue;
										return recipe.getResultItem(null);
									}
								}
								return ItemStack.EMPTY;
							}
						}.getResult()).getItem() == ItemStack.EMPTY.getItem())) {
							{
								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
								if (_ent != null) {
									final int _slotid = (int) (slot + 9);
									final ItemStack _setstack = (new Object() {
										public ItemStack getResult() {
											if (world instanceof Level _lvl) {
												net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
												List<CookingRecipe> recipes = rm.getAllRecipesFor(CookingRecipe.Type.INSTANCE);
												for (CookingRecipe recipe : recipes) {
													NonNullList<Ingredient> ingredients = recipe.getIngredients();
													if (!ingredients.get(0).test((new Object() {
														public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
															AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
															BlockEntity _ent = world.getBlockEntity(pos);
															if (_ent != null)
																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
															return _retval.get();
														}
													}.getItemStack(world, BlockPos.containing(x, y, z), (int) (new Object() {
														public double getValue(LevelAccessor world, BlockPos pos, String tag) {
															BlockEntity blockEntity = world.getBlockEntity(pos);
															if (blockEntity != null)
																return blockEntity.getPersistentData().getDouble(tag);
															return -1;
														}
													}.getValue(world, BlockPos.containing(x, y, z), "slot"))))))
														continue;
													return recipe.getResultItem(null);
												}
											}
											return ItemStack.EMPTY;
										}
									}.getResult());
									_setstack.setCount((int) (new Object() {
										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicInteger _retval = new AtomicInteger(0);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
											return _retval.get();
										}
									}.getAmount(world, BlockPos.containing(x, y, z), (int) (slot + 9)) + 1));
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable)
											((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
									});
								}
							}
							{
								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
								if (_ent != null) {
									final int _slotid = (int) slot;
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
						} else if (!((world instanceof Level _lvlSmeltResult ? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer((new Object() {
							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
								return _retval.get();
							}
						}.getItemStack(world, BlockPos.containing(x, y, z), (int) slot))), _lvlSmeltResult).map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY) : ItemStack.EMPTY)
								.getItem() == ItemStack.EMPTY.getItem())) {
							{
								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
								if (_ent != null) {
									final int _slotid = (int) (slot + 9);
									final ItemStack _setstack = (world instanceof Level _lvlSmeltResult ? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer((new Object() {
										public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
											return _retval.get();
										}
									}.getItemStack(world, BlockPos.containing(x, y, z), (int) slot))), _lvlSmeltResult).map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY) : ItemStack.EMPTY);
									_setstack.setCount((int) (new Object() {
										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicInteger _retval = new AtomicInteger(0);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
											return _retval.get();
										}
									}.getAmount(world, BlockPos.containing(x, y, z), (int) (slot + 9)) + 1));
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable)
											((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
									});
								}
							}
							{
								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
								if (_ent != null) {
									final int _slotid = (int) slot;
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
						} else if (!((new Object() {
							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
								return _retval.get();
							}
						}.getItemStack(world, BlockPos.containing(x, y, z), (int) slot)).getItem() == ItemStack.EMPTY.getItem())) {
							{
								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
								if (_ent != null) {
									final int _slotid = (int) (slot + 9);
									final ItemStack _setstack = new ItemStack(PokefoodModItems.CARBON_POWDER.get());
									_setstack.setCount((int) (new Object() {
										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicInteger _retval = new AtomicInteger(0);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
											return _retval.get();
										}
									}.getAmount(world, BlockPos.containing(x, y, z), (int) (slot + 9)) + 1));
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable)
											((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
									});
								}
							}
							{
								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
								if (_ent != null) {
									final int _slotid = (int) slot;
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
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.bell")), SoundSource.BLOCKS, 1, 2);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.bell")), SoundSource.BLOCKS, 1, 2, false);
							}
						}
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble(("craftingTime_" + (slot - 1)), 0);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble(("craftingProgress_" + (slot - 1)), 0);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					}
				} else {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble(("craftingTime_" + (slot - 1)), 0);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble(("craftingProgress_" + (slot - 1)), 0);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				slot = slot + 1;
			}
			slot = 0;
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("slot", 0);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}
}
