package net.pokefood.procedures;

import net.pokefood.init.PokefoodModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class CookiesRandomizer5Procedure {
	public static ItemStack execute() {
		double NbPokemonsAsCookies = 0;
		double SelectedCookieNb = 0;
		ItemStack SelectedItme = ItemStack.EMPTY;
		NbPokemonsAsCookies = 20;
		SelectedCookieNb = Mth.nextInt(RandomSource.create(), 1, (int) NbPokemonsAsCookies);
		if (SelectedCookieNb <= 1) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_MAGNEMITE.get());
		} else if (SelectedCookieNb == 2) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_MAGNETON.get());
		} else if (SelectedCookieNb == 3) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_FARFETCHD.get());
		} else if (SelectedCookieNb == 4) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_DODUO.get());
		} else if (SelectedCookieNb == 5) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_DODRIO.get());
		} else if (SelectedCookieNb == 6) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_SEEL.get());
		} else if (SelectedCookieNb == 7) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_DEWGONG.get());
		} else if (SelectedCookieNb == 8) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_GRIMGER.get());
		} else if (SelectedCookieNb == 9) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_MUK.get());
		} else if (SelectedCookieNb == 10) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_SHELLDER.get());
		} else if (SelectedCookieNb == 11) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_CLOYSTER.get());
		} else if (SelectedCookieNb == 12) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_GASTLY.get());
		} else if (SelectedCookieNb == 13) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_HAUNTER.get());
		} else if (SelectedCookieNb == 14) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_GRENGAR.get());
		} else if (SelectedCookieNb == 15) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_ONIX.get());
		} else if (SelectedCookieNb == 16) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_DROWZEE.get());
		} else if (SelectedCookieNb == 17) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_HYPNO.get());
		} else if (SelectedCookieNb == 18) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_KRABBY.get());
		} else if (SelectedCookieNb == 19) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_KINGLER.get());
		} else if (SelectedCookieNb == 20) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_VOLTORB.get());
		} else {
			SelectedItme = new ItemStack(PokefoodModItems.CARBON_POWDER.get());
		}
		return SelectedItme;
	}
}
