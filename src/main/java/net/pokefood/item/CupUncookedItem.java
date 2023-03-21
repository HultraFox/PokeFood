
package net.pokefood.item;

import net.pokefood.init.PokefoodModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CupUncookedItem extends Item {
	public CupUncookedItem() {
		super(new Item.Properties().tab(PokefoodModTabs.TAB_POKE_FOOD_MISC).stacksTo(64).rarity(Rarity.COMMON));
	}
}