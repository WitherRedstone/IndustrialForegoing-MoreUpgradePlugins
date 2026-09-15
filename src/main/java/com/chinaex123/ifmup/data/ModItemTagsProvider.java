package com.chinaex123.ifmup.data;

import com.chinaex123.ifmup.IndustrialForegoingMoreUpgradePlugins;
import com.chinaex123.ifmup.init.IFMUPBlocks;
import com.chinaex123.ifmup.init.IFMUPItems;
import com.chinaex123.ifmup.init.IFMUPItemTags;
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
        this.tag(IFMUPItemTags.INGOTS)
                .add(IFMUPItems.SHADOW.INGOT.get())
                .add(IFMUPItems.UNKNOWN_MAGIC.INGOT.get())
                .add(IFMUPItems.SHADOW_ROSE.INGOT.get())
                .add(IFMUPItems.STAR_ETHER_ALLOY.INGOT.get());
        // 所有粒
        this.tag(IFMUPItemTags.NUGGETS)
                .add(IFMUPItems.SHADOW.NUGGET.get())
                .add(IFMUPItems.UNKNOWN_MAGIC.NUGGET.get())
                .add(IFMUPItems.SHADOW_ROSE.NUGGET.get())
                .add(IFMUPItems.STAR_ETHER_ALLOY.NUGGET.get());
        // 所有齿轮
        this.tag(IFMUPItemTags.GEARS)
                .add(IFMUPItems.SHADOW.GEAR.get())
                .add(IFMUPItems.UNKNOWN_MAGIC.GEAR.get())
                .add(IFMUPItems.SHADOW_ROSE.GEAR.get())
                .add(IFMUPItems.STAR_ETHER_ALLOY.GEAR.get())
                .add(IFMUPItems.NETHERITE_GEAR.get())
                .add(IFMUPItems.NETHER_STAR_GEAR.get());
        // 所有粉
        this.tag(IFMUPItemTags.DUSTS)
                .add(IFMUPItems.SHADOW.DUST.get())
                .add(IFMUPItems.UNKNOWN_MAGIC.DUST.get())
                .add(IFMUPItems.SHADOW_ROSE.DUST.get())
                .add(IFMUPItems.STAR_ETHER_ALLOY.DUST.get());
        // 所有板
        this.tag(IFMUPItemTags.PLATES)
                .add(IFMUPItems.SHADOW.PLATE.get())
                .add(IFMUPItems.UNKNOWN_MAGIC.PLATE.get())
                .add(IFMUPItems.SHADOW_ROSE.PLATE.get())
                .add(IFMUPItems.STAR_ETHER_ALLOY.PLATE.get());
        // 所有棍
        this.tag(IFMUPItemTags.RODS)
                .add(IFMUPItems.SHADOW.ROD.get())
                .add(IFMUPItems.UNKNOWN_MAGIC.ROD.get())
                .add(IFMUPItems.SHADOW_ROSE.ROD.get())
                .add(IFMUPItems.STAR_ETHER_ALLOY.ROD.get());
        // 所有线
        this.tag(IFMUPItemTags.WIRES)
                .add(IFMUPItems.SHADOW.WIRE.get())
                .add(IFMUPItems.UNKNOWN_MAGIC.WIRE.get())
                .add(IFMUPItems.SHADOW_ROSE.WIRE.get())
                .add(IFMUPItems.STAR_ETHER_ALLOY.WIRE.get());
        // 所有粗矿
        this.tag(IFMUPItemTags.RAW_MATERIALS)
                .add(IFMUPItems.SHADOW.RAW.get());


        // 暗影 - 锭/粒/齿轮/板/粉/棍/线
        this.tag(IFMUPItemTags.INGOTS_SHADOW).add(IFMUPItems.SHADOW.INGOT.get());
        this.tag(IFMUPItemTags.NUGGETS_SHADOW).add(IFMUPItems.SHADOW.NUGGET.get());
        this.tag(IFMUPItemTags.GEARS_SHADOW).add(IFMUPItems.SHADOW.GEAR.get());
        this.tag(IFMUPItemTags.DUSTS_SHADOW).add(IFMUPItems.SHADOW.DUST.get());
        this.tag(IFMUPItemTags.PLATES_SHADOW).add(IFMUPItems.SHADOW.PLATE.get());
        this.tag(IFMUPItemTags.RODS_SHADOW).add(IFMUPItems.SHADOW.ROD.get());
        this.tag(IFMUPItemTags.WIRES_SHADOW).add(IFMUPItems.SHADOW.WIRE.get());
        this.tag(IFMUPItemTags.RAW_MATERIALS_SHADOW).add(IFMUPItems.SHADOW.RAW.get());
        // 未知魔法 - 锭/粒/齿轮/板/粉/棍/线
        this.tag(IFMUPItemTags.INGOTS_UNKNOWN_MAGIC).add(IFMUPItems.UNKNOWN_MAGIC.INGOT.get());
        this.tag(IFMUPItemTags.NUGGETS_UNKNOWN_MAGIC).add(IFMUPItems.UNKNOWN_MAGIC.NUGGET.get());
        this.tag(IFMUPItemTags.GEARS_UNKNOWN_MAGIC).add(IFMUPItems.UNKNOWN_MAGIC.GEAR.get());
        this.tag(IFMUPItemTags.DUSTS_UNKNOWN_MAGIC).add(IFMUPItems.UNKNOWN_MAGIC.DUST.get());
        this.tag(IFMUPItemTags.PLATES_UNKNOWN_MAGIC).add(IFMUPItems.UNKNOWN_MAGIC.PLATE.get());
        this.tag(IFMUPItemTags.RODS_UNKNOWN_MAGIC).add(IFMUPItems.UNKNOWN_MAGIC.ROD.get());
        this.tag(IFMUPItemTags.WIRES_UNKNOWN_MAGIC).add(IFMUPItems.UNKNOWN_MAGIC.WIRE.get());
        // 暗影玫瑰 - 锭/粒/齿轮/板/粉/棍/线
        this.tag(IFMUPItemTags.INGOTS_SHADOW_ROSE).add(IFMUPItems.SHADOW_ROSE.INGOT.get());
        this.tag(IFMUPItemTags.NUGGETS_SHADOW_ROSE).add(IFMUPItems.SHADOW_ROSE.NUGGET.get());
        this.tag(IFMUPItemTags.GEARS_SHADOW_ROSE).add(IFMUPItems.SHADOW_ROSE.GEAR.get());
        this.tag(IFMUPItemTags.DUSTS_SHADOW_ROSE).add(IFMUPItems.SHADOW_ROSE.DUST.get());
        this.tag(IFMUPItemTags.PLATES_SHADOW_ROSE).add(IFMUPItems.SHADOW_ROSE.PLATE.get());
        this.tag(IFMUPItemTags.RODS_SHADOW_ROSE).add(IFMUPItems.SHADOW_ROSE.ROD.get());
        this.tag(IFMUPItemTags.WIRES_SHADOW_ROSE).add(IFMUPItems.SHADOW_ROSE.WIRE.get());
        // 星以合金 - 锭/粒/齿轮/板/粉/棍/线
        this.tag(IFMUPItemTags.INGOTS_STAR_ETHER_ALLOY).add(IFMUPItems.STAR_ETHER_ALLOY.INGOT.get());
        this.tag(IFMUPItemTags.NUGGETS_STAR_ETHER_ALLOY).add(IFMUPItems.STAR_ETHER_ALLOY.NUGGET.get());
        this.tag(IFMUPItemTags.GEARS_STAR_ETHER_ALLOY).add(IFMUPItems.STAR_ETHER_ALLOY.GEAR.get());
        this.tag(IFMUPItemTags.DUSTS_STAR_ETHER_ALLOY).add(IFMUPItems.STAR_ETHER_ALLOY.DUST.get());
        this.tag(IFMUPItemTags.PLATES_STAR_ETHER_ALLOY).add(IFMUPItems.STAR_ETHER_ALLOY.PLATE.get());
        this.tag(IFMUPItemTags.RODS_STAR_ETHER_ALLOY).add(IFMUPItems.STAR_ETHER_ALLOY.ROD.get());
        this.tag(IFMUPItemTags.WIRES_STAR_ETHER_ALLOY).add(IFMUPItems.STAR_ETHER_ALLOY.WIRE.get());


        // 矿物块
        this.tag(IFMUPItemTags.STORAGE_BLOCKS)
                .add(IFMUPBlocks.SHADOW_BLOCK.get().asItem())
                .add(IFMUPBlocks.RAW_SHADOW_BLOCK.get().asItem())
                .add(IFMUPBlocks.UNKNOWN_MAGIC_BLOCK.get().asItem())
                .add(IFMUPBlocks.SHADOW_ROSE_BLOCK.get().asItem())
                .add(IFMUPBlocks.STAR_ETHER_ALLOY_BLOCK.get().asItem());
        this.tag(IFMUPItemTags.STORAGE_BLOCKS_SHADOW).add(IFMUPBlocks.SHADOW_BLOCK.get().asItem());
        this.tag(IFMUPItemTags.STORAGE_BLOCKS_RAW_SHADOW).add(IFMUPBlocks.RAW_SHADOW_BLOCK.get().asItem());
        this.tag(IFMUPItemTags.STORAGE_BLOCKS_UNKNOWN_MAGIC).add(IFMUPBlocks.UNKNOWN_MAGIC_BLOCK.get().asItem());
        this.tag(IFMUPItemTags.STORAGE_BLOCKS_SHADOW_ROSE).add(IFMUPBlocks.SHADOW_ROSE_BLOCK.get().asItem());
        this.tag(IFMUPItemTags.STORAGE_BLOCKS_STAR_ETHER_ALLOY).add(IFMUPBlocks.STAR_ETHER_ALLOY_BLOCK.get().asItem());
        // 矿石
        this.tag(Tags.Items.ORES).add(IFMUPBlocks.NETHER_SHADOW_ORE.get().asItem());
        this.tag(IFMUPItemTags.ORES_SHADOW).add(IFMUPBlocks.NETHER_SHADOW_ORE.get().asItem());


        // 齿轮
        this.tag(IFMUPItemTags.GEAR_NETHERITE_GEAR).add(IFMUPItems.NETHERITE_GEAR.get());
        this.tag(IFMUPItemTags.GEAR_NETHER_STAR_GEAR).add(IFMUPItems.NETHER_STAR_GEAR.get());


        // ==================== 工具 ====================
        this.tag(Tags.Items.TOOLS)
                // -------------------- 暗影 工具 --------------------
                .add(IFMUPItems.SHADOW_SWORD.get())
                .add(IFMUPItems.SHADOW_PICKAXE.get())
                .add(IFMUPItems.SHADOW_AXE.get())
                .add(IFMUPItems.SHADOW_SHOVEL.get())
                .add(IFMUPItems.SHADOW_HOE.get())
                // -------------------- 未知魔法 工具 --------------------
                .add(IFMUPItems.UNKNOWN_MAGIC_SWORD.get())
                .add(IFMUPItems.UNKNOWN_MAGIC_PICKAXE.get())
                .add(IFMUPItems.UNKNOWN_MAGIC_AXE.get())
                .add(IFMUPItems.UNKNOWN_MAGIC_SHOVEL.get())
                .add(IFMUPItems.UNKNOWN_MAGIC_HOE.get())
                // -------------------- 暗影玫瑰 工具 --------------------
                .add(IFMUPItems.SHADOW_ROSE_SWORD.get())
                .add(IFMUPItems.SHADOW_ROSE_PICKAXE.get())
                .add(IFMUPItems.SHADOW_ROSE_AXE.get())
                .add(IFMUPItems.SHADOW_ROSE_SHOVEL.get())
                .add(IFMUPItems.SHADOW_ROSE_HOE.get())
                // -------------------- 星以合金 工具 --------------------
                .add(IFMUPItems.STAR_ETHER_ALLOY_SWORD.get())
                .add(IFMUPItems.STAR_ETHER_ALLOY_PICKAXE.get())
                .add(IFMUPItems.STAR_ETHER_ALLOY_AXE.get())
                .add(IFMUPItems.STAR_ETHER_ALLOY_SHOVEL.get())
                .add(IFMUPItems.STAR_ETHER_ALLOY_HOE.get());
        // 近战武器工具
        this.tag(Tags.Items.MELEE_WEAPON_TOOLS)
                // -------------------- 暗影 工具 --------------------
                .add(IFMUPItems.SHADOW_SWORD.get())
                .add(IFMUPItems.SHADOW_AXE.get())
                // -------------------- 未知魔法 工具 --------------------
                .add(IFMUPItems.UNKNOWN_MAGIC_SWORD.get())
                .add(IFMUPItems.UNKNOWN_MAGIC_AXE.get())
                // -------------------- 暗影玫瑰 工具 --------------------
                .add(IFMUPItems.SHADOW_ROSE_SWORD.get())
                .add(IFMUPItems.SHADOW_ROSE_AXE.get())
                // -------------------- 星以合金 工具 --------------------
                .add(IFMUPItems.STAR_ETHER_ALLOY_SWORD.get())
                .add(IFMUPItems.STAR_ETHER_ALLOY_AXE.get());
        // 剑
        this.tag(ItemTags.SWORDS)
                .add(IFMUPItems.SHADOW_SWORD.get())
                .add(IFMUPItems.UNKNOWN_MAGIC_SWORD.get())
                .add(IFMUPItems.SHADOW_ROSE_SWORD.get())
                .add(IFMUPItems.STAR_ETHER_ALLOY_SWORD.get());
        // 镐
        this.tag(ItemTags.PICKAXES)
                .add(IFMUPItems.SHADOW_PICKAXE.get())
                .add(IFMUPItems.UNKNOWN_MAGIC_PICKAXE.get())
                .add(IFMUPItems.SHADOW_ROSE_PICKAXE.get())
                .add(IFMUPItems.STAR_ETHER_ALLOY_PICKAXE.get());
        this.tag(Tags.Items.MINING_TOOL_TOOLS)
                .add(IFMUPItems.SHADOW_PICKAXE.get())
                .add(IFMUPItems.UNKNOWN_MAGIC_PICKAXE.get())
                .add(IFMUPItems.SHADOW_ROSE_PICKAXE.get())
                .add(IFMUPItems.STAR_ETHER_ALLOY_PICKAXE.get());
        // 斧
        this.tag(ItemTags.AXES)
                .add(IFMUPItems.SHADOW_AXE.get())
                .add(IFMUPItems.UNKNOWN_MAGIC_AXE.get())
                .add(IFMUPItems.SHADOW_ROSE_AXE.get())
                .add(IFMUPItems.STAR_ETHER_ALLOY_AXE.get());
        // 锹
        this.tag(ItemTags.SHOVELS)
                .add(IFMUPItems.SHADOW_SHOVEL.get())
                .add(IFMUPItems.UNKNOWN_MAGIC_SHOVEL.get())
                .add(IFMUPItems.SHADOW_ROSE_SHOVEL.get())
                .add(IFMUPItems.STAR_ETHER_ALLOY_SHOVEL.get());
        // 锄
        this.tag(ItemTags.HOES)
                .add(IFMUPItems.SHADOW_HOE.get())
                .add(IFMUPItems.UNKNOWN_MAGIC_HOE.get())
                .add(IFMUPItems.SHADOW_ROSE_HOE.get())
                .add(IFMUPItems.STAR_ETHER_ALLOY_HOE.get());


        // ==================== 护甲 ====================
        this.tag(Tags.Items.ARMORS)
                // -------------------- 暗影 护甲 --------------------
                .add(IFMUPItems.SHADOW_HELMET.get())
                .add(IFMUPItems.SHADOW_CHESTPLATE.get())
                .add(IFMUPItems.SHADOW_LEGGINGS.get())
                .add(IFMUPItems.SHADOW_BOOTS.get())
                // -------------------- 未知魔法 护甲 --------------------
                .add(IFMUPItems.UNKNOWN_MAGIC_HELMET.get())
                .add(IFMUPItems.UNKNOWN_MAGIC_CHESTPLATE.get())
                .add(IFMUPItems.UNKNOWN_MAGIC_LEGGINGS.get())
                .add(IFMUPItems.UNKNOWN_MAGIC_BOOTS.get())
                // -------------------- 暗影玫瑰 护甲 --------------------
                .add(IFMUPItems.SHADOW_ROSE_HELMET.get())
                .add(IFMUPItems.SHADOW_ROSE_CHESTPLATE.get())
                .add(IFMUPItems.SHADOW_ROSE_LEGGINGS.get())
                .add(IFMUPItems.SHADOW_ROSE_BOOTS.get())
                // -------------------- 星以合金 护甲 --------------------
                .add(IFMUPItems.STAR_ETHER_ALLOY_HELMET.get())
                .add(IFMUPItems.STAR_ETHER_ALLOY_CHESTPLATE.get())
                .add(IFMUPItems.STAR_ETHER_ALLOY_LEGGINGS.get())
                .add(IFMUPItems.STAR_ETHER_ALLOY_BOOTS.get());
        // 头盔
        this.tag(ItemTags.HEAD_ARMOR)
                .add(IFMUPItems.SHADOW_HELMET.get())
                .add(IFMUPItems.UNKNOWN_MAGIC_HELMET.get())
                .add(IFMUPItems.SHADOW_ROSE_HELMET.get())
                .add(IFMUPItems.STAR_ETHER_ALLOY_HELMET.get());
        // 胸甲
        this.tag(ItemTags.CHEST_ARMOR)
                .add(IFMUPItems.SHADOW_CHESTPLATE.get())
                .add(IFMUPItems.UNKNOWN_MAGIC_CHESTPLATE.get())
                .add(IFMUPItems.SHADOW_ROSE_CHESTPLATE.get())
                .add(IFMUPItems.STAR_ETHER_ALLOY_CHESTPLATE.get());
        // 护腿
        this.tag(ItemTags.LEG_ARMOR)
                .add(IFMUPItems.SHADOW_LEGGINGS.get())
                .add(IFMUPItems.UNKNOWN_MAGIC_LEGGINGS.get())
                .add(IFMUPItems.SHADOW_ROSE_LEGGINGS.get())
                .add(IFMUPItems.STAR_ETHER_ALLOY_LEGGINGS.get());
        // 靴子
        this.tag(ItemTags.FOOT_ARMOR)
                .add(IFMUPItems.SHADOW_BOOTS.get())
                .add(IFMUPItems.UNKNOWN_MAGIC_BOOTS.get())
                .add(IFMUPItems.SHADOW_ROSE_BOOTS.get())
                .add(IFMUPItems.STAR_ETHER_ALLOY_BOOTS.get());
    }
}
