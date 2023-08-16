
package net.pokefood.item;

import net.pokefood.procedures.PoffinsUnlockAdvProcedure;
import net.pokefood.init.PokefoodModTabs;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.InteractionResult;

public class PoffinSpicySweetItem extends Item {
	public PoffinSpicySweetItem() {
		super(new Item.Properties().tab(PokefoodModTabs.TAB_POKE_FOOD).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(8).saturationMod(0.5f)

				.build()));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		PoffinsUnlockAdvProcedure.execute(context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
