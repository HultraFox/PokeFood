
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.pokefood.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class PokefoodModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == PokefoodModItems.BURNT_BAG.get())
			event.setBurnTime(1600);
		else if (itemstack.getItem() == PokefoodModBlocks.BANANA_WOOD.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == PokefoodModBlocks.BANANA_LOG.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == PokefoodModBlocks.BANANA_PLANKS.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == PokefoodModBlocks.BANANA_STAIRS.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == PokefoodModBlocks.BANANA_SLAB.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == PokefoodModBlocks.BANANA_FENCE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == PokefoodModBlocks.BANANA_FENCE_GATE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == PokefoodModBlocks.BANANA_PRESSURE_PLATE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == PokefoodModBlocks.BANANA_BUTTON.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == PokefoodModBlocks.BANANA_TOP.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == PokefoodModBlocks.BANANA_LOG_2.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == PokefoodModBlocks.BANANA_LOG_3.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == PokefoodModBlocks.BANANA_LOG_STRIPPED.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == PokefoodModBlocks.BANANA_LOG_2_STRIPPED.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == PokefoodModBlocks.BANANA_LOG_3_STRIPPED.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == PokefoodModBlocks.BANANA_TOP_STRIPPED.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == PokefoodModBlocks.BANANA_WOOD_STRIPPED.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == PokefoodModBlocks.BANANA_LOG_2_CONTROLER.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == PokefoodModBlocks.BANANA_WOOD_TREE_CONTROLER.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == PokefoodModBlocks.BANANA_TRAPDOOR.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == PokefoodModBlocks.BANANA_DOOR.get().asItem())
			event.setBurnTime(300);
	}
}
