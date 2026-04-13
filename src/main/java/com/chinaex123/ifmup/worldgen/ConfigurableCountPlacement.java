//package com.chinaex123.ifmup.worldgen;
//
//import com.mojang.serialization.Codec;
//import com.mojang.serialization.MapCodec;
//import net.minecraft.core.BlockPos;
//import net.minecraft.util.RandomSource;
//import net.minecraft.world.level.levelgen.placement.PlacementContext;
//import net.minecraft.world.level.levelgen.placement.PlacementModifier;
//import net.minecraft.world.level.levelgen.placement.PlacementModifierType;
//
//import java.util.function.Supplier;
//import java.util.stream.Stream;
//
//public class ConfigurableCountPlacement extends PlacementModifier {
//
//    private final Supplier<Integer> countSupplier;
//
//    public static final MapCodec<ConfigurableCountPlacement> CODEC = Codec.INT.fieldOf("count")
//            .xmap(
//                    count -> new ConfigurableCountPlacement(() -> count),
//                    placement -> placement.countSupplier.get()
//            );
//
//    public ConfigurableCountPlacement(Supplier<Integer> countSupplier) {
//        this.countSupplier = countSupplier;
//    }
//
//    @Override
//    public Stream<BlockPos> getPositions(PlacementContext context, RandomSource random, BlockPos pos) {
//        int count = countSupplier.get();
//
//        if (count <= 0) {
//            return Stream.empty();
//        }
//
//        Stream.Builder<BlockPos> builder = Stream.builder();
//        for (int i = 0; i < count; i++) {
//            builder.add(pos);
//        }
//        return builder.build();
//    }
//
//    @Override
//    public PlacementModifierType<?> type() {
//        return ModPlacements.CONFIGURABLE_COUNT.get();
//    }
//}
