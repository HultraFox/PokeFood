
package net.pokefood.jei_recipes;

import net.pokefood.init.PokefoodModJeiPlugin;
import net.pokefood.init.PokefoodModBlocks;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

public class BrewingRecipeCategory implements IRecipeCategory<BrewingRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("pokefood", "brewing");
	public final static ResourceLocation TEXTURE = new ResourceLocation("pokefood", "textures/screens/keg_jei.png");
	private final IDrawable background;
	private final IDrawable icon;

	public BrewingRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 86);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(PokefoodModBlocks.KEG.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<BrewingRecipe> getRecipeType() {
		return PokefoodModJeiPlugin.Brewing_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Brewing");
	}

	@Override
	public IDrawable getBackground() {
		return this.background;
	}

	@Override
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, BrewingRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 79, 35).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 52, 17).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.INPUT, 79, 8).addIngredients(recipe.getIngredients().get(2));
		builder.addSlot(RecipeIngredientRole.INPUT, 106, 17).addIngredients(recipe.getIngredients().get(3));
		builder.addSlot(RecipeIngredientRole.INPUT, 52, 53).addIngredients(recipe.getIngredients().get(4));
		builder.addSlot(RecipeIngredientRole.INPUT, 79, 62).addIngredients(recipe.getIngredients().get(5));
		builder.addSlot(RecipeIngredientRole.INPUT, 106, 53).addIngredients(recipe.getIngredients().get(6));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 142, 35).addItemStack(recipe.getResultItem(null));
	}
}
