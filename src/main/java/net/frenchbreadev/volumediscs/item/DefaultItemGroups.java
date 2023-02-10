package net.frenchbreadev.volumediscs.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.frenchbreadev.volumediscs.VolumeDisc;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class DefaultItemGroups {
    public static final ItemGroup VOLUMEALPHA = FabricItemGroupBuilder.build(
            new Identifier(VolumeDisc.MOD_ID, "alpha"), () -> new ItemStack(DefaultDiscs.MUSIC_DISC_BEGINNING));
    public static final ItemGroup VOLUMEBETA = FabricItemGroupBuilder.build(
            new Identifier(VolumeDisc.MOD_ID, "beta"), () -> new ItemStack(DefaultDiscs.MUSIC_DISC_BEGINNING_2));
    public static final ItemGroup VOLUMEEXTRAS = FabricItemGroupBuilder.build(
            new Identifier(VolumeDisc.MOD_ID, "extras"), () -> new ItemStack(DefaultDiscs.MUSIC_DISC_DRAGON_FISH));
    public static final ItemGroup VOLUMEMODDED = FabricItemGroupBuilder.build(
            new Identifier(VolumeDisc.MOD_ID, "modded"), () -> new ItemStack(DefaultDiscs.MODDED_PLACEHOLDER));
    }
