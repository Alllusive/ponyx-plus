package net.allusive.ponyxplus;

import net.allusive.ponyxplus.block.ModBlocks;
import net.allusive.ponyxplus.item.ModItems;
import net.allusive.ponyxplus.util.ModRegistries;
import net.allusive.ponyxplus.world.gen.feature.OreConfiguredFeatures;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.allusive.ponyxplus.world.gen.feature.OrePlacedFeatures;
public class PonyxPlus implements ModInitializer, ClientModInitializer {
	public static final String MOD_ID = "ponyxplus";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModStuffs();
		OrePlacedFeatures.RegisterFeatures0();
		OreConfiguredFeatures.RegisterFeatures1();
		BiomeModifications.create(new Identifier(MOD_ID,"tanzanite_outcrop")).add(ModificationPhase.ADDITIONS, BiomeSelectors.foundInTheNether(),(context->{
			context.getGenerationSettings().addFeature(GenerationStep.Feature.UNDERGROUND_DECORATION, OrePlacedFeatures.PATCH_TANZANITE_OUTCROP.getKey().get());
		}));
	}

	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GEL_BLOCK, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TANZANITE_OUTCROP, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENCHANTED_LEAVES, RenderLayer.getCutout());
	}
}
