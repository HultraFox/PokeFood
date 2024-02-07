package net.pokefood.block.entity;

import net.pokefood.init.PokefoodModBlockEntities;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

public class CalcuimCropBlockEntity extends BlockEntity {
	public CalcuimCropBlockEntity(BlockPos pos, BlockState state) {
		super(PokefoodModBlockEntities.CALCUIM_CROP.get(), pos, state);
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
