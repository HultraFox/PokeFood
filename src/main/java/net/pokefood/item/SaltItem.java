
package net.pokefood.item;

import net.pokefood.procedures.SaltConsumedProcedure;
import net.pokefood.init.PokefoodModTabs;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

public class SaltItem extends Item {
	public SaltItem() {
		super(new Item.Properties().tab(PokefoodModTabs.TAB_POKE_FOOD_OTHERS).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(-1).saturationMod(-1f).alwaysEat()

				.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 8;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		SaltConsumedProcedure.execute(entity);
		return retval;
	}
}
