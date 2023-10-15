package net.pokefood.block.entity;

import net.pokefood.init.PokefoodModBlockEntities;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

public class OnionStage2BlockEntity extends BlockEntity {
	public OnionStage2BlockEntity(BlockPos pos, BlockState state) {
		super(PokefoodModBlockEntities.ONION_STAGE_2.get(), pos, state);
	}

	@Override
	public ClientboundBlockEntityDataPacket getUpdatePacket() {
		return ClientboundBlockEntityDataPacket.create(this);
	}

	@Override
	public CompoundTag getUpdateTag() {
		return this.saveWithFullMetadata();
	}
}
