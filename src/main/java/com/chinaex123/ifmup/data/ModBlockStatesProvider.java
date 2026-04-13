package com.chinaex123.ifmup.data;

import com.chinaex123.ifmup.IndustrialForegoingMoreUpgradePlugins;
import com.chinaex123.ifmup.init.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStatesProvider extends BlockStateProvider {
    public ModBlockStatesProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, IndustrialForegoingMoreUpgradePlugins.MOD_ID, exFileHelper);
    }

    protected void registerStatesAndModels() {
        // -------------------- 暗影 --------------------
        basicMaterialBlock(ModBlocks.SHADOW_BLOCK);
        rawMaterialBlock(ModBlocks.RAW_SHADOW_BLOCK);
        oreBlock(ModBlocks.NETHER_SHADOW_ORE);
        // -------------------- 暗影玫瑰 --------------------
        basicMaterialBlock(ModBlocks.SHADOW_ROSE_BLOCK);
        // -------------------- 未知魔法 --------------------
        basicOtherMaterialBlock(ModBlocks.UNKNOWN_BLOCK);
        basicMaterialBlock(ModBlocks.UNKNOWN_MAGIC_BLOCK);
        // -------------------- 星以合金 --------------------
        basicMaterialBlock(ModBlocks.STAR_ETHER_ALLOY_BLOCK);
    }

    /**
     * 材料方块模型（路径：textures/block/material/材料文件夹）
     */
    private void basicMaterialBlock(DeferredBlock<?> block) {
        String blockName = block.getId().getPath();
        String materialName = blockName.substring(0, blockName.lastIndexOf('_'));
        simpleBlockWithItem(block.get(), models().cubeAll(blockName, modLoc("block/material/" + materialName + "/" + blockName)));
    }

    /**
     * 粗材料方块模型（路径：textures/block/material/材料文件夹）
     */
    private void rawMaterialBlock(DeferredBlock<?> block) {
        String blockName = block.getId().getPath();
        String materialName = blockName.substring(4, blockName.length() - 6);
        simpleBlockWithItem(block.get(), models().cubeAll(blockName, modLoc("block/material/" + materialName + "/" + blockName)));
    }

    /**
     * 矿石方块模型（路径：textures/block/material/材料文件夹）
     */
    private void oreBlock(DeferredBlock<?> block) {
        String blockName = block.getId().getPath();
        String materialName;
        if (blockName.startsWith("nether_")) {
            materialName = blockName.substring(7, blockName.lastIndexOf("_ore"));
        } else if (blockName.endsWith("_ore")) {
            materialName = blockName.substring(0, blockName.lastIndexOf("_ore"));
        } else {
            materialName = blockName.substring(0, blockName.lastIndexOf('_'));
        }
        simpleBlockWithItem(block.get(), models().cubeAll(blockName, modLoc("block/material/" + materialName + "/" + blockName)));
    }

    /**
     * 材料方块模型（路径：textures/block/material）
     */
    private void basicOtherMaterialBlock(DeferredBlock<?> block) {
        String blockName = block.getId().getPath();
        simpleBlockWithItem(block.get(), models().cubeAll(blockName, modLoc("block/material/" + blockName)));
    }

    private void blockItem(DeferredBlock<?> block) {
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(IndustrialForegoingMoreUpgradePlugins.MOD_ID + ":block/" + block.getId().getPath()));
    }
    private void blockItem(DeferredBlock<?> block, String append) {
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(IndustrialForegoingMoreUpgradePlugins.MOD_ID + ":block/" + block.getId().getPath() + append));
    }
}