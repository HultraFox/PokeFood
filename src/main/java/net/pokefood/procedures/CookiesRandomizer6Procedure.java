package net.pokefood.procedures;

import net.pokefood.init.PokefoodModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class CookiesRandomizer6Procedure {
	public static ItemStack execute() {
		double NbPokemonsAsCookies = 0;
		double SelectedCookieNb = 0;
		ItemStack SelectedItme = ItemStack.EMPTY;
		NbPokemonsAsCookies = 20;
		SelectedCookieNb = Mth.nextInt(RandomSource.create(), 1, (int) NbPokemonsAsCookies);
		if (SelectedCookieNb <= 1) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_ELECTRODE.get());
		} else if (SelectedCookieNb == 2) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_EXEGGCUTE.get());
		} else if (SelectedCookieNb == 3) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_EXEGGUTOR.get());
		} else if (SelectedCookieNb == 4) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_CUBONE.get());
		} else if (SelectedCookieNb == 5) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_MAROWAK.get());
		} else if (SelectedCookieNb == 6) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_HITMONLEE.get());
		} else if (SelectedCookieNb == 7) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_HITMONCHAN.get());
		} else if (SelectedCookieNb == 8) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_LICKITUNG.get());
		} else if (SelectedCookieNb == 9) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_KOFFING.get());
		} else if (SelectedCookieNb == 10) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_WEEZING.get());
		} else if (SelectedCookieNb == 11) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_RHYHORN.get());
		} else if (SelectedCookieNb == 12) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_RHYDON.get());
		} else if (SelectedCookieNb == 13) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_CHANSEY.get());
		} else if (SelectedCookieNb == 14) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_TANGELA.get());
		} else if (SelectedCookieNb == 15) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_KANGASKHAN.get());
		} else if (SelectedCookieNb == 16) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_HORSEA.get());
		} else if (SelectedCookieNb == 17) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_SEADRA.get());
		} else if (SelectedCookieNb == 18) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_GOLDEEN.get());
		} else if (SelectedCookieNb == 19) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_SEAKING.get());
		} else if (SelectedCookieNb == 20) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_STARYU.get());
		} else {
			SelectedItme = new ItemStack(PokefoodModItems.CARBON_POWDER.get());
		}
		return SelectedItme;
	}
}
