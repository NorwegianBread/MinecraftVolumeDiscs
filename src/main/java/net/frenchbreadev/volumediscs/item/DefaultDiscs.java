package net.frenchbreadev.volumediscs.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.frenchbreadev.volumediscs.VolumeDisc;
import net.frenchbreadev.volumediscs.item.custom.ModDiscFragmentItem;
import net.frenchbreadev.volumediscs.item.custom.ModMusicDiscItem;
import net.frenchbreadev.volumediscs.sound.ModSounds;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class DefaultDiscs {

    public static final Item MUSIC_DISC_EASTER_EGG = registerItem("music_disc_easter_egg",
            new ModMusicDiscItem(15, ModSounds.MUSIC_DISC_EASTER_EGG,
                    new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item MUSIC_DISC_BEGINNING = registerItem("music_disc_beginning",
            new ModMusicDiscItem(1, ModSounds.MUSIC_DISC_BEGINNING,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEALPHA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_CHRIS = registerItem("music_disc_chris",
            new ModMusicDiscItem(1, ModSounds.MUSIC_DISC_CHRIS,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEALPHA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_CLARK = registerItem("music_disc_clark",
            new ModMusicDiscItem(1, ModSounds.MUSIC_DISC_CLARK,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEALPHA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_DANNY = registerItem("music_disc_danny",
            new ModMusicDiscItem(1, ModSounds.MUSIC_DISC_DANNY,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEALPHA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_DEATH = registerItem("music_disc_death",
            new ModMusicDiscItem(1, ModSounds.MUSIC_DISC_DEATH,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEALPHA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_DOG = registerItem("music_disc_dog",
            new ModMusicDiscItem(1, ModSounds.MUSIC_DISC_DOG,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEALPHA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_DOOR = registerItem("music_disc_door",
            new ModMusicDiscItem(1, ModSounds.MUSIC_DISC_DOOR,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEALPHA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_DRYHANDS = registerItem("music_disc_dryhands",
            new ModMusicDiscItem(1, ModSounds.MUSIC_DISC_DRYHANDS,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEALPHA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_EQUINOXE = registerItem("music_disc_equinoxe",
            new ModMusicDiscItem(1, ModSounds.MUSIC_DISC_EQUINOXE,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEALPHA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_EXCUSE = registerItem("music_disc_excuse",
            new ModMusicDiscItem(1, ModSounds.MUSIC_DISC_EXCUSE,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEALPHA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_HAGGSTROM = registerItem("music_disc_haggstrom",
            new ModMusicDiscItem(1, ModSounds.MUSIC_DISC_HAGGSTROM,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEALPHA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_KEY = registerItem("music_disc_key",
            new ModMusicDiscItem(1, ModSounds.MUSIC_DISC_KEY,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEALPHA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_LIVINGMICE = registerItem("music_disc_livingmice",
            new ModMusicDiscItem(1, ModSounds.MUSIC_DISC_LIVINGMICE,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEALPHA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_MICEONVENUS = registerItem("music_disc_miceonvenus",
            new ModMusicDiscItem(1, ModSounds.MUSIC_DISC_MICEONVENUS,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEALPHA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_MINECRAFT = registerItem("music_disc_minecraft",
            new ModMusicDiscItem(1, ModSounds.MUSIC_DISC_MINECRAFT,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEALPHA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_MOOGCITY = registerItem("music_disc_moogcity",
            new ModMusicDiscItem(1, ModSounds.MUSIC_DISC_MOOGCITY,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEALPHA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_OXYGENE = registerItem("music_disc_oxygene",
            new ModMusicDiscItem(1, ModSounds.MUSIC_DISC_OXYGENE,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEALPHA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_SUBLULABY = registerItem("music_disc_sublulaby",
            new ModMusicDiscItem(1, ModSounds.MUSIC_DISC_SUBLULABY,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEALPHA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_SWEDEN = registerItem("music_disc_sweden",
            new ModMusicDiscItem(1, ModSounds.MUSIC_DISC_SWEDEN,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEALPHA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_WETHANDS = registerItem("music_disc_wethands",
            new ModMusicDiscItem(1, ModSounds.MUSIC_DISC_WETHANDS,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEALPHA).maxCount(1).rarity(Rarity.RARE)));

    public static final Item MUSIC_DISC_ALPHA = registerItem("music_disc_alpha",
            new ModMusicDiscItem(2, ModSounds.MUSIC_DISC_ALPHA,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEBETA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_ARIA_MATH = registerItem("music_disc_aria_math",
            new ModMusicDiscItem(2, ModSounds.MUSIC_DISC_ARIA_MATH,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEBETA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_BALLAD_OF_THE_CATS = registerItem("music_disc_ballad_of_the_cats",
            new ModMusicDiscItem(2, ModSounds.MUSIC_DISC_BALLAD_OF_THE_CATS,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEBETA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_BEGINNING_2 = registerItem("music_disc_beginning_2",
            new ModMusicDiscItem(2, ModSounds.MUSIC_DISC_BEGGINNING_2,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEBETA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_BIOME_FEST = registerItem("music_disc_biome_fest",
            new ModMusicDiscItem(2, ModSounds.MUSIC_DISC_BIOME_FEST,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEBETA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_BLIND_SPOTS = registerItem("music_disc_blind_spots",
            new ModMusicDiscItem(2, ModSounds.MUSIC_DISC_BLIND_SPOTS,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEBETA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_CONCRETE_HALLS = registerItem("music_disc_concrete_halls",
            new ModMusicDiscItem(2, ModSounds.MUSIC_DISC_CONCRETE_HALLS,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEBETA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_DEAD_VOXEL = registerItem("music_disc_dead_voxel",
            new ModMusicDiscItem(2, ModSounds.MUSIC_DISC_DEAD_VOXEL,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEBETA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_DREITON = registerItem("music_disc_dreiton",
            new ModMusicDiscItem(2, ModSounds.MUSIC_DISC_DREITON,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEBETA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_FLAKE = registerItem("music_disc_flake",
            new ModMusicDiscItem(2, ModSounds.MUSIC_DISC_FLAKE,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEBETA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_FLOATING_TREES = registerItem("music_disc_floating_trees",
            new ModMusicDiscItem(2, ModSounds.MUSIC_DISC_FLOATING_TREES,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEBETA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_HAUNT_MUSKIE = registerItem("music_disc_haunt_muskie",
            new ModMusicDiscItem(2, ModSounds.MUSIC_DISC_HAUNT_MUSKIE,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEBETA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_INTRO = registerItem("music_disc_intro",
            new ModMusicDiscItem(2, ModSounds.MUSIC_DISC_INTRO,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEBETA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_KI = registerItem("music_disc_ki",
            new ModMusicDiscItem(2, ModSounds.MUSIC_DISC_KI,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEBETA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_KYOTO = registerItem("music_disc_kyoto",
            new ModMusicDiscItem(2, ModSounds.MUSIC_DISC_KYOTO,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEBETA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_MOOG_CITY_2 = registerItem("music_disc_moog_city_2",
            new ModMusicDiscItem(2, ModSounds.MUSIC_DISC_MOOG_CITY_2,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEBETA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_MUTATION = registerItem("music_disc_mutation",
            new ModMusicDiscItem(2, ModSounds.MUSIC_DISC_MUTATION,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEBETA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_TASWELL = registerItem("music_disc_taswell",
            new ModMusicDiscItem(2, ModSounds.MUSIC_DISC_TASWELL,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEBETA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_THE_END = registerItem("music_disc_the_end",
            new ModMusicDiscItem(0, ModSounds.MUSIC_DISC_THE_END,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEBETA).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_WARMTH = registerItem("music_disc_warmth",
            new ModMusicDiscItem(2, ModSounds.MUSIC_DISC_WARMTH,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEBETA).maxCount(1).rarity(Rarity.RARE)));

    public static final Item MODDED_PLACEHOLDER = registerItem("modded_placeholder",
            new ModMusicDiscItem(0, SoundEvents.BLOCK_NOTE_BLOCK_BANJO,
                    new FabricItemSettings().maxCount(0).rarity(Rarity.EPIC)));

    public static final Item MUSIC_DISC_AXOLOTL = registerItem("music_disc_axolotl",
            new ModMusicDiscItem(3, ModSounds.MUSIC_DISC_AXOLOTL,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEEXTRAS).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_DRAGON_FISH = registerItem("music_disc_dragon_fish",
            new ModMusicDiscItem(3, ModSounds.MUSIC_DISC_DRAGON_FISH,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEEXTRAS).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_SHUNIJI = registerItem("music_disc_shuniji",
            new ModMusicDiscItem(3, ModSounds.MUSIC_DISC_SHUNIJI,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEEXTRAS).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_SO_BELOW = registerItem("music_disc_so_below",
            new ModMusicDiscItem(3, ModSounds.MUSIC_DISC_SO_BELOW,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEEXTRAS).maxCount(1).rarity(Rarity.RARE).fireproof()));
    public static final Item MUSIC_DISC_CHRYSOPOEIA = registerItem("music_disc_chrysopoeia",
            new ModMusicDiscItem(3, ModSounds.MUSIC_DISC_CHRYSOPOEIA,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEEXTRAS).maxCount(1).rarity(Rarity.RARE).fireproof()));
    public static final Item MUSIC_DISC_RUBEDO = registerItem("music_disc_rubedo",
            new ModMusicDiscItem(3, ModSounds.MUSIC_DISC_RUBEDO,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEEXTRAS).maxCount(1).rarity(Rarity.RARE).fireproof()));
    public static final Item MUSIC_DISC_COMFORTING_MEMORIES = registerItem("music_disc_comforting_memories",
            new ModMusicDiscItem(3, ModSounds.MUSIC_DISC_COMFORTING_MEMORIES,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEEXTRAS).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_FLOATING_DREAM = registerItem("music_disc_floating_dream",
            new ModMusicDiscItem(3, ModSounds.MUSIC_DISC_FLOATING_DREAM,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEEXTRAS).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_LEFT_TO_BLOOM = registerItem("music_disc_left_to_bloom",
            new ModMusicDiscItem(3, ModSounds.MUSIC_DISC_LEFT_TO_BLOOM,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEEXTRAS).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_ONE_MORE_DAY = registerItem("music_disc_one_more_day",
            new ModMusicDiscItem(3, ModSounds.MUSIC_DISC_ONE_MORE_DAY,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEEXTRAS).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_INFINITE_AMETHYST = registerItem("music_disc_infinite_amethyst",
            new ModMusicDiscItem(3, ModSounds.MUSIC_DISC_INFINITE_AMETHYST,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEEXTRAS).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_AN_ORDINARY_DAY = registerItem("music_disc_an_ordinary_day",
            new ModMusicDiscItem(3, ModSounds.MUSIC_DISC_AN_ORDINARY_DAY,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEEXTRAS).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_WENDING = registerItem("music_disc_wending",
            new ModMusicDiscItem(3, ModSounds.MUSIC_DISC_WENDING,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEEXTRAS).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_STAND_TALL = registerItem("music_disc_stand_tall",
            new ModMusicDiscItem(3, ModSounds.MUSIC_DISC_STAND_TALL,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEEXTRAS).maxCount(1).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_ANCESTRY = registerItem("music_disc_ancestry",
            new ModMusicDiscItem(3, ModSounds.MUSIC_DISC_ANCESTRY,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEEXTRAS).maxCount(1).rarity(Rarity.RARE)));

    public static final Item MUSIC_DISC_RICHOCHET = registerItem("music_disc_richochet",
            new ModMusicDiscItem(14, ModSounds.MUSIC_DISC_RICHOCHET,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEEXTRAS).maxCount(1).rarity(Rarity.EPIC)));

    public static final Item MUSIC_DISC_DROOPYFACE = registerItem("music_disc_droopyface",
            new ModMusicDiscItem(14, ModSounds.MUSIC_DISC_DROOPYFACE,
                    new FabricItemSettings().group(DefaultItemGroups.VOLUMEEXTRAS).maxCount(1).rarity(Rarity.EPIC)));

    public static final Item MUSIC_DISC_NIGHT_WAVE = registerItem("music_disc_night_wave",
            new ModMusicDiscItem(15, ModSounds.MUSIC_DISC_NIGHT_WAVE,
                    new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));

    public static final Item AMETHYST_DISC_FRAGMENT = registerItem("amethyst_disc_fragment",
            new ModDiscFragmentItem(new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(VolumeDisc.MOD_ID, name), item);
    }

    public static void registerModItems() {
        VolumeDisc.LOGGER.debug(VolumeDisc.MOD_ID + ": registering default discs");
    }
}
