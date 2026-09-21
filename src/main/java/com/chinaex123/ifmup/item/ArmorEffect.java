package com.chinaex123.ifmup.item;

import com.chinaex123.ifmup.IndustrialForegoingMoreUpgradePlugins;
import com.chinaex123.ifmup.init.IFMUPItems;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;

import java.util.List;

/**
 * 星以太合金套装效果处理类。
 * <p>
 * 功能：
 * 1. 玩家穿戴整套星以太合金护甲时，持续给予生命恢复、抗性提升等 Buff；
 * 2. 若主手拿着星以太合金剑，额外给予力量 Buff；
 * 3. 若主手拿着星以太合金镐，额外给予急迫 Buff；
 * 4. 为星以太合金护甲、剑、镐添加对应的物品提示（Tooltip）。
 *
 */
@EventBusSubscriber(modid = IndustrialForegoingMoreUpgradePlugins.MOD_ID)
public class ArmorEffect {

    /** 持续时间 */
    private static final int BUFF_DURATION = 120;
    /** 效果检测间隔（tick），20 = 每秒检测一次 */
    private static final int TICK_INTERVAL = 60;
    /** 整套护甲要求的件数 */
    private static final int FULL_SET_SIZE = 4;

    /**
     * 护甲顺序：头盔(0) → 胸甲(1) → 护腿(2) → 靴子(3)，
     * 与玩家背包 getArmor(int) 的索引方向相反。
     * <p>
     * 注意：getArmor(int) 中 0 是靴子、3 是头盔，
     * 因此下面遍历时会用 FULL_SET_SIZE - 1 - i 做一次反转。
     */
    private static final List<DeferredItem<Item>> STAR_ETHER_ARMOR_ITEMS = List.of(
            IFMUPItems.STAR_ETHER_ALLOY_HELMET,
            IFMUPItems.STAR_ETHER_ALLOY_CHESTPLATE,
            IFMUPItems.STAR_ETHER_ALLOY_LEGGINGS,
            IFMUPItems.STAR_ETHER_ALLOY_BOOTS
    );

    /** 星以太合金剑 */
    private static final DeferredItem<Item> STAR_ETHER_SWORD = IFMUPItems.STAR_ETHER_ALLOY_SWORD;
    /** 星以太合金镐 */
    private static final DeferredItem<Item> STAR_ETHER_PICKAXE = IFMUPItems.STAR_ETHER_ALLOY_PICKAXE;

