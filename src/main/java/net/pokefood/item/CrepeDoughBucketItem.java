
package net.pokefood.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CrepeDoughBucketItem extends Item {
	public CrepeDoughBucketItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
