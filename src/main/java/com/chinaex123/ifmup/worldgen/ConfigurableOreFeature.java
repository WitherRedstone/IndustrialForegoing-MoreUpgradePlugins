package com.chinaex123.ifmup.worldgen;

import com.chinaex123.ifmup.config.ServerConfig;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration.TargetBlockState;

import java.util.List;
import java.util.Optional;

public class ConfigurableOreFeature extends Feature<ConfigurableOreFeature.ConfigurableOreConfig> {

    public ConfigurableOreFeature() {
        super(ConfigurableOreConfig.CODEC);
    }

    @Override
    public boolean place(FeaturePlaceContext<ConfigurableOreConfig> ctx) {
        String blockName = ctx.config().targetStates.getFirst().state.getBlock().getName().getString();

        int veinSize, veinCount, minHeight, maxHeight;

        if (blockName.contains("nether_shadow")) {
            veinSize = ServerConfig.NETHER_SHADOW_ORE_VEIN_SIZE.get();
            veinCount = ServerConfig.NETHER_SHADOW_ORE_VEIN_COUNT.get();
            minHeight = ServerConfig.NETHER_SHADOW_ORE_MIN_HEIGHT.get();
            maxHeight = ServerConfig.NETHER_SHADOW_ORE_MAX_HEIGHT.get();
        } else {
            veinSize = ServerConfig.UNKNOWN_BLOCK_VEIN_SIZE.get();
            veinCount = ServerConfig.UNKNOWN_BLOCK_VEIN_COUNT.get();
            minHeight = ServerConfig.UNKNOWN_BLOCK_MIN_HEIGHT.get();
            maxHeight = ServerConfig.UNKNOWN_BLOCK_MAX_HEIGHT.get();
        }

        if (veinCount <= 0 || veinSize <= 0) {
            return false;
        }

        WorldGenLevel level = ctx.level();
        BlockPos origin = ctx.origin();
        int yRange = maxHeight - minHeight;
        if (yRange < 0) {
            return false;
        }

        OreConfiguration vanillaConfig = new OreConfiguration(
                ctx.config().targetStates,
                veinSize
        );

        boolean placed = false;
        for (int i = 0; i < veinCount; i++) {
            int xOffset = ctx.random().nextInt(16);
            int zOffset = ctx.random().nextInt(16);
            int yOffset = minHeight + ctx.random().nextInt(yRange + 1);
            BlockPos pos = origin.offset(xOffset, yOffset, zOffset);

            placed |= Feature.ORE.place(new FeaturePlaceContext<>(
                    Optional.empty(),
                    level,
                    ctx.chunkGenerator(),
                    ctx.random(),
                    pos,
                    vanillaConfig
            ));
        }

        return placed;
    }

    public record ConfigurableOreConfig(List<TargetBlockState> targetStates) implements FeatureConfiguration {
        public static final Codec<ConfigurableOreConfig> CODEC = RecordCodecBuilder.create(
                app -> app.group(
                        Codec.list(OreConfiguration.TargetBlockState.CODEC).fieldOf("targets")
                                .forGetter(ConfigurableOreConfig::targetStates)
                ).apply(app, ConfigurableOreConfig::new)
        );
    }
}
