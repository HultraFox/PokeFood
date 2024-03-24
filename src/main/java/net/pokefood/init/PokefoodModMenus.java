
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.pokefood.init;

import net.pokefood.world.inventory.WarpedBurgerGUIMenu;
import net.pokefood.world.inventory.ToGoBagGUIMenu;
import net.pokefood.world.inventory.PokeBowlGUIMenu;
import net.pokefood.world.inventory.PlateGUIMenu;
import net.pokefood.world.inventory.MixingGUIMenu;
import net.pokefood.world.inventory.KegGUIMenu;
import net.pokefood.world.inventory.KegFunnelGUIMenu;
import net.pokefood.world.inventory.IceCreamExtentionGUIMenu;
import net.pokefood.world.inventory.IceCreaMakerGUIMenu;
import net.pokefood.world.inventory.FryerGUIMenu;
import net.pokefood.world.inventory.ConeDisplayGUIMenu;
import net.pokefood.world.inventory.CardboardBoxItemGUIMenu;
import net.pokefood.world.inventory.CardboardBoxGUIMenu;
import net.pokefood.world.inventory.CarbonizerGUIMenu;
import net.pokefood.world.inventory.CandyPackagerMenu;
import net.pokefood.world.inventory.CandyMachineGUIMenu;
import net.pokefood.world.inventory.BlenderGUIMenu;
import net.pokefood.world.inventory.BigOvenGUIMenu;
import net.pokefood.world.inventory.BigBagGUIMenu;
import net.pokefood.world.inventory.ApricornBoxGUIMenu;
import net.pokefood.PokefoodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class PokefoodModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, PokefoodMod.MODID);
	public static final RegistryObject<MenuType<CarbonizerGUIMenu>> CARBONIZER_GUI = REGISTRY.register("carbonizer_gui", () -> IForgeMenuType.create(CarbonizerGUIMenu::new));
	public static final RegistryObject<MenuType<MixingGUIMenu>> MIXING_GUI = REGISTRY.register("mixing_gui", () -> IForgeMenuType.create(MixingGUIMenu::new));
	public static final RegistryObject<MenuType<BigOvenGUIMenu>> BIG_OVEN_GUI = REGISTRY.register("big_oven_gui", () -> IForgeMenuType.create(BigOvenGUIMenu::new));
	public static final RegistryObject<MenuType<KegGUIMenu>> KEG_GUI = REGISTRY.register("keg_gui", () -> IForgeMenuType.create(KegGUIMenu::new));
	public static final RegistryObject<MenuType<FryerGUIMenu>> FRYER_GUI = REGISTRY.register("fryer_gui", () -> IForgeMenuType.create(FryerGUIMenu::new));
	public static final RegistryObject<MenuType<KegFunnelGUIMenu>> KEG_FUNNEL_GUI = REGISTRY.register("keg_funnel_gui", () -> IForgeMenuType.create(KegFunnelGUIMenu::new));
	public static final RegistryObject<MenuType<IceCreaMakerGUIMenu>> ICE_CREA_MAKER_GUI = REGISTRY.register("ice_crea_maker_gui", () -> IForgeMenuType.create(IceCreaMakerGUIMenu::new));
	public static final RegistryObject<MenuType<IceCreamExtentionGUIMenu>> ICE_CREAM_EXTENTION_GUI = REGISTRY.register("ice_cream_extention_gui", () -> IForgeMenuType.create(IceCreamExtentionGUIMenu::new));
	public static final RegistryObject<MenuType<CandyPackagerMenu>> CANDY_PACKAGER = REGISTRY.register("candy_packager", () -> IForgeMenuType.create(CandyPackagerMenu::new));
	public static final RegistryObject<MenuType<CardboardBoxGUIMenu>> CARDBOARD_BOX_GUI = REGISTRY.register("cardboard_box_gui", () -> IForgeMenuType.create(CardboardBoxGUIMenu::new));
	public static final RegistryObject<MenuType<ConeDisplayGUIMenu>> CONE_DISPLAY_GUI = REGISTRY.register("cone_display_gui", () -> IForgeMenuType.create(ConeDisplayGUIMenu::new));
	public static final RegistryObject<MenuType<BigBagGUIMenu>> BIG_BAG_GUI = REGISTRY.register("big_bag_gui", () -> IForgeMenuType.create(BigBagGUIMenu::new));
	public static final RegistryObject<MenuType<PlateGUIMenu>> PLATE_GUI = REGISTRY.register("plate_gui", () -> IForgeMenuType.create(PlateGUIMenu::new));
	public static final RegistryObject<MenuType<CandyMachineGUIMenu>> CANDY_MACHINE_GUI = REGISTRY.register("candy_machine_gui", () -> IForgeMenuType.create(CandyMachineGUIMenu::new));
	public static final RegistryObject<MenuType<ApricornBoxGUIMenu>> APRICORN_BOX_GUI = REGISTRY.register("apricorn_box_gui", () -> IForgeMenuType.create(ApricornBoxGUIMenu::new));
	public static final RegistryObject<MenuType<CardboardBoxItemGUIMenu>> CARDBOARD_BOX_ITEM_GUI = REGISTRY.register("cardboard_box_item_gui", () -> IForgeMenuType.create(CardboardBoxItemGUIMenu::new));
	public static final RegistryObject<MenuType<PokeBowlGUIMenu>> POKE_BOWL_GUI = REGISTRY.register("poke_bowl_gui", () -> IForgeMenuType.create(PokeBowlGUIMenu::new));
	public static final RegistryObject<MenuType<BlenderGUIMenu>> BLENDER_GUI = REGISTRY.register("blender_gui", () -> IForgeMenuType.create(BlenderGUIMenu::new));
	public static final RegistryObject<MenuType<WarpedBurgerGUIMenu>> WARPED_BURGER_GUI = REGISTRY.register("warped_burger_gui", () -> IForgeMenuType.create(WarpedBurgerGUIMenu::new));
	public static final RegistryObject<MenuType<ToGoBagGUIMenu>> TO_GO_BAG_GUI = REGISTRY.register("to_go_bag_gui", () -> IForgeMenuType.create(ToGoBagGUIMenu::new));
}
