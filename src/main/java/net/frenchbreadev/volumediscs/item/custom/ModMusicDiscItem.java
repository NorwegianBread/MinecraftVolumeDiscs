package net.frenchbreadev.volumediscs.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;

public class ModMusicDiscItem extends MusicDiscItem {
    public ModMusicDiscItem(int comparatorOutput, SoundEvent sound, Settings settings) {
        super(comparatorOutput, sound, settings);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Objects.equals(stack.getTranslationKey(), "item.volumediscs.music_disc_the_end") ||
                Objects.equals(stack.getTranslationKey(), "item.volumediscs.music_disc_droopyface") ||
                Objects.equals(stack.getTranslationKey(), "item.volumediscs.music_disc_richochet")) {
            tooltip.add(this.getDescription().formatted(Formatting.GRAY));
            tooltip.add(Text.translatable(""));
            tooltip.add(Text.translatable(stack.getTranslationKey() + ".tooltip"));
        } else {
            tooltip.add(this.getDescription().formatted(Formatting.GRAY));
        }
    }
    @Override
    public boolean hasGlint(ItemStack stack) {
        return Objects.equals(stack.getTranslationKey(), "item.volumediscs.music_disc_droopyface") ||
                Objects.equals(stack.getTranslationKey(), "item.volumediscs.music_disc_richochet");
    }
}


