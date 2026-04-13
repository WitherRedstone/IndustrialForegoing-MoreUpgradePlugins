package com.chinaex123.ifmup.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public interface ModItemTags {

    TagKey<Item> INGOTS = neoforgeItemTag("ingots"); // c:ingots
    TagKey<Item> NUGGETS = neoforgeItemTag("nuggets"); // c:nuggets
    TagKey<Item> GEARS = neoforgeItemTag("gears"); // c:gears
    TagKey<Item> DUSTS = neoforgeItemTag("dusts"); // c:dusts
    TagKey<Item> PLATES = neoforgeItemTag("plates"); // c:plates
    TagKey<Item> RODS = neoforgeItemTag("rods"); // c:rods
    TagKey<Item> WIRES = neoforgeItemTag("wires"); // c:wire/wires
    TagKey<Item> STORAGE_BLOCKS = neoforgeItemTag("storage_blocks"); // c:storage_blocks
    TagKey<Item> RAW_MATERIALS = neoforgeItemTag("raw_materials"); // c:raw_materials


    TagKey<Item> GEAR_NETHERITE_GEAR = neoforgeItemTag("gear/netherite"); // c:gear/netherite
    TagKey<Item> GEAR_NETHER_STAR_GEAR = neoforgeItemTag("gear/nether_star"); // c:gear/nether_star

    // 暗影
    TagKey<Item> INGOT_SHADOW = neoforgeItemTag("ingot/shadow"); // c:ingot/shadow
    TagKey<Item> NUGGET_SHADOW = neoforgeItemTag("nugget/shadow"); // c:nugget/shadow
    TagKey<Item> GEAR_SHADOW = neoforgeItemTag("gear/shadow"); // c:gear/shadow
    TagKey<Item> DUST_SHADOW = neoforgeItemTag("dust/shadow"); // c:dust/shadow
    TagKey<Item> PLATE_SHADOW = neoforgeItemTag("plate/shadow"); // c:plate/shadow
    TagKey<Item> ROD_SHADOW = neoforgeItemTag("rod/shadow"); // c:rod/shadow
    TagKey<Item> WIRE_SHADOW = neoforgeItemTag("wire/shadow"); // c:wire/shadow
    TagKey<Item> RAW_MATERIALS_SHADOW = neoforgeItemTag("raw_materials/shadow"); // c:raw_materials/shadow
    TagKey<Item> STORAGE_BLOCKS_SHADOW = neoforgeItemTag("storage_blocks/shadow"); // c:storage_blocks/shadow
    TagKey<Item> STORAGE_BLOCKS_RAW_SHADOW = neoforgeItemTag("storage_blocks/raw_shadow"); // c:storage_blocks/raw_shadow
    TagKey<Item> ORES_SHADOW = neoforgeItemTag("ore/shadow"); // c:ore/shadow
    // 暗影玫瑰
    TagKey<Item> INGOT_SHADOW_ROSE = neoforgeItemTag("ingot/shadow_rose"); // c:ingot/shadow_rose
    TagKey<Item> NUGGET_SHADOW_ROSE = neoforgeItemTag("nugget/shadow_rose"); // c:nugget/shadow_rose
    TagKey<Item> GEAR_SHADOW_ROSE = neoforgeItemTag("gear/shadow_rose"); // c:gear/shadow_rose
    TagKey<Item> DUST_SHADOW_ROSE = neoforgeItemTag("dust/shadow_rose"); // c:dust/shadow_rose
    TagKey<Item> PLATE_SHADOW_ROSE = neoforgeItemTag("plate/shadow_rose"); // c:plate/shadow_rose
    TagKey<Item> ROD_SHADOW_ROSE = neoforgeItemTag("rod/shadow_rose"); // c:rod/shadow_rose
    TagKey<Item> WIRE_SHADOW_ROSE = neoforgeItemTag("wire/shadow_rose"); // c:wire/shadow_rose
    TagKey<Item> STORAGE_BLOCKS_SHADOW_ROSE = neoforgeItemTag("storage_blocks/shadow_rose"); // c:storage_blocks/shadow_rose
    // 未知魔法
    TagKey<Item> INGOT_UNKNOWN_MAGIC = neoforgeItemTag("ingot/unknown_magic"); // c:ingot/unknown_magic
    TagKey<Item> NUGGET_UNKNOWN_MAGIC = neoforgeItemTag("nugget/unknown_magic"); // c:nugget/unknown_magic
    TagKey<Item> GEAR_UNKNOWN_MAGIC = neoforgeItemTag("gear/unknown_magic"); // c:gear/unknown_magic
    TagKey<Item> DUST_UNKNOWN_MAGIC = neoforgeItemTag("dust/unknown_magic"); // c:dust/unknown_magic
    TagKey<Item> PLATE_UNKNOWN_MAGIC = neoforgeItemTag("plate/unknown_magic"); // c:plate/unknown_magic
    TagKey<Item> ROD_UNKNOWN_MAGIC = neoforgeItemTag("rod/unknown_magic"); // c:rod/unknown_magic
    TagKey<Item> WIRE_UNKNOWN_MAGIC = neoforgeItemTag("wire/unknown_magic"); // c:wire/unknown_magic
    TagKey<Item> STORAGE_BLOCKS_UNKNOWN_MAGIC = neoforgeItemTag("storage_blocks/unknown_magic"); // c:storage_blocks/unknown_magic
    // 星以合金
    TagKey<Item> INGOT_STAR_ETHER_ALLOY = neoforgeItemTag("ingot/star_ether_alloy"); // c:ingot/star_ether_alloy
    TagKey<Item> NUGGET_STAR_ETHER_ALLOY = neoforgeItemTag("nugget/star_ether_alloy"); // c:nugget/star_ether_alloy
    TagKey<Item> GEAR_STAR_ETHER_ALLOY = neoforgeItemTag("gear/star_ether_alloy"); // c:gear/star_ether_alloy
    TagKey<Item> DUST_STAR_ETHER_ALLOY = neoforgeItemTag("dust/star_ether_alloy"); // c:dust/star_ether_alloy
    TagKey<Item> PLATE_STAR_ETHER_ALLOY = neoforgeItemTag("plate/star_ether_alloy"); // c:plate/star_ether_alloy
    TagKey<Item> ROD_STAR_ETHER_ALLOY = neoforgeItemTag("rod/star_ether_alloy"); // c:rod/star_ether_alloy
    TagKey<Item> WIRE_STAR_ETHER_ALLOY = neoforgeItemTag("wire/star_ether_alloy"); // c:wire/star_ether_alloy
    TagKey<Item> STORAGE_BLOCKS_STAR_ETHER_ALLOY = neoforgeItemTag("storage_blocks/star_ether_alloy"); // c:storage_blocks/star_ether_alloy


    private static TagKey<Item> neoforgeItemTag(String name) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", name));
    }
}
