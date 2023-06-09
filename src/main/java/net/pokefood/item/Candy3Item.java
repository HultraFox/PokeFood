
package net.pokefood.item;

import net.pokefood.init.PokefoodModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class Candy3Item extends Item {
	public Candy3Item() {
		super(new Item.Properties().tab(PokefoodModTabs.TAB_POKE_FOOD).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(1).saturationMod(1f).alwaysEat()

				.build()));
	}
}
