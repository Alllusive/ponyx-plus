package net.allusive.ponyxplus.item;

import net.allusive.ponyxplus.PonyxPlus;
import net.allusive.ponyxplus.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item HEAD_OF_SOL = registerItem("head_of_sol",
            new SwordItem(ModToolMaterials.HEADOFSOL, 48, -3.3f, new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item GEL_LUMP = registerItem("gel_lump",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    public static final Item CUT_TANZANITE = registerItem("cut_tanzanite",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    public static final Item TANZANITE_SWORD = registerItem("tanzanite_sword",
            new ModGlowingSwordItem(ModToolMaterials.TANZANITE, 10, -2.8f,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item TANZANITE_PICKAXE = registerItem("tanzanite_pickaxe",
            new ModPickaxeItem(ModToolMaterials.TANZANITE, 6, -2.5f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));

    public static final Item TANZANITE_AXE = registerItem("tanzanite_axe",
            new ModAxeItem(ModToolMaterials.TANZANITE, 12, -3.1f,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item TANZANITE_HOE = registerItem("tanzanite_hoe",
            new ModHoeItem(ModToolMaterials.TANZANITE, 1, 0f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));

    public static final Item TANZANITE_SHOVEL = registerItem("tanzanite_shovel",
            new ModShovelItem(ModToolMaterials.TANZANITE, 4, -3.0f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));

    public static final Item TANZANITE_CHESTPLATE = registerItem("tanzanite_chestplate",
            new ArmorItem(ModArmourMaterials.TANZANITE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item TANZANITE_LEGGINGS = registerItem("tanzanite_leggings",
            new ArmorItem(ModArmourMaterials.TANZANITE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item TANZANITE_BOOTS = registerItem("tanzanite_boots",
            new ArmorItem(ModArmourMaterials.TANZANITE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item TANZANITE_HELMET = registerItem("tanzanite_helmet",
            new ModArmorItem(ModArmourMaterials.TANZANITE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item ANCIENT_RELIC = registerItem("ancient_relic",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(PonyxPlus.MOD_ID, name), item);
    }


    public static void registerModItems() {
        PonyxPlus.LOGGER.info("Registering Mod Items for " + PonyxPlus.MOD_ID);
    }
}
