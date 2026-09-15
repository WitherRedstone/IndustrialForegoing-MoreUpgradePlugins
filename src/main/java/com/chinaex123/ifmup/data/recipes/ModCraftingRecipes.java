package com.chinaex123.ifmup.data.recipes;

import com.chinaex123.ifmup.IndustrialForegoingMoreUpgradePlugins;
import com.chinaex123.ifmup.init.IFMUPBlocks;
import com.chinaex123.ifmup.init.IFMUPItems;
import com.chinaex123.ifmup.init.IFMUPItemTags;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.Tags;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModCraftingRecipes {

    private final PackOutput output;
    private final CompletableFuture<HolderLookup.Provider> registries;

    public ModCraftingRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        this.output = output;
        this.registries = registries;
    }

    public void buildCraftingRecipes(@NotNull RecipeOutput recipeOutput) {
        // ==================== 熔炉/高炉 ====================
        // 粗暗影块
        oreSmelting(recipeOutput, List.of(Ingredient.of(IFMUPItemTags.STORAGE_BLOCKS_RAW_SHADOW)), RecipeCategory.MISC, IFMUPBlocks.SHADOW_BLOCK, 0.25f, 200, "shadow_block");
        oreBlasting(recipeOutput,  List.of(Ingredient.of(IFMUPItemTags.STORAGE_BLOCKS_RAW_SHADOW)), RecipeCategory.MISC, IFMUPBlocks.SHADOW_BLOCK, 0.25f, 100, "shadow_block");
        // 下界暗影矿石
        oreSmelting(recipeOutput,  List.of(Ingredient.of(IFMUPItemTags.ORES_SHADOW)), RecipeCategory.MISC, IFMUPItems.SHADOW.INGOT.get(), 0.25f, 200, "shadow_ore");
        oreBlasting(recipeOutput,  List.of(Ingredient.of(IFMUPItemTags.ORES_SHADOW)), RecipeCategory.MISC, IFMUPItems.SHADOW.INGOT.get(), 0.25f, 100, "shadow_ore");
        // 粗暗影
        oreSmelting(recipeOutput,  List.of(Ingredient.of(IFMUPItemTags.RAW_MATERIALS_SHADOW)), RecipeCategory.MISC, IFMUPItems.SHADOW.INGOT.get(), 0.25f, 200, "raw_shadow");
        oreBlasting(recipeOutput,  List.of(Ingredient.of(IFMUPItemTags.RAW_MATERIALS_SHADOW)), RecipeCategory.MISC, IFMUPItems.SHADOW.INGOT.get(), 0.25f, 100, "raw_shadow");


        // ==================== 有序合成 ====================
        // 下界合金齿轮
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IFMUPItems.NETHERITE_GEAR.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', Tags.Items.INGOTS_NETHERITE)
                .unlockedBy("has_netherite_gear", has(IFMUPItems.NETHERITE_GEAR.get()))
                .save(recipeOutput);
        // 下界之星齿轮
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IFMUPItems.NETHER_STAR_GEAR.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', Tags.Items.NETHER_STARS)
                .unlockedBy("has_nether_star_gear", has(IFMUPItems.NETHER_STAR_GEAR.get()))
                .save(recipeOutput);

        // 粗暗影块
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IFMUPBlocks.RAW_SHADOW_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', IFMUPItemTags.RAW_MATERIALS_SHADOW)
                .unlockedBy("has_raw_shadow", has(IFMUPItemTags.RAW_MATERIALS_SHADOW))
                .save(recipeOutput);
        // 暗影块
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IFMUPBlocks.SHADOW_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', IFMUPItemTags.INGOTS_SHADOW)
                .unlockedBy("has_shadow_ingot", has(IFMUPItemTags.INGOTS_SHADOW))
                .save(recipeOutput);
        // 暗影锭
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IFMUPItems.SHADOW.INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', IFMUPItemTags.NUGGETS_SHADOW)
                .unlockedBy("has_shadow_nugget", has(IFMUPItemTags.NUGGETS_SHADOW))
                .save(recipeOutput);
        // 暗影棍
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IFMUPItems.SHADOW.ROD.get())
                .pattern(" A ")
                .pattern(" A ")
                .pattern("   ")
                .define('A', IFMUPItemTags.INGOTS_SHADOW)
                .unlockedBy("has_shadow_ingot_rod", has(IFMUPItemTags.INGOTS_SHADOW))
                .save(recipeOutput);
        // 暗影齿轮
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IFMUPItems.SHADOW.GEAR.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', IFMUPItemTags.INGOTS_SHADOW)
                .unlockedBy("has_shadow_ingot_gear", has(IFMUPItemTags.GEARS_SHADOW))
                .save(recipeOutput);

        // 暗影玫瑰块
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IFMUPBlocks.SHADOW_ROSE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', IFMUPItemTags.INGOTS_SHADOW_ROSE)
                .unlockedBy("has_shadow_rose_ingot", has(IFMUPItemTags.INGOTS_SHADOW_ROSE))
                .save(recipeOutput);
        // 暗影玫瑰锭
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IFMUPItems.SHADOW_ROSE.INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', IFMUPItemTags.NUGGETS_SHADOW_ROSE)
                .unlockedBy("has_shadow_rose_nugget", has(IFMUPItemTags.NUGGETS_SHADOW_ROSE))
                .save(recipeOutput);
        // 暗影玫瑰棍
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IFMUPItems.SHADOW_ROSE.ROD.get())
                .pattern(" A ")
                .pattern(" A ")
                .pattern("   ")
                .define('A', IFMUPItemTags.INGOTS_SHADOW_ROSE)
                .unlockedBy("has_shadow_rose_ingot_rod", has(IFMUPItemTags.INGOTS_SHADOW_ROSE))
                .save(recipeOutput);
        // 暗影玫瑰齿轮
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IFMUPItems.SHADOW_ROSE.GEAR.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', IFMUPItemTags.INGOTS_SHADOW_ROSE)
                .unlockedBy("has_shadow_rose_ingot_gear", has(IFMUPItemTags.GEARS_SHADOW_ROSE))
                .save(recipeOutput);

        // 未知魔法块
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IFMUPBlocks.UNKNOWN_MAGIC_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', IFMUPItemTags.INGOTS_UNKNOWN_MAGIC)
                .unlockedBy("has_unknown_magic_ingot", has(IFMUPItemTags.INGOTS_UNKNOWN_MAGIC))
                .save(recipeOutput);
        // 未知魔法锭
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IFMUPItems.UNKNOWN_MAGIC.INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', IFMUPItemTags.NUGGETS_UNKNOWN_MAGIC)
                .unlockedBy("has_unknown_magic_nugget", has(IFMUPItemTags.NUGGETS_UNKNOWN_MAGIC))
                .save(recipeOutput);
        // 未知魔法棍
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IFMUPItems.UNKNOWN_MAGIC.ROD.get())
                .pattern(" A ")
                .pattern(" A ")
                .pattern("   ")
                .define('A', IFMUPItemTags.INGOTS_UNKNOWN_MAGIC)
                .unlockedBy("has_unknown_magic_ingot_rod", has(IFMUPItemTags.INGOTS_UNKNOWN_MAGIC))
                .save(recipeOutput);
        // 未知魔法齿轮
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IFMUPItems.UNKNOWN_MAGIC.GEAR.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', IFMUPItemTags.INGOTS_UNKNOWN_MAGIC)
                .unlockedBy("has_unknown_magic_ingot_gear", has(IFMUPItemTags.GEARS_UNKNOWN_MAGIC))
                .save(recipeOutput);

        // 星以合金块
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IFMUPBlocks.STAR_ETHER_ALLOY_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', IFMUPItemTags.INGOTS_STAR_ETHER_ALLOY)
                .unlockedBy("has_star_ether_alloy_ingot", has(IFMUPItemTags.INGOTS_STAR_ETHER_ALLOY))
                .save(recipeOutput);
        // 星以合金锭
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IFMUPItems.STAR_ETHER_ALLOY.INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', IFMUPItemTags.NUGGETS_STAR_ETHER_ALLOY)
                .unlockedBy("has_star_ether_alloy_nugget", has(IFMUPItemTags.NUGGETS_STAR_ETHER_ALLOY))
                .save(recipeOutput);
        // 星以合金棍
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IFMUPItems.STAR_ETHER_ALLOY.ROD.get())
                .pattern(" A ")
                .pattern(" A ")
                .pattern("   ")
                .define('A', IFMUPItemTags.INGOTS_STAR_ETHER_ALLOY)
                .unlockedBy("has_star_ether_alloy_ingot_rod", has(IFMUPItemTags.INGOTS_STAR_ETHER_ALLOY))
                .save(recipeOutput);
        // 星以合金齿轮
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IFMUPItems.STAR_ETHER_ALLOY.GEAR.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', IFMUPItemTags.INGOTS_STAR_ETHER_ALLOY)
                .unlockedBy("has_star_ether_alloy_ingot_gear", has(IFMUPItemTags.GEARS_STAR_ETHER_ALLOY))
                .save(recipeOutput);

        // -------------------- 暗影 - 工具装备 --------------------
        armorAndToolsRecipes(recipeOutput, IFMUPItemTags.INGOTS_SHADOW, IFMUPItemTags.RODS_SHADOW,
                IFMUPItems.SHADOW_SWORD.get(), IFMUPItems.SHADOW_PICKAXE.get(), IFMUPItems.SHADOW_AXE.get(),
                IFMUPItems.SHADOW_SHOVEL.get(), IFMUPItems.SHADOW_HOE.get(),
                IFMUPItems.SHADOW_HELMET.get(), IFMUPItems.SHADOW_CHESTPLATE.get(), IFMUPItems.SHADOW_LEGGINGS.get(), IFMUPItems.SHADOW_BOOTS.get());
        // -------------------- 未知魔法 - 工具装备 --------------------
        armorAndToolsRecipes(recipeOutput, IFMUPItemTags.INGOTS_UNKNOWN_MAGIC, IFMUPItemTags.RODS_UNKNOWN_MAGIC,
                IFMUPItems.UNKNOWN_MAGIC_SWORD.get(), IFMUPItems.UNKNOWN_MAGIC_PICKAXE.get(), IFMUPItems.UNKNOWN_MAGIC_AXE.get(),
                IFMUPItems.UNKNOWN_MAGIC_SHOVEL.get(), IFMUPItems.UNKNOWN_MAGIC_HOE.get(),
                IFMUPItems.UNKNOWN_MAGIC_HELMET.get(), IFMUPItems.UNKNOWN_MAGIC_CHESTPLATE.get(), IFMUPItems.UNKNOWN_MAGIC_LEGGINGS.get(), IFMUPItems.UNKNOWN_MAGIC_BOOTS.get());
        // -------------------- 暗影玫瑰 - 工具装备 --------------------
        armorAndToolsRecipes(recipeOutput, IFMUPItemTags.INGOTS_SHADOW_ROSE, IFMUPItemTags.RODS_SHADOW_ROSE,
                IFMUPItems.SHADOW_ROSE_SWORD.get(), IFMUPItems.SHADOW_ROSE_PICKAXE.get(), IFMUPItems.SHADOW_ROSE_AXE.get(),
                IFMUPItems.SHADOW_ROSE_SHOVEL.get(), IFMUPItems.SHADOW_ROSE_HOE.get(),
                IFMUPItems.SHADOW_ROSE_HELMET.get(), IFMUPItems.SHADOW_ROSE_CHESTPLATE.get(), IFMUPItems.SHADOW_ROSE_LEGGINGS.get(), IFMUPItems.SHADOW_ROSE_BOOTS.get());
        // -------------------- 星以合金 - 工具装备 --------------------
        armorAndToolsRecipes(recipeOutput, IFMUPItemTags.INGOTS_STAR_ETHER_ALLOY, IFMUPItemTags.RODS_STAR_ETHER_ALLOY,
                IFMUPItems.STAR_ETHER_ALLOY_SWORD.get(), IFMUPItems.STAR_ETHER_ALLOY_PICKAXE.get(), IFMUPItems.STAR_ETHER_ALLOY_AXE.get(),
                IFMUPItems.STAR_ETHER_ALLOY_SHOVEL.get(), IFMUPItems.STAR_ETHER_ALLOY_HOE.get(),
                IFMUPItems.STAR_ETHER_ALLOY_HELMET.get(), IFMUPItems.STAR_ETHER_ALLOY_CHESTPLATE.get(), IFMUPItems.STAR_ETHER_ALLOY_LEGGINGS.get(), IFMUPItems.STAR_ETHER_ALLOY_BOOTS.get());

        // ==================== 无形状合成 ====================
        // 粗暗影块
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, IFMUPItems.SHADOW.NUGGET.get(),9)
                .requires(IFMUPItemTags.INGOTS_SHADOW)
                .unlockedBy("has_shadow_ingot_9", has(IFMUPItemTags.RAW_MATERIALS_SHADOW))
                .save(recipeOutput);
        // 暗影粒
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, IFMUPItems.SHADOW.RAW.get(),9)
                .requires(IFMUPBlocks.RAW_SHADOW_BLOCK)
                .unlockedBy("has_raw_shadow_9", has(IFMUPItemTags.INGOTS_SHADOW))
                .save(recipeOutput);
        // 暗影玫瑰粒
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, IFMUPItems.SHADOW_ROSE.NUGGET.get(),9)
                .requires(IFMUPItemTags.INGOTS_SHADOW_ROSE)
                .unlockedBy("has_shadow_rose_ingot_9", has(IFMUPItemTags.INGOTS_SHADOW_ROSE))
                .save(recipeOutput);
        // 未知魔法粒
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, IFMUPItems.UNKNOWN_MAGIC.NUGGET.get(),9)
                .requires(IFMUPItemTags.INGOTS_UNKNOWN_MAGIC)
                .unlockedBy("has_unknown_magic_ingot_9", has(IFMUPItemTags.INGOTS_UNKNOWN_MAGIC))
                .save(recipeOutput);
        // 星以合金粒
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, IFMUPItems.STAR_ETHER_ALLOY.NUGGET.get(),9)
                .requires(IFMUPItemTags.INGOTS_STAR_ETHER_ALLOY)
                .unlockedBy("has_star_ether_alloy_ingot_9", has(IFMUPItemTags.INGOTS_STAR_ETHER_ALLOY))
                .save(recipeOutput);
    }

    /**
     * 检查物品标签
     */
    protected static Criterion<InventoryChangeTrigger.TriggerInstance> has(TagKey<Item> tag) {
        return InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(tag).build());
    }

    /**
     * 检查具体物品
     */
    protected static Criterion<InventoryChangeTrigger.TriggerInstance> has(Item item) {
        return InventoryChangeTrigger.TriggerInstance.hasItems(item);
    }

    protected static String getItemName(ItemLike item) {
        return item.asItem().getDescriptionId().replace("item.", "").replace(".", "_");
    }

    protected static String getHasName(ItemLike item) {
        return "has_" + getItemName(item);
    }

    protected static void oreSmelting(
            RecipeOutput recipeOutput, List<Ingredient> ingredients, RecipeCategory category, ItemLike result, float experience, int cookingTime, String group
    ) {
        oreCooking(
                recipeOutput,
                RecipeSerializer.SMELTING_RECIPE,
                SmeltingRecipe::new,
                ingredients,
                category,
                result,
                experience,
                cookingTime,
                group,
                "_from_smelting"
        );
    }

    protected static void oreBlasting(
            RecipeOutput recipeOutput, List<Ingredient> ingredients, RecipeCategory category, ItemLike result, float experience, int cookingTime, String group
    ) {
        oreCooking(
                recipeOutput,
                RecipeSerializer.BLASTING_RECIPE,
                BlastingRecipe::new,
                ingredients,
                category,
                result,
                experience,
                cookingTime,
                group,
                "_from_blasting"
        );
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(
            RecipeOutput recipeOutput,
            RecipeSerializer<T> serializer,
            AbstractCookingRecipe.Factory<T> recipeFactory,
            List<Ingredient> ingredients,
            RecipeCategory category,
            ItemLike result,
            float experience,
            int cookingTime,
            String group,
            String suffix
    ) {
        for (Ingredient ingredient : ingredients) {
            SimpleCookingRecipeBuilder.generic(ingredient, category, result, experience, cookingTime, serializer, recipeFactory)
                    .group(group)
                    .unlockedBy("has_" + group, has(result.asItem()))
                    .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(IndustrialForegoingMoreUpgradePlugins.MOD_ID, getItemName(result) + suffix + "_" + group));
        }
    }

    protected static void armorAndToolsRecipes(
            RecipeOutput recipeOutput, TagKey<Item> materialTag, TagKey<Item> rodTag,
            Item sword, Item pickaxe, Item axe, Item shovel, Item hoe,
            Item helmet, Item chestplate, Item leggings, Item boots
    ) {
        String materialName = materialTag.location().getPath();

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, sword)
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" B ")
                .define('A', materialTag)
                .define('B', rodTag)
                .unlockedBy("has_" + materialName, has(materialTag))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pickaxe)
                .pattern("AAA")
                .pattern(" B ")
                .pattern(" B ")
                .define('A', materialTag)
                .define('B', rodTag)
                .unlockedBy("has_" + materialName, has(materialTag))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, axe)
                .pattern("AA ")
                .pattern("AB ")
                .pattern(" B ")
                .define('A', materialTag)
                .define('B', rodTag)
                .unlockedBy("has_" + materialName, has(materialTag))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, shovel)
                .pattern(" A ")
                .pattern(" B ")
                .pattern(" B ")
                .define('A', materialTag)
                .define('B', rodTag)
                .unlockedBy("has_" + materialName, has(materialTag))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, hoe)
                .pattern("AA ")
                .pattern(" B ")
                .pattern(" B ")
                .define('A', materialTag)
                .define('B', rodTag)
                .unlockedBy("has_" + materialName, has(materialTag))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, helmet)
                .pattern("AAA")
                .pattern("A A")
                .define('A', materialTag)
                .unlockedBy("has_" + materialName, has(materialTag))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, chestplate)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', materialTag)
                .unlockedBy("has_" + materialName, has(materialTag))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, leggings)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', materialTag)
                .unlockedBy("has_" + materialName, has(materialTag))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, boots)
                .pattern("A A")
                .pattern("A A")
                .define('A', materialTag)
                .unlockedBy("has_" + materialName, has(materialTag))
                .save(recipeOutput);
    }
}
