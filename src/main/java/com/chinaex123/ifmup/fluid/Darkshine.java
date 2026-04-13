package com.chinaex123.ifmup.fluid;

import com.chinaex123.ifmup.IndustrialForegoingMoreUpgradePlugins;
import com.chinaex123.ifmup.init.ModFluids;
import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;

@EventBusSubscriber(modid = IndustrialForegoingMoreUpgradePlugins.MOD_ID)
public class Darkshine {

    @SubscribeEvent
    public static void onPlayerTick(PlayerTickEvent.Post event) {
        Player player = event.getEntity();
        Level level = player.level();

        if (level.isClientSide()) return;

        BlockPos pos = player.blockPosition();
        boolean isInDarkshine = level.getFluidState(pos).is(ModFluids.DARKSHINE.get()) ||
                level.getFluidState(pos).is(ModFluids.FLOWING_DARKSHINE.get());

        if (isInDarkshine) {
            player.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 20 * 5, 0));
            player.addEffect(new MobEffectInstance(MobEffects.WITHER, 20 * 5, 1));
        }
    }
}
