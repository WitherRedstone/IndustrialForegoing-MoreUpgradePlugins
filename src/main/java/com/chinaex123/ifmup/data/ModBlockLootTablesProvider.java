package com.chinaex123.ifmup.data;

import com.chinaex123.ifmup.init.IFMUPBlocks;
import com.chinaex123.ifmup.init.IFMUPItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class ModBlockLootTablesProvider extends BlockLootSubProvider {
    public ModBlockLootTablesProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        // -------------------- 暗影 --------------------
        add(IFMUPBlocks.NETHER_SHADOW_ORE.get(),
                block -> customDrops_Fortune(IFMUPBlocks.NETHER_SHADOW_ORE.get(), IFMUPItems.SHADOW.RAW.get(), 1.0F, 2.0F));
        dropSelf(IFMUPBlocks.RAW_SHADOW_BLOCK.get());
        dropSelf(IFMUPBlocks.SHADOW_BLOCK.get());
        // -------------------- 暗影玫瑰 --------------------
        dropSelf(IFMUPBlocks.SHADOW_ROSE_BLOCK.get());
        // -------------------- 未知魔法 --------------------
        add(IFMUPBlocks.UNKNOWN_BLOCK.get(),
                block -> customDrops_Fortune(IFMUPBlocks.UNKNOWN_BLOCK.get(), IFMUPItems.UNKNOWN_DUST.get(), 1.0F, 1.0F));
        dropSelf(IFMUPBlocks.UNKNOWN_MAGIC_BLOCK.get());
        // -------------------- 星以合金 --------------------
        dropSelf(IFMUPBlocks.STAR_ETHER_ALLOY_BLOCK.get());
    }

    protected LootTable.Builder customDrops_Fortune(Block block, Item item, float min, float max) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(block,
                this.applyExplosionDecay(block, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(min, max)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return IFMUPBlocks.BLOCK_REGISTER.getEntries().stream().map(Holder::value)::iterator;
    }
}
