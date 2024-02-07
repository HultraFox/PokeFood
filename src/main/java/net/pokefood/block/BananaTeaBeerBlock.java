
package net.pokefood.block;

import net.pokefood.procedures.FluidNoFallDamageProcedure;
import net.pokefood.procedures.CheckIfLavaOrNetherProcedure;
import net.pokefood.init.PokefoodModFluids;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class BananaTeaBeerBlock extends LiquidBlock {
	public BananaTeaBeerBlock() {
		super(() -> PokefoodModFluids.BANANA_TEA_BEER.get(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, 10);
		CheckIfLavaOrNetherProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		CheckIfLavaOrNetherProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		world.scheduleTick(pos, this, 10);
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		FluidNoFallDamageProcedure.execute(entity);
	}
}