    /**
     * 玩家每 tick 触发一次，用于维持或移除套装 Buff。
     * <p>
     * 只在服务端执行，避免客户端重复添加效果。
     * 每次都会重新给予短时长效果，从而保证玩家脱下装备后效果会自然消失。
     *
     * @param event 玩家 tick 事件
     */
    @SubscribeEvent
    public static void onPlayerTick(PlayerTickEvent.Post event) {
        Player player = event.getEntity();

        // 只在服务端处理，客户端无需同步执行
        if (player.level().isClientSide()) return;

        ItemStack mainHand = player.getMainHandItem();
        boolean isFullSet = countMatchingArmor(player) == FULL_SET_SIZE;

        boolean shouldRefresh = player.tickCount % TICK_INTERVAL == 0;

        if (isFullSet) {
            // 穿戴整套：立刻给予效果（身上没有时）或每秒刷新时长
            if (shouldRefresh || !player.hasEffect(MobEffects.REGENERATION)) {
                player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, BUFF_DURATION, 1, true, true));
            }
            if (shouldRefresh || !player.hasEffect(MobEffects.DAMAGE_RESISTANCE)) {
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, BUFF_DURATION, 0, true, true));
            }

            applyOrRemoveEffect(player, mainHand.is(STAR_ETHER_SWORD.get()), shouldRefresh,
                    MobEffects.DAMAGE_BOOST, BUFF_DURATION, 0);
            applyOrRemoveEffect(player, mainHand.is(STAR_ETHER_PICKAXE.get()), shouldRefresh,
                    MobEffects.DIG_SPEED, BUFF_DURATION, 0);
        } else {
            removeSetEffect(player, MobEffects.REGENERATION, 1);
            removeSetEffect(player, MobEffects.DAMAGE_RESISTANCE, 0);
            removeSetEffect(player, MobEffects.DAMAGE_BOOST, 0);
            removeSetEffect(player, MobEffects.DIG_SPEED, 0);
        }
    }

    /**
     * 为物品添加 Tooltip 提示。
     * <p>
     * 规则：
     * 1. 护甲：始终显示套装说明与穿戴进度；
     * 2. 剑/镐：只有玩家已穿戴整套护甲时才显示；
     * 3. 整套穿戴后，额外显示武器加成说明。
     *
     * @param event 物品 Tooltip 事件
     */
    @SubscribeEvent
    public static void onItemTooltip(ItemTooltipEvent event) {
        ItemStack stack = event.getItemStack();
        List<Component> tooltip = event.getToolTip();
        Player player = event.getEntity();

        boolean isStarEtherArmor = isStarEtherAlloyArmor(stack);
        boolean isStarEtherSword = stack.is(STAR_ETHER_SWORD.get());
        boolean isStarEtherPickaxe = stack.is(STAR_ETHER_PICKAXE.get());

        // 剑和镐统称为工具
        boolean isTool = isStarEtherSword || isStarEtherPickaxe;

        // 如果是剑/镐，只有玩家穿戴了整套护甲才显示 tooltip
        if (isTool && (player == null || countMatchingArmor(player) != FULL_SET_SIZE)) {
            return;
        }

        // 既不是护甲也不是工具，直接跳过
        if (!isStarEtherArmor && !isTool) return;

        // 套装总标题
        tooltip.add(Component.translatable("tooltip.ifmup.star_ether_alloy_set"));

        // 没有玩家上下文时无法显示进度，直接返回
        if (player == null) return;

        // 护甲套装进度列表
        for (int i = 0; i < FULL_SET_SIZE; i++) {
            // getArmor 索引与数组顺序相反：helmet=3, chestplate=2, leggings=1, boots=0
            int armorIndex = FULL_SET_SIZE - 1 - i;
            ItemStack armorPiece = player.getInventory().getArmor(armorIndex);

            // 已穿戴显示绿色，未穿戴显示灰色
            String color = armorPiece.is(STAR_ETHER_ARMOR_ITEMS.get(i).get()) ? "§a" : "§7";
            tooltip.add(Component.literal("  §7·" + color + STAR_ETHER_ARMOR_ITEMS.get(i).get().getDescription().getString()));
        }

        // 未集齐全套，不显示额外加成说明
        boolean isFullSet = countMatchingArmor(player) == FULL_SET_SIZE;
        if (!isFullSet) return;

        // 额外加成标题
        tooltip.add(Component.translatable("tooltip.ifmup.star_ether_alloy_extra"));

        ItemStack mainHand = player.getMainHandItem();

        // 主手是否持有对应工具，决定显示绿色还是灰色
        String swordColor = mainHand.is(STAR_ETHER_SWORD.get()) ? "§a" : "§7";
        String pickaxeColor = mainHand.is(STAR_ETHER_PICKAXE.get()) ? "§a" : "§7";

        // 力量加成说明
        tooltip.add(Component.literal("  §7·" + swordColor + STAR_ETHER_SWORD.get().getDescription().getString()
                + Component.translatable("tooltip.ifmup.star_ether_alloy_strength").getString()));

        // 急迫加成说明
        tooltip.add(Component.literal("  §7·" + pickaxeColor + STAR_ETHER_PICKAXE.get().getDescription().getString()
                + Component.translatable("tooltip.ifmup.star_ether_alloy_haste").getString()));
    }

    /**
     * 统计玩家穿戴的 STAR_ETHER_ALLOY 护甲件数。
     *
     * @param player 目标玩家
     * @return 已穿戴的星以太合金护甲件数（0 ~ 4）
     */
    private static int countMatchingArmor(Player player) {
        int count = 0;
        for (int i = 0; i < FULL_SET_SIZE; i++) {
            // 同样做索引反转，使 i 与 STAR_ETHER_ARMOR_ITEMS 顺序对应
            int armorIndex = FULL_SET_SIZE - 1 - i;
            if (player.getInventory().getArmor(armorIndex).is(STAR_ETHER_ARMOR_ITEMS.get(i).get())) {
                count++;
            }
        }
        return count;
    }

    /**
     * 判断 ItemStack 是否为 STAR_ETHER_ALLOY 护甲之一。
     *
     * @param stack 待判断的物品堆
     * @return 是星以太合金护甲返回 true，否则 false
     */
    private static boolean isStarEtherAlloyArmor(ItemStack stack) {
        for (DeferredItem<Item> armor : STAR_ETHER_ARMOR_ITEMS) {
            if (stack.is(armor.get())) return true;
        }
        return false;
    }

    /**
     * 条件性地给玩家添加或移除由本套装提供的效果。
     * <p>
     * 添加时使用 ambient=true 标记，移除时只移除 ambient 的实例，
     * 从而不会影响玩家从药水、信标等其他来源获得的同名效果。
     *
     * @param player      目标玩家
     * @param shouldApply 是否应该施加效果
     * @param effect      效果类型
     * @param duration    持续时间（tick）
     * @param amplifier   效果等级（0 为 I 级）
     */
    private static void applyOrRemoveEffect(Player player, boolean shouldApply, boolean shouldRefresh,
                                            Holder<MobEffect> effect, int duration, int amplifier) {
        if (shouldApply && (shouldRefresh || !player.hasEffect(effect))) {
            player.addEffect(new MobEffectInstance(effect, duration, amplifier, true, true));
        } else if (!shouldApply) {
            removeSetEffect(player, effect, amplifier);
        }
    }

    /**
     * 只移除由本套装添加的效果实例（ambient=true 且 amplifier 匹配），
     * 不影响玩家从其他来源（药水、信标等）获得的同名效果。
     *
     * @param player    目标玩家
     * @param effect    效果类型
     * @param amplifier 本套装使用的 amplifier
     */
    private static void removeSetEffect(Player player, Holder<MobEffect> effect, int amplifier) {
        MobEffectInstance instance = player.getEffect(effect);
        if (instance != null && instance.isAmbient() && instance.getAmplifier() == amplifier) {
            player.removeEffect(effect);
        }
    }
}