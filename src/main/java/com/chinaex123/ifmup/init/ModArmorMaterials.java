package com.chinaex123.ifmup.init;

import com.chinaex123.ifmup.IndustrialForegoingMoreUpgradePlugins;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {

    // 参数: 名称, 各部位防御值, 附魔能力, 装备音效, 韧性, 击退抗性, 修复材料
    // 暗影
    public static final Holder<ArmorMaterial> SHADOW = register("shadow", Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 3); // 靴子
        map.put(ArmorItem.Type.LEGGINGS, 6); // 护腿
        map.put(ArmorItem.Type.CHESTPLATE, 8); // 盔甲
        map.put(ArmorItem.Type.HELMET, 3); // 头盔
    }), 8, SoundEvents.ARMOR_EQUIP_NETHERITE, 2.5F, 0.0F, () -> Ingredient.of(ModItemTags.INGOTS_SHADOW));
    // 未知魔法
    public static final Holder<ArmorMaterial> UNKNOWN_MAGIC = register("unknown_magic", Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 4); // 靴子
        map.put(ArmorItem.Type.LEGGINGS, 7); // 护腿
        map.put(ArmorItem.Type.CHESTPLATE, 9); // 盔甲
        map.put(ArmorItem.Type.HELMET, 4); // 头盔
    }), 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.05F, () -> Ingredient.of(ModItemTags.INGOTS_UNKNOWN_MAGIC));
    // 暗影玫瑰
    public static final Holder<ArmorMaterial> SHADOW_ROSE = register("shadow_rose", Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 5); // 靴子
        map.put(ArmorItem.Type.LEGGINGS, 8); // 护腿
        map.put(ArmorItem.Type.CHESTPLATE, 10); // 盔甲
        map.put(ArmorItem.Type.HELMET, 5); // 头盔
    }), 22, SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.15F, () -> Ingredient.of(ModItemTags.INGOTS_SHADOW_ROSE));
    // 星以合金
    public static final Holder<ArmorMaterial> STAR_ETHER_ALLOY = register("star_ether_alloy", Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 6); // 靴子
        map.put(ArmorItem.Type.LEGGINGS, 10); // 护腿
        map.put(ArmorItem.Type.CHESTPLATE, 12); // 盔甲
        map.put(ArmorItem.Type.HELMET, 6); // 头盔
    }), 30, SoundEvents.ARMOR_EQUIP_NETHERITE, 5.0F, 0.25F, () -> Ingredient.of(ModItemTags.INGOTS_STAR_ETHER_ALLOY));

    private static Holder<ArmorMaterial> register(
            String name,
            EnumMap<ArmorItem.Type, Integer> defense,
            int enchantmentValue,
            Holder<SoundEvent> equipSound,
            float toughness,
            float knockbackResistance,
            Supplier<Ingredient> repairIngredient
    ) {
        List<ArmorMaterial.Layer> list = List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(IndustrialForegoingMoreUpgradePlugins.MOD_ID, name)));
        return register(name, defense, enchantmentValue, equipSound, toughness, knockbackResistance, repairIngredient, list);
    }

    private static Holder<ArmorMaterial> register(
            String name,
            EnumMap<ArmorItem.Type, Integer> defense,
            int enchantmentValue,
            Holder<SoundEvent> equipSound,
            float toughness,
            float knockbackResistance,
            Supplier<Ingredient> repairIngridient,
            List<ArmorMaterial.Layer> layers
    ) {
        EnumMap<ArmorItem.Type, Integer> enummap = new EnumMap<>(ArmorItem.Type.class);

        for (ArmorItem.Type armoritem$type : ArmorItem.Type.values()) {
            enummap.put(armoritem$type, defense.get(armoritem$type));
        }

        return Registry.registerForHolder(
                BuiltInRegistries.ARMOR_MATERIAL,
                ResourceLocation.withDefaultNamespace(name),
                new ArmorMaterial(enummap, enchantmentValue, equipSound, repairIngridient, layers, toughness, knockbackResistance)
        );
    }
}
