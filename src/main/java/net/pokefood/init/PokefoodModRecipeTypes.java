package net.pokefood.init;

import net.pokefood.jei_recipes.SugarMeltingRecipe;
import net.pokefood.jei_recipes.LinkedInfuseOrBoilRecipe;
import net.pokefood.jei_recipes.InfuseOrBoilRecipe;
import net.pokefood.jei_recipes.IcecreamRecipe;
import net.pokefood.jei_recipes.FryRecipe;
import net.pokefood.jei_recipes.CrepeCookingRecipe;
import net.pokefood.jei_recipes.CookingRecipe;
import net.pokefood.jei_recipes.CoffeeMakingRecipe;
import net.pokefood.jei_recipes.CarbonizationRecipe;
import net.pokefood.jei_recipes.BrewingRecipe;
import net.pokefood.PokefoodMod;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.world.item.crafting.RecipeSerializer;

@Mod.EventBusSubscriber(modid = PokefoodMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class PokefoodModRecipeTypes {
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, "pokefood");

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		event.enqueueWork(() -> {
			SERIALIZERS.register(bus);
			SERIALIZERS.register("brewing", () -> BrewingRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("carbonization", () -> CarbonizationRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("cooking", () -> CookingRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("fry", () -> FryRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("icecream", () -> IcecreamRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("crepe_cooking", () -> CrepeCookingRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("infuse_or_boil", () -> InfuseOrBoilRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("linked_infuse_or_boil", () -> LinkedInfuseOrBoilRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("coffee_making", () -> CoffeeMakingRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("sugar_melting", () -> SugarMeltingRecipe.Serializer.INSTANCE);
		});
	}
}
