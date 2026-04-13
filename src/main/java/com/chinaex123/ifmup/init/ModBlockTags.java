package com.chinaex123.ifmup.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public interface ModBlockTags {

    TagKey<Block> STORAGE_BLOCKS_SHADOW = neoforgeBlockTag("storage_blocks/shadow"); // c:storage_blocks/shadow
    TagKey<Block> STORAGE_BLOCKS_SHADOW_ROSE = neoforgeBlockTag("storage_blocks/shadow_rose"); // c:storage_blocks/shadow_rose
    TagKey<Block> STORAGE_BLOCKS_UNKNOWN_MAGIC = neoforgeBlockTag("storage_blocks/unknown_magic"); // c:storage_blocks/unknown_magic
    TagKey<Block> STORAGE_BLOCKS_STAR_ETHER_ALLOY = neoforgeBlockTag("storage_blocks/star_ether_alloy"); // c:storage_blocks/star_ether_alloy

    static TagKey<Block> neoforgeBlockTag(String name) {
        return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", name));
    }
}
