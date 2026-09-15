package com.chinaex123.ifmup;

import com.chinaex123.ifmup.config.IFMUPServerConfig;
import com.chinaex123.ifmup.init.*;
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
        IFMUPBlocks.register(modEventBus);
        IFMUPItems.register(modEventBus);
        IFMUPFluids.FLUID_TYPES.register(modEventBus);
        IFMUPFluids.FLUIDS.register(modEventBus);
        IFMUPCreativeTabs.register(modEventBus);
        modContainer.registerConfig(ModConfig.Type.COMMON, IFMUPServerConfig.SPEC);
    }
}
