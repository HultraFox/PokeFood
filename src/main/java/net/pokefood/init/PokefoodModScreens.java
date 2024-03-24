
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.pokefood.init;

import net.pokefood.client.gui.WarpedBurgerGUIScreen;
import net.pokefood.client.gui.ToGoBagGUIScreen;
import net.pokefood.client.gui.PokeBowlGUIScreen;
import net.pokefood.client.gui.PlateGUIScreen;
import net.pokefood.client.gui.MixingGUIScreen;
import net.pokefood.client.gui.KegGUIScreen;
import net.pokefood.client.gui.KegFunnelGUIScreen;
import net.pokefood.client.gui.IceCreamExtentionGUIScreen;
import net.pokefood.client.gui.IceCreaMakerGUIScreen;
import net.pokefood.client.gui.FryerGUIScreen;
import net.pokefood.client.gui.ConeDisplayGUIScreen;
import net.pokefood.client.gui.CardboardBoxItemGUIScreen;
import net.pokefood.client.gui.CardboardBoxGUIScreen;
import net.pokefood.client.gui.CarbonizerGUIScreen;
import net.pokefood.client.gui.CandyPackagerScreen;
import net.pokefood.client.gui.CandyMachineGUIScreen;
import net.pokefood.client.gui.BlenderGUIScreen;
import net.pokefood.client.gui.BigOvenGUIScreen;
import net.pokefood.client.gui.BigBagGUIScreen;
import net.pokefood.client.gui.ApricornBoxGUIScreen;

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
			MenuScreens.register(PokefoodModMenus.CANDY_PACKAGER.get(), CandyPackagerScreen::new);
			MenuScreens.register(PokefoodModMenus.CARDBOARD_BOX_GUI.get(), CardboardBoxGUIScreen::new);
			MenuScreens.register(PokefoodModMenus.CONE_DISPLAY_GUI.get(), ConeDisplayGUIScreen::new);
			MenuScreens.register(PokefoodModMenus.BIG_BAG_GUI.get(), BigBagGUIScreen::new);
			MenuScreens.register(PokefoodModMenus.PLATE_GUI.get(), PlateGUIScreen::new);
			MenuScreens.register(PokefoodModMenus.CANDY_MACHINE_GUI.get(), CandyMachineGUIScreen::new);
			MenuScreens.register(PokefoodModMenus.APRICORN_BOX_GUI.get(), ApricornBoxGUIScreen::new);
			MenuScreens.register(PokefoodModMenus.CARDBOARD_BOX_ITEM_GUI.get(), CardboardBoxItemGUIScreen::new);
			MenuScreens.register(PokefoodModMenus.POKE_BOWL_GUI.get(), PokeBowlGUIScreen::new);
			MenuScreens.register(PokefoodModMenus.BLENDER_GUI.get(), BlenderGUIScreen::new);
			MenuScreens.register(PokefoodModMenus.WARPED_BURGER_GUI.get(), WarpedBurgerGUIScreen::new);
			MenuScreens.register(PokefoodModMenus.TO_GO_BAG_GUI.get(), ToGoBagGUIScreen::new);
		});
	}
}
