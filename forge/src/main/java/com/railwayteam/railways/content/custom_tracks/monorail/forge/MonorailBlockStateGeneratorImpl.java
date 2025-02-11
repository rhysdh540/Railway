package com.railwayteam.railways.content.custom_tracks.monorail.forge;

import com.railwayteam.railways.content.custom_tracks.monorail.MonorailBlockStateGenerator;
import com.simibubi.create.content.trains.track.TrackBlock;
import com.simibubi.create.content.trains.track.TrackShape;
import com.tterrag.registrate.providers.DataGenContext;
import com.tterrag.registrate.providers.RegistrateBlockstateProvider;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.ModelFile;

public class MonorailBlockStateGeneratorImpl extends MonorailBlockStateGenerator {
    public static MonorailBlockStateGenerator create() {
        return new MonorailBlockStateGeneratorImpl();
    }

    @Override
    public <T extends Block> ModelFile getModel(DataGenContext<Block, T> ctx, RegistrateBlockstateProvider prov, BlockState state) {
        TrackShape value = state.getValue(TrackBlock.SHAPE);
        if (value == TrackShape.NONE)
            return prov.models()
                .getExistingFile(prov.mcLoc("block/air"));
        return prov.models()
            .getExistingFile(prov.modLoc("block/monorail/monorail/static_blocks/" + value.getModel()));
    }
}
