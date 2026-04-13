package com.chinaex123.ifmup.init;

import com.buuz135.industrial.item.addon.*;
import com.chinaex123.ifmup.IndustrialForegoingMoreUpgradePlugins;
import com.hrznstudio.titanium.tab.TitaniumTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS_REGISTER =
            DeferredRegister.createItems(IndustrialForegoingMoreUpgradePlugins.MOD_ID);
    public static final TitaniumTab IFMUP_TAB = new TitaniumTab(ResourceLocation.fromNamespaceAndPath(IndustrialForegoingMoreUpgradePlugins.MOD_ID, "tab"));

    // ==================== 材料 ====================
    public static final DeferredItem<Item> DARKSHINE_BUCKET = ITEMS_REGISTER.register("darkshine_bucket", () ->
            new BucketItem(ModFluids.DARKSHINE.get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET))); // 黯曜桶
    public static final DeferredItem<Item> NETHERITE_GEAR = ITEMS_REGISTER.register("netherite_gear", () -> new Item(new Item.Properties())); // 下界合金齿轮
    public static final DeferredItem<Item> NETHER_STAR_GEAR = ITEMS_REGISTER.register("nether_star_gear", () -> new Item(new Item.Properties())); // 下界之星齿轮

    // -------------------- 暗影 --------------------
    public static final OreItems SHADOW = new OreItems("shadow", Rarity.UNCOMMON);
    // -------------------- 暗影 工具 --------------------
    public static final DeferredItem<Item> SHADOW_SWORD = ITEMS_REGISTER.register("shadow_sword", () ->
            new SwordItem(ModToolTiers.SHADOW, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.SHADOW, 3.0f, -2.4f)).rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> SHADOW_PICKAXE = ITEMS_REGISTER.register("shadow_pickaxe", () ->
            new PickaxeItem(ModToolTiers.SHADOW, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.SHADOW, 1.0f, -2.4f)).rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> SHADOW_AXE = ITEMS_REGISTER.register("shadow_axe", () ->
            new AxeItem(ModToolTiers.SHADOW, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.SHADOW, 5.0f, -3.0f)).rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> SHADOW_SHOVEL = ITEMS_REGISTER.register("shadow_shovel", () ->
            new ShovelItem(ModToolTiers.SHADOW, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.SHADOW, 1.5f, -3.0f)).rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> SHADOW_HOE = ITEMS_REGISTER.register("shadow_hoe", () ->
            new HoeItem(ModToolTiers.SHADOW, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.SHADOW, -2.0f, 0f)).rarity(Rarity.UNCOMMON)));
    // -------------------- 暗影 护甲 --------------------
    public static final DeferredItem<Item> SHADOW_HELMET = ITEMS_REGISTER.register("shadow_helmet", () ->
            new ArmorItem(ModArmorMaterials.SHADOW, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(20))));
    public static final DeferredItem<Item> SHADOW_CHESTPLATE = ITEMS_REGISTER.register("shadow_chestplate", () ->
            new ArmorItem(ModArmorMaterials.SHADOW, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(20))));
    public static final DeferredItem<Item> SHADOW_LEGGINGS = ITEMS_REGISTER.register("shadow_leggings", () ->
            new ArmorItem(ModArmorMaterials.SHADOW, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(20))));
    public static final DeferredItem<Item> SHADOW_BOOTS = ITEMS_REGISTER.register("shadow_boots", () ->
            new ArmorItem(ModArmorMaterials.SHADOW, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(20))));

    // -------------------- 未知魔法 --------------------
    public static final DeferredItem<Item> UNKNOWN_DUST = ITEMS_REGISTER.register("unknown_dust", () -> new Item(new Item.Properties().rarity(Rarity.RARE))); // 未知粉
    public static final AlloyItems UNKNOWN_MAGIC = new AlloyItems("unknown_magic", Rarity.RARE);
    // -------------------- 未知魔法 工具 --------------------
    public static final DeferredItem<Item> UNKNOWN_MAGIC_SWORD = ITEMS_REGISTER.register("unknown_magic_sword", () ->
            new SwordItem(ModToolTiers.UNKNOWN_MAGIC, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.UNKNOWN_MAGIC, 4.0f, -2.4f)).rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> UNKNOWN_MAGIC_PICKAXE = ITEMS_REGISTER.register("unknown_magic_pickaxe", () ->
            new PickaxeItem(ModToolTiers.UNKNOWN_MAGIC, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.UNKNOWN_MAGIC, 5.0f, -2.4f)).rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> UNKNOWN_MAGIC_AXE = ITEMS_REGISTER.register("unknown_magic_axe", () ->
            new AxeItem(ModToolTiers.UNKNOWN_MAGIC, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.UNKNOWN_MAGIC, 6.0f, -3.0f)).rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> UNKNOWN_MAGIC_SHOVEL = ITEMS_REGISTER.register("unknown_magic_shovel", () ->
            new ShovelItem(ModToolTiers.UNKNOWN_MAGIC, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.UNKNOWN_MAGIC, 0f, -3.0f)).rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> UNKNOWN_MAGIC_HOE = ITEMS_REGISTER.register("unknown_magic_hoe", () ->
            new HoeItem(ModToolTiers.UNKNOWN_MAGIC, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.UNKNOWN_MAGIC, -1.0f, 0f)).rarity(Rarity.EPIC)));
    // -------------------- 未知魔法 护甲 --------------------
    public static final DeferredItem<Item> UNKNOWN_MAGIC_HELMET = ITEMS_REGISTER.register("unknown_magic_helmet", () ->
            new ArmorItem(ModArmorMaterials.UNKNOWN_MAGIC, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(40))));
    public static final DeferredItem<Item> UNKNOWN_MAGIC_CHESTPLATE = ITEMS_REGISTER.register("unknown_magic_chestplate", () ->
            new ArmorItem(ModArmorMaterials.UNKNOWN_MAGIC, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(40))));
    public static final DeferredItem<Item> UNKNOWN_MAGIC_LEGGINGS = ITEMS_REGISTER.register("unknown_magic_leggings", () ->
            new ArmorItem(ModArmorMaterials.UNKNOWN_MAGIC, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(40))));
    public static final DeferredItem<Item> UNKNOWN_MAGIC_BOOTS = ITEMS_REGISTER.register("unknown_magic_boots", () ->
            new ArmorItem(ModArmorMaterials.UNKNOWN_MAGIC, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(40))));

    // -------------------- 暗影玫瑰 --------------------
    public static final AlloyItems SHADOW_ROSE = new AlloyItems("shadow_rose", Rarity.RARE);
    // -------------------- 暗影玫瑰 工具 --------------------
    public static final DeferredItem<Item> SHADOW_ROSE_SWORD = ITEMS_REGISTER.register("shadow_rose_sword", () ->
            new SwordItem(ModToolTiers.SHADOW_ROSE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.SHADOW_ROSE, 6.0f, -2.4f)).rarity(Rarity.RARE)));
    public static final DeferredItem<Item> SHADOW_ROSE_PICKAXE = ITEMS_REGISTER.register("shadow_rose_pickaxe", () ->
            new PickaxeItem(ModToolTiers.SHADOW_ROSE, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.SHADOW_ROSE, 4.0f, -2.4f)).rarity(Rarity.RARE)));
    public static final DeferredItem<Item> SHADOW_ROSE_AXE = ITEMS_REGISTER.register("shadow_rose_axe", () ->
            new AxeItem(ModToolTiers.SHADOW_ROSE, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.SHADOW_ROSE, 8.0f, -3.0f)).rarity(Rarity.RARE)));
    public static final DeferredItem<Item> SHADOW_ROSE_SHOVEL = ITEMS_REGISTER.register("shadow_rose_shovel", () ->
            new ShovelItem(ModToolTiers.SHADOW_ROSE, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.SHADOW_ROSE, 1.5f, -3.0f)).rarity(Rarity.RARE)));
    public static final DeferredItem<Item> SHADOW_ROSE_HOE = ITEMS_REGISTER.register("shadow_rose_hoe", () ->
            new HoeItem(ModToolTiers.SHADOW_ROSE, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.SHADOW_ROSE, 1.0f, 0f)).rarity(Rarity.RARE)));
    // -------------------- 暗影玫瑰 护甲 --------------------
    public static final DeferredItem<Item> SHADOW_ROSE_HELMET = ITEMS_REGISTER.register("shadow_rose_helmet", () ->
            new ArmorItem(ModArmorMaterials.SHADOW_ROSE, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(60))));
    public static final DeferredItem<Item> SHADOW_ROSE_CHESTPLATE = ITEMS_REGISTER.register("shadow_rose_chestplate", () ->
            new ArmorItem(ModArmorMaterials.SHADOW_ROSE, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(60))));
    public static final DeferredItem<Item> SHADOW_ROSE_LEGGINGS = ITEMS_REGISTER.register("shadow_rose_leggings", () ->
            new ArmorItem(ModArmorMaterials.SHADOW_ROSE, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(60))));
    public static final DeferredItem<Item> SHADOW_ROSE_BOOTS = ITEMS_REGISTER.register("shadow_rose_boots", () ->
            new ArmorItem(ModArmorMaterials.SHADOW_ROSE, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(60))));

    // -------------------- 星以合金 --------------------
    public static final AlloyItems STAR_ETHER_ALLOY = new AlloyItems("star_ether_alloy", Rarity.EPIC);
    // -------------------- 星以合金 工具 --------------------
    public static final DeferredItem<Item> STAR_ETHER_ALLOY_SWORD = ITEMS_REGISTER.register("star_ether_alloy_sword", () -> 
            new SwordItem(ModToolTiers.STAR_ETHER_ALLOY, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.STAR_ETHER_ALLOY, 10.0f, -2.2f)).rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> STAR_ETHER_ALLOY_PICKAXE = ITEMS_REGISTER.register("star_ether_alloy_pickaxe", () -> 
            new PickaxeItem(ModToolTiers.STAR_ETHER_ALLOY, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.STAR_ETHER_ALLOY, 8.0f, -2.2f)).rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> STAR_ETHER_ALLOY_AXE = ITEMS_REGISTER.register("star_ether_alloy_axe", () ->
            new AxeItem(ModToolTiers.STAR_ETHER_ALLOY, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.STAR_ETHER_ALLOY, 12.0f, -2.8f)).rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> STAR_ETHER_ALLOY_SHOVEL = ITEMS_REGISTER.register("star_ether_alloy_shovel", () ->
            new ShovelItem(ModToolTiers.STAR_ETHER_ALLOY, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.STAR_ETHER_ALLOY, 4.5f, -2.8f)).rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> STAR_ETHER_ALLOY_HOE = ITEMS_REGISTER.register("star_ether_alloy_hoe", () -> 
            new HoeItem(ModToolTiers.STAR_ETHER_ALLOY, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.STAR_ETHER_ALLOY, 4.0f, 0f)).rarity(Rarity.EPIC)));
    // -------------------- 星以合金 护甲 --------------------
    public static final DeferredItem<Item> STAR_ETHER_ALLOY_HELMET = ITEMS_REGISTER.register("star_ether_alloy_helmet", () ->
            new ArmorItem(ModArmorMaterials.STAR_ETHER_ALLOY, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(120))));
    public static final DeferredItem<Item> STAR_ETHER_ALLOY_CHESTPLATE = ITEMS_REGISTER.register("star_ether_alloy_chestplate", () ->
            new ArmorItem(ModArmorMaterials.STAR_ETHER_ALLOY, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(120))));
    public static final DeferredItem<Item> STAR_ETHER_ALLOY_LEGGINGS = ITEMS_REGISTER.register("star_ether_alloy_leggings", () ->
            new ArmorItem(ModArmorMaterials.STAR_ETHER_ALLOY, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(120))));
    public static final DeferredItem<Item> STAR_ETHER_ALLOY_BOOTS = ITEMS_REGISTER.register("star_ether_alloy_boots", () ->
            new ArmorItem(ModArmorMaterials.STAR_ETHER_ALLOY, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(120))));


    // ==================== 速度升级 ====================
    public static final DeferredItem<Item> SPEED_ADDON_TIER_3 = ITEMS_REGISTER.register("speed_addon_tier_3", () -> new SpeedAddonItem(3, IFMUP_TAB));
    public static final DeferredItem<Item> SPEED_ADDON_TIER_4 = ITEMS_REGISTER.register("speed_addon_tier_4", () -> new SpeedAddonItem(4, IFMUP_TAB));
    public static final DeferredItem<Item> SPEED_ADDON_TIER_5 = ITEMS_REGISTER.register("speed_addon_tier_5", () -> new SpeedAddonItem(5, IFMUP_TAB));
    public static final DeferredItem<Item> SPEED_ADDON_TIER_6 = ITEMS_REGISTER.register("speed_addon_tier_6", () -> new SpeedAddonItem(6, IFMUP_TAB));
    public static final DeferredItem<Item> SPEED_ADDON_TIER_7 = ITEMS_REGISTER.register("speed_addon_tier_7", () -> new SpeedAddonItem(7, IFMUP_TAB));
    public static final DeferredItem<Item> SPEED_ADDON_TIER_8 = ITEMS_REGISTER.register("speed_addon_tier_8", () -> new SpeedAddonItem(8, IFMUP_TAB));

    // ==================== 效率升级 ====================
    public static final DeferredItem<Item> EFFICIENCY_ADDON_TIER_3 = ITEMS_REGISTER.register("efficiency_addon_tier_3", () -> new EfficiencyAddonItem(3, IFMUP_TAB));
    public static final DeferredItem<Item> EFFICIENCY_ADDON_TIER_4 = ITEMS_REGISTER.register("efficiency_addon_tier_4", () -> new EfficiencyAddonItem(4, IFMUP_TAB));
    public static final DeferredItem<Item> EFFICIENCY_ADDON_TIER_5 = ITEMS_REGISTER.register("efficiency_addon_tier_5", () -> new EfficiencyAddonItem(5, IFMUP_TAB));
    public static final DeferredItem<Item> EFFICIENCY_ADDON_TIER_6 = ITEMS_REGISTER.register("efficiency_addon_tier_6", () -> new EfficiencyAddonItem(6, IFMUP_TAB));
    public static final DeferredItem<Item> EFFICIENCY_ADDON_TIER_7 = ITEMS_REGISTER.register("efficiency_addon_tier_7", () -> new EfficiencyAddonItem(7, IFMUP_TAB));
    public static final DeferredItem<Item> EFFICIENCY_ADDON_TIER_8 = ITEMS_REGISTER.register("efficiency_addon_tier_8", () -> new EfficiencyAddonItem(8, IFMUP_TAB));

    // ==================== 处理升级 ====================
    public static final DeferredItem<Item> PROCESSING_ADDON_TIER_3 = ITEMS_REGISTER.register("processing_addon_tier_3", () -> new ProcessingAddonItem(3, IFMUP_TAB));
    public static final DeferredItem<Item> PROCESSING_ADDON_TIER_4 = ITEMS_REGISTER.register("processing_addon_tier_4", () -> new ProcessingAddonItem(4, IFMUP_TAB));
    public static final DeferredItem<Item> PROCESSING_ADDON_TIER_5 = ITEMS_REGISTER.register("processing_addon_tier_5", () -> new ProcessingAddonItem(5, IFMUP_TAB));
    public static final DeferredItem<Item> PROCESSING_ADDON_TIER_6 = ITEMS_REGISTER.register("processing_addon_tier_6", () -> new ProcessingAddonItem(6, IFMUP_TAB));
    public static final DeferredItem<Item> PROCESSING_ADDON_TIER_7 = ITEMS_REGISTER.register("processing_addon_tier_7", () -> new ProcessingAddonItem(7, IFMUP_TAB));
    public static final DeferredItem<Item> PROCESSING_ADDON_TIER_8 = ITEMS_REGISTER.register("processing_addon_tier_8", () -> new ProcessingAddonItem(8, IFMUP_TAB));

    // ==================== 范围升级 ====================
    public static final DeferredItem<Item> RANGE_ADDON_TIER_12 = ITEMS_REGISTER.register("range_addon_tier_12", () -> new RangeAddonItem(12, IFMUP_TAB));
    public static final DeferredItem<Item> RANGE_ADDON_TIER_13 = ITEMS_REGISTER.register("range_addon_tier_13", () -> new RangeAddonItem(13, IFMUP_TAB));
    public static final DeferredItem<Item> RANGE_ADDON_TIER_14 = ITEMS_REGISTER.register("range_addon_tier_14", () -> new RangeAddonItem(14, IFMUP_TAB));
    public static final DeferredItem<Item> RANGE_ADDON_TIER_15 = ITEMS_REGISTER.register("range_addon_tier_15", () -> new RangeAddonItem(15, IFMUP_TAB));
    public static final DeferredItem<Item> RANGE_ADDON_TIER_16 = ITEMS_REGISTER.register("range_addon_tier_16", () -> new RangeAddonItem(16, IFMUP_TAB));
    public static final DeferredItem<Item> RANGE_ADDON_TIER_17 = ITEMS_REGISTER.register("range_addon_tier_17", () -> new RangeAddonItem(17, IFMUP_TAB));
    public static final DeferredItem<Item> RANGE_ADDON_TIER_18 = ITEMS_REGISTER.register("range_addon_tier_18", () -> new RangeAddonItem(18, IFMUP_TAB));
    public static final DeferredItem<Item> RANGE_ADDON_TIER_19 = ITEMS_REGISTER.register("range_addon_tier_19", () -> new RangeAddonItem(19, IFMUP_TAB));
    public static final DeferredItem<Item> RANGE_ADDON_TIER_20 = ITEMS_REGISTER.register("range_addon_tier_20", () -> new RangeAddonItem(20, IFMUP_TAB));
    public static final DeferredItem<Item> RANGE_ADDON_TIER_21 = ITEMS_REGISTER.register("range_addon_tier_21", () -> new RangeAddonItem(21, IFMUP_TAB));
    public static final DeferredItem<Item> RANGE_ADDON_TIER_22 = ITEMS_REGISTER.register("range_addon_tier_22", () -> new RangeAddonItem(22, IFMUP_TAB));
    public static final DeferredItem<Item> RANGE_ADDON_TIER_23 = ITEMS_REGISTER.register("range_addon_tier_23", () -> new RangeAddonItem(23, IFMUP_TAB));
    public static final DeferredItem<Item> RANGE_ADDON_TIER_24 = ITEMS_REGISTER.register("range_addon_tier_24", () -> new RangeAddonItem(24, IFMUP_TAB));
    public static final DeferredItem<Item> RANGE_ADDON_TIER_25 = ITEMS_REGISTER.register("range_addon_tier_25", () -> new RangeAddonItem(25, IFMUP_TAB));
    public static final DeferredItem<Item> RANGE_ADDON_TIER_26 = ITEMS_REGISTER.register("range_addon_tier_26", () -> new RangeAddonItem(26, IFMUP_TAB));
    public static final DeferredItem<Item> RANGE_ADDON_TIER_27 = ITEMS_REGISTER.register("range_addon_tier_27", () -> new RangeAddonItem(27, IFMUP_TAB));
    public static final DeferredItem<Item> RANGE_ADDON_TIER_28 = ITEMS_REGISTER.register("range_addon_tier_28", () -> new RangeAddonItem(28, IFMUP_TAB));
    public static final DeferredItem<Item> RANGE_ADDON_TIER_29 = ITEMS_REGISTER.register("range_addon_tier_29", () -> new RangeAddonItem(29, IFMUP_TAB));
    public static final DeferredItem<Item> RANGE_ADDON_TIER_30 = ITEMS_REGISTER.register("range_addon_tier_30", () -> new RangeAddonItem(30, IFMUP_TAB));
    public static final DeferredItem<Item> RANGE_ADDON_TIER_31 = ITEMS_REGISTER.register("range_addon_tier_31", () -> new RangeAddonItem(31, IFMUP_TAB));
    public static final DeferredItem<Item> RANGE_ADDON_TIER_47 = ITEMS_REGISTER.register("range_addon_tier_47", () -> new RangeAddonItem(47, IFMUP_TAB));
    public static final DeferredItem<Item> RANGE_ADDON_TIER_63 = ITEMS_REGISTER.register("range_addon_tier_63", () -> new RangeAddonItem(63, IFMUP_TAB));
    public static final DeferredItem<Item> RANGE_ADDON_TIER_71 = ITEMS_REGISTER.register("range_addon_tier_71", () -> new RangeAddonItem(71, IFMUP_TAB));
    public static final DeferredItem<Item> RANGE_ADDON_TIER_79 = ITEMS_REGISTER.register("range_addon_tier_79", () -> new RangeAddonItem(79, IFMUP_TAB));


    // ==================== 批量注册矿石锭/粒/齿轮/板/粉/棍/线 ====================
    public static class OreItems {
        public final DeferredItem<Item> INGOT;
        public final DeferredItem<Item> NUGGET;
        public final DeferredItem<Item> GEAR;
        public final DeferredItem<Item> DUST;
        public final DeferredItem<Item> PLATE;
        public final DeferredItem<Item> ROD;
        public final DeferredItem<Item> WIRE;
        public final DeferredItem<Item> RAW;

        public OreItems(String materialName, Rarity rarity) {
            INGOT = ITEMS_REGISTER.register(materialName + "_ingot", () -> new Item(new Item.Properties().rarity(rarity)));
            NUGGET = ITEMS_REGISTER.register(materialName + "_nugget", () -> new Item(new Item.Properties().rarity(rarity)));
            GEAR = ITEMS_REGISTER.register(materialName + "_gear", () -> new Item(new Item.Properties().rarity(rarity)));
            DUST = ITEMS_REGISTER.register(materialName + "_dust", () -> new Item(new Item.Properties().rarity(rarity)));
            PLATE = ITEMS_REGISTER.register(materialName + "_plate", () -> new Item(new Item.Properties().rarity(rarity)));
            ROD = ITEMS_REGISTER.register(materialName + "_rod", () -> new Item(new Item.Properties().rarity(rarity)));
            WIRE = ITEMS_REGISTER.register(materialName + "_wire", () -> new Item(new Item.Properties().rarity(rarity)));
            RAW = ITEMS_REGISTER.register( "raw_" + materialName, () -> new Item(new Item.Properties().rarity(rarity)));
        }

        public void addToCreativeTab(java.util.function.Consumer<ItemStack> output) {
            output.accept(new ItemStack(INGOT.get()));
            output.accept(new ItemStack(NUGGET.get()));
            output.accept(new ItemStack(GEAR.get()));
            output.accept(new ItemStack(DUST.get()));
            output.accept(new ItemStack(PLATE.get()));
            output.accept(new ItemStack(ROD.get()));
            output.accept(new ItemStack(WIRE.get()));
            output.accept(new ItemStack(RAW.get()));
        }
    }

    // ==================== 批量注册合金锭/粒/齿轮/板/粉/棍/线 ====================
    public static class AlloyItems {
        public final DeferredItem<Item> INGOT;
        public final DeferredItem<Item> NUGGET;
        public final DeferredItem<Item> GEAR;
        public final DeferredItem<Item> DUST;
        public final DeferredItem<Item> PLATE;
        public final DeferredItem<Item> ROD;
        public final DeferredItem<Item> WIRE;

        public AlloyItems(String materialName, Rarity rarity) {
            INGOT = ITEMS_REGISTER.register(materialName + "_ingot", () -> new Item(new Item.Properties().rarity(rarity)));
            NUGGET = ITEMS_REGISTER.register(materialName + "_nugget", () -> new Item(new Item.Properties().rarity(rarity)));
            GEAR = ITEMS_REGISTER.register(materialName + "_gear", () -> new Item(new Item.Properties().rarity(rarity)));
            DUST = ITEMS_REGISTER.register(materialName + "_dust", () -> new Item(new Item.Properties().rarity(rarity)));
            PLATE = ITEMS_REGISTER.register(materialName + "_plate", () -> new Item(new Item.Properties().rarity(rarity)));
            ROD = ITEMS_REGISTER.register(materialName + "_rod", () -> new Item(new Item.Properties().rarity(rarity)));
            WIRE = ITEMS_REGISTER.register(materialName + "_wire", () -> new Item(new Item.Properties().rarity(rarity)));
        }

        public void addToCreativeTab(java.util.function.Consumer<ItemStack> output) {
            output.accept(new ItemStack(INGOT.get()));
            output.accept(new ItemStack(NUGGET.get()));
            output.accept(new ItemStack(GEAR.get()));
            output.accept(new ItemStack(DUST.get()));
            output.accept(new ItemStack(PLATE.get()));
            output.accept(new ItemStack(ROD.get()));
            output.accept(new ItemStack(WIRE.get()));
        }
    }

    public static void register(IEventBus eventBus){
        ITEMS_REGISTER.register(eventBus);
    }
}
