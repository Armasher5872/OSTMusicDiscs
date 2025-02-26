package net.phazoganon.ostmusicdiscs.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;
import net.phazoganon.ostmusicdiscs.OSTMusicDiscs;
import net.phazoganon.ostmusicdiscs.item.ModItems;

public class ModItemModelProvider extends ModelProvider {
    public ModItemModelProvider(PackOutput output) {
        super(output, OSTMusicDiscs.MODID);
    }
    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(ModItems.A_FAMILIAR_ROOM_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.AERIE_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.ALPHA_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.AN_ORDINARY_DAY_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.ANCESTRY_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.ARIA_MATH_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.AXOLOTL_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.BALLAD_OF_THE_CATS_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.BEGINNING_2_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.BIOME_FEST_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.BLIND_SPOTS_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.BOSS_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.BROMELIAD_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CHRYSOPOEIA_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CLARK_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.COMFORTING_MEMORIES_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CONCRETE_HALLS_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CRESCENT_DUNES_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.DANNY_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.DEAD_VOXEL_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.DEEPER_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.DRAGON_FISH_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.DREITON_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.DRY_HANDS_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.ECHO_IN_THE_WIND_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.ELD_UNKNOWN_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.ENDLESS_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.FEATHERFALL_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.FIREBUGS_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.FLOATING_DREAM_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.FLOATING_TREES_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.HAGGSTROM_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.HAUNT_MUSKIE_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.INFINITE_AMETHYST_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.KEY_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.KOMOREBI_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.LABYRINTHINE_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.LEFT_TO_BLOOM_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.LIVING_MICE_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.MICE_ON_VENUS_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.MINECRAFT_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.MOOG_CITY_2_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.MUTATION_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.ONE_MORE_DAY_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.OXYGENE_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.POKOPOKO_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.PUZZLEBOX_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RUBEDO_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.SHUNIJI_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.SO_BELOW_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.STAND_TALL_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.SUBWOOFER_LULLABY_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.SWEDEN_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.TASWELL_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.THE_END_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.WARMTH_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.WENDING_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.WET_HANDS_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.YAKUSOKU_MUSIC_DISC.value(), ModelTemplates.FLAT_ITEM);
    }
}