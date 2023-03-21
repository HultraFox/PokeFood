package net.pokefood.procedures;

import net.pokefood.init.PokefoodModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class CookiesRandomizer7Procedure {
	public static ItemStack execute() {
		double NbPokemonsAsCookies = 0;
		double SelectedCookieNb = 0;
		ItemStack SelectedItme = ItemStack.EMPTY;
		NbPokemonsAsCookies = 20;
		SelectedCookieNb = Mth.nextInt(RandomSource.create(), 1, (int) NbPokemonsAsCookies);
		if (SelectedCookieNb <= 1) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_STARMIE.get());
		} else if (SelectedCookieNb == 2) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_MRMIME.get());
		} else if (SelectedCookieNb == 3) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_SCYTHER.get());
		} else if (SelectedCookieNb == 4) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_JYNX.get());
		} else if (SelectedCookieNb == 5) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_ELECTABUZZ.get());
		} else if (SelectedCookieNb == 6) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_MAGMAR.get());
		} else if (SelectedCookieNb == 7) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_PINSIR.get());
		} else if (SelectedCookieNb == 8) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_TAUROS.get());
		} else if (SelectedCookieNb == 9) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_MAGIKARP.get());
		} else if (SelectedCookieNb == 10) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_GYARADOS.get());
		} else if (SelectedCookieNb == 11) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_LAPRAS.get());
		} else if (SelectedCookieNb == 12) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_EEVEE.get());
		} else if (SelectedCookieNb == 13) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_VAPOREON.get());
		} else if (SelectedCookieNb == 14) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_JOLTEON.get());
		} else if (SelectedCookieNb == 15) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_FLAREON.get());
		} else if (SelectedCookieNb == 16) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_PORYGON.get());
		} else if (SelectedCookieNb == 17) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_OMANYTE.get());
		} else if (SelectedCookieNb == 18) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_OMASTAR.get());
		} else if (SelectedCookieNb == 19) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_KABUTO.get());
		} else if (SelectedCookieNb == 20) {
			SelectedItme = new ItemStack(PokefoodModItems.COOKIE_KABUTOPS.get());
		} else {
			SelectedItme = new ItemStack(PokefoodModItems.CARBON_POWDER.get());
		}
		return SelectedItme;
	}
}
