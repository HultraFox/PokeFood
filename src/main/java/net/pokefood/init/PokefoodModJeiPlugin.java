
package net.pokefood.init;

import net.pokefood.jei_recipes.SugarMeltingRecipeCategory;
import net.pokefood.jei_recipes.SugarMeltingRecipe;
import net.pokefood.jei_recipes.LinkedInfuseOrBoilRecipeCategory;
import net.pokefood.jei_recipes.LinkedInfuseOrBoilRecipe;
import net.pokefood.jei_recipes.InfuseOrBoilRecipeCategory;
import net.pokefood.jei_recipes.InfuseOrBoilRecipe;
import net.pokefood.jei_recipes.IcecreamRecipeCategory;
import net.pokefood.jei_recipes.IcecreamRecipe;
import net.pokefood.jei_recipes.FryRecipeCategory;
import net.pokefood.jei_recipes.FryRecipe;
import net.pokefood.jei_recipes.CrepeCookingRecipeCategory;
import net.pokefood.jei_recipes.CrepeCookingRecipe;
import net.pokefood.jei_recipes.CookingRecipeCategory;
import net.pokefood.jei_recipes.CookingRecipe;
import net.pokefood.jei_recipes.CoffeeMakingRecipeCategory;
import net.pokefood.jei_recipes.CoffeeMakingRecipe;
import net.pokefood.jei_recipes.CarbonizationRecipeCategory;
import net.pokefood.jei_recipes.CarbonizationRecipe;
import net.pokefood.jei_recipes.BrewingRecipeCategory;
import net.pokefood.jei_recipes.BrewingRecipe;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.Objects;
import java.util.List;

@JeiPlugin
public class PokefoodModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<BrewingRecipe> Brewing_Type = new mezz.jei.api.recipe.RecipeType<>(BrewingRecipeCategory.UID, BrewingRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<CarbonizationRecipe> Carbonization_Type = new mezz.jei.api.recipe.RecipeType<>(CarbonizationRecipeCategory.UID, CarbonizationRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<CookingRecipe> Cooking_Type = new mezz.jei.api.recipe.RecipeType<>(CookingRecipeCategory.UID, CookingRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<FryRecipe> Fry_Type = new mezz.jei.api.recipe.RecipeType<>(FryRecipeCategory.UID, FryRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<IcecreamRecipe> Icecream_Type = new mezz.jei.api.recipe.RecipeType<>(IcecreamRecipeCategory.UID, IcecreamRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<CrepeCookingRecipe> CrepeCooking_Type = new mezz.jei.api.recipe.RecipeType<>(CrepeCookingRecipeCategory.UID, CrepeCookingRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<InfuseOrBoilRecipe> InfuseOrBoil_Type = new mezz.jei.api.recipe.RecipeType<>(InfuseOrBoilRecipeCategory.UID, InfuseOrBoilRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<LinkedInfuseOrBoilRecipe> LinkedInfuseOrBoil_Type = new mezz.jei.api.recipe.RecipeType<>(LinkedInfuseOrBoilRecipeCategory.UID, LinkedInfuseOrBoilRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<CoffeeMakingRecipe> CoffeeMaking_Type = new mezz.jei.api.recipe.RecipeType<>(CoffeeMakingRecipeCategory.UID, CoffeeMakingRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<SugarMeltingRecipe> SugarMelting_Type = new mezz.jei.api.recipe.RecipeType<>(SugarMeltingRecipeCategory.UID, SugarMeltingRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("pokefood:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new BrewingRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new CarbonizationRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new CookingRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new FryRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new IcecreamRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new CrepeCookingRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new InfuseOrBoilRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new LinkedInfuseOrBoilRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new CoffeeMakingRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new SugarMeltingRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<BrewingRecipe> BrewingRecipes = recipeManager.getAllRecipesFor(BrewingRecipe.Type.INSTANCE);
		registration.addRecipes(Brewing_Type, BrewingRecipes);
		List<CarbonizationRecipe> CarbonizationRecipes = recipeManager.getAllRecipesFor(CarbonizationRecipe.Type.INSTANCE);
		registration.addRecipes(Carbonization_Type, CarbonizationRecipes);
		List<CookingRecipe> CookingRecipes = recipeManager.getAllRecipesFor(CookingRecipe.Type.INSTANCE);
		registration.addRecipes(Cooking_Type, CookingRecipes);
		List<FryRecipe> FryRecipes = recipeManager.getAllRecipesFor(FryRecipe.Type.INSTANCE);
		registration.addRecipes(Fry_Type, FryRecipes);
		List<IcecreamRecipe> IcecreamRecipes = recipeManager.getAllRecipesFor(IcecreamRecipe.Type.INSTANCE);
		registration.addRecipes(Icecream_Type, IcecreamRecipes);
		List<CrepeCookingRecipe> CrepeCookingRecipes = recipeManager.getAllRecipesFor(CrepeCookingRecipe.Type.INSTANCE);
		registration.addRecipes(CrepeCooking_Type, CrepeCookingRecipes);
		List<InfuseOrBoilRecipe> InfuseOrBoilRecipes = recipeManager.getAllRecipesFor(InfuseOrBoilRecipe.Type.INSTANCE);
		registration.addRecipes(InfuseOrBoil_Type, InfuseOrBoilRecipes);
		List<LinkedInfuseOrBoilRecipe> LinkedInfuseOrBoilRecipes = recipeManager.getAllRecipesFor(LinkedInfuseOrBoilRecipe.Type.INSTANCE);
		registration.addRecipes(LinkedInfuseOrBoil_Type, LinkedInfuseOrBoilRecipes);
		List<CoffeeMakingRecipe> CoffeeMakingRecipes = recipeManager.getAllRecipesFor(CoffeeMakingRecipe.Type.INSTANCE);
		registration.addRecipes(CoffeeMaking_Type, CoffeeMakingRecipes);
		List<SugarMeltingRecipe> SugarMeltingRecipes = recipeManager.getAllRecipesFor(SugarMeltingRecipe.Type.INSTANCE);
		registration.addRecipes(SugarMelting_Type, SugarMeltingRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(PokefoodModBlocks.KEG.get().asItem()), Brewing_Type);
		registration.addRecipeCatalyst(new ItemStack(PokefoodModBlocks.CARBONIZER.get().asItem()), Carbonization_Type);
		registration.addRecipeCatalyst(new ItemStack(PokefoodModBlocks.OVEN.get().asItem()), Cooking_Type);
		registration.addRecipeCatalyst(new ItemStack(PokefoodModBlocks.FRYER.get().asItem()), Fry_Type);
		registration.addRecipeCatalyst(new ItemStack(PokefoodModBlocks.ICE_CREAM_MAKER.get().asItem()), Icecream_Type);
		registration.addRecipeCatalyst(new ItemStack(PokefoodModBlocks.CREPE_MAKER.get().asItem()), CrepeCooking_Type);
		registration.addRecipeCatalyst(new ItemStack(PokefoodModBlocks.COOKING_POT.get().asItem()), InfuseOrBoil_Type);
		registration.addRecipeCatalyst(new ItemStack(PokefoodModBlocks.COOKING_POT.get().asItem()), LinkedInfuseOrBoil_Type);
		registration.addRecipeCatalyst(new ItemStack(PokefoodModBlocks.COFFEE_MAKER.get().asItem()), CoffeeMaking_Type);
		registration.addRecipeCatalyst(new ItemStack(PokefoodModBlocks.SUGAR_MELTER_0.get().asItem()), SugarMelting_Type);
	}
}
