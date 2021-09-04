package io.htmlchannel.utils.nbt;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.BlockPos;

public class BlockPosCompound {

    private final BlockPos pos;

    public BlockPosCompound(int x, int y, int z) {
        this(new BlockPos(x, y, z));
    }

    public BlockPosCompound(BlockPos pos) {
        this.pos = pos;
    }

    public String getString() {
        return String.format("{%d, %d, %d}", pos.getX(), pos.getY(), pos.getZ());
    }

    public CompoundNBT writeCompound() {
        CompoundNBT compoundNBT = new CompoundNBT();
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        compoundNBT.putInt("x", x);
        compoundNBT.putInt("y", y);
        compoundNBT.putInt("z", z);
        return compoundNBT;
    }
}
