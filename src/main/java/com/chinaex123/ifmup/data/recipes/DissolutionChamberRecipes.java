package com.chinaex123.ifmup.data.recipes;

import com.buuz135.industrial.module.ModuleCore;
import com.buuz135.industrial.recipe.DissolutionChamberRecipe;
import com.chinaex123.ifmup.init.IFMUPFluids;
import com.chinaex123.ifmup.init.IFMUPItems;
import com.chinaex123.ifmup.init.IFMUPItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
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
                        Ingredient.of(IFMUPItems.UNKNOWN_DUST),
                        Ingredient.of(IFMUPItems.UNKNOWN_DUST),
                        Ingredient.of(IFMUPItems.UNKNOWN_DUST),
                        Ingredient.of(IFMUPItems.UNKNOWN_DUST)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 50),
                20 * 15,
                Optional.of(new ItemStack(IFMUPItems.UNKNOWN_MAGIC.INGOT.get())),
                Optional.empty()
        ));
        // 暗影玫瑰锭
        DissolutionChamberRecipe.createRecipe(recipeOutput, "shadow_rose_ingot", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(IFMUPItemTags.INGOTS_SHADOW),
                        Ingredient.of(IFMUPItemTags.INGOTS_SHADOW),
                        Ingredient.of(IFMUPItemTags.INGOTS_SHADOW),
                        Ingredient.of(IFMUPItemTags.INGOTS_SHADOW),
                        Ingredient.of(Items.WITHER_ROSE),
                        Ingredient.of(Items.WITHER_ROSE),
                        Ingredient.of(Tags.Items.GEMS_DIAMOND),
                        Ingredient.of(Tags.Items.GEMS_DIAMOND)
                ),
                new FluidStack(ModuleCore.SLUDGE.getSourceFluid().get(), 250),
                20 * 15,
                Optional.of(new ItemStack(IFMUPItems.SHADOW_ROSE.INGOT.get())),
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
                Optional.of(new ItemStack(IFMUPItems.STAR_ETHER_ALLOY.INGOT.get())),
                Optional.empty()
        ));


        // ==================== 速度升级 ====================
        DissolutionChamberRecipe.createRecipe(recipeOutput, "speed_addon_tier_3", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(IFMUPItemTags.GEARS_SHADOW),
                        Ingredient.of(IFMUPItemTags.GEARS_SHADOW),
                        Ingredient.of(Items.SUGAR),
                        Ingredient.of(Items.SUGAR)
                ),
                new FluidStack(ModuleCore.LATEX.getSourceFluid().get(), 1000),
                20 * 15,
                Optional.of(new ItemStack(IFMUPItems.SPEED_ADDON_TIER_3.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "speed_addon_tier_4", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(IFMUPItemTags.GEAR_NETHERITE_GEAR),
                        Ingredient.of(IFMUPItemTags.GEAR_NETHERITE_GEAR),
                        Ingredient.of(Items.SUGAR),
                        Ingredient.of(Items.SUGAR)
                ),
                new FluidStack(ModuleCore.LATEX.getSourceFluid().get(), 1000),
                20 * 15,
                Optional.of(new ItemStack(IFMUPItems.SPEED_ADDON_TIER_4.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "speed_addon_tier_5", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(IFMUPItemTags.GEARS_UNKNOWN_MAGIC),
                        Ingredient.of(IFMUPItemTags.GEARS_UNKNOWN_MAGIC),
                        Ingredient.of(Items.SUGAR),
                        Ingredient.of(Items.SUGAR)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 50),
                20 * 15,
                Optional.of(new ItemStack(IFMUPItems.SPEED_ADDON_TIER_5.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "speed_addon_tier_6", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(IFMUPItemTags.GEARS_SHADOW_ROSE),
                        Ingredient.of(IFMUPItemTags.GEARS_SHADOW_ROSE),
                        Ingredient.of(Items.SUGAR),
                        Ingredient.of(Items.SUGAR)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 250),
                20 * 15,
                Optional.of(new ItemStack(IFMUPItems.SPEED_ADDON_TIER_6.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "speed_addon_tier_7", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(IFMUPItemTags.GEAR_NETHER_STAR_GEAR),
                        Ingredient.of(IFMUPItemTags.GEAR_NETHER_STAR_GEAR),
                        Ingredient.of(Items.SUGAR),
                        Ingredient.of(Items.SUGAR)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 500),
                20 * 15,
                Optional.of(new ItemStack(IFMUPItems.SPEED_ADDON_TIER_7.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "speed_addon_tier_8", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(IFMUPItemTags.GEARS_STAR_ETHER_ALLOY),
                        Ingredient.of(IFMUPItemTags.GEARS_STAR_ETHER_ALLOY),
                        Ingredient.of(Items.SUGAR),
                        Ingredient.of(Items.SUGAR)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 1000),
                20 * 15,
                Optional.of(new ItemStack(IFMUPItems.SPEED_ADDON_TIER_8.get())),
                Optional.empty()
        ));


        // ==================== 效率升级 ====================
        DissolutionChamberRecipe.createRecipe(recipeOutput, "efficiency_addon_tier_3", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(IFMUPItemTags.GEARS_SHADOW),
                        Ingredient.of(IFMUPItemTags.GEARS_SHADOW),
                        Ingredient.of(Tags.Items.RODS_BLAZE),
                        Ingredient.of(Tags.Items.RODS_BLAZE)
                ),
                new FluidStack(ModuleCore.LATEX.getSourceFluid().get(), 1000),
                20 * 15,
                Optional.of(new ItemStack(IFMUPItems.EFFICIENCY_ADDON_TIER_3.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "efficiency_addon_tier_4", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(IFMUPItemTags.GEAR_NETHERITE_GEAR),
                        Ingredient.of(IFMUPItemTags.GEAR_NETHERITE_GEAR),
                        Ingredient.of(Tags.Items.RODS_BLAZE),
                        Ingredient.of(Tags.Items.RODS_BLAZE)
                ),
                new FluidStack(ModuleCore.LATEX.getSourceFluid().get(), 1000),
                20 * 15,
                Optional.of(new ItemStack(IFMUPItems.EFFICIENCY_ADDON_TIER_4.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "efficiency_addon_tier_5", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(IFMUPItemTags.GEARS_UNKNOWN_MAGIC),
                        Ingredient.of(IFMUPItemTags.GEARS_UNKNOWN_MAGIC),
                        Ingredient.of(Tags.Items.RODS_BLAZE),
                        Ingredient.of(Tags.Items.RODS_BLAZE)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 50),
                20 * 15,
                Optional.of(new ItemStack(IFMUPItems.EFFICIENCY_ADDON_TIER_5.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "efficiency_addon_tier_6", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(IFMUPItemTags.GEARS_SHADOW_ROSE),
                        Ingredient.of(IFMUPItemTags.GEARS_SHADOW_ROSE),
                        Ingredient.of(Tags.Items.RODS_BLAZE),
                        Ingredient.of(Tags.Items.RODS_BLAZE)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 250),
                20 * 15,
                Optional.of(new ItemStack(IFMUPItems.EFFICIENCY_ADDON_TIER_6.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "efficiency_addon_tier_7", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(IFMUPItemTags.GEAR_NETHER_STAR_GEAR),
                        Ingredient.of(IFMUPItemTags.GEAR_NETHER_STAR_GEAR),
                        Ingredient.of(Tags.Items.RODS_BLAZE),
                        Ingredient.of(Tags.Items.RODS_BLAZE)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 500),
                20 * 15,
                Optional.of(new ItemStack(IFMUPItems.EFFICIENCY_ADDON_TIER_7.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "efficiency_addon_tier_8", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(IFMUPItemTags.GEARS_STAR_ETHER_ALLOY),
                        Ingredient.of(IFMUPItemTags.GEARS_STAR_ETHER_ALLOY),
                        Ingredient.of(Tags.Items.RODS_BLAZE),
                        Ingredient.of(Tags.Items.RODS_BLAZE)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 1000),
                20 * 15,
                Optional.of(new ItemStack(IFMUPItems.EFFICIENCY_ADDON_TIER_8.get())),
                Optional.empty()
        ));


        // ==================== 处理升级 ====================
        DissolutionChamberRecipe.createRecipe(recipeOutput, "processing_addon_tier_3", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(IFMUPItemTags.GEARS_SHADOW),
                        Ingredient.of(IFMUPItemTags.GEARS_SHADOW),
                        Ingredient.of(Items.FURNACE),
                        Ingredient.of(Items.CRAFTING_TABLE)
                ),
                new FluidStack(ModuleCore.LATEX.getSourceFluid().get(), 1000),
                20 * 15,
                Optional.of(new ItemStack(IFMUPItems.PROCESSING_ADDON_TIER_3.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "processing_addon_tier_4", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(IFMUPItemTags.GEAR_NETHERITE_GEAR),
                        Ingredient.of(IFMUPItemTags.GEAR_NETHERITE_GEAR),
                        Ingredient.of(Items.FURNACE),
                        Ingredient.of(Items.CRAFTING_TABLE)
                ),
                new FluidStack(ModuleCore.LATEX.getSourceFluid().get(), 1000),
                20 * 15,
                Optional.of(new ItemStack(IFMUPItems.PROCESSING_ADDON_TIER_4.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "processing_addon_tier_5", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(IFMUPItemTags.GEARS_UNKNOWN_MAGIC),
                        Ingredient.of(IFMUPItemTags.GEARS_UNKNOWN_MAGIC),
                        Ingredient.of(Items.FURNACE),
                        Ingredient.of(Items.CRAFTING_TABLE)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 50),
                20 * 15,
                Optional.of(new ItemStack(IFMUPItems.PROCESSING_ADDON_TIER_5.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "processing_addon_tier_6", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(IFMUPItemTags.GEARS_SHADOW_ROSE),
                        Ingredient.of(IFMUPItemTags.GEARS_SHADOW_ROSE),
                        Ingredient.of(Items.FURNACE),
                        Ingredient.of(Items.CRAFTING_TABLE)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 250),
                20 * 15,
                Optional.of(new ItemStack(IFMUPItems.PROCESSING_ADDON_TIER_6.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "processing_addon_tier_7", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(IFMUPItemTags.GEAR_NETHER_STAR_GEAR),
                        Ingredient.of(IFMUPItemTags.GEAR_NETHER_STAR_GEAR),
                        Ingredient.of(Items.FURNACE),
                        Ingredient.of(Items.CRAFTING_TABLE)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 500),
                20 * 15,
                Optional.of(new ItemStack(IFMUPItems.PROCESSING_ADDON_TIER_7.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "processing_addon_tier_8", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(IFMUPItemTags.GEARS_STAR_ETHER_ALLOY),
                        Ingredient.of(IFMUPItemTags.GEARS_STAR_ETHER_ALLOY),
                        Ingredient.of(Items.FURNACE),
                        Ingredient.of(Items.CRAFTING_TABLE)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 1000),
                20 * 15,
                Optional.of(new ItemStack(IFMUPItems.PROCESSING_ADDON_TIER_8.get())),
                Optional.empty()
        ));


        // ==================== 范围升级 ====================
        DissolutionChamberRecipe.createRecipe(recipeOutput, "range_addon_tier_12", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE)
                ),
                new FluidStack(ModuleCore.LATEX.getSourceFluid().get(), 1000),
                20 * 10,
                Optional.of(new ItemStack(IFMUPItems.RANGE_ADDON_TIER_12.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "range_addon_tier_13", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.DUSTS_GLOWSTONE),
                        Ingredient.of(Tags.Items.DUSTS_GLOWSTONE),
                        Ingredient.of(Tags.Items.DUSTS_GLOWSTONE),
                        Ingredient.of(Tags.Items.DUSTS_GLOWSTONE)
                ),
                new FluidStack(ModuleCore.LATEX.getSourceFluid().get(), 1000),
                20 * 10,
                Optional.of(new ItemStack(IFMUPItems.RANGE_ADDON_TIER_13.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "range_addon_tier_14", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.FEATHERS),
                        Ingredient.of(Tags.Items.FEATHERS),
                        Ingredient.of(Tags.Items.FEATHERS),
                        Ingredient.of(Tags.Items.FEATHERS)
                ),
                new FluidStack(ModuleCore.LATEX.getSourceFluid().get(), 1000),
                20 * 10,
                Optional.of(new ItemStack(IFMUPItems.RANGE_ADDON_TIER_14.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "range_addon_tier_15", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Items.SPIDER_EYE),
                        Ingredient.of(Items.SPIDER_EYE),
                        Ingredient.of(Items.SPIDER_EYE),
                        Ingredient.of(Items.SPIDER_EYE)
                ),
                new FluidStack(ModuleCore.LATEX.getSourceFluid().get(), 1000),
                20 * 10,
                Optional.of(new ItemStack(IFMUPItems.RANGE_ADDON_TIER_15.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "range_addon_tier_16", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.SLIME_BALLS),
                        Ingredient.of(Tags.Items.SLIME_BALLS),
                        Ingredient.of(Tags.Items.SLIME_BALLS),
                        Ingredient.of(Tags.Items.SLIME_BALLS)
                ),
                new FluidStack(ModuleCore.LATEX.getSourceFluid().get(), 1000),
                20 * 10,
                Optional.of(new ItemStack(IFMUPItems.RANGE_ADDON_TIER_16.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "range_addon_tier_17", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Items.GHAST_TEAR),
                        Ingredient.of(Items.GHAST_TEAR),
                        Ingredient.of(Items.GHAST_TEAR),
                        Ingredient.of(Items.GHAST_TEAR)
                ),
                new FluidStack(ModuleCore.LATEX.getSourceFluid().get(), 1000),
                20 * 10,
                Optional.of(new ItemStack(IFMUPItems.RANGE_ADDON_TIER_17.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "range_addon_tier_18", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Items.SEA_LANTERN),
                        Ingredient.of(Items.SEA_LANTERN),
                        Ingredient.of(Items.SEA_LANTERN),
                        Ingredient.of(Items.SEA_LANTERN)
                ),
                new FluidStack(ModuleCore.LATEX.getSourceFluid().get(), 1000),
                20 * 10,
                Optional.of(new ItemStack(IFMUPItems.RANGE_ADDON_TIER_18.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "range_addon_tier_19", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GEMS_AMETHYST),
                        Ingredient.of(Tags.Items.GEMS_AMETHYST),
                        Ingredient.of(Tags.Items.GEMS_AMETHYST),
                        Ingredient.of(Tags.Items.GEMS_AMETHYST)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 50),
                20 * 10,
                Optional.of(new ItemStack(IFMUPItems.RANGE_ADDON_TIER_19.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "range_addon_tier_20", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Items.EXPERIENCE_BOTTLE),
                        Ingredient.of(Items.EXPERIENCE_BOTTLE),
                        Ingredient.of(Items.EXPERIENCE_BOTTLE),
                        Ingredient.of(Items.EXPERIENCE_BOTTLE)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 50),
                20 * 10,
                Optional.of(new ItemStack(IFMUPItems.RANGE_ADDON_TIER_20.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "range_addon_tier_21", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.FERTILIZERS),
                        Ingredient.of(Tags.Items.FERTILIZERS),
                        Ingredient.of(Tags.Items.FERTILIZERS),
                        Ingredient.of(Tags.Items.FERTILIZERS)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 50),
                20 * 10,
                Optional.of(new ItemStack(IFMUPItems.RANGE_ADDON_TIER_21.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "range_addon_tier_22", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plastics"))),
                        Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plastics"))),
                        Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plastics"))),
                        Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plastics")))
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 50),
                20 * 10,
                Optional.of(new ItemStack(IFMUPItems.RANGE_ADDON_TIER_22.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "range_addon_tier_23", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Items.NAUTILUS_SHELL),
                        Ingredient.of(Items.NAUTILUS_SHELL),
                        Ingredient.of(Items.NAUTILUS_SHELL),
                        Ingredient.of(Items.NAUTILUS_SHELL)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 50),
                20 * 10,
                Optional.of(new ItemStack(IFMUPItems.RANGE_ADDON_TIER_23.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "range_addon_tier_24", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Items.ECHO_SHARD),
                        Ingredient.of(Items.ECHO_SHARD),
                        Ingredient.of(Items.ECHO_SHARD),
                        Ingredient.of(Items.ECHO_SHARD)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 50),
                20 * 10,
                Optional.of(new ItemStack(IFMUPItems.RANGE_ADDON_TIER_24.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "range_addon_tier_25", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Items.PHANTOM_MEMBRANE),
                        Ingredient.of(Items.PHANTOM_MEMBRANE),
                        Ingredient.of(Items.PHANTOM_MEMBRANE),
                        Ingredient.of(Items.PHANTOM_MEMBRANE)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 500),
                20 * 10,
                Optional.of(new ItemStack(IFMUPItems.RANGE_ADDON_TIER_25.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "range_addon_tier_26", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Items.DRAGON_BREATH),
                        Ingredient.of(Items.DRAGON_BREATH),
                        Ingredient.of(Items.DRAGON_BREATH),
                        Ingredient.of(Items.DRAGON_BREATH)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 250),
                20 * 10,
                Optional.of(new ItemStack(IFMUPItems.RANGE_ADDON_TIER_26.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "range_addon_tier_27", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Items.RABBIT_FOOT),
                        Ingredient.of(Items.RABBIT_FOOT),
                        Ingredient.of(Items.RABBIT_FOOT),
                        Ingredient.of(Items.RABBIT_FOOT)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 250),
                20 * 10,
                Optional.of(new ItemStack(IFMUPItems.RANGE_ADDON_TIER_27.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "range_addon_tier_28", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(IFMUPItemTags.INGOTS_SHADOW),
                        Ingredient.of(IFMUPItemTags.INGOTS_SHADOW),
                        Ingredient.of(IFMUPItemTags.INGOTS_SHADOW),
                        Ingredient.of(IFMUPItemTags.INGOTS_SHADOW)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 250),
                20 * 10,
                Optional.of(new ItemStack(IFMUPItems.RANGE_ADDON_TIER_28.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "range_addon_tier_29", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.INGOTS_NETHERITE),
                        Ingredient.of(Tags.Items.INGOTS_NETHERITE),
                        Ingredient.of(Tags.Items.INGOTS_NETHERITE),
                        Ingredient.of(Tags.Items.INGOTS_NETHERITE)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 500),
                20 * 10,
                Optional.of(new ItemStack(IFMUPItems.RANGE_ADDON_TIER_29.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "range_addon_tier_30", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(IFMUPItemTags.INGOTS_UNKNOWN_MAGIC),
                        Ingredient.of(IFMUPItemTags.INGOTS_UNKNOWN_MAGIC),
                        Ingredient.of(IFMUPItemTags.INGOTS_UNKNOWN_MAGIC),
                        Ingredient.of(IFMUPItemTags.INGOTS_UNKNOWN_MAGIC)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 500),
                20 * 10,
                Optional.of(new ItemStack(IFMUPItems.RANGE_ADDON_TIER_30.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "range_addon_tier_31", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(IFMUPItemTags.INGOTS_SHADOW_ROSE),
                        Ingredient.of(IFMUPItemTags.INGOTS_SHADOW_ROSE),
                        Ingredient.of(IFMUPItemTags.INGOTS_SHADOW_ROSE),
                        Ingredient.of(IFMUPItemTags.INGOTS_SHADOW_ROSE)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 500),
                20 * 10,
                Optional.of(new ItemStack(IFMUPItems.RANGE_ADDON_TIER_31.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "range_addon_tier_47", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.NETHER_STARS),
                        Ingredient.of(Tags.Items.NETHER_STARS),
                        Ingredient.of(Tags.Items.NETHER_STARS),
                        Ingredient.of(Tags.Items.NETHER_STARS)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 1000),
                20 * 10,
                Optional.of(new ItemStack(IFMUPItems.RANGE_ADDON_TIER_47.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "range_addon_tier_63", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(IFMUPItemTags.STORAGE_BLOCKS_SHADOW_ROSE),
                        Ingredient.of(IFMUPItemTags.STORAGE_BLOCKS_SHADOW_ROSE),
                        Ingredient.of(IFMUPItemTags.STORAGE_BLOCKS_SHADOW_ROSE),
                        Ingredient.of(IFMUPItemTags.STORAGE_BLOCKS_SHADOW_ROSE)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 1000),
                20 * 10,
                Optional.of(new ItemStack(IFMUPItems.RANGE_ADDON_TIER_63.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "range_addon_tier_71", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(IFMUPItemTags.INGOTS_STAR_ETHER_ALLOY),
                        Ingredient.of(IFMUPItemTags.INGOTS_STAR_ETHER_ALLOY),
                        Ingredient.of(IFMUPItemTags.INGOTS_STAR_ETHER_ALLOY),
                        Ingredient.of(IFMUPItemTags.INGOTS_STAR_ETHER_ALLOY)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 1000),
                20 * 10,
                Optional.of(new ItemStack(IFMUPItems.RANGE_ADDON_TIER_71.get())),
                Optional.empty()
        ));
        DissolutionChamberRecipe.createRecipe(recipeOutput, "range_addon_tier_79", new DissolutionChamberRecipe(
                List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(Tags.Items.GLASS_PANES),
                        Ingredient.of(IFMUPItemTags.STORAGE_BLOCKS_STAR_ETHER_ALLOY),
                        Ingredient.of(IFMUPItemTags.STORAGE_BLOCKS_STAR_ETHER_ALLOY),
                        Ingredient.of(IFMUPItemTags.STORAGE_BLOCKS_STAR_ETHER_ALLOY),
                        Ingredient.of(IFMUPItemTags.STORAGE_BLOCKS_STAR_ETHER_ALLOY)
                ),
                new FluidStack(IFMUPFluids.DARKSHINE.get(), 1000),
                20 * 10,
                Optional.of(new ItemStack(IFMUPItems.RANGE_ADDON_TIER_79.get())),
                Optional.empty()
        ));
    }
}
