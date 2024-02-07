
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

public class SugarMeltingRecipeCategory implements IRecipeCategory<SugarMeltingRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("pokefood", "sugar_melting");
	public final static ResourceLocation TEXTURE = new ResourceLocation("pokefood", "textures/screens/sugar_melter_jei.png");
	private final IDrawable background;
	private final IDrawable icon;

	public SugarMeltingRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 86);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(PokefoodModBlocks.SUGAR_MELTER_0.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<SugarMeltingRecipe> getRecipeType() {
		return PokefoodModJeiPlugin.SugarMelting_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Sugar Melting");
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
	public void setRecipe(IRecipeLayoutBuilder builder, SugarMeltingRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 21, 17).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 21, 53).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.INPUT, 57, 24).addIngredients(recipe.getIngredients().get(2));
		builder.addSlot(RecipeIngredientRole.INPUT, 93, 35).addIngredients(recipe.getIngredients().get(3));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 139, 35).addItemStack(recipe.getResultItem(null));
	}
}
