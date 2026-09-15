package com.chinaex123.ifmup.data;

import com.chinaex123.ifmup.IndustrialForegoingMoreUpgradePlugins;
import com.chinaex123.ifmup.init.IFMUPBlocks;
import com.chinaex123.ifmup.init.IFMUPBlockTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, IndustrialForegoingMoreUpgradePlugins.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {

        // 信标底座
        this.tag(BlockTags.BEACON_BASE_BLOCKS)
                .add(IFMUPBlocks.SHADOW_BLOCK.get())
                .add(IFMUPBlocks.SHADOW_ROSE_BLOCK.get())
                .add(IFMUPBlocks.UNKNOWN_MAGIC_BLOCK.get())
                .add(IFMUPBlocks.STAR_ETHER_ALLOY_BLOCK.get());

        this.tag(Tags.Blocks.STORAGE_BLOCKS)
                .add(IFMUPBlocks.SHADOW_BLOCK.get())
                .add(IFMUPBlocks.SHADOW_ROSE_BLOCK.get())
                .add(IFMUPBlocks.UNKNOWN_MAGIC_BLOCK.get())
                .add(IFMUPBlocks.STAR_ETHER_ALLOY_BLOCK.get());

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(IFMUPBlocks.SHADOW_BLOCK.get())
                .add(IFMUPBlocks.NETHER_SHADOW_ORE.get())
                .add(IFMUPBlocks.SHADOW_ROSE_BLOCK.get())
                .add(IFMUPBlocks.UNKNOWN_BLOCK.get())
                .add(IFMUPBlocks.UNKNOWN_MAGIC_BLOCK.get())
                .add(IFMUPBlocks.STAR_ETHER_ALLOY_BLOCK.get());
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(IFMUPBlocks.NETHER_SHADOW_ORE.get())
                .add(IFMUPBlocks.RAW_SHADOW_BLOCK.get())
                .add(IFMUPBlocks.SHADOW_BLOCK.get())
                .add(IFMUPBlocks.SHADOW_ROSE_BLOCK.get());
        tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(IFMUPBlocks.UNKNOWN_BLOCK.get())
                .add(IFMUPBlocks.UNKNOWN_MAGIC_BLOCK.get())
                .add(IFMUPBlocks.STAR_ETHER_ALLOY_BLOCK.get());

        this.tag(IFMUPBlockTags.STORAGE_BLOCKS_SHADOW).add(IFMUPBlocks.SHADOW_BLOCK.get());
        this.tag(IFMUPBlockTags.STORAGE_BLOCKS_SHADOW_ROSE).add(IFMUPBlocks.SHADOW_ROSE_BLOCK.get());
        this.tag(IFMUPBlockTags.STORAGE_BLOCKS_UNKNOWN_MAGIC).add(IFMUPBlocks.UNKNOWN_MAGIC_BLOCK.get());
        this.tag(IFMUPBlockTags.STORAGE_BLOCKS_STAR_ETHER_ALLOY).add(IFMUPBlocks.STAR_ETHER_ALLOY_BLOCK.get());

    }
}
