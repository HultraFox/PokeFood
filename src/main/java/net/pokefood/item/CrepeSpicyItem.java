
package net.pokefood.item;

import net.pokefood.init.PokefoodModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CrepeSpicyItem extends Item {
	public CrepeSpicyItem() {
		super(new Item.Properties().tab(PokefoodModTabs.TAB_POKE_FOOD_ON_THE_GO).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(6).saturationMod(0.5f)

				.build()));
	}
}
