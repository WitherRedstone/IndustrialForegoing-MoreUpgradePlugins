package com.chinaex123.ifmup.init;

import com.chinaex123.ifmup.IndustrialForegoingMoreUpgradePlugins;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

public interface IFMUPBiomeTags {

    TagKey<Biome> DEEP_DARK = basicBiomeTag("deep_dark");

    private static TagKey<Biome> basicBiomeTag(String name) {
        return TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(IndustrialForegoingMoreUpgradePlugins.MOD_ID, name));
    }
}
