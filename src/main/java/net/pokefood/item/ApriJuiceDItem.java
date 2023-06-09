
package net.pokefood.item;

import net.pokefood.init.PokefoodModTabs;
import net.pokefood.init.PokefoodModFluids;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

public class ApriJuiceDItem extends BucketItem {
	public ApriJuiceDItem() {
		super(PokefoodModFluids.APRI_JUICE_D, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(PokefoodModTabs.TAB_POKE_FOOD_OTHERS));
	}
}
