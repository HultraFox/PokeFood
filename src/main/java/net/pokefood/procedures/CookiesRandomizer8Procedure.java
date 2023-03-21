package net.pokefood.procedures;

import net.pokefood.init.PokefoodModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class CookiesRandomizer8Procedure {
	public static ItemStack execute() {
		double NbPokemonsAsCookies = 0;
		double SelectedCookieNb = 0;
		ItemStack SelectedItme = ItemStack.EMPTY;
		NbPokemonsAsCookies = 11;
		SelectedCookieNb = Mth.nextInt(RandomSource.create(), 1, (int) NbPokemonsAsCookies);
		if (SelectedCookieNb <= 1) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_AERODACTYL.get());
		} else if (SelectedCookieNb == 2) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_SNORLAX.get());
		} else if (SelectedCookieNb == 3) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_ARTICUNO.get());
		} else if (SelectedCookieNb == 4) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_ZAPDOS.get());
		} else if (SelectedCookieNb == 5) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_MOLTRES.get());
		} else if (SelectedCookieNb == 6) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_DRATINI.get());
		} else if (SelectedCookieNb == 7) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_DRAGONAIR.get());
		} else if (SelectedCookieNb == 8) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_DRAGONITE.get());
		} else if (SelectedCookieNb == 9) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_MEWTWO.get());
		} else if (SelectedCookieNb == 10) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_MEW.get());
		} else if (SelectedCookieNb == 11) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_POKEBALL.get());
		} else {
			SelectedItme = new ItemStack(PokefoodModItems.CARBON_POWDER.get());
		}
		return SelectedItme;
	}
}
