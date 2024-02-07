
package net.pokefood.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.storage.loot.LootParams;
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
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class PackEmptyBlock extends FallingBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final IntegerProperty VISUAL = IntegerProperty.create("visual", 0, 7);

	public PackEmptyBlock() {
		super(BlockBehaviour.Properties.of().mapColor(MapColor.NONE).sound(SoundType.WOOD).strength(1f, 2f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(VISUAL,Integer.valueOf(0)));
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
		
		int visual  = state.getValue(VISUAL);
		
		if(visual==0)
			return switch (state.getValue(FACING)) {
				default -> box(5, 0, 4, 11, 7, 12);
				case NORTH -> box(5, 0, 4, 11, 7, 12);
				case EAST -> box(4, 0, 5, 12, 7, 11);
				case WEST -> box(4, 0, 5, 12, 7, 11);
			};
		else if(visual==1)
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(1, 0, 1, 7, 7, 9), box(6.5, 0, 4.3, 15.1, 7, 14));
				case NORTH -> Shapes.or(box(9, 0, 7, 15, 7, 15), box(0.9, 0, 2, 9.5, 7, 11.7));
				case EAST -> Shapes.or(box(1, 0, 9, 9, 7, 15), box(4.3, 0, 0.9, 14, 7, 9.5));
				case WEST -> Shapes.or(box(7, 0, 1, 15, 7, 7), box(2, 0, 6.5, 11.7, 7, 15.1));
			};
		else if(visual==2)
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(1, 0, 1, 7, 7, 9), box(7.1, 0, 0.2, 15.7, 7, 10), box(2.5, 0, 9.5, 10.5, 7, 15.5));
				case NORTH -> Shapes.or(box(9, 0, 7, 15, 7, 15), box(0.3, 0, 6, 8.9, 7, 15.8), box(5.5, 0, 0.5, 13.5, 7, 6.5));
				case EAST -> Shapes.or(box(1, 0, 9, 9, 7, 15), box(0.2, 0, 0.3, 10, 7, 8.9), box(9.5, 0, 5.5, 15.5, 7, 13.5));
				case WEST -> Shapes.or(box(7, 0, 1, 15, 7, 7), box(6, 0, 7.1, 15.8, 7, 15.7), box(0.5, 0, 2.5, 6.5, 7, 10.5));
		};

		else if(visual==3)
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(2, 0, 0, 8, 7, 8), box(7.4, 0, 2.4, 16, 7, 12.1), box(0.3, 0, 7.5, 10, 7, 16), box(5.2, 7, 1.8, 15.1, 14, 11.7));
				case NORTH -> Shapes.or(box(8, 0, 8, 14, 7, 16), box(0, 0, 3.9, 8.6, 7, 13.6), box(6, 0, 0, 15.7, 7, 8.5), box(0.9, 7, 4.3, 10.8, 14, 14.2));
				case EAST -> Shapes.or(box(0, 0, 8, 8, 7, 14), box(2.4, 0, 0, 12.1, 7, 8.6), box(7.5, 0, 6, 16, 7, 15.7), box(1.8, 7, 0.9, 11.7, 14, 10.8));
				case WEST -> Shapes.or(box(8, 0, 2, 16, 7, 8), box(3.9, 0, 7.4, 13.6, 7, 16), box(0, 0, 0.3, 8.5, 7, 10), box(4.3, 7, 5.2, 14.2, 14, 15.1));
		};

		else if(visual==4)
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(1, 0, 0, 15, 7, 16), box(4, 7, 4, 12.7, 14, 13.8));
				case NORTH -> Shapes.or(box(1, 0, 0, 15, 7, 16), box(3.3, 7, 2.2, 12, 14, 12));
				case EAST -> Shapes.or(box(0, 0, 1, 16, 7, 15), box(4, 7, 3.3, 13.8, 14, 12));
				case WEST -> Shapes.or(box(0, 0, 1, 16, 7, 15), box(2.2, 7, 4, 12, 14, 12.7));
		};
		else if(visual==5)
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(1, 0, 0, 15, 7, 16), box(4.7, 7, 6.1, 14.7, 14, 16), box(0, 7, 0, 8.6, 14, 9.7));
				case NORTH -> Shapes.or(box(1, 0, 0, 15, 7, 16), box(1.3, 7, 0, 11.3, 14, 9.9), box(7.4, 7, 6.3, 16, 14, 16));
				case EAST -> Shapes.or(box(0, 0, 1, 16, 7, 15), box(6.1, 7, 1.3, 16, 14, 11.3), box(0, 7, 7.4, 9.7, 14, 16));
				case WEST -> Shapes.or(box(0, 0, 1, 16, 7, 15), box(0, 7, 4.7, 9.9, 14, 14.7), box(6.3, 7, 0, 16, 14, 8.6));
		};
		else if(visual==6)
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(1, 0, 0, 15, 7, 16), box(3.1, 7, 7.4, 12.9, 14, 16), box(1.3, 7, 0, 7.3, 14, 8), box(7.3, 7, 0, 16, 14, 9.8));
				case NORTH -> Shapes.or(box(1, 0, 0, 15, 7, 16), box(3.1, 7, 0, 12.9, 14, 8.6), box(8.7, 7, 8, 14.7, 14, 16), box(0, 7, 6.2, 8.7, 14, 16));
				case EAST -> Shapes.or(box(0, 0, 1, 16, 7, 15), box(7.4, 7, 3.1, 16, 14, 12.9), box(0, 7, 8.7, 8, 14, 14.7), box(0, 7, 0, 9.8, 14, 8.7));
				case WEST -> Shapes.or(box(0, 0, 1, 16, 7, 15), box(0, 7, 3.1, 8.6, 14, 12.9), box(8, 7, 1.3, 16, 14, 7.3), box(6.2, 7, 7.3, 16, 14, 16));
		};
		else if(visual==7)
			return switch (state.getValue(FACING)) {
				default -> box(1, 0, 0, 15, 14, 16);
				case NORTH -> box(1, 0, 0, 15, 14, 16);
				case EAST -> box(0, 0, 1, 16, 14, 15);
				case WEST -> box(0, 0, 1, 16, 14, 15);
		};
		else
			return box(0, 0, 0, 16, 16, 16);
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, VISUAL);
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

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
