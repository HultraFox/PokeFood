
package net.pokefood.item;

import net.pokefood.init.PokefoodModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class CalcuimBoxEmpty8Item extends Item {
	public CalcuimBoxEmpty8Item() {
		super(new Item.Properties().tab(PokefoodModTabs.TAB_POKE_FOOD_OTHERS).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}
}
