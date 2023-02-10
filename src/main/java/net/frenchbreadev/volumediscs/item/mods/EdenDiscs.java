package net.frenchbreadev.volumediscs.item.mods;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.frenchbreadev.volumediscs.VolumeDisc;
import net.frenchbreadev.volumediscs.item.DefaultItemGroups;
import net.frenchbreadev.volumediscs.item.custom.ModMusicDiscItem;
import net.frenchbreadev.volumediscs.sound.ModSounds;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class EdenDiscs {

        public static final Item EDEN_RING_MUSIC_DISC_RING_OF_EDEN = registerItem("eden_ring_music_disc_ring_of_eden",
                new ModMusicDiscItem(8, ModSounds.EDEN_RING_MUSIC_DISC_RING_OF_EDEN,
                        new FabricItemSettings().group(DefaultItemGroups.VOLUMEMODDED).maxCount(1).rarity(Rarity.RARE)));

        public static final Item EDEN_RING_MUSIC_DISC_JOURNEYS = registerItem("eden_ring_music_disc_journeys",
                new ModMusicDiscItem(8, ModSounds.EDEN_RING_MUSIC_DISC_JOURNEYS,
                        new FabricItemSettings().group(DefaultItemGroups.VOLUMEMODDED).maxCount(1).rarity(Rarity.RARE)));

        public static final Item EDEN_RING_MUSIC_DISC_INFINITY = registerItem("eden_ring_music_disc_infinity",
                new ModMusicDiscItem(8, ModSounds.EDEN_RING_MUSIC_DISC_INFINITY,
                        new FabricItemSettings().group(DefaultItemGroups.VOLUMEMODDED).maxCount(1).rarity(Rarity.RARE)));

        public static final Item EDEN_RING_MUSIC_DISC_ETERNALITY = registerItem("eden_ring_music_disc_eternality",
                new ModMusicDiscItem(8, ModSounds.EDEN_RING_MUSIC_DISC_ETERNALITY,
                        new FabricItemSettings().group(DefaultItemGroups.VOLUMEMODDED).maxCount(1).rarity(Rarity.RARE)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier("edenring", name), item);
    }

    public static void registerModItems() {
        VolumeDisc.LOGGER.debug(VolumeDisc.MOD_ID + ": registering eden ring discs");
    }
}

