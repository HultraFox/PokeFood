
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

public class IcecreamRecipeCategory implements IRecipeCategory<IcecreamRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("pokefood", "icecream");
	public final static ResourceLocation TEXTURE = new ResourceLocation("pokefood", "textures/screens/icecream_maker_jei.png");
	private final IDrawable background;
	private final IDrawable icon;

	public IcecreamRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 86);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(PokefoodModBlocks.ICE_CREAM_MAKER.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<IcecreamRecipe> getRecipeType() {
		return PokefoodModJeiPlugin.Icecream_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Ice-cream Making");
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
	public void setRecipe(IRecipeLayoutBuilder builder, IcecreamRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 16, 8).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.INPUT, 142, 8).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 52, 62).addItemStack(recipe.getResultItem(null));
	}
}
