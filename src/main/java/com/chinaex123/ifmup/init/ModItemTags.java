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
    TagKey<Item> WIRES = neoforgeItemTag("wires"); // c:wires/wires
    TagKey<Item> STORAGE_BLOCKS = neoforgeItemTag("storage_blocks"); // c:storage_blocks
    TagKey<Item> RAW_MATERIALS = neoforgeItemTag("raw_materials"); // c:raw_materials


    TagKey<Item> GEAR_NETHERITE_GEAR = neoforgeItemTag("gears/netherite"); // c:gears/netherite
    TagKey<Item> GEAR_NETHER_STAR_GEAR = neoforgeItemTag("gears/nether_star"); // c:gears/nether_star

    // 暗影
    TagKey<Item> INGOTS_SHADOW = neoforgeItemTag("ingots/shadow"); // c:ingots/shadow
    TagKey<Item> NUGGETS_SHADOW = neoforgeItemTag("nuggets/shadow"); // c:nuggets/shadow
    TagKey<Item> GEARS_SHADOW = neoforgeItemTag("gears/shadow"); // c:gears/shadow
    TagKey<Item> DUSTS_SHADOW = neoforgeItemTag("dusts/shadow"); // c:dusts/shadow
    TagKey<Item> PLATES_SHADOW = neoforgeItemTag("plates/shadow"); // c:plates/shadow
    TagKey<Item> RODS_SHADOW = neoforgeItemTag("rods/shadow"); // c:rods/shadow
    TagKey<Item> WIRES_SHADOW = neoforgeItemTag("wires/shadow"); // c:wires/shadow
    TagKey<Item> RAW_MATERIALS_SHADOW = neoforgeItemTag("raw_materials/shadow"); // c:raw_materials/shadow
    TagKey<Item> STORAGE_BLOCKS_SHADOW = neoforgeItemTag("storage_blocks/shadow"); // c:storage_blocks/shadow
    TagKey<Item> STORAGE_BLOCKS_RAW_SHADOW = neoforgeItemTag("storage_blocks/raw_shadow"); // c:storage_blocks/raw_shadow
    TagKey<Item> ORES_SHADOW = neoforgeItemTag("ores/shadow"); // c:ores/shadow
    // 暗影玫瑰
    TagKey<Item> INGOTS_SHADOW_ROSE = neoforgeItemTag("ingots/shadow_rose"); // c:ingots/shadow_rose
    TagKey<Item> NUGGETS_SHADOW_ROSE = neoforgeItemTag("nuggets/shadow_rose"); // c:nuggets/shadow_rose
    TagKey<Item> GEARS_SHADOW_ROSE = neoforgeItemTag("gears/shadow_rose"); // c:gears/shadow_rose
    TagKey<Item> DUSTS_SHADOW_ROSE = neoforgeItemTag("dusts/shadow_rose"); // c:dusts/shadow_rose
    TagKey<Item> PLATES_SHADOW_ROSE = neoforgeItemTag("plates/shadow_rose"); // c:plates/shadow_rose
    TagKey<Item> RODS_SHADOW_ROSE = neoforgeItemTag("rods/shadow_rose"); // c:rods/shadow_rose
    TagKey<Item> WIRES_SHADOW_ROSE = neoforgeItemTag("wires/shadow_rose"); // c:wires/shadow_rose
    TagKey<Item> STORAGE_BLOCKS_SHADOW_ROSE = neoforgeItemTag("storage_blocks/shadow_rose"); // c:storage_blocks/shadow_rose
    // 未知魔法
    TagKey<Item> INGOTS_UNKNOWN_MAGIC = neoforgeItemTag("ingots/unknown_magic"); // c:ingots/unknown_magic
    TagKey<Item> NUGGETS_UNKNOWN_MAGIC = neoforgeItemTag("nuggets/unknown_magic"); // c:nuggets/unknown_magic
    TagKey<Item> GEARS_UNKNOWN_MAGIC = neoforgeItemTag("gears/unknown_magic"); // c:gears/unknown_magic
    TagKey<Item> DUSTS_UNKNOWN_MAGIC = neoforgeItemTag("dusts/unknown_magic"); // c:dusts/unknown_magic
    TagKey<Item> PLATES_UNKNOWN_MAGIC = neoforgeItemTag("plates/unknown_magic"); // c:plates/unknown_magic
    TagKey<Item> RODS_UNKNOWN_MAGIC = neoforgeItemTag("rods/unknown_magic"); // c:rods/unknown_magic
    TagKey<Item> WIRES_UNKNOWN_MAGIC = neoforgeItemTag("wires/unknown_magic"); // c:wires/unknown_magic
    TagKey<Item> STORAGE_BLOCKS_UNKNOWN_MAGIC = neoforgeItemTag("storage_blocks/unknown_magic"); // c:storage_blocks/unknown_magic
    // 星以合金
    TagKey<Item> INGOTS_STAR_ETHER_ALLOY = neoforgeItemTag("ingots/star_ether_alloy"); // c:ingots/star_ether_alloy
    TagKey<Item> NUGGETS_STAR_ETHER_ALLOY = neoforgeItemTag("nuggets/star_ether_alloy"); // c:nuggets/star_ether_alloy
    TagKey<Item> GEARS_STAR_ETHER_ALLOY = neoforgeItemTag("gears/star_ether_alloy"); // c:gears/star_ether_alloy
    TagKey<Item> DUSTS_STAR_ETHER_ALLOY = neoforgeItemTag("dusts/star_ether_alloy"); // c:dusts/star_ether_alloy
    TagKey<Item> PLATES_STAR_ETHER_ALLOY = neoforgeItemTag("plates/star_ether_alloy"); // c:plates/star_ether_alloy
    TagKey<Item> RODS_STAR_ETHER_ALLOY = neoforgeItemTag("rods/star_ether_alloy"); // c:rods/star_ether_alloy
    TagKey<Item> WIRES_STAR_ETHER_ALLOY = neoforgeItemTag("wires/star_ether_alloy"); // c:wires/star_ether_alloy
    TagKey<Item> STORAGE_BLOCKS_STAR_ETHER_ALLOY = neoforgeItemTag("storage_blocks/star_ether_alloy"); // c:storage_blocks/star_ether_alloy


    private static TagKey<Item> neoforgeItemTag(String name) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", name));
    }
}
