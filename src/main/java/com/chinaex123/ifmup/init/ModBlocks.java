package com.chinaex123.ifmup.init;

import com.chinaex123.ifmup.IndustrialForegoingMoreUpgradePlugins;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCK_REGISTER =
            DeferredRegister.createBlocks(IndustrialForegoingMoreUpgradePlugins.MOD_ID);

    // 黯曜
    public static final DeferredBlock<LiquidBlock> DARKSHINE_FLUID =
            BLOCK_REGISTER.register("darkshine", () -> new LiquidBlock(ModFluids.DARKSHINE.get(), BlockBehaviour.Properties.of()
                    .noLootTable() // 不掉落
                    .liquid() // 液体
                    .replaceable() // 可替换
                    .noCollission() // 无碰撞
                    .strength(100.0F) // 硬度
                    .friction(0.8F) // 摩擦
                    .speedFactor(0.4F) // 移动速度
                    .jumpFactor(0.3F) // 跳跃速度
                    .mapColor(MapColor.COLOR_CYAN)
                    .sound(SoundType.SCULK_SENSOR)
            ));

    // -------------------- 暗影 --------------------
    public static final DeferredBlock<Block> SHADOW_BLOCK = registerBlocks("shadow_block", () ->
            new Block(BlockBehaviour.Properties.of().strength(3F, 6.0F).mapColor(MapColor.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops()), Rarity.UNCOMMON);
    public static final DeferredBlock<Block> RAW_SHADOW_BLOCK = registerBlocks("raw_shadow_block", () ->
            new Block(BlockBehaviour.Properties.of().strength(3F, 6.0F).mapColor(MapColor.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops()), Rarity.UNCOMMON);
    public static final DeferredBlock<Block> NETHER_SHADOW_ORE = registerBlocks("nether_shadow_ore", () ->
            new Block(BlockBehaviour.Properties.of().strength(3F, 6.0F).mapColor(MapColor.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops()), Rarity.UNCOMMON);

    // -------------------- 未知魔法 --------------------
    public static final DeferredBlock<Block> UNKNOWN_BLOCK = registerBlocks("unknown_block", () ->
            new Block(BlockBehaviour.Properties.of().strength(1.5F, 3.0F).mapColor(MapColor.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops()), Rarity.RARE);
    public static final DeferredBlock<Block> UNKNOWN_MAGIC_BLOCK = registerBlocks("unknown_magic_block", () ->
            new Block(BlockBehaviour.Properties.of().strength(1.5F, 3.0F).mapColor(MapColor.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops()), Rarity.EPIC);

    // -------------------- 暗影玫瑰 --------------------
    public static final DeferredBlock<Block> SHADOW_ROSE_BLOCK = registerBlocks("shadow_rose_block", () ->
            new Block(BlockBehaviour.Properties.of().strength(3F, 6.0F).mapColor(MapColor.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops()), Rarity.RARE);

    // -------------------- 星以合金 --------------------
    public static final DeferredBlock<Block> STAR_ETHER_ALLOY_BLOCK = registerBlocks("star_ether_alloy_block", () ->
            new Block(BlockBehaviour.Properties.of().strength(3F, 6.0F).mapColor(MapColor.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops()), Rarity.EPIC);


    public static <T extends Block> void registerBlockItems(String name, DeferredBlock<T> block, Rarity rarity) {
        ModItems.ITEMS_REGISTER.register(name, () -> new BlockItem(block.get(), new Item.Properties().rarity(rarity)));
    }

    public static <T extends Block> DeferredBlock<T> registerBlocks(String name, Supplier<T> block, Rarity rarity) {
        DeferredBlock<T> blocks = BLOCK_REGISTER.register(name, block);
        registerBlockItems(name, blocks, rarity);
        return blocks;
    }

    public static void register(IEventBus eventBus){
        BLOCK_REGISTER.register(eventBus);
    }
}
