package net.frenchbreadev.volumediscs;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.frenchbreadev.volumediscs.item.DefaultDiscs;
import net.frenchbreadev.volumediscs.item.mods.EdenDiscs;
import net.frenchbreadev.volumediscs.util.DiscLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class VolumeDisc implements ModInitializer {
    public static final String MOD_ID = "volumediscs";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        DefaultDiscs.registerModItems();
        DiscLootTableModifiers.modifyLootTables();

        FabricLoader.getInstance().getModContainer("edenring").ifPresent(
                modContainer -> {
                    EdenDiscs.registerModItems();
                }
        );
    }
}
