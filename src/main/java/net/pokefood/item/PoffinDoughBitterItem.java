
package net.pokefood.item;

import net.pokefood.procedures.DoughConsumedProcedure;
import net.pokefood.init.PokefoodModTabs;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

public class PoffinDoughBitterItem extends Item {
	public PoffinDoughBitterItem() {
		super(new Item.Properties().tab(PokefoodModTabs.TAB_POKE_FOOD_INGREDIENTS).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(1).saturationMod(1.5f)

				.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		DoughConsumedProcedure.execute(entity);
		return retval;
	}
}
