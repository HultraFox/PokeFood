
package net.pokefood.item;

import net.pokefood.init.PokefoodModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SpicyJuiceItem extends Item {
	public SpicyJuiceItem() {
		super(new Item.Properties().tab(PokefoodModTabs.TAB_POKE_FOOD_INGREDIENTS).stacksTo(16).rarity(Rarity.COMMON));
	}
}
