package com.chinaex123.ifmup.init;

import com.chinaex123.ifmup.IndustrialForegoingMoreUpgradePlugins;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class ModFluids {
    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, IndustrialForegoingMoreUpgradePlugins.MOD_ID);
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(BuiltInRegistries.FLUID, IndustrialForegoingMoreUpgradePlugins.MOD_ID);

    public static ResourceLocation id(String name) {
        return ResourceLocation.tryBuild(IndustrialForegoingMoreUpgradePlugins.MOD_ID, name);
    }

    // ==================== 流体ID ====================
    // 黯曜
    public static final ResourceLocation DARKSHINE_ID = ModFluids.id("darkshine");
    public static final ResourceLocation FLOWING_DARKSHINE_ID = ModFluids.id("flowing_darkshine");


    // ==================== 流体属性 ====================
    // 参数：流体 ID，掉落伤害，光亮等级，滋润耕地，无限生成
    // 黯曜
    public static final Supplier<FluidType> DARKSHINE_TYPE =
            FLUID_TYPES.register("darkshine", () -> new ModFluidTypes(DARKSHINE_ID, 0, 3, false, false));


    // ==================== 流体 属性 ====================
    public static BaseFlowingFluid.Properties DARKSHINE_PROPERTIES; // 黯曜


    // ==================== 流体 物理和行为====================
    // 黯曜
    public static final Supplier<BaseFlowingFluid.Source> DARKSHINE =
            FLUIDS.register("darkshine", () -> new BaseFlowingFluid.Source(ModFluids.DARKSHINE_PROPERTIES));
    public static final Supplier<BaseFlowingFluid.Flowing> FLOWING_DARKSHINE =
            FLUIDS.register("flowing_darkshine", () -> new BaseFlowingFluid.Flowing(ModFluids.DARKSHINE_PROPERTIES));


    static {
        // ==================== 流体 ====================
        // 黯曜
        DARKSHINE_PROPERTIES = new BaseFlowingFluid.Properties(
                DARKSHINE_TYPE,
                DARKSHINE,
                FLOWING_DARKSHINE
        ).bucket(ModItems.DARKSHINE_BUCKET)
                .block(ModBlocks.DARKSHINE_FLUID)
                .explosionResistance(100.0F) // 抗爆性
                .slopeFindDistance(4) // 流动查找距离
                .levelDecreasePerBlock(1) // 液面下降等级
                .tickRate(10); // 流动速度
    }
}
