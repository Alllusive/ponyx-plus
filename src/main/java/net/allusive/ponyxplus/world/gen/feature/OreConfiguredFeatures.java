package net.allusive.ponyxplus.world.gen.feature;

import net.allusive.ponyxplus.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.BiasedToBottomIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.BlockFilterPlacementModifier;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import java.util.List;

public class OreConfiguredFeatures {
    public static void RegisterFeatures1() {
    }
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> PATCH_TANZANITE_OUTCROP = ConfiguredFeatures.register("patch_tanzanite_outcrop", Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(20, 4, 0, PlacedFeatures.createEntry(Feature.BLOCK_COLUMN, BlockColumnFeatureConfig.create(BiasedToBottomIntProvider.create(1, 1), BlockStateProvider.of(ModBlocks.TANZANITE_OUTCROP)), BlockFilterPlacementModifier.of(BlockPredicate.allOf(BlockPredicate.matchingBlock(Blocks.LAVA, BlockPos.ORIGIN), BlockPredicate.matchingBlock(Blocks.NETHERRACK, new BlockPos(0, -1, 0)),
            BlockPredicate.anyOf(BlockPredicate.matchingFluids(List.of(Fluids.LAVA, Fluids.FLOWING_LAVA),
            new BlockPos(1, 0, 0)), BlockPredicate.matchingFluids(List.of(Fluids.LAVA, Fluids.FLOWING_LAVA),
            new BlockPos(-1, 0, 0)), BlockPredicate.matchingFluids(List.of(Fluids.LAVA, Fluids.FLOWING_LAVA),
            new BlockPos(0, 0, 1)), BlockPredicate.matchingFluids(List.of(Fluids.LAVA, Fluids.FLOWING_LAVA),
            new BlockPos(0, 0, -1))))))));

}
