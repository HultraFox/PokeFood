
package net.pokefood.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PlateUncookedItem extends Item {
	public PlateUncookedItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
