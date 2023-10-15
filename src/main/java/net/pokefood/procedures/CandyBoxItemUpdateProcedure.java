package net.pokefood.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import java.util.concurrent.atomic.AtomicReference;

public class CandyBoxItemUpdateProcedure {
	public static void execute(ItemStack itemstack) {
		double slot = 0;
		boolean hasInventory = false;
		hasInventory = false;
		slot = 0;
		for (int index0 = 0; index0 < 16; index0++) {
			if (!((new Object() {
				public ItemStack getItemStack(int sltid, ItemStack _isc) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack((int) slot, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
				hasInventory = true;
			}
			slot = slot + 1;
		}
		if (hasInventory == true) {
			if (itemstack.getOrCreateTag().getDouble("CustomModelData") == 0) {
				itemstack.getOrCreateTag().putDouble("CustomModelData", (Mth.nextInt(RandomSource.create(), 1, 4)));
			}
		} else {
			itemstack.getOrCreateTag().putDouble("CustomModelData", 0);
		}
	}
}
