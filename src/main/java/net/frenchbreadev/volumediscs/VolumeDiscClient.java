package net.frenchbreadev.volumediscs;

import net.fabricmc.api.ClientModInitializer;
import net.frenchbreadev.volumediscs.event.KeyInputHandler;

public class VolumeDiscClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        KeyInputHandler.register();
    }
}
