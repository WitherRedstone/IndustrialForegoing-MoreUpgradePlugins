package com.chinaex123.ifmup.data.recipes;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModRecipesProvider extends RecipeProvider implements IConditionBuilder {

    private final ModCraftingRecipes craftingRecipes;
    private final DissolutionChamberRecipes dissolutionChamberRecipes;
    private final LaserDrillFluidRecipes laserDrillFluidRecipes;

    public ModRecipesProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);

        // 初始化各个配方类
        this.craftingRecipes = new ModCraftingRecipes(output, registries);
        this.dissolutionChamberRecipes = new DissolutionChamberRecipes(output, registries);
        this.laserDrillFluidRecipes = new LaserDrillFluidRecipes(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        // 调用各个配方类的注册方法
        craftingRecipes.buildCraftingRecipes(recipeOutput);
        dissolutionChamberRecipes.buildCraftingRecipes(recipeOutput);
        laserDrillFluidRecipes.buildCraftingRecipes(recipeOutput);
    }
}
