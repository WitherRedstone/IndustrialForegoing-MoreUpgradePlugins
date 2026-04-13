package com.chinaex123.ifmup.data.recipes;

import com.buuz135.industrial.module.ModuleCore;
import com.buuz135.industrial.recipe.DissolutionChamberRecipe;
import com.chinaex123.ifmup.init.ModFluids;
import com.chinaex123.ifmup.init.ModItemTags;
import com.chinaex123.ifmup.init.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.fluids.FluidStack;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class DissolutionChamberRecipes {

    private final PackOutput output;
    private final CompletableFuture<HolderLookup.Provider> registries;

    public DissolutionChamberRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        this.output = output;
        this.registries = registries;
    }

    public void buildCraftingRecipes(@NotNull RecipeOutput recipeOutput) {
        // ==================== 矿石材料 ====================
        // 未知魔法锭
        DissolutionChamberRecipe.createRecipe(recipeOutput, "unknown_magic_ingot", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.INGOTS_IRON),
                        Ingredient.of(Tags.Items.INGOTS_IRON),
                        Ingredient.of(Tags.Items.INGOTS_IRON),
                        Ingredient.of(Tags.Items.INGOTS_IRON),
                        Ingredient.of(ModItems.UNKNOWN_DUST),
                        Ingredient.of(ModItems.UNKNOWN_DUST),
                        Ingredient.of(ModItems.UNKNOWN_DUST),
                        Ingredient.of(ModItems.UNKNOWN_DUST)
                ),
                new FluidStack(ModFluids.DARKSHINE.get(), 50),
                20 * 15,
                Optional.of(new ItemStack(ModItems.UNKNOWN_MAGIC.INGOT.get())),
                Optional.empty()
        ));
        // 暗影玫瑰锭
        DissolutionChamberRecipe.createRecipe(recipeOutput, "shadow_rose_ingot", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(ModItemTags.INGOT_SHADOW),
                        Ingredient.of(ModItemTags.INGOT_SHADOW),
                        Ingredient.of(ModItemTags.INGOT_SHADOW),
                        Ingredient.of(ModItemTags.INGOT_SHADOW),
                        Ingredient.of(Items.WITHER_ROSE),
                        Ingredient.of(Items.WITHER_ROSE),
                        Ingredient.of(Tags.Items.GEMS_DIAMOND),
                        Ingredient.of(Tags.Items.GEMS_DIAMOND)
                ),
                new FluidStack(ModuleCore.SLUDGE.getSourceFluid().get(), 500),
                20 * 15,
                Optional.of(new ItemStack(ModItems.SHADOW_ROSE.INGOT.get())),
                Optional.empty()
        ));
        // 星以合金锭
        DissolutionChamberRecipe.createRecipe(recipeOutput, "star_ether_alloy_ingot", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.NETHER_STARS),
                        Ingredient.of(Tags.Items.NETHER_STARS),
                        Ingredient.of(Tags.Items.NETHER_STARS),
                        Ingredient.of(Tags.Items.NETHER_STARS),
                        Ingredient.of(Tags.Items.INGOTS_NETHERITE),
                        Ingredient.of(Tags.Items.INGOTS_NETHERITE),
                        Ingredient.of(Tags.Items.GEMS_DIAMOND),
                        Ingredient.of(Tags.Items.GEMS_DIAMOND)
                ),
                new FluidStack(ModuleCore.ETHER.getSourceFluid().get(), 1000),
                20 * 15,
                Optional.of(new ItemStack(ModItems.STAR_ETHER_ALLOY.INGOT.get())),
                Optional.empty()
        ));


        // ==================== 速度升级 ====================
        DissolutionChamberRecipe.createRecipe(recipeOutput, "speed_addon_tier_3", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(ModItemTags.GEAR_SHADOW),
                        Ingredient.of(ModItemTags.GEAR_SHADOW),
                        Ingredient.of(Items.SUGAR),
                        Ingredient.of(Items.SUGAR)
                ),
                new FluidStack(ModuleCore.LATEX.getSourceFluid().get(), 1000),
                20 * 15,
                Optional.of(new ItemStack(ModItems.SPEED_ADDON_TIER_3.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "speed_addon_tier_4", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(ModItemTags.GEAR_NETHERITE_GEAR),
                        Ingredient.of(ModItemTags.GEAR_NETHERITE_GEAR),
                        Ingredient.of(Items.SUGAR),
                        Ingredient.of(Items.SUGAR)
                ),
                new FluidStack(ModuleCore.LATEX.getSourceFluid().get(), 1000),
                20 * 15,
                Optional.of(new ItemStack(ModItems.SPEED_ADDON_TIER_4.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "speed_addon_tier_5", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(ModItemTags.GEAR_UNKNOWN_MAGIC),
                        Ingredient.of(ModItemTags.GEAR_UNKNOWN_MAGIC),
                        Ingredient.of(Items.SUGAR),
                        Ingredient.of(Items.SUGAR)
                ),
                new FluidStack(ModFluids.DARKSHINE.get(), 500),
                20 * 15,
                Optional.of(new ItemStack(ModItems.SPEED_ADDON_TIER_5.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "speed_addon_tier_6", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(ModItemTags.GEAR_SHADOW_ROSE),
                        Ingredient.of(ModItemTags.GEAR_SHADOW_ROSE),
                        Ingredient.of(Items.SUGAR),
                        Ingredient.of(Items.SUGAR)
                ),
                new FluidStack(ModFluids.DARKSHINE.get(), 500),
                20 * 15,
                Optional.of(new ItemStack(ModItems.SPEED_ADDON_TIER_6.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "speed_addon_tier_7", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(ModItemTags.GEAR_NETHER_STAR_GEAR),
                        Ingredient.of(ModItemTags.GEAR_NETHER_STAR_GEAR),
                        Ingredient.of(Items.SUGAR),
                        Ingredient.of(Items.SUGAR)
                ),
                new FluidStack(ModFluids.DARKSHINE.get(), 500),
                20 * 15,
                Optional.of(new ItemStack(ModItems.SPEED_ADDON_TIER_7.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "speed_addon_tier_8", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(ModItemTags.GEAR_STAR_ETHER_ALLOY),
                        Ingredient.of(ModItemTags.GEAR_STAR_ETHER_ALLOY),
                        Ingredient.of(Items.SUGAR),
                        Ingredient.of(Items.SUGAR)
                ),
                new FluidStack(ModFluids.DARKSHINE.get(), 500),
                20 * 15,
                Optional.of(new ItemStack(ModItems.SPEED_ADDON_TIER_8.get())),
                Optional.empty()
        ));


        // ==================== 效率升级 ====================
        DissolutionChamberRecipe.createRecipe(recipeOutput, "efficiency_addon_tier_3", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(ModItemTags.GEAR_SHADOW),
                        Ingredient.of(ModItemTags.GEAR_SHADOW),
                        Ingredient.of(Tags.Items.RODS_BLAZE),
                        Ingredient.of(Tags.Items.RODS_BLAZE)
                ),
                new FluidStack(ModuleCore.LATEX.getSourceFluid().get(), 1000),
                20 * 15,
                Optional.of(new ItemStack(ModItems.EFFICIENCY_ADDON_TIER_3.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "efficiency_addon_tier_4", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(ModItemTags.GEAR_NETHERITE_GEAR),
                        Ingredient.of(ModItemTags.GEAR_NETHERITE_GEAR),
                        Ingredient.of(Tags.Items.RODS_BLAZE),
                        Ingredient.of(Tags.Items.RODS_BLAZE)
                ),
                new FluidStack(ModuleCore.LATEX.getSourceFluid().get(), 1000),
                20 * 15,
                Optional.of(new ItemStack(ModItems.EFFICIENCY_ADDON_TIER_4.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "efficiency_addon_tier_5", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(ModItemTags.GEAR_UNKNOWN_MAGIC),
                        Ingredient.of(ModItemTags.GEAR_UNKNOWN_MAGIC),
                        Ingredient.of(Tags.Items.RODS_BLAZE),
                        Ingredient.of(Tags.Items.RODS_BLAZE)
                ),
                new FluidStack(ModFluids.DARKSHINE.get(), 500),
                20 * 15,
                Optional.of(new ItemStack(ModItems.EFFICIENCY_ADDON_TIER_5.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "efficiency_addon_tier_6", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(ModItemTags.GEAR_SHADOW_ROSE),
                        Ingredient.of(ModItemTags.GEAR_SHADOW_ROSE),
                        Ingredient.of(Tags.Items.RODS_BLAZE),
                        Ingredient.of(Tags.Items.RODS_BLAZE)
                ),
                new FluidStack(ModFluids.DARKSHINE.get(), 500),
                20 * 15,
                Optional.of(new ItemStack(ModItems.EFFICIENCY_ADDON_TIER_6.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "efficiency_addon_tier_7", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(ModItemTags.GEAR_NETHER_STAR_GEAR),
                        Ingredient.of(ModItemTags.GEAR_NETHER_STAR_GEAR),
                        Ingredient.of(Tags.Items.RODS_BLAZE),
                        Ingredient.of(Tags.Items.RODS_BLAZE)
                ),
                new FluidStack(ModFluids.DARKSHINE.get(), 500),
                20 * 15,
                Optional.of(new ItemStack(ModItems.EFFICIENCY_ADDON_TIER_7.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "efficiency_addon_tier_8", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(ModItemTags.GEAR_STAR_ETHER_ALLOY),
                        Ingredient.of(ModItemTags.GEAR_STAR_ETHER_ALLOY),
                        Ingredient.of(Tags.Items.RODS_BLAZE),
                        Ingredient.of(Tags.Items.RODS_BLAZE)
                ),
                new FluidStack(ModFluids.DARKSHINE.get(), 500),
                20 * 15,
                Optional.of(new ItemStack(ModItems.EFFICIENCY_ADDON_TIER_8.get())),
                Optional.empty()
        ));


        // ==================== 处理升级 ====================
        DissolutionChamberRecipe.createRecipe(recipeOutput, "processing_addon_tier_3", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(ModItemTags.GEAR_SHADOW),
                        Ingredient.of(ModItemTags.GEAR_SHADOW),
                        Ingredient.of(Items.FURNACE),
                        Ingredient.of(Items.CRAFTING_TABLE)
                ),
                new FluidStack(ModuleCore.LATEX.getSourceFluid().get(), 1000),
                20 * 15,
                Optional.of(new ItemStack(ModItems.PROCESSING_ADDON_TIER_3.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "processing_addon_tier_4", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(ModItemTags.GEAR_NETHERITE_GEAR),
                        Ingredient.of(ModItemTags.GEAR_NETHERITE_GEAR),
                        Ingredient.of(Items.FURNACE),
                        Ingredient.of(Items.CRAFTING_TABLE)
                ),
                new FluidStack(ModuleCore.LATEX.getSourceFluid().get(), 1000),
                20 * 15,
                Optional.of(new ItemStack(ModItems.PROCESSING_ADDON_TIER_4.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "processing_addon_tier_5", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(ModItemTags.GEAR_UNKNOWN_MAGIC),
                        Ingredient.of(ModItemTags.GEAR_UNKNOWN_MAGIC),
                        Ingredient.of(Items.FURNACE),
                        Ingredient.of(Items.CRAFTING_TABLE)
                ),
                new FluidStack(ModFluids.DARKSHINE.get(), 500),
                20 * 15,
                Optional.of(new ItemStack(ModItems.PROCESSING_ADDON_TIER_5.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "processing_addon_tier_6", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(ModItemTags.GEAR_SHADOW_ROSE),
                        Ingredient.of(ModItemTags.GEAR_SHADOW_ROSE),
                        Ingredient.of(Items.FURNACE),
                        Ingredient.of(Items.CRAFTING_TABLE)
                ),
                new FluidStack(ModFluids.DARKSHINE.get(), 500),
                20 * 15,
                Optional.of(new ItemStack(ModItems.PROCESSING_ADDON_TIER_6.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "processing_addon_tier_7", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(ModItemTags.GEAR_NETHER_STAR_GEAR),
                        Ingredient.of(ModItemTags.GEAR_NETHER_STAR_GEAR),
                        Ingredient.of(Items.FURNACE),
                        Ingredient.of(Items.CRAFTING_TABLE)
                ),
                new FluidStack(ModFluids.DARKSHINE.get(), 500),
                20 * 15,
                Optional.of(new ItemStack(ModItems.PROCESSING_ADDON_TIER_7.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "processing_addon_tier_8", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(Items.GLASS_BOTTLE),
                        Ingredient.of(ModItemTags.GEAR_STAR_ETHER_ALLOY),
                        Ingredient.of(ModItemTags.GEAR_STAR_ETHER_ALLOY),
                        Ingredient.of(Items.FURNACE),
                        Ingredient.of(Items.CRAFTING_TABLE)
                ),
                new FluidStack(ModFluids.DARKSHINE.get(), 500),
                20 * 15,
                Optional.of(new ItemStack(ModItems.PROCESSING_ADDON_TIER_8.get())),
                Optional.empty()
        ));


        // ==================== 范围升级 ====================
    }
}
