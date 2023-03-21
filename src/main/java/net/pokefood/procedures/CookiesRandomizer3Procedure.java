package net.pokefood.procedures;

import net.pokefood.init.PokefoodModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class CookiesRandomizer3Procedure {
	public static ItemStack execute() {
		double NbPokemonsAsCookies = 0;
		double SelectedCookieNb = 0;
		ItemStack SelectedItme = ItemStack.EMPTY;
		NbPokemonsAsCookies = 20;
		SelectedCookieNb = Mth.nextInt(RandomSource.create(), 1, (int) NbPokemonsAsCookies);
		if (SelectedCookieNb <= 1) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_ZUBAT.get());
		} else if (SelectedCookieNb == 2) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_GOLBAT.get());
		} else if (SelectedCookieNb == 3) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_ODDISH.get());
		} else if (SelectedCookieNb == 4) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_GLOOM.get());
		} else if (SelectedCookieNb == 5) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_VILEPLUME.get());
		} else if (SelectedCookieNb == 6) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_PARAS.get());
		} else if (SelectedCookieNb == 7) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_PARASECT.get());
		} else if (SelectedCookieNb == 8) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_VENONAT.get());
		} else if (SelectedCookieNb == 9) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_VENOMOTH.get());
		} else if (SelectedCookieNb == 10) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_DIGLETT.get());
		} else if (SelectedCookieNb == 11) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_DUGTRIO.get());
		} else if (SelectedCookieNb == 12) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_MEOWTH.get());
		} else if (SelectedCookieNb == 13) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_PERSIAN.get());
		} else if (SelectedCookieNb == 14) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_PSYDUCK.get());
		} else if (SelectedCookieNb == 15) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_GOLDUCK.get());
		} else if (SelectedCookieNb == 16) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_MANKEY.get());
		} else if (SelectedCookieNb == 17) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_PRIMEAPE.get());
		} else if (SelectedCookieNb == 18) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_GROWLITHE.get());
		} else if (SelectedCookieNb == 19) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_ARCANINE.get());
		} else if (SelectedCookieNb == 20) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_POLIWAG.get());
		} else {
			SelectedItme = new ItemStack(PokefoodModItems.CARBON_POWDER.get());
		}
		return SelectedItme;
	}
}
