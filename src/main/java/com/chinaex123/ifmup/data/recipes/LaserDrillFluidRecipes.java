package com.chinaex123.ifmup.data.recipes;

import com.buuz135.industrial.recipe.LaserDrillFluidRecipe;
import com.buuz135.industrial.recipe.LaserDrillRarity;
import com.buuz135.industrial.recipe.data.EntityData;
import com.chinaex123.ifmup.init.ModFluids;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.material.Fluids;
import net.neoforged.neoforge.fluids.crafting.FluidIngredient;
import net.neoforged.neoforge.fluids.crafting.SizedFluidIngredient;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class LaserDrillFluidRecipes {

    private final PackOutput output;
    private final CompletableFuture<HolderLookup.Provider> registries;

    public LaserDrillFluidRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        this.output = output;
        this.registries = registries;
    }

    public void buildCraftingRecipes(@NotNull RecipeOutput recipeOutput) {

        // 黯曜
        LaserDrillFluidRecipe.createRecipe(recipeOutput, "darkshine", "ifmup", new LaserDrillFluidRecipe(
                // 输出物品，数量，颜色，实体数据
                new SizedFluidIngredient(FluidIngredient.of(ModFluids.DARKSHINE.get()), 10), 11, Optional.of(EntityData.of(EntityType.WARDEN)),
                // 生成条件
                new LaserDrillRarity(
                        new LaserDrillRarity.BiomeRarity(  // 生物群系要求
                                List.of(TagKey.create(Registries.BIOME, ResourceLocation.parse("minecraft:has_structure/ancient_city"))),
                                List.of()  // 黑名单
                        ),
                        new LaserDrillRarity.DimensionRarity(List.of(BuiltinDimensionTypes.OVERWORLD), List.of()),  // 维度要求
                        -64, -16, 8 // 最小Y坐标，最大Y坐标，权重
                ))
        );

        /*
          0 白色 (White)
          1	橙色 (Orange)
          2	品红色 (Magenta)
          3	淡蓝色 (Light Blue)
          4	黄色 (Yellow)
          5	黄绿色 (Lime)
          6	粉红色 (Pink)
          7	灰色 (Gray)
          8	淡灰色 (Light Gray)
          9	青色 (Cyan)
          10 紫色 (Purple)
          11 蓝色 (Blue)
          12 棕色 (Brown)
          13 绿色 (Green)
          14 红色 (Red)
          15 黑色 (Black)
         */

    }
}
