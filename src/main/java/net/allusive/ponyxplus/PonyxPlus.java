package net.allusive.ponyxplus;

import net.allusive.ponyxplus.block.ModBlocks;
import net.allusive.ponyxplus.item.ModItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PonyxPlus implements ModInitializer, ClientModInitializer {
	public static final String MOD_ID = "ponyxplus";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GEL_BLOCK, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TANZANITE_OUTCROP, RenderLayer.getCutout());
	}
	@Override
	public void onInitializeClient() {

	}
}
