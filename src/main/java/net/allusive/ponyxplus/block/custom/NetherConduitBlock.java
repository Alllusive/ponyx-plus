package net.allusive.ponyxplus.block.custom;

import net.allusive.ponyxplus.block.entity.NetherConduitBlockEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.ConduitBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class NetherConduitBlock extends ConduitBlock {
    public NetherConduitBlock(Settings settings) {
        super(settings);
    }
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new NetherConduitBlockEntity(pos, state); // or whatever yours is called
    }
}
