
package net.pokefood.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BagCurdItem extends Item {
	public BagCurdItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
