
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

public class CrepeCookingRecipeCategory implements IRecipeCategory<CrepeCookingRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("pokefood", "crepe_cooking");
	public final static ResourceLocation TEXTURE = new ResourceLocation("pokefood", "textures/screens/crepe_maker_jei.png");
	private final IDrawable background;
	private final IDrawable icon;

	public CrepeCookingRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 86);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(PokefoodModBlocks.CREPE_MAKER.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<CrepeCookingRecipe> getRecipeType() {
		return PokefoodModJeiPlugin.CrepeCooking_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Crepe Cooking");
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
	public void setRecipe(IRecipeLayoutBuilder builder, CrepeCookingRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 79, 35).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 137, 35).addItemStack(recipe.getResultItem(null));
	}
}
