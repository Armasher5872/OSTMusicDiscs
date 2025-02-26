package net.phazoganon.ostmusicdiscs;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.phazoganon.ostmusicdiscs.item.ModItems;
import net.phazoganon.ostmusicdiscs.sound.ModSounds;

@Mod(OSTMusicDiscs.MODID)
public class OSTMusicDiscs {
    public static final String MODID = "ostmusicdiscs";
    public OSTMusicDiscs(IEventBus modEventBus) {
        modEventBus.addListener(this::addCreative);
        ModItems.register(modEventBus);
        ModSounds.register(modEventBus);
    }
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        ResourceKey<CreativeModeTab> getTabKey = event.getTabKey();
        if (getTabKey == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.A_FAMILIAR_ROOM_MUSIC_DISC);
            event.accept(ModItems.AERIE_MUSIC_DISC);
            event.accept(ModItems.ALPHA_MUSIC_DISC);
            event.accept(ModItems.AN_ORDINARY_DAY_MUSIC_DISC);
            event.accept(ModItems.ANCESTRY_MUSIC_DISC);
            event.accept(ModItems.ARIA_MATH_MUSIC_DISC);
            event.accept(ModItems.AXOLOTL_MUSIC_DISC);
            event.accept(ModItems.BALLAD_OF_THE_CATS_MUSIC_DISC);
            event.accept(ModItems.BEGINNING_2_MUSIC_DISC);
            event.accept(ModItems.BIOME_FEST_MUSIC_DISC);
            event.accept(ModItems.BLIND_SPOTS_MUSIC_DISC);
            event.accept(ModItems.BOSS_MUSIC_DISC);
            event.accept(ModItems.BROMELIAD_MUSIC_DISC);
            event.accept(ModItems.CHRYSOPOEIA_MUSIC_DISC);
            event.accept(ModItems.CLARK_MUSIC_DISC);
            event.accept(ModItems.COMFORTING_MEMORIES_MUSIC_DISC);
            event.accept(ModItems.CONCRETE_HALLS_MUSIC_DISC);
            event.accept(ModItems.CRESCENT_DUNES_MUSIC_DISC);
            event.accept(ModItems.DANNY_MUSIC_DISC);
            event.accept(ModItems.DEAD_VOXEL_MUSIC_DISC);
            event.accept(ModItems.DEEPER_MUSIC_DISC);
            event.accept(ModItems.DRAGON_FISH_MUSIC_DISC);
            event.accept(ModItems.DREITON_MUSIC_DISC);
            event.accept(ModItems.DRY_HANDS_MUSIC_DISC);
            event.accept(ModItems.ECHO_IN_THE_WIND_MUSIC_DISC);
            event.accept(ModItems.ELD_UNKNOWN_MUSIC_DISC);
            event.accept(ModItems.ENDLESS_MUSIC_DISC);
            event.accept(ModItems.FEATHERFALL_MUSIC_DISC);
            event.accept(ModItems.FIREBUGS_MUSIC_DISC);
            event.accept(ModItems.FLOATING_DREAM_MUSIC_DISC);
            event.accept(ModItems.FLOATING_TREES_MUSIC_DISC);
            event.accept(ModItems.HAGGSTROM_MUSIC_DISC);
            event.accept(ModItems.HAUNT_MUSKIE_MUSIC_DISC);
            event.accept(ModItems.INFINITE_AMETHYST_MUSIC_DISC);
            event.accept(ModItems.KEY_MUSIC_DISC);
            event.accept(ModItems.KOMOREBI_MUSIC_DISC);
            event.accept(ModItems.LABYRINTHINE_MUSIC_DISC);
            event.accept(ModItems.LEFT_TO_BLOOM_MUSIC_DISC);
            event.accept(ModItems.LIVING_MICE_MUSIC_DISC);
            event.accept(ModItems.MICE_ON_VENUS_MUSIC_DISC);
            event.accept(ModItems.MINECRAFT_MUSIC_DISC);
            event.accept(ModItems.MOOG_CITY_2_MUSIC_DISC);
            event.accept(ModItems.MUTATION_MUSIC_DISC);
            event.accept(ModItems.ONE_MORE_DAY_MUSIC_DISC);
            event.accept(ModItems.OXYGENE_MUSIC_DISC);
            event.accept(ModItems.POKOPOKO_MUSIC_DISC);
            event.accept(ModItems.PUZZLEBOX_MUSIC_DISC);
            event.accept(ModItems.RUBEDO_MUSIC_DISC);
            event.accept(ModItems.SHUNIJI_MUSIC_DISC);
            event.accept(ModItems.SO_BELOW_MUSIC_DISC);
            event.accept(ModItems.STAND_TALL_MUSIC_DISC);
            event.accept(ModItems.SUBWOOFER_LULLABY_MUSIC_DISC);
            event.accept(ModItems.SWEDEN_MUSIC_DISC);
            event.accept(ModItems.TASWELL_MUSIC_DISC);
            event.accept(ModItems.THE_END_MUSIC_DISC);
            event.accept(ModItems.WARMTH_MUSIC_DISC);
            event.accept(ModItems.WENDING_MUSIC_DISC);
            event.accept(ModItems.WET_HANDS_MUSIC_DISC);
            event.accept(ModItems.YAKUSOKU_MUSIC_DISC);
        }
    }
}