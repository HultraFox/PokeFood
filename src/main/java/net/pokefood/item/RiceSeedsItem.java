
package net.pokefood.item;

import net.pokefood.init.PokefoodModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RiceSeedsItem extends Item {
	public RiceSeedsItem() {
		super(new Item.Properties().tab(PokefoodModTabs.TAB_POKE_FOOD_OTHERS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
