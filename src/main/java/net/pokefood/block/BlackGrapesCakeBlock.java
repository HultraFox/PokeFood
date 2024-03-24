
package net.pokefood.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.List;

public class BlackGrapesCakeBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final IntegerProperty PARTS = IntegerProperty.create("parts", 0, 3);

	public BlackGrapesCakeBlock() {
		super(BlockBehaviour.Properties.of().mapColor(MapColor.NONE).sound(SoundType.WOOL).strength(0.5f).noOcclusion().pushReaction(PushReaction.DESTROY).isRedstoneConductor((bs, br, bp) -> false).noLootTable());
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(PARTS, Integer.valueOf(0)));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		int parts = state.getValue(PARTS);

		if (parts == 0)
			return box(1, 0, 1, 15, 8, 15);
		if (parts == 1)
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(1, 0, 1, 15, 8, 8), box(1, 0, 8, 8, 8, 15));
				case NORTH -> Shapes.or(box(1, 0, 8, 15, 8, 15), box(8, 0, 1, 15, 8, 8));
				case EAST -> Shapes.or(box(1, 0, 1, 8, 8, 15), box(8, 0, 8, 15, 8, 15));
				case WEST -> Shapes.or(box(8, 0, 1, 15, 8, 15), box(1, 0, 1, 8, 8, 8));
			};
		if (parts == 2)
			return switch (state.getValue(FACING)) {
				default -> box(1, 0, 1, 15, 8, 8);
				case NORTH -> box(1, 0, 8, 15, 8, 15);
				case EAST -> box(1, 0, 1, 8, 8, 15);
				case WEST -> box(8, 0, 1, 15, 8, 15);
			};
		if (parts == 3)
			return switch (state.getValue(FACING)) {
				default -> box(1, 0, 1, 8, 8, 8);
				case NORTH -> box(8, 0, 8, 15, 8, 15);
				case EAST -> box(1, 0, 8, 8, 8, 15);
				case WEST -> box(8, 0, 1, 15, 8, 8);
			};
		else
			return box(1, 0, 1, 15, 8, 15);
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, PARTS);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}
}
