package net.allusive.ponyxplus.util;

import net.allusive.ponyxplus.block.ModBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFlammableBlock();

    }
    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.ENCHANTED_LEAVES, 30, 30);
    }
}
