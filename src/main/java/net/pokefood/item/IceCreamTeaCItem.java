
package net.pokefood.item;

import net.pokefood.procedures.IceCreamChocolateUnlockAdvProcedure;
import net.pokefood.init.PokefoodModTabs;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.Entity;

public class IceCreamTeaCItem extends Item {
	public IceCreamTeaCItem() {
		super(new Item.Properties().tab(PokefoodModTabs.TAB_POKE_FOOD).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.5f).alwaysEat()

				.build()));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		IceCreamChocolateUnlockAdvProcedure.execute(entity);
	}
}
