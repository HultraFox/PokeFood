
package net.pokefood.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.List;

@JeiPlugin
public class PokefoodModJeiInformation implements IModPlugin {
	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("pokefood:information");
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		registration.addIngredientInfo(List.of(new ItemStack(PokefoodModBlocks.MIXER_RED.get()), new ItemStack(PokefoodModBlocks.MIXER_BLUE.get()), new ItemStack(PokefoodModBlocks.MIXER_GREEN.get()),
				new ItemStack(PokefoodModBlocks.MIXER_YELLOW.get()), new ItemStack(PokefoodModItems.POFFIN_DOUGH_SPICY.get()), new ItemStack(PokefoodModItems.POFFIN_DOUGH_DRY.get()), new ItemStack(PokefoodModItems.POFFIN_DOUGH_SWEET.get()),
				new ItemStack(PokefoodModItems.POFFIN_DOUGH_BITTER.get()), new ItemStack(PokefoodModItems.POFFIN_DOUGH_SOUR.get()), new ItemStack(PokefoodModItems.PUFF_BASIC_SWEET.get()), new ItemStack(PokefoodModItems.PUFF_FROSTED_SWEET.get()),
				new ItemStack(PokefoodModItems.PUFF_FANCY_SWEET.get()), new ItemStack(PokefoodModItems.PUFF_DELUXE_SWEET.get()), new ItemStack(PokefoodModItems.PUFF_BASIC_MINT.get()), new ItemStack(PokefoodModItems.PUFF_FROSTED_MINT.get()),
				new ItemStack(PokefoodModItems.PUFF_FANCY_MINT.get()), new ItemStack(PokefoodModItems.PUFF_DELUXE_MINT.get()), new ItemStack(PokefoodModItems.PUFF_BASIC_CITRUS.get()), new ItemStack(PokefoodModItems.PUFF_FROSTED_CITRUS.get()),
				new ItemStack(PokefoodModItems.PUFF_FANCY_CITRUS.get()), new ItemStack(PokefoodModItems.PUFF_DELUXE_CITRUS.get()), new ItemStack(PokefoodModItems.PUFF_BASIC_MOCHA.get()), new ItemStack(PokefoodModItems.PUFF_FROSTED_MOCHA.get()),
				new ItemStack(PokefoodModItems.PUFF_FANCY_MOCHA.get()), new ItemStack(PokefoodModItems.PUFF_DELUXE_MOCHA.get()), new ItemStack(PokefoodModItems.PUFF_BASIC_SPICY.get()), new ItemStack(PokefoodModItems.PUFF_FROSTED_SPICY.get()),
				new ItemStack(PokefoodModItems.PUFF_FANCY_SPICY.get()), new ItemStack(PokefoodModItems.PUFF_DELUXE_SPICY.get()), new ItemStack(PokefoodModItems.PUFF_BASIC_HONEY.get()), new ItemStack(PokefoodModItems.PUFF_FROSTED_HONEY.get()),
				new ItemStack(PokefoodModItems.PUFF_FANCY_HONEY.get()), new ItemStack(PokefoodModItems.PUFF_DELUXE_HONEY.get()), new ItemStack(PokefoodModItems.PUFF_BASIC_CALM.get()), new ItemStack(PokefoodModItems.PUFF_FROSTED_CALM.get()),
				new ItemStack(PokefoodModItems.PUFF_FANCY_CALM.get()), new ItemStack(PokefoodModItems.PUFF_DELUXE_CALM.get()), new ItemStack(PokefoodModItems.PUFF_BASIC_CANDY.get()), new ItemStack(PokefoodModItems.PUFF_FROSTED_CANDY.get()),
				new ItemStack(PokefoodModItems.PUFF_FANCY_CANDY.get()), new ItemStack(PokefoodModItems.PUFF_DELUXE_CANDY.get()), new ItemStack(PokefoodModItems.PUFF_BASIC_STIFF.get()), new ItemStack(PokefoodModItems.PUFF_FROSTED_STIFF.get()),
				new ItemStack(PokefoodModItems.PUFF_FANCY_STIFF.get()), new ItemStack(PokefoodModItems.PUFF_DELUXE_STIFF.get()), new ItemStack(PokefoodModItems.PUFF_BASIC_STRONG.get()), new ItemStack(PokefoodModItems.PUFF_FROSTED_STRONG.get()),
				new ItemStack(PokefoodModItems.PUFF_FANCY_STRONG.get()), new ItemStack(PokefoodModItems.PUFF_DELUXE_STRONG.get()), new ItemStack(PokefoodModItems.PUFF_BASIC_TOAST.get()), new ItemStack(PokefoodModItems.PUFF_FROSTED_TOAST.get()),
				new ItemStack(PokefoodModItems.PUFF_FANCY_TOAST.get()), new ItemStack(PokefoodModItems.PUFF_DELUXE_TOAST.get()), new ItemStack(PokefoodModItems.PUFF_BASIC_SALTY.get()), new ItemStack(PokefoodModItems.PUFF_FROSTED_SALTY.get()),
				new ItemStack(PokefoodModItems.PUFF_FANCY_SALTY.get()), new ItemStack(PokefoodModItems.PUFF_DELUXE_SALTY.get()), new ItemStack(PokefoodModItems.PUFF_BASIC_ANANAS.get()), new ItemStack(PokefoodModItems.PUFF_FROSTED_ANANAS.get()),
				new ItemStack(PokefoodModItems.PUFF_FANCY_ANANAS.get()), new ItemStack(PokefoodModItems.PUFF_DELUXE_ANANAS.get()), new ItemStack(PokefoodModItems.PUFF_BASIC_HIGH.get()), new ItemStack(PokefoodModItems.PUFF_FROSTED_HIGH.get()),
				new ItemStack(PokefoodModItems.PUFF_FANCY_HIGH.get()), new ItemStack(PokefoodModItems.PUFF_DELUXE_HIGH.get()), new ItemStack(PokefoodModItems.PUFF_BASIC_PEPPER.get()), new ItemStack(PokefoodModItems.PUFF_FROSTED_PEPPER.get()),
				new ItemStack(PokefoodModItems.PUFF_FANCY_PEPPER.get()), new ItemStack(PokefoodModItems.PUFF_DELUXE_PEPPER.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.pokefood.mixing_info"));
		registration.addIngredientInfo(
				List.of(new ItemStack(PokefoodModBlocks.CHEESE_MOLD.get()), new ItemStack(PokefoodModBlocks.CHEESE_FULL_0.get()), new ItemStack(PokefoodModBlocks.CHEESE_FULL_1.get()), new ItemStack(PokefoodModBlocks.CHEESE_FULL_2.get()),
						new ItemStack(PokefoodModBlocks.CHEESE_FULL_3.get()), new ItemStack(PokefoodModBlocks.CHEESE_FULL_4.get()), new ItemStack(PokefoodModBlocks.CHEESE_FULL_5.get()), new ItemStack(PokefoodModItems.BAG_CURD.get())),
				VanillaTypes.ITEM_STACK, Component.translatable("jei.pokefood.cheese_making_info"));
		registration
				.addIngredientInfo(
						List.of(new ItemStack(PokefoodModBlocks.BLENDER.get()), new ItemStack(PokefoodModItems.POKEBLOCK_RED.get()), new ItemStack(PokefoodModItems.POKEBLOCK_BLUE.get()), new ItemStack(PokefoodModItems.POKEBLOCK_PINK.get()),
								new ItemStack(PokefoodModItems.POKEBLOCK_GREEN.get()), new ItemStack(PokefoodModItems.POKEBLOCK_YELLOW.get()), new ItemStack(PokefoodModItems.POKEBLOCK_WHITE.get()),
								new ItemStack(PokefoodModItems.POKEBLOCK_RED_PLUS.get()), new ItemStack(PokefoodModItems.POKEBLOCK_BLUE_PLUS.get()), new ItemStack(PokefoodModItems.POKEBLOCK_GREEN_PLUS.get()),
								new ItemStack(PokefoodModItems.POKEBLOCK_YELLOW_PLUS.get()), new ItemStack(PokefoodModItems.POKEBLOCK_WHITE_PLUS.get()), new ItemStack(PokefoodModItems.POKEBLOCK_PINK_PLUS.get())),
						VanillaTypes.ITEM_STACK, Component.translatable("jei.pokefood.blending_info"));
		registration.addIngredientInfo(List.of(new ItemStack(Items.PAPER), new ItemStack(PokefoodModItems.BURGER_BEEF.get()), new ItemStack(PokefoodModItems.BURGER_BEEF_CHEESE.get()), new ItemStack(PokefoodModItems.BURGER_BEEF_SPICY.get()),
				new ItemStack(PokefoodModItems.BURGER_PORK.get()), new ItemStack(PokefoodModItems.BURGER_PORK_CHEESE.get()), new ItemStack(PokefoodModItems.BURGER_PORK_SPICY.get()), new ItemStack(PokefoodModItems.BURGER_MUTTON.get()),
				new ItemStack(PokefoodModItems.BURGER_MUTTON_CHEESE.get()), new ItemStack(PokefoodModItems.BURGER_MUTTON_SPICY.get()), new ItemStack(PokefoodModItems.BURGER_GREEN.get()), new ItemStack(PokefoodModItems.BURGER_GREEN_CHEESE.get()),
				new ItemStack(PokefoodModItems.BURGER_GREEN_SPICY.get()), new ItemStack(PokefoodModItems.BURGER_FAIRY.get()), new ItemStack(PokefoodModItems.BURGER_FAIRY_CHEESE.get()), new ItemStack(PokefoodModItems.BURGER_FAIRY_SPICY.get()),
				new ItemStack(PokefoodModItems.BURGER_FLUFFY.get()), new ItemStack(PokefoodModItems.BURGER_FLUFFY_CHEESE.get()), new ItemStack(PokefoodModItems.BURGER_FLUFFY_SPICY.get()), new ItemStack(PokefoodModItems.BURGER_NIDO.get()),
				new ItemStack(PokefoodModItems.BURGER_NIDO_CHEESE.get()), new ItemStack(PokefoodModItems.BURGER_NIDO_SPICY.get()), new ItemStack(PokefoodModItems.BURGER_BLUE.get()), new ItemStack(PokefoodModItems.BURGER_BLUE_CHEESE.get()),
				new ItemStack(PokefoodModItems.BURGER_BLUE_SPICY.get()), new ItemStack(PokefoodModItems.BURGER_HORSE.get()), new ItemStack(PokefoodModItems.BURGER_HORSE_CHEESE.get()), new ItemStack(PokefoodModItems.BURGER_HORSE_SPICY.get()),
				new ItemStack(PokefoodModItems.BURGER_LUV.get()), new ItemStack(PokefoodModItems.BURGER_LUV_CHEESE.get()), new ItemStack(PokefoodModItems.BURGER_LUV_SPICY.get()), new ItemStack(PokefoodModItems.BURGER_BAS.get()),
				new ItemStack(PokefoodModItems.BURGER_BAS_CHEESE.get()), new ItemStack(PokefoodModItems.BURGER_BAS_SPICY.get()), new ItemStack(PokefoodModItems.BURGER_KARP.get()), new ItemStack(PokefoodModItems.BURGER_KARP_CHEESE.get()),
				new ItemStack(PokefoodModItems.BURGER_KARP_SPICY.get()), new ItemStack(PokefoodModItems.BURGER_KING.get()), new ItemStack(PokefoodModItems.BURGER_KING_CHEESE.get()), new ItemStack(PokefoodModItems.BURGER_KING_SPICY.get()),
				new ItemStack(PokefoodModItems.BURGER_DEEN.get()), new ItemStack(PokefoodModItems.BURGER_DEEN_CHEESE.get()), new ItemStack(PokefoodModItems.BURGER_DEEN_SPICY.get()), new ItemStack(PokefoodModItems.BURGER_FRIED.get()),
				new ItemStack(PokefoodModItems.BURGER_FRIED_CHEESE.get()), new ItemStack(PokefoodModItems.BURGER_FRIED_SPICY.get()), new ItemStack(PokefoodModItems.WRAPPED_BURGER.get())), VanillaTypes.ITEM_STACK,
				Component.translatable("jei.pokefood.wrapped_burger_info"));
	}
}
