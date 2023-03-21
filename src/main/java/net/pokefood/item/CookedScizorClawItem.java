
package net.pokefood.item;

import net.pokefood.init.PokefoodModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedScizorClawItem extends Item {
	public CookedScizorClawItem() {
		super(new Item.Properties().tab(PokefoodModTabs.TAB_POKE_FOOD_HUNT).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(1).saturationMod(1f)

						.meat().build()));
	}
}
