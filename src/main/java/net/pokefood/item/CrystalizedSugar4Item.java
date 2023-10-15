
package net.pokefood.item;

import net.pokefood.init.PokefoodModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CrystalizedSugar4Item extends Item {
	public CrystalizedSugar4Item() {
		super(new Item.Properties().tab(PokefoodModTabs.TAB_POKE_FOOD_INGREDIENTS).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.5f).alwaysEat()

				.build()));
	}
}
