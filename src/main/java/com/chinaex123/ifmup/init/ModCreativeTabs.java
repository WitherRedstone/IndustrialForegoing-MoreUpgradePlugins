package com.chinaex123.ifmup.init;

import com.chinaex123.ifmup.IndustrialForegoingMoreUpgradePlugins;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IndustrialForegoingMoreUpgradePlugins.MOD_ID);

    public static final Supplier<CreativeModeTab> IFMUP_TAB =
            CREATIVE_MODE_TAB.register("ifmup_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.SPEED_ADDON_TIER_8.get()))
                    .title(Component.translatable("itemGroup.ifmup_tab"))
                    .displayItems((parameters, output) -> {
                        // ==================== 速度升级 ====================
                        output.accept(ModItems.SPEED_ADDON_TIER_3.get());
                        output.accept(ModItems.SPEED_ADDON_TIER_4.get());
                        output.accept(ModItems.SPEED_ADDON_TIER_5.get());
                        output.accept(ModItems.SPEED_ADDON_TIER_6.get());
                        output.accept(ModItems.SPEED_ADDON_TIER_7.get());
                        output.accept(ModItems.SPEED_ADDON_TIER_8.get());
                        // ==================== 效率升级 ====================
                        output.accept(ModItems.EFFICIENCY_ADDON_TIER_3.get());
                        output.accept(ModItems.EFFICIENCY_ADDON_TIER_4.get());
                        output.accept(ModItems.EFFICIENCY_ADDON_TIER_5.get());
                        output.accept(ModItems.EFFICIENCY_ADDON_TIER_6.get());
                        output.accept(ModItems.EFFICIENCY_ADDON_TIER_7.get());
                        output.accept(ModItems.EFFICIENCY_ADDON_TIER_8.get());
                        // ==================== 处理升级 ====================
                        output.accept(ModItems.PROCESSING_ADDON_TIER_3.get());
                        output.accept(ModItems.PROCESSING_ADDON_TIER_4.get());
                        output.accept(ModItems.PROCESSING_ADDON_TIER_5.get());
                        output.accept(ModItems.PROCESSING_ADDON_TIER_6.get());
                        output.accept(ModItems.PROCESSING_ADDON_TIER_7.get());
                        output.accept(ModItems.PROCESSING_ADDON_TIER_8.get());
                        // ==================== 范围升级 ====================
                        output.accept(ModItems.RANGE_ADDON_TIER_12.get());
                        output.accept(ModItems.RANGE_ADDON_TIER_13.get());
                        output.accept(ModItems.RANGE_ADDON_TIER_14.get());
                        output.accept(ModItems.RANGE_ADDON_TIER_15.get());
                        output.accept(ModItems.RANGE_ADDON_TIER_16.get());
                        output.accept(ModItems.RANGE_ADDON_TIER_17.get());
                        output.accept(ModItems.RANGE_ADDON_TIER_18.get());
                        output.accept(ModItems.RANGE_ADDON_TIER_19.get());
                        output.accept(ModItems.RANGE_ADDON_TIER_20.get());
                        output.accept(ModItems.RANGE_ADDON_TIER_21.get());
                        output.accept(ModItems.RANGE_ADDON_TIER_22.get());
                        output.accept(ModItems.RANGE_ADDON_TIER_23.get());
                        output.accept(ModItems.RANGE_ADDON_TIER_24.get());
                        output.accept(ModItems.RANGE_ADDON_TIER_25.get());
                        output.accept(ModItems.RANGE_ADDON_TIER_26.get());
                        output.accept(ModItems.RANGE_ADDON_TIER_27.get());
                        output.accept(ModItems.RANGE_ADDON_TIER_28.get());
                        output.accept(ModItems.RANGE_ADDON_TIER_29.get());
                        output.accept(ModItems.RANGE_ADDON_TIER_30.get());
                        output.accept(ModItems.RANGE_ADDON_TIER_31.get());
                        output.accept(ModItems.RANGE_ADDON_TIER_47.get());
                        output.accept(ModItems.RANGE_ADDON_TIER_63.get());
                        output.accept(ModItems.RANGE_ADDON_TIER_71.get());
                        output.accept(ModItems.RANGE_ADDON_TIER_79.get());


                        // ==================== 材料 ====================
                        output.accept(ModBlocks.UNKNOWN_BLOCK.get()); // 未知块
                        output.accept(ModItems.UNKNOWN_DUST.get()); // 未知粉
                        output.accept(ModBlocks.NETHER_SHADOW_ORE.get()); // 下界暗影矿石
                        output.accept(ModBlocks.SHADOW_BLOCK.get()); // 暗影块
                        ModItems.SHADOW.addToCreativeTab(output::accept); // 暗影

                        output.accept(ModBlocks.UNKNOWN_MAGIC_BLOCK.get()); // 未知魔法块
                        ModItems.UNKNOWN_MAGIC.addToCreativeTab(output::accept); // 未知魔法
                        output.accept(ModBlocks.RAW_SHADOW_BLOCK.get()); // 粗暗影块

                        output.accept(ModBlocks.SHADOW_ROSE_BLOCK.get()); // 暗影玫瑰块
                        ModItems.SHADOW_ROSE.addToCreativeTab(output::accept); // 暗影玫瑰
                        output.accept(ModItems.NETHERITE_GEAR.get()); // 下界合金齿轮

                        output.accept(ModBlocks.STAR_ETHER_ALLOY_BLOCK.get()); // 星以合金块
                        ModItems.STAR_ETHER_ALLOY.addToCreativeTab(output::accept); // 星以合金
                        output.accept(ModItems.NETHER_STAR_GEAR.get()); // 下界之星齿轮

                        // -------------------- 暗影 - 装备 --------------------
                        output.accept(ModItems.SHADOW_SWORD.get()); // 暗影剑
                        output.accept(ModItems.SHADOW_PICKAXE.get()); // 暗影镐
                        output.accept(ModItems.SHADOW_AXE.get()); // 暗影斧
                        output.accept(ModItems.SHADOW_SHOVEL.get()); // 暗影铲
                        output.accept(ModItems.SHADOW_HOE.get()); // 暗影锄
                        output.accept(ModItems.SHADOW_HELMET.get()); // 暗影头盔
                        output.accept(ModItems.SHADOW_CHESTPLATE.get()); // 暗影胸甲
                        output.accept(ModItems.SHADOW_LEGGINGS.get()); // 暗影护腿
                        output.accept(ModItems.SHADOW_BOOTS.get()); // 暗影靴
                        // -------------------- 未知魔法 - 装备 --------------------
                        output.accept(ModItems.UNKNOWN_MAGIC_SWORD.get()); // 未知魔法剑
                        output.accept(ModItems.UNKNOWN_MAGIC_PICKAXE.get()); // 未知魔法镐
                        output.accept(ModItems.UNKNOWN_MAGIC_AXE.get()); // 未知魔法斧
                        output.accept(ModItems.UNKNOWN_MAGIC_SHOVEL.get()); // 未知魔法铲
                        output.accept(ModItems.UNKNOWN_MAGIC_HOE.get()); // 未知魔法锄
                        output.accept(ModItems.UNKNOWN_MAGIC_HELMET.get()); // 未知魔法头盔
                        output.accept(ModItems.UNKNOWN_MAGIC_CHESTPLATE.get()); // 未知魔法胸甲
                        output.accept(ModItems.UNKNOWN_MAGIC_LEGGINGS.get()); // 未知魔法护腿
                        output.accept(ModItems.UNKNOWN_MAGIC_BOOTS.get()); // 未知魔法靴
                        // -------------------- 暗影玫瑰 - 装备 --------------------
                        output.accept(ModItems.SHADOW_ROSE_SWORD.get()); // 暗影玫瑰剑
                        output.accept(ModItems.SHADOW_ROSE_PICKAXE.get()); // 暗影玫瑰镐
                        output.accept(ModItems.SHADOW_ROSE_AXE.get()); // 暗影玫瑰斧
                        output.accept(ModItems.SHADOW_ROSE_SHOVEL.get()); // 暗影玫瑰铲
                        output.accept(ModItems.SHADOW_ROSE_HOE.get()); // 暗影玫瑰锄
                        output.accept(ModItems.SHADOW_ROSE_HELMET.get()); // 暗影玫瑰头盔
                        output.accept(ModItems.SHADOW_ROSE_CHESTPLATE.get()); // 暗影玫瑰胸甲
                        output.accept(ModItems.SHADOW_ROSE_LEGGINGS.get()); // 暗影玫瑰护腿
                        output.accept(ModItems.SHADOW_ROSE_BOOTS.get()); // 暗影玫瑰靴
                        // -------------------- 星以合金 - 装备 --------------------
                        output.accept(ModItems.STAR_ETHER_ALLOY_SWORD.get()); // 星以合金剑
                        output.accept(ModItems.STAR_ETHER_ALLOY_PICKAXE.get()); // 星以合金镐
                        output.accept(ModItems.STAR_ETHER_ALLOY_AXE.get()); // 星以合金斧
                        output.accept(ModItems.STAR_ETHER_ALLOY_SHOVEL.get()); // 星以合金铲
                        output.accept(ModItems.STAR_ETHER_ALLOY_HOE.get()); // 星以合金锄
                        output.accept(ModItems.STAR_ETHER_ALLOY_HELMET.get()); // 星以合金头盔
                        output.accept(ModItems.STAR_ETHER_ALLOY_CHESTPLATE.get()); // 星以合金胸甲
                        output.accept(ModItems.STAR_ETHER_ALLOY_LEGGINGS.get()); // 星以合金护腿
                        output.accept(ModItems.STAR_ETHER_ALLOY_BOOTS.get()); // 星以合金靴

                        output.accept(ModItems.DARKSHINE_BUCKET.get()); // 黯曜桶
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
