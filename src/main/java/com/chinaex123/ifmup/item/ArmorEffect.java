package com.chinaex123.ifmup.item;

import com.chinaex123.ifmup.IndustrialForegoingMoreUpgradePlugins;
import com.chinaex123.ifmup.init.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;

import java.util.List;

@EventBusSubscriber(modid = IndustrialForegoingMoreUpgradePlugins.MOD_ID)
public class ArmorEffect {

    @SubscribeEvent
    public static void onPlayerTick(PlayerTickEvent.Post event) {
        Player player = event.getEntity();

        if (player.level().isClientSide()) return;

        ItemStack helmet = player.getInventory().getArmor(3);
        ItemStack chestplate = player.getInventory().getArmor(2);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack boots = player.getInventory().getArmor(0);
        ItemStack mainHand = player.getMainHandItem();

        boolean isFullSet =
                helmet.is(ModItems.STAR_ETHER_ALLOY_HELMET.get()) &&
                        chestplate.is(ModItems.STAR_ETHER_ALLOY_CHESTPLATE.get()) &&
                        leggings.is(ModItems.STAR_ETHER_ALLOY_LEGGINGS.get()) &&
                        boots.is(ModItems.STAR_ETHER_ALLOY_BOOTS.get());

        if (isFullSet) {
            player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 20 * 10, 1, false, false));
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20 * 10, 0, false, false));

            if (mainHand.is(ModItems.STAR_ETHER_ALLOY_SWORD.get())) {
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20 * 10, 0, false, false));
            } else {
                player.removeEffect(MobEffects.DAMAGE_BOOST);
            }

            if (mainHand.is(ModItems.STAR_ETHER_ALLOY_PICKAXE.get())) {
                player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 20 * 10, 0, false, false));
            } else {
                player.removeEffect(MobEffects.DIG_SPEED);
            }
        } else {
            player.removeEffect(MobEffects.REGENERATION);
            player.removeEffect(MobEffects.DAMAGE_RESISTANCE);
            player.removeEffect(MobEffects.DAMAGE_BOOST);
            player.removeEffect(MobEffects.DIG_SPEED);
        }
    }

    @SubscribeEvent
    public static void onItemTooltip(ItemTooltipEvent event) {
        ItemStack stack = event.getItemStack();
        List<Component> tooltip = event.getToolTip();
        Player player = event.getEntity();

        boolean isStarEtherAlloyArmor =
                stack.is(ModItems.STAR_ETHER_ALLOY_HELMET.get()) ||
                        stack.is(ModItems.STAR_ETHER_ALLOY_CHESTPLATE.get()) ||
                        stack.is(ModItems.STAR_ETHER_ALLOY_LEGGINGS.get()) ||
                        stack.is(ModItems.STAR_ETHER_ALLOY_BOOTS.get());

        boolean isStarEtherAlloySword = stack.is(ModItems.STAR_ETHER_ALLOY_SWORD.get());
        boolean isStarEtherAlloyPickaxe = stack.is(ModItems.STAR_ETHER_ALLOY_PICKAXE.get());

        if (isStarEtherAlloyArmor || isStarEtherAlloySword || isStarEtherAlloyPickaxe) {
            tooltip.add(Component.translatable("tooltip.ifmup.star_ether_alloy_set"));

            if (player != null) {
                ItemStack helmet = player.getInventory().getArmor(3);
                ItemStack chestplate = player.getInventory().getArmor(2);
                ItemStack leggings = player.getInventory().getArmor(1);
                ItemStack boots = player.getInventory().getArmor(0);
                ItemStack mainHand = player.getMainHandItem();

                String helmetColor = helmet.is(ModItems.STAR_ETHER_ALLOY_HELMET.get()) ? "§a" : "§7";
                String chestplateColor = chestplate.is(ModItems.STAR_ETHER_ALLOY_CHESTPLATE.get()) ? "§a" : "§7";
                String leggingsColor = leggings.is(ModItems.STAR_ETHER_ALLOY_LEGGINGS.get()) ? "§a" : "§7";
                String bootsColor = boots.is(ModItems.STAR_ETHER_ALLOY_BOOTS.get()) ? "§a" : "§7";

                tooltip.add(Component.literal("  §7·" + helmetColor + ModItems.STAR_ETHER_ALLOY_HELMET.get().getDescription().getString()));
                tooltip.add(Component.literal("  §7·" + chestplateColor + ModItems.STAR_ETHER_ALLOY_CHESTPLATE.get().getDescription().getString()));
                tooltip.add(Component.literal("  §7·" + leggingsColor + ModItems.STAR_ETHER_ALLOY_LEGGINGS.get().getDescription().getString()));
                tooltip.add(Component.literal("  §7·" + bootsColor + ModItems.STAR_ETHER_ALLOY_BOOTS.get().getDescription().getString()));

                boolean isFullSet = helmet.is(ModItems.STAR_ETHER_ALLOY_HELMET.get()) &&
                        chestplate.is(ModItems.STAR_ETHER_ALLOY_CHESTPLATE.get()) &&
                        leggings.is(ModItems.STAR_ETHER_ALLOY_LEGGINGS.get()) &&
                        boots.is(ModItems.STAR_ETHER_ALLOY_BOOTS.get());

                if (isFullSet) {
                    tooltip.add(Component.translatable("tooltip.ifmup.star_ether_alloy_extra"));

                    String swordColor = mainHand.is(ModItems.STAR_ETHER_ALLOY_SWORD.get()) ? "§a" : "§7";
                    String pickaxeColor = mainHand.is(ModItems.STAR_ETHER_ALLOY_PICKAXE.get()) ? "§a" : "§7";

                    tooltip.add(Component.literal("  §7·" + swordColor + ModItems.STAR_ETHER_ALLOY_SWORD.get().getDescription().getString() + Component.translatable("tooltip.ifmup.star_ether_alloy_strength").getString()));
                    tooltip.add(Component.literal("  §7·" + pickaxeColor + ModItems.STAR_ETHER_ALLOY_PICKAXE.get().getDescription().getString() + Component.translatable("tooltip.ifmup.star_ether_alloy_haste").getString()));
                }
            }
        }
    }
}
