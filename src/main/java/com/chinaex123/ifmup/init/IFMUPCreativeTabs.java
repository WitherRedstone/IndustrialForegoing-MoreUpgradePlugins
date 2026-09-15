package com.chinaex123.ifmup.init;

import com.chinaex123.ifmup.IndustrialForegoingMoreUpgradePlugins;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class IFMUPCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IndustrialForegoingMoreUpgradePlugins.MOD_ID);

    public static final Supplier<CreativeModeTab> IFMUP_TAB =
            CREATIVE_MODE_TAB.register("ifmup_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(IFMUPItems.SPEED_ADDON_TIER_8.get()))
                    .title(Component.translatable("itemGroup.ifmup_tab"))
                    .displayItems((parameters, output) -> {
                        // ==================== 速度升级 ====================
                        output.accept(IFMUPItems.SPEED_ADDON_TIER_3.get());
                        output.accept(IFMUPItems.SPEED_ADDON_TIER_4.get());
                        output.accept(IFMUPItems.SPEED_ADDON_TIER_5.get());
                        output.accept(IFMUPItems.SPEED_ADDON_TIER_6.get());
                        output.accept(IFMUPItems.SPEED_ADDON_TIER_7.get());
                        output.accept(IFMUPItems.SPEED_ADDON_TIER_8.get());
                        // ==================== 效率升级 ====================
                        output.accept(IFMUPItems.EFFICIENCY_ADDON_TIER_3.get());
                        output.accept(IFMUPItems.EFFICIENCY_ADDON_TIER_4.get());
                        output.accept(IFMUPItems.EFFICIENCY_ADDON_TIER_5.get());
                        output.accept(IFMUPItems.EFFICIENCY_ADDON_TIER_6.get());
                        output.accept(IFMUPItems.EFFICIENCY_ADDON_TIER_7.get());
                        output.accept(IFMUPItems.EFFICIENCY_ADDON_TIER_8.get());
                        // ==================== 处理升级 ====================
                        output.accept(IFMUPItems.PROCESSING_ADDON_TIER_3.get());
                        output.accept(IFMUPItems.PROCESSING_ADDON_TIER_4.get());
                        output.accept(IFMUPItems.PROCESSING_ADDON_TIER_5.get());
                        output.accept(IFMUPItems.PROCESSING_ADDON_TIER_6.get());
                        output.accept(IFMUPItems.PROCESSING_ADDON_TIER_7.get());
                        output.accept(IFMUPItems.PROCESSING_ADDON_TIER_8.get());
                        // ==================== 范围升级 ====================
                        output.accept(IFMUPItems.RANGE_ADDON_TIER_12.get());
                        output.accept(IFMUPItems.RANGE_ADDON_TIER_13.get());
                        output.accept(IFMUPItems.RANGE_ADDON_TIER_14.get());
                        output.accept(IFMUPItems.RANGE_ADDON_TIER_15.get());
                        output.accept(IFMUPItems.RANGE_ADDON_TIER_16.get());
                        output.accept(IFMUPItems.RANGE_ADDON_TIER_17.get());
                        output.accept(IFMUPItems.RANGE_ADDON_TIER_18.get());
                        output.accept(IFMUPItems.RANGE_ADDON_TIER_19.get());
                        output.accept(IFMUPItems.RANGE_ADDON_TIER_20.get());
                        output.accept(IFMUPItems.RANGE_ADDON_TIER_21.get());
                        output.accept(IFMUPItems.RANGE_ADDON_TIER_22.get());
                        output.accept(IFMUPItems.RANGE_ADDON_TIER_23.get());
                        output.accept(IFMUPItems.RANGE_ADDON_TIER_24.get());
                        output.accept(IFMUPItems.RANGE_ADDON_TIER_25.get());
                        output.accept(IFMUPItems.RANGE_ADDON_TIER_26.get());
                        output.accept(IFMUPItems.RANGE_ADDON_TIER_27.get());
                        output.accept(IFMUPItems.RANGE_ADDON_TIER_28.get());
                        output.accept(IFMUPItems.RANGE_ADDON_TIER_29.get());
                        output.accept(IFMUPItems.RANGE_ADDON_TIER_30.get());
                        output.accept(IFMUPItems.RANGE_ADDON_TIER_31.get());
                        output.accept(IFMUPItems.RANGE_ADDON_TIER_47.get());
                        output.accept(IFMUPItems.RANGE_ADDON_TIER_63.get());
                        output.accept(IFMUPItems.RANGE_ADDON_TIER_71.get());
                        output.accept(IFMUPItems.RANGE_ADDON_TIER_79.get());


                        // ==================== 材料 ====================
                        output.accept(IFMUPBlocks.UNKNOWN_BLOCK.get()); // 未知块
                        output.accept(IFMUPItems.UNKNOWN_DUST.get()); // 未知粉
                        output.accept(IFMUPBlocks.NETHER_SHADOW_ORE.get()); // 下界暗影矿石
                        output.accept(IFMUPBlocks.SHADOW_BLOCK.get()); // 暗影块
                        IFMUPItems.SHADOW.addToCreativeTab(output::accept); // 暗影

                        output.accept(IFMUPBlocks.UNKNOWN_MAGIC_BLOCK.get()); // 未知魔法块
                        IFMUPItems.UNKNOWN_MAGIC.addToCreativeTab(output::accept); // 未知魔法
                        output.accept(IFMUPBlocks.RAW_SHADOW_BLOCK.get()); // 粗暗影块

                        output.accept(IFMUPBlocks.SHADOW_ROSE_BLOCK.get()); // 暗影玫瑰块
                        IFMUPItems.SHADOW_ROSE.addToCreativeTab(output::accept); // 暗影玫瑰
                        output.accept(IFMUPItems.NETHERITE_GEAR.get()); // 下界合金齿轮

                        output.accept(IFMUPBlocks.STAR_ETHER_ALLOY_BLOCK.get()); // 星以合金块
                        IFMUPItems.STAR_ETHER_ALLOY.addToCreativeTab(output::accept); // 星以合金
                        output.accept(IFMUPItems.NETHER_STAR_GEAR.get()); // 下界之星齿轮

                        // -------------------- 暗影 - 装备 --------------------
                        output.accept(IFMUPItems.SHADOW_SWORD.get()); // 暗影剑
                        output.accept(IFMUPItems.SHADOW_PICKAXE.get()); // 暗影镐
                        output.accept(IFMUPItems.SHADOW_AXE.get()); // 暗影斧
                        output.accept(IFMUPItems.SHADOW_SHOVEL.get()); // 暗影铲
                        output.accept(IFMUPItems.SHADOW_HOE.get()); // 暗影锄
                        output.accept(IFMUPItems.SHADOW_HELMET.get()); // 暗影头盔
                        output.accept(IFMUPItems.SHADOW_CHESTPLATE.get()); // 暗影胸甲
                        output.accept(IFMUPItems.SHADOW_LEGGINGS.get()); // 暗影护腿
                        output.accept(IFMUPItems.SHADOW_BOOTS.get()); // 暗影靴
                        // -------------------- 未知魔法 - 装备 --------------------
                        output.accept(IFMUPItems.UNKNOWN_MAGIC_SWORD.get()); // 未知魔法剑
                        output.accept(IFMUPItems.UNKNOWN_MAGIC_PICKAXE.get()); // 未知魔法镐
                        output.accept(IFMUPItems.UNKNOWN_MAGIC_AXE.get()); // 未知魔法斧
                        output.accept(IFMUPItems.UNKNOWN_MAGIC_SHOVEL.get()); // 未知魔法铲
                        output.accept(IFMUPItems.UNKNOWN_MAGIC_HOE.get()); // 未知魔法锄
                        output.accept(IFMUPItems.UNKNOWN_MAGIC_HELMET.get()); // 未知魔法头盔
                        output.accept(IFMUPItems.UNKNOWN_MAGIC_CHESTPLATE.get()); // 未知魔法胸甲
                        output.accept(IFMUPItems.UNKNOWN_MAGIC_LEGGINGS.get()); // 未知魔法护腿
                        output.accept(IFMUPItems.UNKNOWN_MAGIC_BOOTS.get()); // 未知魔法靴
                        // -------------------- 暗影玫瑰 - 装备 --------------------
                        output.accept(IFMUPItems.SHADOW_ROSE_SWORD.get()); // 暗影玫瑰剑
                        output.accept(IFMUPItems.SHADOW_ROSE_PICKAXE.get()); // 暗影玫瑰镐
                        output.accept(IFMUPItems.SHADOW_ROSE_AXE.get()); // 暗影玫瑰斧
                        output.accept(IFMUPItems.SHADOW_ROSE_SHOVEL.get()); // 暗影玫瑰铲
                        output.accept(IFMUPItems.SHADOW_ROSE_HOE.get()); // 暗影玫瑰锄
                        output.accept(IFMUPItems.SHADOW_ROSE_HELMET.get()); // 暗影玫瑰头盔
                        output.accept(IFMUPItems.SHADOW_ROSE_CHESTPLATE.get()); // 暗影玫瑰胸甲
                        output.accept(IFMUPItems.SHADOW_ROSE_LEGGINGS.get()); // 暗影玫瑰护腿
                        output.accept(IFMUPItems.SHADOW_ROSE_BOOTS.get()); // 暗影玫瑰靴
                        // -------------------- 星以合金 - 装备 --------------------
                        output.accept(IFMUPItems.STAR_ETHER_ALLOY_SWORD.get()); // 星以合金剑
                        output.accept(IFMUPItems.STAR_ETHER_ALLOY_PICKAXE.get()); // 星以合金镐
                        output.accept(IFMUPItems.STAR_ETHER_ALLOY_AXE.get()); // 星以合金斧
                        output.accept(IFMUPItems.STAR_ETHER_ALLOY_SHOVEL.get()); // 星以合金铲
                        output.accept(IFMUPItems.STAR_ETHER_ALLOY_HOE.get()); // 星以合金锄
                        output.accept(IFMUPItems.STAR_ETHER_ALLOY_HELMET.get()); // 星以合金头盔
                        output.accept(IFMUPItems.STAR_ETHER_ALLOY_CHESTPLATE.get()); // 星以合金胸甲
                        output.accept(IFMUPItems.STAR_ETHER_ALLOY_LEGGINGS.get()); // 星以合金护腿
                        output.accept(IFMUPItems.STAR_ETHER_ALLOY_BOOTS.get()); // 星以合金靴

                        output.accept(IFMUPItems.DARKSHINE_BUCKET.get()); // 黯曜桶
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
