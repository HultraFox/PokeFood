
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.pokefood.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PokefoodModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 8),

				new ItemStack(PokefoodModItems.BANANA_LEAVES_ITEM.get()), 10, 5, 0.1f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

				new ItemStack(PokefoodModItems.ROSERADE_TEA_LEAF.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 6),

				new ItemStack(PokefoodModItems.CHERRY.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(PokefoodModItems.LEEK_SEEDS.get(), 2), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(PokefoodModItems.RICE_SEEDS.get()), 10, 5, 0.05f));
	}

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2),

					new ItemStack(PokefoodModItems.TEA_SEEDS.get(), 5), 10, 5, 0.1f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2),

					new ItemStack(PokefoodModItems.BLACK_TEA_SEEDS.get(), 5), 10, 5, 0.1f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(PokefoodModItems.LEMON_SEEDS.get(), 15), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(PokefoodModItems.ROSERADE_TEA_LEAF.get(), 5), 10, 5, 0.2f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 8),

					new ItemStack(PokefoodModItems.BANANA_LEAVES_ITEM.get()), 10, 5, 0.1f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 6),

					new ItemStack(PokefoodModItems.CHERRY.get()), 10, 5, 0.2f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(PokefoodModItems.LEEK_SEEDS.get(), 2), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(PokefoodModItems.RICE_SEEDS.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.BUTCHER) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(PokefoodModItems.SPIDER_MEAT.get()),

					new ItemStack(Items.EMERALD, 15), 10, 5, 0.2f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(PokefoodModItems.SAND_TAIL.get()),

					new ItemStack(Items.EMERALD, 5), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(PokefoodModItems.GREEN_SLICE.get()),

					new ItemStack(Items.EMERALD, 25), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(PokefoodModItems.HERACROSS_HORN.get()),

					new ItemStack(Items.EMERALD, 10), 10, 5, 0.2f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(PokefoodModItems.STAR_BITE.get()),

					new ItemStack(Items.EMERALD, 5), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FISHERMAN) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(PokefoodModItems.SHELL.get()),

					new ItemStack(Items.EMERALD, 20), 10, 5, 0.2f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(PokefoodModItems.MAGIKARP.get()),

					new ItemStack(Items.EMERALD, 5), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(PokefoodModItems.GOLDEEN.get()),

					new ItemStack(Items.EMERALD, 10), 10, 5, 0.5f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(PokefoodModItems.SEAKING.get()),

					new ItemStack(Items.EMERALD, 10), 10, 5, 0.2f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(PokefoodModItems.LUVDISC.get()),

					new ItemStack(Items.EMERALD, 15), 10, 5, 0.5f));
		}
	}
}
