
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.pokefood.init;

import net.pokefood.client.gui.MixingGUIScreen;
import net.pokefood.client.gui.KegGUIScreen;
import net.pokefood.client.gui.KegFunnelGUIScreen;
import net.pokefood.client.gui.IceCreamExtentionGUIScreen;
import net.pokefood.client.gui.IceCreaMakerGUIScreen;
import net.pokefood.client.gui.FryerGUIScreen;
import net.pokefood.client.gui.CarbonizerGUIScreen;
import net.pokefood.client.gui.BigOvenGUIScreen;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PokefoodModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(PokefoodModMenus.CARBONIZER_GUI.get(), CarbonizerGUIScreen::new);
			MenuScreens.register(PokefoodModMenus.MIXING_GUI.get(), MixingGUIScreen::new);
			MenuScreens.register(PokefoodModMenus.BIG_OVEN_GUI.get(), BigOvenGUIScreen::new);
			MenuScreens.register(PokefoodModMenus.KEG_GUI.get(), KegGUIScreen::new);
			MenuScreens.register(PokefoodModMenus.FRYER_GUI.get(), FryerGUIScreen::new);
			MenuScreens.register(PokefoodModMenus.KEG_FUNNEL_GUI.get(), KegFunnelGUIScreen::new);
			MenuScreens.register(PokefoodModMenus.ICE_CREA_MAKER_GUI.get(), IceCreaMakerGUIScreen::new);
			MenuScreens.register(PokefoodModMenus.ICE_CREAM_EXTENTION_GUI.get(), IceCreamExtentionGUIScreen::new);
		});
	}
}
