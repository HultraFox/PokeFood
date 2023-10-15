
package net.pokefood.item;

import net.pokefood.procedures.FryingVeganUnlockAdvProcedure;
import net.pokefood.init.PokefoodModTabs;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.Entity;

public class PoppedCalcuimItem extends Item {
	public PoppedCalcuimItem() {
		super(new Item.Properties().tab(PokefoodModTabs.TAB_POKE_FOOD_ON_THE_GO).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(1).saturationMod(1f).alwaysEat()

				.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 8;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		FryingVeganUnlockAdvProcedure.execute(entity);
	}
}
