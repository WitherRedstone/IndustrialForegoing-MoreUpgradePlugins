package com.chinaex123.ifmup.tooltop;

import com.chinaex123.ifmup.init.ModBlocks;
import com.chinaex123.ifmup.init.ModItems;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;

import java.util.List;

@EventBusSubscriber(modid = "ifmup")
public class ModTooltips {

    @SubscribeEvent
    public static void onItemTooltip(ItemTooltipEvent event) {
        ItemStack stack = event.getItemStack();
        List<Component> tooltip = event.getToolTip();

        // 未知粉
        if (stack.getItem() == ModItems.UNKNOWN_DUST.get()) {
            tooltip.add(Component.translatable("item.ifmup.unknown_dust.tooltip")
                    .withStyle(ChatFormatting.GREEN));
        }

        // 未知块
        if (stack.getItem() == ModBlocks.UNKNOWN_BLOCK.get().asItem()) {
            tooltip.add(Component.translatable("item.ifmup.unknown_block.tooltip")
                    .withStyle(ChatFormatting.GREEN));
        }

        // 粗暗影矿
        if (stack.getItem() == ModItems.SHADOW.RAW.get()) {
            tooltip.add(Component.translatable("item.ifmup.raw_shadow.tooltip")
                    .withStyle(ChatFormatting.GREEN));
        }
    }
}
