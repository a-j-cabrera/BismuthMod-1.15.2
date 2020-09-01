package com.github.BismuthMod.init;

import com.github.BismuthMod.Bismuth;
import com.github.BismuthMod.util.enums.ModArmorMaterial;
import com.github.BismuthMod.util.enums.ModItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Bismuth.MOD_ID);

    //Items
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot",
            () -> new Item(new Item.Properties().group(Bismuth.TAB_0)));

    //Block Items
    public static final RegistryObject<Item> COPPER_BLOCK_ITEM = ITEMS.register("copper_block",
            () -> new BlockItem(ModBlocks.COPPER_BLOCK.get(), new Item.Properties().group(Bismuth.TAB_1)));
    public static final RegistryObject<Item> COPPER_ORE_ITEM = ITEMS.register("copper_ore",
            () -> new BlockItem(ModBlocks.COPPER_ORE.get(), new Item.Properties().group(Bismuth.TAB_1)));
    public static final RegistryObject<Item> CRUCIBLE_ITEM = ITEMS.register("crucible",
            () -> new BlockItem(ModBlocks.CRUCIBLE.get(), new Item.Properties().group(Bismuth.TAB_1)));
    public static final RegistryObject<Item> GABBRO_ITEM = ITEMS.register("gabbro",
            () -> new BlockItem(ModBlocks.GABBRO.get(), new Item.Properties().group(Bismuth.TAB_1)));
    public static final RegistryObject<Item> DUNITE_ITEM = ITEMS.register("dunite",
            () -> new BlockItem(ModBlocks.DUNITE.get(), new Item.Properties().group(Bismuth.TAB_1)));
    public static final RegistryObject<Item> FLOOR_BASALT_ITEM = ITEMS.register("floor_basalt",
            () -> new BlockItem(ModBlocks.FLOOR_BASALT.get(), new Item.Properties().group(Bismuth.TAB_1)));
    public static final RegistryObject<Item> YELLOW_GRANITE_ITEM = ITEMS.register("yellow_granite",
            () -> new BlockItem(ModBlocks.YELLOW_GRANITE.get(), new Item.Properties().group(Bismuth.TAB_1)));
    public static final RegistryObject<Item> POLISHED_FLOOR_BASALT_ITEM = ITEMS.register("polished_floor_basalt",
            () -> new BlockItem(ModBlocks.POLISHED_FLOOR_BASALT.get(), new Item.Properties().group(Bismuth.TAB_1)));
    public static final RegistryObject<Item> POLISHED_ORANGE_GRANITE_ITEM = ITEMS.register("polished_orange_granite",
            () -> new BlockItem(ModBlocks.POLISHED_ORANGE_GRANITE.get(), new Item.Properties().group(Bismuth.TAB_1)));
    //public static final RegistryObject<Item> POLISHED_BEIGE_GRANITE_ITEM = ITEMS.register("polished_beige_granite",
    //        () -> new BlockItem(ModBlocks.POLISHED_BEIGE_GRANITE.get(), new Item.Properties().group(Bismuth.TAB_1)));
    public static final RegistryObject<Item> POLISHED_YELLOW_GRANITE_ITEM = ITEMS.register("polished_yellow_granite",
            () -> new BlockItem(ModBlocks.POLISHED_YELLOW_GRANITE.get(), new Item.Properties().group(Bismuth.TAB_1)));
    public static final RegistryObject<Item> POLISHED_BROWN_GRANITE_ITEM = ITEMS.register("polished_brown_granite",
            () -> new BlockItem(ModBlocks.POLISHED_BROWN_GRANITE.get(), new Item.Properties().group(Bismuth.TAB_1)));
    public static final RegistryObject<Item> POLISHED_GREEN_GRANITE_ITEM = ITEMS.register("polished_green_granite",
            () -> new BlockItem(ModBlocks.POLISHED_GREEN_GRANITE.get(), new Item.Properties().group(Bismuth.TAB_1)));
    public static final RegistryObject<Item> POLISHED_BLUE_GRANITE_ITEM = ITEMS.register("polished_blue_granite",
            () -> new BlockItem(ModBlocks.POLISHED_BLUE_GRANITE.get(), new Item.Properties().group(Bismuth.TAB_1)));
    public static final RegistryObject<Item> POLISHED_GRAY_GRANITE_ITEM = ITEMS.register("polished_gray_granite",
            () -> new BlockItem(ModBlocks.POLISHED_GRAY_GRANITE.get(), new Item.Properties().group(Bismuth.TAB_1)));
    public static final RegistryObject<Item> POLISHED_WHITE_GRANITE_ITEM = ITEMS.register("polished_white_granite",
            () -> new BlockItem(ModBlocks.POLISHED_WHITE_GRANITE.get(), new Item.Properties().group(Bismuth.TAB_1)));
    public static final RegistryObject<Item> POLISHED_PINK_GRANITE_ITEM = ITEMS.register("polished_pink_granite",
            () -> new BlockItem(ModBlocks.POLISHED_PINK_GRANITE.get(), new Item.Properties().group(Bismuth.TAB_1)));
    public static final RegistryObject<Item> POLISHED_PURPLE_GRANITE_ITEM = ITEMS.register("polished_purple_granite",
            () -> new BlockItem(ModBlocks.POLISHED_PURPLE_GRANITE.get(), new Item.Properties().group(Bismuth.TAB_1)));
    public static final RegistryObject<Item> POLISHED_RED_GRANITE_ITEM = ITEMS.register("polished_red_granite",
            () -> new BlockItem(ModBlocks.POLISHED_RED_GRANITE.get(), new Item.Properties().group(Bismuth.TAB_1)));
    public static final RegistryObject<Item> POLISHED_BLACK_GRANITE_ITEM = ITEMS.register("polished_black_granite",
            () -> new BlockItem(ModBlocks.POLISHED_BLACK_GRANITE.get(), new Item.Properties().group(Bismuth.TAB_1)));
    public static final RegistryObject<Item> POLISHED_CYAN_GRANITE_ITEM = ITEMS.register("polished_cyan_granite",
            () -> new BlockItem(ModBlocks.POLISHED_CYAN_GRANITE.get(), new Item.Properties().group(Bismuth.TAB_1)));
    public static final RegistryObject<Item> POLISHED_MAGENTA_GRANITE_ITEM = ITEMS.register("polished_magenta_granite",
            () -> new BlockItem(ModBlocks.POLISHED_MAGENTA_GRANITE.get(), new Item.Properties().group(Bismuth.TAB_1)));

    //Tools
    public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ModItemTier.COPPER, 2, -2.4F, new Item.Properties().group(Bismuth.TAB_2)));
    public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ModItemTier.COPPER, 2, -2.4F, new Item.Properties().group(Bismuth.TAB_2)));
    public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ModItemTier.COPPER, 2, -2.4F, new Item.Properties().group(Bismuth.TAB_2)));
    public static final RegistryObject<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ModItemTier.COPPER, 2, new Item.Properties().group(Bismuth.TAB_2)));
    public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(ModItemTier.COPPER, 2, -2.4F, new Item.Properties().group(Bismuth.TAB_3)));

    //Armor
    public static final RegistryObject<ArmorItem> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.HEAD, new Item.Properties().group(Bismuth.TAB_3)));
    public static final RegistryObject<ArmorItem> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.CHEST, new Item.Properties().group(Bismuth.TAB_3)));
    public static final RegistryObject<ArmorItem> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            () -> new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.LEGS, new Item.Properties().group(Bismuth.TAB_3)));
    public static final RegistryObject<ArmorItem> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.FEET, new Item.Properties().group(Bismuth.TAB_3)));

}