
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.pokefood.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class PokefoodModTabs {
	public static CreativeModeTab TAB_POKE_FOOD;
	public static CreativeModeTab TAB_POKE_FOOD_INGREDIENTS;
	public static CreativeModeTab TAB_POKE_FOOD_MISC;
	public static CreativeModeTab TAB_POKE_FOOD_COOKIES;
	public static CreativeModeTab TAB_POKE_FOOD_HUNT;

	public static void load() {
		TAB_POKE_FOOD = new CreativeModeTab("tabpoke_food") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PokefoodModItems.PUFF_DELUXE_PEPPER.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_POKE_FOOD_INGREDIENTS = new CreativeModeTab("tabpoke_food_ingredients") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PokefoodModItems.POFFIN_DOUGH_SPICY.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_POKE_FOOD_MISC = new CreativeModeTab("tabpoke_food_misc") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PokefoodModItems.SODA_BOTTLE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
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
	}
}
