//package com.chinaex123.ifmup.worldgen;
//
//import com.chinaex123.ifmup.IndustrialForegoingMoreUpgradePlugins;
//import net.minecraft.core.registries.Registries;
//import net.minecraft.world.level.levelgen.placement.PlacementModifierType;
//import net.neoforged.bus.api.IEventBus;
//import net.neoforged.neoforge.registries.DeferredRegister;
//
//import java.util.function.Supplier;
//
//public class ModPlacements {
//    public static final DeferredRegister<PlacementModifierType<?>> PLACEMENT_MODIFIERS =
//            DeferredRegister.create(Registries.PLACEMENT_MODIFIER_TYPE, IndustrialForegoingMoreUpgradePlugins.MOD_ID);
//
//    public static final Supplier<PlacementModifierType<ConfigurableCountPlacement>> CONFIGURABLE_COUNT =
//            PLACEMENT_MODIFIERS.register("configurable_count", () -> () -> ConfigurableCountPlacement.CODEC);
//
//    public static void register(IEventBus modEventBus) {
//        PLACEMENT_MODIFIERS.register(modEventBus);
//    }
//}
