package com.chinaex123.ifmup.data;

import com.chinaex123.ifmup.IndustrialForegoingMoreUpgradePlugins;
import com.chinaex123.ifmup.init.ModBlocks;
import com.chinaex123.ifmup.init.ModItemTags;
import com.chinaex123.ifmup.init.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                               CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, IndustrialForegoingMoreUpgradePlugins.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {

        // 所有锭
        this.tag(ModItemTags.INGOTS)
                .add(ModItems.SHADOW.INGOT.get())
                .add(ModItems.UNKNOWN_MAGIC.INGOT.get())
                .add(ModItems.SHADOW_ROSE.INGOT.get())
                .add(ModItems.STAR_ETHER_ALLOY.INGOT.get());
        // 所有粒
        this.tag(ModItemTags.NUGGETS)
                .add(ModItems.SHADOW.NUGGET.get())
                .add(ModItems.UNKNOWN_MAGIC.NUGGET.get())
                .add(ModItems.SHADOW_ROSE.NUGGET.get())
                .add(ModItems.STAR_ETHER_ALLOY.NUGGET.get());
        // 所有齿轮
        this.tag(ModItemTags.GEARS)
                .add(ModItems.SHADOW.GEAR.get())
                .add(ModItems.UNKNOWN_MAGIC.GEAR.get())
                .add(ModItems.SHADOW_ROSE.GEAR.get())
                .add(ModItems.STAR_ETHER_ALLOY.GEAR.get())
                .add(ModItems.NETHERITE_GEAR.get())
                .add(ModItems.NETHER_STAR_GEAR.get());
        // 所有粉
        this.tag(ModItemTags.DUSTS)
                .add(ModItems.SHADOW.DUST.get())
                .add(ModItems.UNKNOWN_MAGIC.DUST.get())
                .add(ModItems.SHADOW_ROSE.DUST.get())
                .add(ModItems.STAR_ETHER_ALLOY.DUST.get());
        // 所有板
        this.tag(ModItemTags.PLATES)
                .add(ModItems.SHADOW.PLATE.get())
                .add(ModItems.UNKNOWN_MAGIC.PLATE.get())
                .add(ModItems.SHADOW_ROSE.PLATE.get())
                .add(ModItems.STAR_ETHER_ALLOY.PLATE.get());
        // 所有棍
        this.tag(ModItemTags.RODS)
                .add(ModItems.SHADOW.ROD.get())
                .add(ModItems.UNKNOWN_MAGIC.ROD.get())
                .add(ModItems.SHADOW_ROSE.ROD.get())
                .add(ModItems.STAR_ETHER_ALLOY.ROD.get());
        // 所有线
        this.tag(ModItemTags.WIRES)
                .add(ModItems.SHADOW.WIRE.get())
                .add(ModItems.UNKNOWN_MAGIC.WIRE.get())
                .add(ModItems.SHADOW_ROSE.WIRE.get())
                .add(ModItems.STAR_ETHER_ALLOY.WIRE.get());
        // 所有粗矿
        this.tag(ModItemTags.RAW_MATERIALS)
                .add(ModItems.SHADOW.RAW.get());


        // 暗影 - 锭/粒/齿轮/板/粉/棍/线
        this.tag(ModItemTags.INGOTS_SHADOW).add(ModItems.SHADOW.INGOT.get());
        this.tag(ModItemTags.NUGGETS_SHADOW).add(ModItems.SHADOW.NUGGET.get());
        this.tag(ModItemTags.GEARS_SHADOW).add(ModItems.SHADOW.GEAR.get());
        this.tag(ModItemTags.DUSTS_SHADOW).add(ModItems.SHADOW.DUST.get());
        this.tag(ModItemTags.PLATES_SHADOW).add(ModItems.SHADOW.PLATE.get());
        this.tag(ModItemTags.RODS_SHADOW).add(ModItems.SHADOW.ROD.get());
        this.tag(ModItemTags.WIRES_SHADOW).add(ModItems.SHADOW.WIRE.get());
        this.tag(ModItemTags.RAW_MATERIALS_SHADOW).add(ModItems.SHADOW.RAW.get());
        // 未知魔法 - 锭/粒/齿轮/板/粉/棍/线
        this.tag(ModItemTags.INGOTS_UNKNOWN_MAGIC).add(ModItems.UNKNOWN_MAGIC.INGOT.get());
        this.tag(ModItemTags.NUGGETS_UNKNOWN_MAGIC).add(ModItems.UNKNOWN_MAGIC.NUGGET.get());
        this.tag(ModItemTags.GEARS_UNKNOWN_MAGIC).add(ModItems.UNKNOWN_MAGIC.GEAR.get());
        this.tag(ModItemTags.DUSTS_UNKNOWN_MAGIC).add(ModItems.UNKNOWN_MAGIC.DUST.get());
        this.tag(ModItemTags.PLATES_UNKNOWN_MAGIC).add(ModItems.UNKNOWN_MAGIC.PLATE.get());
        this.tag(ModItemTags.RODS_UNKNOWN_MAGIC).add(ModItems.UNKNOWN_MAGIC.ROD.get());
        this.tag(ModItemTags.WIRES_UNKNOWN_MAGIC).add(ModItems.UNKNOWN_MAGIC.WIRE.get());
        // 暗影玫瑰 - 锭/粒/齿轮/板/粉/棍/线
        this.tag(ModItemTags.INGOTS_SHADOW_ROSE).add(ModItems.SHADOW_ROSE.INGOT.get());
        this.tag(ModItemTags.NUGGETS_SHADOW_ROSE).add(ModItems.SHADOW_ROSE.NUGGET.get());
        this.tag(ModItemTags.GEARS_SHADOW_ROSE).add(ModItems.SHADOW_ROSE.GEAR.get());
        this.tag(ModItemTags.DUSTS_SHADOW_ROSE).add(ModItems.SHADOW_ROSE.DUST.get());
        this.tag(ModItemTags.PLATES_SHADOW_ROSE).add(ModItems.SHADOW_ROSE.PLATE.get());
        this.tag(ModItemTags.RODS_SHADOW_ROSE).add(ModItems.SHADOW_ROSE.ROD.get());
        this.tag(ModItemTags.WIRES_SHADOW_ROSE).add(ModItems.SHADOW_ROSE.WIRE.get());
        // 星以合金 - 锭/粒/齿轮/板/粉/棍/线
        this.tag(ModItemTags.INGOTS_STAR_ETHER_ALLOY).add(ModItems.STAR_ETHER_ALLOY.INGOT.get());
        this.tag(ModItemTags.NUGGETS_STAR_ETHER_ALLOY).add(ModItems.STAR_ETHER_ALLOY.NUGGET.get());
        this.tag(ModItemTags.GEARS_STAR_ETHER_ALLOY).add(ModItems.STAR_ETHER_ALLOY.GEAR.get());
        this.tag(ModItemTags.DUSTS_STAR_ETHER_ALLOY).add(ModItems.STAR_ETHER_ALLOY.DUST.get());
        this.tag(ModItemTags.PLATES_STAR_ETHER_ALLOY).add(ModItems.STAR_ETHER_ALLOY.PLATE.get());
        this.tag(ModItemTags.RODS_STAR_ETHER_ALLOY).add(ModItems.STAR_ETHER_ALLOY.ROD.get());
        this.tag(ModItemTags.WIRES_STAR_ETHER_ALLOY).add(ModItems.STAR_ETHER_ALLOY.WIRE.get());


        // 矿物块
        this.tag(ModItemTags.STORAGE_BLOCKS)
                .add(ModBlocks.SHADOW_BLOCK.get().asItem())
                .add(ModBlocks.RAW_SHADOW_BLOCK.get().asItem())
                .add(ModBlocks.UNKNOWN_MAGIC_BLOCK.get().asItem())
                .add(ModBlocks.SHADOW_ROSE_BLOCK.get().asItem())
                .add(ModBlocks.STAR_ETHER_ALLOY_BLOCK.get().asItem());
        this.tag(ModItemTags.STORAGE_BLOCKS_SHADOW).add(ModBlocks.SHADOW_BLOCK.get().asItem());
        this.tag(ModItemTags.STORAGE_BLOCKS_RAW_SHADOW).add(ModBlocks.RAW_SHADOW_BLOCK.get().asItem());
        this.tag(ModItemTags.STORAGE_BLOCKS_UNKNOWN_MAGIC).add(ModBlocks.UNKNOWN_MAGIC_BLOCK.get().asItem());
        this.tag(ModItemTags.STORAGE_BLOCKS_SHADOW_ROSE).add(ModBlocks.SHADOW_ROSE_BLOCK.get().asItem());
        this.tag(ModItemTags.STORAGE_BLOCKS_STAR_ETHER_ALLOY).add(ModBlocks.STAR_ETHER_ALLOY_BLOCK.get().asItem());
        // 矿石
        this.tag(Tags.Items.ORES).add(ModBlocks.NETHER_SHADOW_ORE.get().asItem());
        this.tag(ModItemTags.ORES_SHADOW).add(ModBlocks.NETHER_SHADOW_ORE.get().asItem());


        // 齿轮
        this.tag(ModItemTags.GEAR_NETHERITE_GEAR).add(ModItems.NETHERITE_GEAR.get());
        this.tag(ModItemTags.GEAR_NETHER_STAR_GEAR).add(ModItems.NETHER_STAR_GEAR.get());


        // ==================== 工具 ====================
        this.tag(Tags.Items.TOOLS)
                // -------------------- 暗影 工具 --------------------
                .add(ModItems.SHADOW_SWORD.get())
                .add(ModItems.SHADOW_PICKAXE.get())
                .add(ModItems.SHADOW_AXE.get())
                .add(ModItems.SHADOW_SHOVEL.get())
                .add(ModItems.SHADOW_HOE.get())
                // -------------------- 未知魔法 工具 --------------------
                .add(ModItems.UNKNOWN_MAGIC_SWORD.get())
                .add(ModItems.UNKNOWN_MAGIC_PICKAXE.get())
                .add(ModItems.UNKNOWN_MAGIC_AXE.get())
                .add(ModItems.UNKNOWN_MAGIC_SHOVEL.get())
                .add(ModItems.UNKNOWN_MAGIC_HOE.get())
                // -------------------- 暗影玫瑰 工具 --------------------
                .add(ModItems.SHADOW_ROSE_SWORD.get())
                .add(ModItems.SHADOW_ROSE_PICKAXE.get())
                .add(ModItems.SHADOW_ROSE_AXE.get())
                .add(ModItems.SHADOW_ROSE_SHOVEL.get())
                .add(ModItems.SHADOW_ROSE_HOE.get())
                // -------------------- 星以合金 工具 --------------------
                .add(ModItems.STAR_ETHER_ALLOY_SWORD.get())
                .add(ModItems.STAR_ETHER_ALLOY_PICKAXE.get())
                .add(ModItems.STAR_ETHER_ALLOY_AXE.get())
                .add(ModItems.STAR_ETHER_ALLOY_SHOVEL.get())
                .add(ModItems.STAR_ETHER_ALLOY_HOE.get());
        // 近战武器工具
        this.tag(Tags.Items.MELEE_WEAPON_TOOLS)
                // -------------------- 暗影 工具 --------------------
                .add(ModItems.SHADOW_SWORD.get())
                .add(ModItems.SHADOW_AXE.get())
                // -------------------- 未知魔法 工具 --------------------
                .add(ModItems.UNKNOWN_MAGIC_SWORD.get())
                .add(ModItems.UNKNOWN_MAGIC_AXE.get())
                // -------------------- 暗影玫瑰 工具 --------------------
                .add(ModItems.SHADOW_ROSE_SWORD.get())
                .add(ModItems.SHADOW_ROSE_AXE.get())
                // -------------------- 星以合金 工具 --------------------
                .add(ModItems.STAR_ETHER_ALLOY_SWORD.get())
                .add(ModItems.STAR_ETHER_ALLOY_AXE.get());
        // 剑
        this.tag(ItemTags.SWORDS)
                .add(ModItems.SHADOW_SWORD.get())
                .add(ModItems.UNKNOWN_MAGIC_SWORD.get())
                .add(ModItems.SHADOW_ROSE_SWORD.get())
                .add(ModItems.STAR_ETHER_ALLOY_SWORD.get());
        // 镐
        this.tag(ItemTags.PICKAXES)
                .add(ModItems.SHADOW_PICKAXE.get())
                .add(ModItems.UNKNOWN_MAGIC_PICKAXE.get())
                .add(ModItems.SHADOW_ROSE_PICKAXE.get())
                .add(ModItems.STAR_ETHER_ALLOY_PICKAXE.get());
        this.tag(Tags.Items.MINING_TOOL_TOOLS)
                .add(ModItems.SHADOW_PICKAXE.get())
                .add(ModItems.UNKNOWN_MAGIC_PICKAXE.get())
                .add(ModItems.SHADOW_ROSE_PICKAXE.get())
                .add(ModItems.STAR_ETHER_ALLOY_PICKAXE.get());
        // 斧
        this.tag(ItemTags.AXES)
                .add(ModItems.SHADOW_AXE.get())
                .add(ModItems.UNKNOWN_MAGIC_AXE.get())
                .add(ModItems.SHADOW_ROSE_AXE.get())
                .add(ModItems.STAR_ETHER_ALLOY_AXE.get());
        // 锹
        this.tag(ItemTags.SHOVELS)
                .add(ModItems.SHADOW_SHOVEL.get())
                .add(ModItems.UNKNOWN_MAGIC_SHOVEL.get())
                .add(ModItems.SHADOW_ROSE_SHOVEL.get())
                .add(ModItems.STAR_ETHER_ALLOY_SHOVEL.get());
        // 锄
        this.tag(ItemTags.HOES)
                .add(ModItems.SHADOW_HOE.get())
                .add(ModItems.UNKNOWN_MAGIC_HOE.get())
                .add(ModItems.SHADOW_ROSE_HOE.get())
                .add(ModItems.STAR_ETHER_ALLOY_HOE.get());


        // ==================== 护甲 ====================
        this.tag(Tags.Items.ARMORS)
                // -------------------- 暗影 护甲 --------------------
                .add(ModItems.SHADOW_HELMET.get())
                .add(ModItems.SHADOW_CHESTPLATE.get())
                .add(ModItems.SHADOW_LEGGINGS.get())
                .add(ModItems.SHADOW_BOOTS.get())
                // -------------------- 未知魔法 护甲 --------------------
                .add(ModItems.UNKNOWN_MAGIC_HELMET.get())
                .add(ModItems.UNKNOWN_MAGIC_CHESTPLATE.get())
                .add(ModItems.UNKNOWN_MAGIC_LEGGINGS.get())
                .add(ModItems.UNKNOWN_MAGIC_BOOTS.get())
                // -------------------- 暗影玫瑰 护甲 --------------------
                .add(ModItems.SHADOW_ROSE_HELMET.get())
                .add(ModItems.SHADOW_ROSE_CHESTPLATE.get())
                .add(ModItems.SHADOW_ROSE_LEGGINGS.get())
                .add(ModItems.SHADOW_ROSE_BOOTS.get())
                // -------------------- 星以合金 护甲 --------------------
                .add(ModItems.STAR_ETHER_ALLOY_HELMET.get())
                .add(ModItems.STAR_ETHER_ALLOY_CHESTPLATE.get())
                .add(ModItems.STAR_ETHER_ALLOY_LEGGINGS.get())
                .add(ModItems.STAR_ETHER_ALLOY_BOOTS.get());
        // 头盔
        this.tag(ItemTags.HEAD_ARMOR)
                .add(ModItems.SHADOW_HELMET.get())
                .add(ModItems.UNKNOWN_MAGIC_HELMET.get())
                .add(ModItems.SHADOW_ROSE_HELMET.get())
                .add(ModItems.STAR_ETHER_ALLOY_HELMET.get());
        // 胸甲
        this.tag(ItemTags.CHEST_ARMOR)
                .add(ModItems.SHADOW_CHESTPLATE.get())
                .add(ModItems.UNKNOWN_MAGIC_CHESTPLATE.get())
                .add(ModItems.SHADOW_ROSE_CHESTPLATE.get())
                .add(ModItems.STAR_ETHER_ALLOY_CHESTPLATE.get());
        // 护腿
        this.tag(ItemTags.LEG_ARMOR)
                .add(ModItems.SHADOW_LEGGINGS.get())
                .add(ModItems.UNKNOWN_MAGIC_LEGGINGS.get())
                .add(ModItems.SHADOW_ROSE_LEGGINGS.get())
                .add(ModItems.STAR_ETHER_ALLOY_LEGGINGS.get());
        // 靴子
        this.tag(ItemTags.FOOT_ARMOR)
                .add(ModItems.SHADOW_BOOTS.get())
                .add(ModItems.UNKNOWN_MAGIC_BOOTS.get())
                .add(ModItems.SHADOW_ROSE_BOOTS.get())
                .add(ModItems.STAR_ETHER_ALLOY_BOOTS.get());
    }
}
