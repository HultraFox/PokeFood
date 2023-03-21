package net.pokefood.procedures;

import net.pokefood.init.PokefoodModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class CookiesRandomizerProcedure {
	public static ItemStack execute() {
		double NbPokemonsAsCookies = 0;
		double SelectedCookieNb = 0;
		ItemStack SelectedItme = ItemStack.EMPTY;
		NbPokemonsAsCookies = 151;
		SelectedCookieNb = Mth.nextInt(RandomSource.create(), 1, (int) NbPokemonsAsCookies);
		if (SelectedCookieNb <= 20) {
			SelectedItme = CookiesRandomizer1Procedure.execute();
		} else if (SelectedCookieNb > 20 && SelectedCookieNb <= 40) {
			SelectedItme = CookiesRandomizer2Procedure.execute();
		} else if (SelectedCookieNb > 40 && SelectedCookieNb <= 60) {
			SelectedItme = CookiesRandomizer3Procedure.execute();
		} else if (SelectedCookieNb > 60 && SelectedCookieNb <= 80) {
			SelectedItme = CookiesRandomizer4Procedure.execute();
		} else if (SelectedCookieNb > 80 && SelectedCookieNb <= 100) {
			SelectedItme = CookiesRandomizer5Procedure.execute();
		} else if (SelectedCookieNb > 100 && SelectedCookieNb <= 120) {
			SelectedItme = CookiesRandomizer6Procedure.execute();
		} else if (SelectedCookieNb > 120 && SelectedCookieNb <= 140) {
			SelectedItme = CookiesRandomizer7Procedure.execute();
		} else if (SelectedCookieNb > 140 && SelectedCookieNb <= 151) {
			SelectedItme = CookiesRandomizer8Procedure.execute();
		} else if (SelectedCookieNb > 151) {
			SelectedItme = new ItemStack(PokefoodModItems.CARBON_POWDER.get());
		}
		return SelectedItme;
	}
}
