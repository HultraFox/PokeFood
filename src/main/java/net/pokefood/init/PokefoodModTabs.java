
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.pokefood.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class PokefoodModTabs {
	public static CreativeModeTab TAB_POKE_FOOD;
	public static CreativeModeTab TAB_POKE_FOOD_COOKIES;
	public static CreativeModeTab TAB_POKE_FOOD_HUNT;
	public static CreativeModeTab TAB_POKE_FOOD_OTHERS;

	public static void load() {
		TAB_POKE_FOOD = new CreativeModeTab("tabpoke_food") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PokefoodModItems.PUFF_FANCY_PEPPER.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_POKE_FOOD_COOKIES = new CreativeModeTab("tabpoke_food_cookies") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PokefoodModItems.COOKIE_BULBASAUR.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_POKE_FOOD_HUNT = new CreativeModeTab("tabpoke_food_hunt") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PokefoodModItems.MAGIKARP.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_POKE_FOOD_OTHERS = new CreativeModeTab("tabpoke_food_others") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PokefoodModBlocks.CARDBOARD_BOX.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
