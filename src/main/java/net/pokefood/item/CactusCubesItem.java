
package net.pokefood.item;

import net.pokefood.init.PokefoodModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CactusCubesItem extends Item {
	public CactusCubesItem() {
		super(new Item.Properties().tab(PokefoodModTabs.TAB_POKE_FOOD_ON_THE_GO).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.3f)

				.build()));
	}
}
