package com.railwayteam.railways.mixin_interfaces;

public interface IBufferBlockedTrain {
    boolean railways$isControlBlocked();
    void railways$setControlBlocked(boolean controlBlocked, boolean forceBackwards);

    int railways$getBlockedSign();
}
