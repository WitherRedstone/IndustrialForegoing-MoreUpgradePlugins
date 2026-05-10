package com.chinaex123.ifmup.init;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public enum ModToolTiers implements Tier {

    // 参数: 不能有效挖掘的方块标签，耐久，速度，伤害，附魔值，维修材料
    // 暗影
    SHADOW(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 512, 3F, 3.0F, 8, () -> Ingredient.of(ModItemTags.INGOTS_SHADOW)),
    // 暗影玫瑰
    UNKNOWN_MAGIC(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1024, 3F, 3.0F, 15, () -> Ingredient.of(ModItemTags.INGOTS_UNKNOWN_MAGIC)),
    // 未知魔法
    SHADOW_ROSE(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2048, 3F, 3.0F, 22, () -> Ingredient.of(ModItemTags.INGOTS_SHADOW_ROSE)),
    // 星以合金
    STAR_ETHER_ALLOY(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 4096, 3F, 3.0F, 30, () -> Ingredient.of(ModItemTags.INGOTS_STAR_ETHER_ALLOY));

    private final TagKey<Block> incorrectBlocksForDrops;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    ModToolTiers(TagKey<Block> incorrectBlocksForDrops, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.incorrectBlocksForDrops = incorrectBlocksForDrops;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrectBlocksForDrops;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
