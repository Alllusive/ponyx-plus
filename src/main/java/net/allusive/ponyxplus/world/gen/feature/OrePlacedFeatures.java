package net.allusive.ponyxplus.world.gen.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

public class OrePlacedFeatures {
    public static void RegisterFeatures0() {
    }
    public static final RegistryEntry<PlacedFeature> PATCH_TANZANITE_OUTCROP = PlacedFeatures.register("patch_tazanite_outcrop", OreConfiguredFeatures.PATCH_TANZANITE_OUTCROP, new PlacementModifier[]{
            RarityFilterPlacementModifier.of(6), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()});

}
