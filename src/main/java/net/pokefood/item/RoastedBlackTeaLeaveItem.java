
package net.pokefood.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RoastedBlackTeaLeaveItem extends Item {
	public RoastedBlackTeaLeaveItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}