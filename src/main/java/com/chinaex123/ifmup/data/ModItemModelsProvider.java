package com.chinaex123.ifmup.data;

import com.chinaex123.ifmup.IndustrialForegoingMoreUpgradePlugins;
import com.chinaex123.ifmup.init.ModBlocks;
import com.chinaex123.ifmup.init.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModItemModelsProvider extends ItemModelProvider {
    public ModItemModelsProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, IndustrialForegoingMoreUpgradePlugins.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // ==================== 材料 ====================
        basicOtherMaterialItem(ModItems.DARKSHINE_BUCKET); // 黯曜桶
        basicOtherMaterialItem(ModItems.NETHERITE_GEAR); // 下界合金齿轮
        basicOtherMaterialItem(ModItems.NETHER_STAR_GEAR); // 下界之星齿轮

        basicMaterialItem(ModItems.SHADOW.INGOT); // 暗影锭
        basicMaterialItem(ModItems.SHADOW.NUGGET); // 暗影粒
        basicMaterialItem(ModItems.SHADOW.GEAR); // 暗影轮
        basicMaterialItem(ModItems.SHADOW.DUST); // 暗影粉
        basicMaterialItem(ModItems.SHADOW.PLATE); // 暗影板
        basicMaterialItem(ModItems.SHADOW.ROD); // 暗影棍
        basicMaterialItem(ModItems.SHADOW.WIRE); // 暗影线
        rawMaterialItem(ModItems.SHADOW.RAW); // 粗暗影矿
        basicMaterialBlockItem(ModBlocks.SHADOW_BLOCK); // 暗影块
        rawMaterialBlockItem(ModBlocks.RAW_SHADOW_BLOCK); // 粗暗影块
        oreBlockItem(ModBlocks.NETHER_SHADOW_ORE); // 下界暗影矿
        basicToolsItem(ModItems.SHADOW_SWORD); // 暗影剑
        basicToolsItem(ModItems.SHADOW_PICKAXE); // 暗影镐
        basicToolsItem(ModItems.SHADOW_AXE); // 暗影斧
        basicToolsItem(ModItems.SHADOW_SHOVEL); // 暗影铲
        basicToolsItem(ModItems.SHADOW_HOE); // 暗影锄
        basicArmorItem(ModItems.SHADOW_HELMET); // 暗影头盔
        basicArmorItem(ModItems.SHADOW_CHESTPLATE); // 暗影胸甲
        basicArmorItem(ModItems.SHADOW_LEGGINGS); // 暗影护腿
        basicArmorItem(ModItems.SHADOW_BOOTS); // 暗影靴子

        basicOtherMaterialItem(ModItems.UNKNOWN_DUST); // 未知粉
        basicOtherMaterialBlockItem(ModBlocks.UNKNOWN_BLOCK); // 未知块
        basicMaterialItem(ModItems.UNKNOWN_MAGIC.INGOT); // 未知魔法锭
        basicMaterialItem(ModItems.UNKNOWN_MAGIC.NUGGET); // 未知魔法粒
        basicMaterialItem(ModItems.UNKNOWN_MAGIC.GEAR); // 未知魔法齿轮
        basicMaterialItem(ModItems.UNKNOWN_MAGIC.DUST); // 未知魔法粉
        basicMaterialItem(ModItems.UNKNOWN_MAGIC.PLATE); // 未知魔法板
        basicMaterialItem(ModItems.UNKNOWN_MAGIC.ROD); // 未知魔法棍
        basicMaterialItem(ModItems.UNKNOWN_MAGIC.WIRE); // 未知魔法线
        basicMaterialBlockItem(ModBlocks.UNKNOWN_MAGIC_BLOCK); // 未知魔法块
        basicToolsItem(ModItems.UNKNOWN_MAGIC_SWORD); // 未知魔法剑
        basicToolsItem(ModItems.UNKNOWN_MAGIC_PICKAXE); // 未知魔法镐
        basicToolsItem(ModItems.UNKNOWN_MAGIC_AXE); // 未知魔法斧
        basicToolsItem(ModItems.UNKNOWN_MAGIC_SHOVEL); // 未知魔法铲
        basicToolsItem(ModItems.UNKNOWN_MAGIC_HOE); // 未知魔法锄
        basicArmorItem(ModItems.UNKNOWN_MAGIC_HELMET); // 未知魔法头盔
        basicArmorItem(ModItems.UNKNOWN_MAGIC_CHESTPLATE); // 未知魔法胸甲
        basicArmorItem(ModItems.UNKNOWN_MAGIC_LEGGINGS); // 未知魔法护腿
        basicArmorItem(ModItems.UNKNOWN_MAGIC_BOOTS); // 未知魔法靴子

        basicMaterialItem(ModItems.SHADOW_ROSE.INGOT); // 暗影玫瑰锭
        basicMaterialItem(ModItems.SHADOW_ROSE.NUGGET); // 暗影玫瑰粒
        basicMaterialItem(ModItems.SHADOW_ROSE.GEAR); // 暗影玫瑰齿轮
        basicMaterialItem(ModItems.SHADOW_ROSE.DUST); // 暗影玫瑰粉
        basicMaterialItem(ModItems.SHADOW_ROSE.PLATE); // 暗影玫瑰板
        basicMaterialItem(ModItems.SHADOW_ROSE.ROD); // 暗影玫瑰棍
        basicMaterialItem(ModItems.SHADOW_ROSE.WIRE); // 暗影玫瑰线
        basicMaterialBlockItem(ModBlocks.SHADOW_ROSE_BLOCK); // 暗影玫瑰块
        basicToolsItem(ModItems.SHADOW_ROSE_SWORD); // 暗影玫瑰剑
        basicToolsItem(ModItems.SHADOW_ROSE_PICKAXE); // 暗影玫瑰镐
        basicToolsItem(ModItems.SHADOW_ROSE_AXE); // 暗影玫瑰斧
        basicToolsItem(ModItems.SHADOW_ROSE_SHOVEL); // 暗影玫瑰铲
        basicToolsItem(ModItems.SHADOW_ROSE_HOE); // 暗影玫瑰锄
        basicArmorItem(ModItems.SHADOW_ROSE_HELMET); // 暗影玫瑰头盔
        basicArmorItem(ModItems.SHADOW_ROSE_CHESTPLATE); // 暗影玫瑰胸甲
        basicArmorItem(ModItems.SHADOW_ROSE_LEGGINGS); // 暗影玫瑰护腿
        basicArmorItem(ModItems.SHADOW_ROSE_BOOTS); // 暗影玫瑰靴子

        basicMaterialItem(ModItems.STAR_ETHER_ALLOY.INGOT); // 星以合金锭
        basicMaterialItem(ModItems.STAR_ETHER_ALLOY.NUGGET); // 星以合金粒
        basicMaterialItem(ModItems.STAR_ETHER_ALLOY.GEAR); // 星以合金齿轮
        basicMaterialItem(ModItems.STAR_ETHER_ALLOY.DUST); // 星以合金粉
        basicMaterialItem(ModItems.STAR_ETHER_ALLOY.PLATE); // 星以合金板
        basicMaterialItem(ModItems.STAR_ETHER_ALLOY.ROD); // 星以合金棍
        basicMaterialItem(ModItems.STAR_ETHER_ALLOY.WIRE); // 星以合金线
        basicMaterialBlockItem(ModBlocks.STAR_ETHER_ALLOY_BLOCK); // 星以合金块
        basicToolsItem(ModItems.STAR_ETHER_ALLOY_SWORD); // 星以合金剑
        basicToolsItem(ModItems.STAR_ETHER_ALLOY_PICKAXE); // 星以合金镐
        basicToolsItem(ModItems.STAR_ETHER_ALLOY_AXE); // 星以合金斧
        basicToolsItem(ModItems.STAR_ETHER_ALLOY_SHOVEL); // 星以合金铲
        basicToolsItem(ModItems.STAR_ETHER_ALLOY_HOE); // 星以合金锄
        basicArmorItem(ModItems.STAR_ETHER_ALLOY_HELMET); // 星以合金头盔
        basicArmorItem(ModItems.STAR_ETHER_ALLOY_CHESTPLATE); // 星以合金胸甲
        basicArmorItem(ModItems.STAR_ETHER_ALLOY_LEGGINGS); // 星以合金护腿
        basicArmorItem(ModItems.STAR_ETHER_ALLOY_BOOTS); // 星以合金靴子


        // ==================== 速度升级 ====================
        basicItem(ModItems.SPEED_ADDON_TIER_3.get());
        basicItem(ModItems.SPEED_ADDON_TIER_4.get());
        basicItem(ModItems.SPEED_ADDON_TIER_5.get());
        basicItem(ModItems.SPEED_ADDON_TIER_6.get());
        basicItem(ModItems.SPEED_ADDON_TIER_7.get());
        basicItem(ModItems.SPEED_ADDON_TIER_8.get());
        // ==================== 效率升级 ====================
        basicItem(ModItems.EFFICIENCY_ADDON_TIER_3.get());
        basicItem(ModItems.EFFICIENCY_ADDON_TIER_4.get());
        basicItem(ModItems.EFFICIENCY_ADDON_TIER_5.get());
        basicItem(ModItems.EFFICIENCY_ADDON_TIER_6.get());
        basicItem(ModItems.EFFICIENCY_ADDON_TIER_7.get());
        basicItem(ModItems.EFFICIENCY_ADDON_TIER_8.get());
        // ==================== 速度升级 ====================
        basicItem(ModItems.PROCESSING_ADDON_TIER_3.get());
        basicItem(ModItems.PROCESSING_ADDON_TIER_4.get());
        basicItem(ModItems.PROCESSING_ADDON_TIER_5.get());
        basicItem(ModItems.PROCESSING_ADDON_TIER_6.get());
        basicItem(ModItems.PROCESSING_ADDON_TIER_7.get());
        basicItem(ModItems.PROCESSING_ADDON_TIER_8.get());
        // ==================== 范围升级 ====================
        basicItem(ModItems.RANGE_ADDON_TIER_12.get());
        basicItem(ModItems.RANGE_ADDON_TIER_13.get());
        basicItem(ModItems.RANGE_ADDON_TIER_14.get());
        basicItem(ModItems.RANGE_ADDON_TIER_15.get());
        basicItem(ModItems.RANGE_ADDON_TIER_16.get());
        basicItem(ModItems.RANGE_ADDON_TIER_17.get());
        basicItem(ModItems.RANGE_ADDON_TIER_18.get());
        basicItem(ModItems.RANGE_ADDON_TIER_19.get());
        basicItem(ModItems.RANGE_ADDON_TIER_20.get());
        basicItem(ModItems.RANGE_ADDON_TIER_21.get());
        basicItem(ModItems.RANGE_ADDON_TIER_22.get());
        basicItem(ModItems.RANGE_ADDON_TIER_23.get());
        basicItem(ModItems.RANGE_ADDON_TIER_24.get());
        basicItem(ModItems.RANGE_ADDON_TIER_25.get());
        basicItem(ModItems.RANGE_ADDON_TIER_26.get());
        basicItem(ModItems.RANGE_ADDON_TIER_27.get());
        basicItem(ModItems.RANGE_ADDON_TIER_28.get());
        basicItem(ModItems.RANGE_ADDON_TIER_29.get());
        basicItem(ModItems.RANGE_ADDON_TIER_30.get());
        basicItem(ModItems.RANGE_ADDON_TIER_31.get());
        basicItem(ModItems.RANGE_ADDON_TIER_47.get());
        basicItem(ModItems.RANGE_ADDON_TIER_63.get());
        basicItem(ModItems.RANGE_ADDON_TIER_71.get());
        basicItem(ModItems.RANGE_ADDON_TIER_79.get());
    }

    /**
     * 工具物品模型（路径：textures/item/tools）
     */
    private void basicToolsItem(DeferredItem<?> item) {
        String itemName = item.getId().getPath();
        ItemModelBuilder builder = withExistingParent(itemName, ResourceLocation.withDefaultNamespace("item/handheld"));
        builder.texture("layer0", ResourceLocation.fromNamespaceAndPath(IndustrialForegoingMoreUpgradePlugins.MOD_ID, "item/tools/" + itemName));
    }

    /**
     * 护甲物品模型（路径：textures/item/armor）
     */
    private void basicArmorItem(DeferredItem<?> item) {
        String itemName = item.getId().getPath();
        ItemModelBuilder builder = withExistingParent(itemName, ResourceLocation.withDefaultNamespace("item/generated"));
        builder.texture("layer0", ResourceLocation.fromNamespaceAndPath(IndustrialForegoingMoreUpgradePlugins.MOD_ID, "item/armor/" + itemName));
    }

    /**
     * 材料物品模型（路径：textures/item/material/材料文件夹）
     */
    private void basicMaterialItem(DeferredItem<?> item) {
        String itemName = item.getId().getPath();
        String materialName = itemName.substring(0, itemName.lastIndexOf('_'));
        ItemModelBuilder builder = withExistingParent(itemName, ResourceLocation.withDefaultNamespace("item/generated"));
        builder.texture("layer0", ResourceLocation.fromNamespaceAndPath(IndustrialForegoingMoreUpgradePlugins.MOD_ID, "item/material/" + materialName + "/" + itemName));
    }

    /**
     * 材料物品模型（路径：textures/item/material/raw、block）
     */
    private void rawMaterialItem(DeferredItem<?> item) {
        String itemName = item.getId().getPath();
        ItemModelBuilder builder = withExistingParent(itemName, ResourceLocation.withDefaultNamespace("item/generated"));
        if (itemName.endsWith("_block")) {
            String materialName = itemName.substring(4, itemName.length() - 6);
            builder.texture("layer0", ResourceLocation.fromNamespaceAndPath(IndustrialForegoingMoreUpgradePlugins.MOD_ID, "item/material/" + materialName + "/" + itemName));
        } else {
            String materialName = itemName.substring(4);
            builder.texture("layer0", ResourceLocation.fromNamespaceAndPath(IndustrialForegoingMoreUpgradePlugins.MOD_ID, "item/material/" + materialName + "/" + itemName));
        }
    }

    /**
     * 其他材料物品模型（路径：textures/item/material）
     */
    private void basicOtherMaterialItem(DeferredItem<?> item) {
        String itemName = item.getId().getPath();
        ItemModelBuilder builder = withExistingParent(itemName, ResourceLocation.withDefaultNamespace("item/generated"));
        builder.texture("layer0", ResourceLocation.fromNamespaceAndPath(IndustrialForegoingMoreUpgradePlugins.MOD_ID, "item/material/" + itemName));
    }

    /**
     * 材料方块模型（路径：textures/block/material/材料文件夹）
     */
    private void basicMaterialBlockItem(DeferredBlock<?> block) {
        String blockName = block.getId().getPath();
        String materialName = blockName.substring(0, blockName.lastIndexOf('_'));
        ItemModelBuilder builder = withExistingParent(blockName, ResourceLocation.withDefaultNamespace("item/generated"));
        builder.texture("layer0", ResourceLocation.fromNamespaceAndPath(IndustrialForegoingMoreUpgradePlugins.MOD_ID, "block/material/" + materialName + "/" + blockName));
    }

    /**
     * 粗材料方块模型（路径：textures/block/material/raw_材料文件夹）
     */
    private void rawMaterialBlockItem(DeferredBlock<?> block) {
        String blockName = block.getId().getPath();
        String materialName = blockName.substring(4, blockName.length() - 6);
        ItemModelBuilder builder = withExistingParent(blockName, ResourceLocation.withDefaultNamespace("item/generated"));
        builder.texture("layer0", ResourceLocation.fromNamespaceAndPath(IndustrialForegoingMoreUpgradePlugins.MOD_ID, "block/material/" + materialName + "/" + blockName));
    }

    /**
     * 材料方块模型（路径：textures/block/material）
     */
    private void basicOtherMaterialBlockItem(DeferredBlock<?> block) {
        String blockName = block.getId().getPath();
        ItemModelBuilder builder = withExistingParent(blockName, ResourceLocation.withDefaultNamespace("item/generated"));
        builder.texture("layer0", ResourceLocation.fromNamespaceAndPath(IndustrialForegoingMoreUpgradePlugins.MOD_ID, "block/material/" + blockName));
    }

    /**
     * 矿石方块模型（路径：textures/block/material/材料文件夹）
     */
    private void oreBlockItem(DeferredBlock<?> block) {
        String blockName = block.getId().getPath();
        String materialName;
        if (blockName.startsWith("nether_")) {
            materialName = blockName.substring(7, blockName.lastIndexOf("_ore"));
        } else if (blockName.endsWith("_ore")) {
            materialName = blockName.substring(0, blockName.lastIndexOf("_ore"));
        } else {
            materialName = blockName.substring(0, blockName.lastIndexOf('_'));
        }
        ItemModelBuilder builder = withExistingParent(blockName, ResourceLocation.withDefaultNamespace("item/generated"));
        builder.texture("layer0", ResourceLocation.fromNamespaceAndPath(IndustrialForegoingMoreUpgradePlugins.MOD_ID, "block/material/" + materialName + "/" + blockName));
    }
}