
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
	public static CreativeModeTab TAB_POKE_FOOD_BUILDING;
	public static CreativeModeTab TAB_POKE_FOOD_INGREDIENTS;
	public static CreativeModeTab TAB_POKE_FOOD_CURRIES;
	public static CreativeModeTab TAB_POKE_FOOD_DRINKS;
	public static CreativeModeTab TAB_POKE_FOOD_ON_THE_GO;

	public static void load() {
		TAB_POKE_FOOD = new CreativeModeTab("tabpoke_food") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PokefoodModItems.PUFF_FANCY_PEPPER.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_POKE_FOOD_COOKIES = new CreativeModeTab("tabpoke_food_cookies") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PokefoodModItems.COOKIE_IVYSAUR.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
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
		TAB_POKE_FOOD_BUILDING = new CreativeModeTab("tabpoke_food_building") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PokefoodModBlocks.RESTAURANT_SOFA_CORNER_5.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_POKE_FOOD_INGREDIENTS = new CreativeModeTab("tabpoke_food_ingredients") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PokefoodModItems.SPICY_JUICE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_POKE_FOOD_CURRIES = new CreativeModeTab("tabpoke_food_curries") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PokefoodModItems.CURRY_POTATO.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_POKE_FOOD_DRINKS = new CreativeModeTab("tabpoke_food_drinks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PokefoodModItems.CUP_APRIJUICE_G.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_POKE_FOOD_ON_THE_GO = new CreativeModeTab("tabpoke_food_on_the_go") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PokefoodModItems.CALCUIM_BOX_11.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
