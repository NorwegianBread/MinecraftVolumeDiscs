package net.frenchbreadev.volumediscs.event;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.sound.SoundCategory;
import org.lwjgl.glfw.GLFW;

public class KeyInputHandler {
    public static final String KEY_STOP_SOUND = "key.volumediscs.stopsound";

    public static KeyBinding stopsoundKey;

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if(stopsoundKey.wasPressed()) {
                MinecraftClient.getInstance().getSoundManager().stopSounds(null,SoundCategory.RECORDS);
            }
        });
    }

    public static void register() {
        stopsoundKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_STOP_SOUND,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_R,
                KeyBinding.MISC_CATEGORY
        ));

        registerKeyInputs();
    }
}
