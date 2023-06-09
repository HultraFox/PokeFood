
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.pokefood.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.ComposterBlock;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PokefoodModCompostableItems {
	@SubscribeEvent
	public static void addComposterItems(FMLCommonSetupEvent event) {
		ComposterBlock.COMPOSTABLES.put(PokefoodModItems.TEA_SEEDS.get(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(PokefoodModItems.BLACK_TEA_SEEDS.get(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(PokefoodModItems.TEA_LEAF.get(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(PokefoodModItems.BLACK_TEA_LEAF.get(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(PokefoodModItems.ROSERADE_TEA_LEAF.get(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(PokefoodModItems.LEMON_SEEDS.get(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(PokefoodModItems.LEMON.get(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(PokefoodModItems.LIME.get(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(PokefoodModItems.LEMON_SLICE.get(), 0.15f);
		ComposterBlock.COMPOSTABLES.put(PokefoodModItems.LIME_SLICE.get(), 0.15f);
		ComposterBlock.COMPOSTABLES.put(PokefoodModItems.CALCUIM_SEEDS.get(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(PokefoodModItems.CALCUIM.get(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(PokefoodModItems.BANANA.get(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(PokefoodModItems.CHERRY.get(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(PokefoodModItems.COFFEE_BEANS.get(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(PokefoodModItems.LEEK_SEEDS.get(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(PokefoodModItems.LEEK.get(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(PokefoodModItems.BANANA_LEAVES_ITEM.get(), 0.5f);
	}
}
