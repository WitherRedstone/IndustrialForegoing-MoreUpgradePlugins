package com.chinaex123.ifmup.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class ServerConfig {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec SPEC;

    public static final ModConfigSpec.IntValue UNKNOWN_BLOCK_VEIN_COUNT;
    public static final ModConfigSpec.IntValue UNKNOWN_BLOCK_VEIN_SIZE;
    public static final ModConfigSpec.IntValue UNKNOWN_BLOCK_MIN_HEIGHT;
    public static final ModConfigSpec.IntValue UNKNOWN_BLOCK_MAX_HEIGHT;

    public static final ModConfigSpec.IntValue NETHER_SHADOW_ORE_VEIN_COUNT;
    public static final ModConfigSpec.IntValue NETHER_SHADOW_ORE_VEIN_SIZE;
    public static final ModConfigSpec.IntValue NETHER_SHADOW_ORE_MIN_HEIGHT;
    public static final ModConfigSpec.IntValue NETHER_SHADOW_ORE_MAX_HEIGHT;

    static {
        BUILDER.push("Unknown Magic Block Generation");
        UNKNOWN_BLOCK_VEIN_COUNT = BUILDER
                .comment("每个区块的矿脉数量", "Number of veins per chunk")
                .defineInRange("veinCount", 32, 0, 64);
        UNKNOWN_BLOCK_VEIN_SIZE = BUILDER
                .comment("最大矿脉大小", "Maximum vein size")
                .defineInRange("veinSize", 8, 1, 64);
        UNKNOWN_BLOCK_MIN_HEIGHT = BUILDER
                .comment("最小生成高度", "Minimum generation height")
                .defineInRange("minHeight", 0, -64, 319);
        UNKNOWN_BLOCK_MAX_HEIGHT = BUILDER
                .comment("最大生成高度", "Maximum generation height")
                .defineInRange("maxHeight", 128, -64, 319);
        BUILDER.pop();

        BUILDER.push("Nether Shadow Ore Generation");
        NETHER_SHADOW_ORE_VEIN_COUNT = BUILDER
                .comment("每个区块的矿脉数量", "Number of veins per chunk")
                .defineInRange("veinCount", 4, 0, 64);
        NETHER_SHADOW_ORE_VEIN_SIZE = BUILDER
                .comment("最大矿脉大小", "Maximum vein size")
                .defineInRange("veinSize", 2, 1, 64);
        NETHER_SHADOW_ORE_MIN_HEIGHT = BUILDER
                .comment("最小生成高度", "Minimum generation height")
                .defineInRange("minHeight", 32, 0, 128);
        NETHER_SHADOW_ORE_MAX_HEIGHT = BUILDER
                .comment("最大生成高度", "Maximum generation height")
                .defineInRange("maxHeight", 96, 0, 128);
        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}
