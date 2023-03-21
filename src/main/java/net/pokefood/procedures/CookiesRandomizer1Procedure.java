package net.pokefood.procedures;

import net.pokefood.init.PokefoodModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class CookiesRandomizer1Procedure {
	public static ItemStack execute() {
		double NbPokemonsAsCookies = 0;
		double SelectedCookieNb = 0;
		ItemStack SelectedItme = ItemStack.EMPTY;
		NbPokemonsAsCookies = 20;
		SelectedCookieNb = Mth.nextInt(RandomSource.create(), 1, (int) NbPokemonsAsCookies);
		if (SelectedCookieNb <= 1) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_BULBASAUR.get());
		} else if (SelectedCookieNb == 2) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_IVYSAUR.get());
		} else if (SelectedCookieNb == 3) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_VENUSAUR.get());
		} else if (SelectedCookieNb == 4) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_CHARMANDER.get());
		} else if (SelectedCookieNb == 5) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_CHARMELEON.get());
		} else if (SelectedCookieNb == 6) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_CHARIZARD.get());
		} else if (SelectedCookieNb == 7) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_SQUIRTLE.get());
		} else if (SelectedCookieNb == 8) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_WARTORTLE.get());
		} else if (SelectedCookieNb == 9) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_BLASTOISE.get());
		} else if (SelectedCookieNb == 10) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_CATERPIE.get());
		} else if (SelectedCookieNb == 11) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_METAPOD.get());
		} else if (SelectedCookieNb == 12) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_BUTTERFREE.get());
		} else if (SelectedCookieNb == 13) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_WEEDLE.get());
		} else if (SelectedCookieNb == 14) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_KAKUNA.get());
		} else if (SelectedCookieNb == 15) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_BEEDRILL.get());
		} else if (SelectedCookieNb == 16) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_PIDGEY.get());
		} else if (SelectedCookieNb == 17) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_PIDGEOTTO.get());
		} else if (SelectedCookieNb == 18) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_PIDGEOT.get());
		} else if (SelectedCookieNb == 19) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_RATTATA.get());
		} else if (SelectedCookieNb == 20) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_RATICATE.get());
		} else {
			SelectedItme = new ItemStack(PokefoodModItems.CARBON_POWDER.get());
		}
		return SelectedItme;
	}
}
