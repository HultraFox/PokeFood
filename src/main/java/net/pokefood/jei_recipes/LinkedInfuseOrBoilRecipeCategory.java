
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

public class LinkedInfuseOrBoilRecipeCategory implements IRecipeCategory<LinkedInfuseOrBoilRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("pokefood", "linked_infuse_or_boil");
	public final static ResourceLocation TEXTURE = new ResourceLocation("pokefood", "textures/screens/linked_cooking_pot_jei.png");
	private final IDrawable background;
	private final IDrawable icon;

	public LinkedInfuseOrBoilRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 86);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(PokefoodModBlocks.COOKING_POT.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<LinkedInfuseOrBoilRecipe> getRecipeType() {
		return PokefoodModJeiPlugin.LinkedInfuseOrBoil_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Infuse or Boil");
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
	public void setRecipe(IRecipeLayoutBuilder builder, LinkedInfuseOrBoilRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 35, 11).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 71, 11).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.INPUT, 107, 11).addIngredients(recipe.getIngredients().get(2));
		builder.addSlot(RecipeIngredientRole.INPUT, 143, 11).addIngredients(recipe.getIngredients().get(3));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 89, 36).addItemStack(recipe.getResultItem(null));
	}
}
