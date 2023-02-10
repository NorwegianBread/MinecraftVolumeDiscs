package net.frenchbreadev.volumediscs.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.frenchbreadev.volumediscs.item.DefaultDiscs;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class DiscLootTableModifiers {
    private static final Identifier SIMPLE_DUNGEON_ID
            = new Identifier("minecraft", "chests/simple_dungeon");
    private static final Identifier SPAWN_BONUS_CHEST_ID
            = new Identifier("minecraft", "chests/spawn_bonus_chest");
    private static final Identifier RUINED_PORTAL_ID
            = new Identifier("minecraft", "chests/ruined_portal");


    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
                    if(SPAWN_BONUS_CHEST_ID.equals(id)) {
                        LootPool.Builder poolBuilder = LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(1.0f)) // Drops 100% of the time
                                .with(ItemEntry.builder(DefaultDiscs.MUSIC_DISC_BEGINNING))
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build());
                        tableBuilder.pool(poolBuilder.build());

            }
            if(RUINED_PORTAL_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(DefaultDiscs.MUSIC_DISC_NIGHT_WAVE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build());
                tableBuilder.pool(poolBuilder.build());

            }
            if(RUINED_PORTAL_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.10f))
                        .with(ItemEntry.builder(DefaultDiscs.MUSIC_DISC_CHRYSOPOEIA))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build());
                tableBuilder.pool(poolBuilder.build());

            }
            if(RUINED_PORTAL_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.12f))
                        .with(ItemEntry.builder(DefaultDiscs.MUSIC_DISC_RUBEDO))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build());
                tableBuilder.pool(poolBuilder.build());

            }
            if(RUINED_PORTAL_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.11f))
                        .with(ItemEntry.builder(DefaultDiscs.MUSIC_DISC_SO_BELOW))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build());
                tableBuilder.pool(poolBuilder.build());

            }
        });
    }
}