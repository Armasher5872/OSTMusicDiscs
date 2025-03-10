package net.phazoganon.ostmusicdiscs.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.phazoganon.ostmusicdiscs.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements DataProvider {
    protected ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }
    @Override
    protected void buildRecipes() {
        this.shaped(RecipeCategory.MISC, ModItems.A_FAMILIAR_ROOM_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.WHITE_BED)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.AERIE_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.JUNGLE_PLANKS)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.ALPHA_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.CHORUS_FRUIT)
                .define('S', Items.END_STONE_BRICK_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.AN_ORDINARY_DAY_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.WHEAT_SEEDS)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.ANCESTRY_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.BONE_BLOCK)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.ARIA_MATH_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.REDSTONE)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.AXOLOTL_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.AXOLOTL_BUCKET)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.BALLAD_OF_THE_CATS_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.QUARTZ)
                .define('S', Items.NETHER_BRICK_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.BEGINNING_2_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.OAK_PLANKS)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.BIOME_FEST_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.CHERRY_PLANKS)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.BLIND_SPOTS_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.COBBLED_DEEPSLATE)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.BOSS_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.DRAGON_BREATH)
                .define('S', Items.END_STONE_BRICK_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.BROMELIAD_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.GLOW_BERRIES)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.CHRYSOPOEIA_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.CRIMSON_HYPHAE)
                .define('S', Items.NETHER_BRICK_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.CLARK_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.BONE)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.COMFORTING_MEMORIES_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.PAINTING)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.CONCRETE_HALLS_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.BASALT)
                .define('S', Items.NETHER_BRICK_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.CRESCENT_DUNES_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.SAND)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.DANNY_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.BOOK)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.DEAD_VOXEL_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.SOUL_SAND)
                .define('S', Items.NETHER_BRICK_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.DEEPER_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.DEEPSLATE)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.DRAGON_FISH_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.TROPICAL_FISH)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.DREITON_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.DANDELION)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.DRY_HANDS_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.DRIED_KELP)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.ECHO_IN_THE_WIND_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.ECHO_SHARD)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.ELD_UNKNOWN_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.DRIPSTONE_BLOCK)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.ENDLESS_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.POINTED_DRIPSTONE)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.FEATHERFALL_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.FEATHER)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.FIREBUGS_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.GLOW_INK_SAC)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.FLOATING_DREAM_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.WHITE_WOOL)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.FLOATING_TREES_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.BIRCH_PLANKS)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.HAGGSTROM_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.POPPY)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.HAUNT_MUSKIE_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.HONEYCOMB)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.INFINITE_AMETHYST_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.AMETHYST_SHARD)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.KEY_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.STONE_PRESSURE_PLATE)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.KOMOREBI_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.DAYLIGHT_DETECTOR)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.LABYRINTHINE_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.PRISMARINE)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.LEFT_TO_BLOOM_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.MOSS_BLOCK)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.LIVING_MICE_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.WHEAT)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.MICE_ON_VENUS_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.LAVA_BUCKET)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.MINECRAFT_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.DIRT)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.MOOG_CITY_2_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.CHISELED_STONE_BRICKS)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.MUTATION_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.GUNPOWDER)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.ONE_MORE_DAY_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.CLOCK)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.OXYGENE_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.GLASS_BOTTLE)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.POKOPOKO_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.SNOWBALL)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.PUZZLEBOX_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.CHEST)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.RUBEDO_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.NETHERRACK)
                .define('S', Items.NETHER_BRICK_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.SHUNIJI_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.PUFFERFISH)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.SO_BELOW_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.SOUL_SOIL)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.STAND_TALL_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.ICE)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.SUBWOOFER_LULLABY_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.JUKEBOX)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.SWEDEN_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.ENCHANTED_GOLDEN_APPLE)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.TASWELL_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.TORCH)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.THE_END_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.END_STONE)
                .define('S', Items.END_STONE_BRICK_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.WARMTH_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.GLOWSTONE)
                .define('S', Items.NETHER_BRICK_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.WENDING_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.ANVIL)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.WET_HANDS_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.WATER_BUCKET)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ModItems.YAKUSOKU_MUSIC_DISC.get())
                .pattern(" F ")
                .pattern("IP@")
                .pattern(" S ")
                .define('F', Items.FLINT)
                .define('I', Items.INK_SAC)
                .define('P', Items.PAPER)
                .define('@', Items.WRITTEN_BOOK)
                .define('S', Items.STONE_SLAB)
                .unlockedBy(getHasName(Items.FLINT), has(Items.INK_SAC))
                .save(this.output);
    }
    @Override
    public CompletableFuture<?> run(CachedOutput cachedOutput) {
        return null;
    }
    @Override
    public String getName() {
        return "";
    }
    public static class ModRunner extends RecipeProvider.Runner {
        protected ModRunner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }
        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
            return new ModRecipeProvider(provider, recipeOutput);
        }
        @Override
        public String getName() {
            return "OST Music Discs Recipes";
        }
    }
}