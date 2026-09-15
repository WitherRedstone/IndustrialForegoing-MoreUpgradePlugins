package com.chinaex123.ifmup.data;

import com.chinaex123.ifmup.IndustrialForegoingMoreUpgradePlugins;
import com.chinaex123.ifmup.init.IFMUPBlocks;
import com.chinaex123.ifmup.init.IFMUPItems;
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
        basicOtherMaterialItem(IFMUPItems.DARKSHINE_BUCKET); // 黯曜桶
        basicOtherMaterialItem(IFMUPItems.NETHERITE_GEAR); // 下界合金齿轮
        basicOtherMaterialItem(IFMUPItems.NETHER_STAR_GEAR); // 下界之星齿轮

        basicMaterialItem(IFMUPItems.SHADOW.INGOT); // 暗影锭
        basicMaterialItem(IFMUPItems.SHADOW.NUGGET); // 暗影粒
        basicMaterialItem(IFMUPItems.SHADOW.GEAR); // 暗影轮
        basicMaterialItem(IFMUPItems.SHADOW.DUST); // 暗影粉
        basicMaterialItem(IFMUPItems.SHADOW.PLATE); // 暗影板
        basicMaterialItem(IFMUPItems.SHADOW.ROD); // 暗影棍
        basicMaterialItem(IFMUPItems.SHADOW.WIRE); // 暗影线
        rawMaterialItem(IFMUPItems.SHADOW.RAW); // 粗暗影矿
        basicMaterialBlockItem(IFMUPBlocks.SHADOW_BLOCK); // 暗影块
        rawMaterialBlockItem(IFMUPBlocks.RAW_SHADOW_BLOCK); // 粗暗影块
        oreBlockItem(IFMUPBlocks.NETHER_SHADOW_ORE); // 下界暗影矿
        basicToolsItem(IFMUPItems.SHADOW_SWORD); // 暗影剑
        basicToolsItem(IFMUPItems.SHADOW_PICKAXE); // 暗影镐
        basicToolsItem(IFMUPItems.SHADOW_AXE); // 暗影斧
        basicToolsItem(IFMUPItems.SHADOW_SHOVEL); // 暗影铲
        basicToolsItem(IFMUPItems.SHADOW_HOE); // 暗影锄
        basicArmorItem(IFMUPItems.SHADOW_HELMET); // 暗影头盔
        basicArmorItem(IFMUPItems.SHADOW_CHESTPLATE); // 暗影胸甲
        basicArmorItem(IFMUPItems.SHADOW_LEGGINGS); // 暗影护腿
        basicArmorItem(IFMUPItems.SHADOW_BOOTS); // 暗影靴子

        basicOtherMaterialItem(IFMUPItems.UNKNOWN_DUST); // 未知粉
        basicOtherMaterialBlockItem(IFMUPBlocks.UNKNOWN_BLOCK); // 未知块
        basicMaterialItem(IFMUPItems.UNKNOWN_MAGIC.INGOT); // 未知魔法锭
        basicMaterialItem(IFMUPItems.UNKNOWN_MAGIC.NUGGET); // 未知魔法粒
        basicMaterialItem(IFMUPItems.UNKNOWN_MAGIC.GEAR); // 未知魔法齿轮
        basicMaterialItem(IFMUPItems.UNKNOWN_MAGIC.DUST); // 未知魔法粉
        basicMaterialItem(IFMUPItems.UNKNOWN_MAGIC.PLATE); // 未知魔法板
        basicMaterialItem(IFMUPItems.UNKNOWN_MAGIC.ROD); // 未知魔法棍
        basicMaterialItem(IFMUPItems.UNKNOWN_MAGIC.WIRE); // 未知魔法线
        basicMaterialBlockItem(IFMUPBlocks.UNKNOWN_MAGIC_BLOCK); // 未知魔法块
        basicToolsItem(IFMUPItems.UNKNOWN_MAGIC_SWORD); // 未知魔法剑
        basicToolsItem(IFMUPItems.UNKNOWN_MAGIC_PICKAXE); // 未知魔法镐
        basicToolsItem(IFMUPItems.UNKNOWN_MAGIC_AXE); // 未知魔法斧
        basicToolsItem(IFMUPItems.UNKNOWN_MAGIC_SHOVEL); // 未知魔法铲
        basicToolsItem(IFMUPItems.UNKNOWN_MAGIC_HOE); // 未知魔法锄
        basicArmorItem(IFMUPItems.UNKNOWN_MAGIC_HELMET); // 未知魔法头盔
        basicArmorItem(IFMUPItems.UNKNOWN_MAGIC_CHESTPLATE); // 未知魔法胸甲
        basicArmorItem(IFMUPItems.UNKNOWN_MAGIC_LEGGINGS); // 未知魔法护腿
        basicArmorItem(IFMUPItems.UNKNOWN_MAGIC_BOOTS); // 未知魔法靴子

        basicMaterialItem(IFMUPItems.SHADOW_ROSE.INGOT); // 暗影玫瑰锭
        basicMaterialItem(IFMUPItems.SHADOW_ROSE.NUGGET); // 暗影玫瑰粒
        basicMaterialItem(IFMUPItems.SHADOW_ROSE.GEAR); // 暗影玫瑰齿轮
        basicMaterialItem(IFMUPItems.SHADOW_ROSE.DUST); // 暗影玫瑰粉
        basicMaterialItem(IFMUPItems.SHADOW_ROSE.PLATE); // 暗影玫瑰板
        basicMaterialItem(IFMUPItems.SHADOW_ROSE.ROD); // 暗影玫瑰棍
        basicMaterialItem(IFMUPItems.SHADOW_ROSE.WIRE); // 暗影玫瑰线
        basicMaterialBlockItem(IFMUPBlocks.SHADOW_ROSE_BLOCK); // 暗影玫瑰块
        basicToolsItem(IFMUPItems.SHADOW_ROSE_SWORD); // 暗影玫瑰剑
        basicToolsItem(IFMUPItems.SHADOW_ROSE_PICKAXE); // 暗影玫瑰镐
        basicToolsItem(IFMUPItems.SHADOW_ROSE_AXE); // 暗影玫瑰斧
        basicToolsItem(IFMUPItems.SHADOW_ROSE_SHOVEL); // 暗影玫瑰铲
        basicToolsItem(IFMUPItems.SHADOW_ROSE_HOE); // 暗影玫瑰锄
        basicArmorItem(IFMUPItems.SHADOW_ROSE_HELMET); // 暗影玫瑰头盔
        basicArmorItem(IFMUPItems.SHADOW_ROSE_CHESTPLATE); // 暗影玫瑰胸甲
        basicArmorItem(IFMUPItems.SHADOW_ROSE_LEGGINGS); // 暗影玫瑰护腿
        basicArmorItem(IFMUPItems.SHADOW_ROSE_BOOTS); // 暗影玫瑰靴子

        basicMaterialItem(IFMUPItems.STAR_ETHER_ALLOY.INGOT); // 星以合金锭
        basicMaterialItem(IFMUPItems.STAR_ETHER_ALLOY.NUGGET); // 星以合金粒
        basicMaterialItem(IFMUPItems.STAR_ETHER_ALLOY.GEAR); // 星以合金齿轮
        basicMaterialItem(IFMUPItems.STAR_ETHER_ALLOY.DUST); // 星以合金粉
        basicMaterialItem(IFMUPItems.STAR_ETHER_ALLOY.PLATE); // 星以合金板
        basicMaterialItem(IFMUPItems.STAR_ETHER_ALLOY.ROD); // 星以合金棍
        basicMaterialItem(IFMUPItems.STAR_ETHER_ALLOY.WIRE); // 星以合金线
        basicMaterialBlockItem(IFMUPBlocks.STAR_ETHER_ALLOY_BLOCK); // 星以合金块
        basicToolsItem(IFMUPItems.STAR_ETHER_ALLOY_SWORD); // 星以合金剑
        basicToolsItem(IFMUPItems.STAR_ETHER_ALLOY_PICKAXE); // 星以合金镐
        basicToolsItem(IFMUPItems.STAR_ETHER_ALLOY_AXE); // 星以合金斧
        basicToolsItem(IFMUPItems.STAR_ETHER_ALLOY_SHOVEL); // 星以合金铲
        basicToolsItem(IFMUPItems.STAR_ETHER_ALLOY_HOE); // 星以合金锄
        basicArmorItem(IFMUPItems.STAR_ETHER_ALLOY_HELMET); // 星以合金头盔
        basicArmorItem(IFMUPItems.STAR_ETHER_ALLOY_CHESTPLATE); // 星以合金胸甲
        basicArmorItem(IFMUPItems.STAR_ETHER_ALLOY_LEGGINGS); // 星以合金护腿
        basicArmorItem(IFMUPItems.STAR_ETHER_ALLOY_BOOTS); // 星以合金靴子


        // ==================== 速度升级 ====================
        basicItem(IFMUPItems.SPEED_ADDON_TIER_3.get());
        basicItem(IFMUPItems.SPEED_ADDON_TIER_4.get());
        basicItem(IFMUPItems.SPEED_ADDON_TIER_5.get());
        basicItem(IFMUPItems.SPEED_ADDON_TIER_6.get());
        basicItem(IFMUPItems.SPEED_ADDON_TIER_7.get());
        basicItem(IFMUPItems.SPEED_ADDON_TIER_8.get());
        // ==================== 效率升级 ====================
        basicItem(IFMUPItems.EFFICIENCY_ADDON_TIER_3.get());
        basicItem(IFMUPItems.EFFICIENCY_ADDON_TIER_4.get());
        basicItem(IFMUPItems.EFFICIENCY_ADDON_TIER_5.get());
        basicItem(IFMUPItems.EFFICIENCY_ADDON_TIER_6.get());
        basicItem(IFMUPItems.EFFICIENCY_ADDON_TIER_7.get());
        basicItem(IFMUPItems.EFFICIENCY_ADDON_TIER_8.get());
        // ==================== 速度升级 ====================
        basicItem(IFMUPItems.PROCESSING_ADDON_TIER_3.get());
        basicItem(IFMUPItems.PROCESSING_ADDON_TIER_4.get());
        basicItem(IFMUPItems.PROCESSING_ADDON_TIER_5.get());
        basicItem(IFMUPItems.PROCESSING_ADDON_TIER_6.get());
        basicItem(IFMUPItems.PROCESSING_ADDON_TIER_7.get());
        basicItem(IFMUPItems.PROCESSING_ADDON_TIER_8.get());
        // ==================== 范围升级 ====================
        basicItem(IFMUPItems.RANGE_ADDON_TIER_12.get());
        basicItem(IFMUPItems.RANGE_ADDON_TIER_13.get());
        basicItem(IFMUPItems.RANGE_ADDON_TIER_14.get());
        basicItem(IFMUPItems.RANGE_ADDON_TIER_15.get());
        basicItem(IFMUPItems.RANGE_ADDON_TIER_16.get());
        basicItem(IFMUPItems.RANGE_ADDON_TIER_17.get());
        basicItem(IFMUPItems.RANGE_ADDON_TIER_18.get());
        basicItem(IFMUPItems.RANGE_ADDON_TIER_19.get());
        basicItem(IFMUPItems.RANGE_ADDON_TIER_20.get());
        basicItem(IFMUPItems.RANGE_ADDON_TIER_21.get());
        basicItem(IFMUPItems.RANGE_ADDON_TIER_22.get());
        basicItem(IFMUPItems.RANGE_ADDON_TIER_23.get());
        basicItem(IFMUPItems.RANGE_ADDON_TIER_24.get());
        basicItem(IFMUPItems.RANGE_ADDON_TIER_25.get());
        basicItem(IFMUPItems.RANGE_ADDON_TIER_26.get());
        basicItem(IFMUPItems.RANGE_ADDON_TIER_27.get());
        basicItem(IFMUPItems.RANGE_ADDON_TIER_28.get());
        basicItem(IFMUPItems.RANGE_ADDON_TIER_29.get());
        basicItem(IFMUPItems.RANGE_ADDON_TIER_30.get());
        basicItem(IFMUPItems.RANGE_ADDON_TIER_31.get());
        basicItem(IFMUPItems.RANGE_ADDON_TIER_47.get());
        basicItem(IFMUPItems.RANGE_ADDON_TIER_63.get());
        basicItem(IFMUPItems.RANGE_ADDON_TIER_71.get());
        basicItem(IFMUPItems.RANGE_ADDON_TIER_79.get());
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