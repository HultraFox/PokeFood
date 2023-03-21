
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.pokefood.init;

import net.pokefood.world.inventory.MixingGUIMenu;
import net.pokefood.world.inventory.KegGUIMenu;
import net.pokefood.world.inventory.KegFunnelGUIMenu;
import net.pokefood.world.inventory.IceCreamExtentionGUIMenu;
import net.pokefood.world.inventory.IceCreaMakerGUIMenu;
import net.pokefood.world.inventory.FryerGUIMenu;
import net.pokefood.world.inventory.CarbonizerGUIMenu;
import net.pokefood.world.inventory.BigOvenGUIMenu;
import net.pokefood.PokefoodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class PokefoodModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, PokefoodMod.MODID);
	public static final RegistryObject<MenuType<CarbonizerGUIMenu>> CARBONIZER_GUI = REGISTRY.register("carbonizer_gui",
			() -> IForgeMenuType.create(CarbonizerGUIMenu::new));
	public static final RegistryObject<MenuType<MixingGUIMenu>> MIXING_GUI = REGISTRY.register("mixing_gui",
			() -> IForgeMenuType.create(MixingGUIMenu::new));
	public static final RegistryObject<MenuType<BigOvenGUIMenu>> BIG_OVEN_GUI = REGISTRY.register("big_oven_gui",
			() -> IForgeMenuType.create(BigOvenGUIMenu::new));
	public static final RegistryObject<MenuType<KegGUIMenu>> KEG_GUI = REGISTRY.register("keg_gui", () -> IForgeMenuType.create(KegGUIMenu::new));
	public static final RegistryObject<MenuType<FryerGUIMenu>> FRYER_GUI = REGISTRY.register("fryer_gui",
			() -> IForgeMenuType.create(FryerGUIMenu::new));
	public static final RegistryObject<MenuType<KegFunnelGUIMenu>> KEG_FUNNEL_GUI = REGISTRY.register("keg_funnel_gui",
			() -> IForgeMenuType.create(KegFunnelGUIMenu::new));
	public static final RegistryObject<MenuType<IceCreaMakerGUIMenu>> ICE_CREA_MAKER_GUI = REGISTRY.register("ice_crea_maker_gui",
			() -> IForgeMenuType.create(IceCreaMakerGUIMenu::new));
	public static final RegistryObject<MenuType<IceCreamExtentionGUIMenu>> ICE_CREAM_EXTENTION_GUI = REGISTRY.register("ice_cream_extention_gui",
			() -> IForgeMenuType.create(IceCreamExtentionGUIMenu::new));
}
