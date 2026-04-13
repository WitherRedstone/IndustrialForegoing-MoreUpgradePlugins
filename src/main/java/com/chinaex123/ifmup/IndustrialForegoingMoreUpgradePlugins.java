package com.chinaex123.ifmup;

import com.chinaex123.ifmup.config.ServerConfig;
import com.chinaex123.ifmup.init.ModBlocks;
import com.chinaex123.ifmup.init.ModCreativeTabs;
import com.chinaex123.ifmup.init.ModFluids;
import com.chinaex123.ifmup.init.ModItems;
import net.neoforged.fml.config.ModConfig;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(IndustrialForegoingMoreUpgradePlugins.MOD_ID)
public class IndustrialForegoingMoreUpgradePlugins {
    public static final String MOD_ID = "ifmup";
    public static final Logger LOGGER = LogUtils.getLogger();

    public IndustrialForegoingMoreUpgradePlugins(IEventBus modEventBus, ModContainer modContainer) {
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModFluids.FLUID_TYPES.register(modEventBus);
        ModFluids.FLUIDS.register(modEventBus);
        ModCreativeTabs.register(modEventBus);
        modContainer.registerConfig(ModConfig.Type.COMMON, ServerConfig.SPEC);
    }
}
