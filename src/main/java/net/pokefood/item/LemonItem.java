
package net.pokefood.item;

import net.pokefood.init.PokefoodModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LemonItem extends Item {
	public LemonItem() {
		super(new Item.Properties().tab(PokefoodModTabs.TAB_POKE_FOOD_INGREDIENTS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
