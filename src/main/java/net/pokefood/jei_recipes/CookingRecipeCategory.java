
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

public class CookingRecipeCategory implements IRecipeCategory<CookingRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("pokefood", "cooking");
	public final static ResourceLocation TEXTURE = new ResourceLocation("pokefood", "textures/screens/oven_jei.png");
	private final IDrawable background;
	private final IDrawable icon;

	public CookingRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 86);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(PokefoodModBlocks.OVEN.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<CookingRecipe> getRecipeType() {
		return PokefoodModJeiPlugin.Cooking_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Cooking");
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
	public void setRecipe(IRecipeLayoutBuilder builder, CookingRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 34, 8).addIngredients(recipe.getIngredients().get(0));
	}
}
