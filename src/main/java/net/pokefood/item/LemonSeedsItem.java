
package net.pokefood.item;

import net.pokefood.procedures.LemonPlantingProcedure;
import net.pokefood.init.PokefoodModTabs;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

public class LemonSeedsItem extends Item {
	public LemonSeedsItem() {
		super(new Item.Properties().tab(PokefoodModTabs.TAB_POKE_FOOD_MISC).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		LemonPlantingProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
