package voronoiaoc.byg.core.byglists;

import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;
import voronoiaoc.byg.BYG;
import voronoiaoc.byg.common.world.surfacebuilders.*;

public class BYGSBList {
    public static final SurfaceBuilder<TernarySurfaceConfig> BOREAL_SB = newSurfaceBuilder("boreal", new BorealForestSB(TernarySurfaceConfig.CODEC));
    public static final SurfaceBuilder<TernarySurfaceConfig> CONIFEROUS_SB = newSurfaceBuilder("coniferous", new ConiferousForestSB(TernarySurfaceConfig.CODEC));
    public static final SurfaceBuilder<TernarySurfaceConfig> SHATTEREDGLACIER_SB2 = newSurfaceBuilder("shattered_glacier", new ShatteredGlacierSB2(TernarySurfaceConfig.CODEC));
    public static final SurfaceBuilder<TernarySurfaceConfig> MARSHLAND_SB = newSurfaceBuilder("marshland", new MarshlandSB(TernarySurfaceConfig.CODEC));
    public static final SurfaceBuilder<TernarySurfaceConfig> GREAT_LAKES_SB = newSurfaceBuilder("great_lakes", new GreatLakeSB(TernarySurfaceConfig.CODEC));
    public static final SurfaceBuilder<TernarySurfaceConfig> GREAT_LAKE_ISLE_SB = newSurfaceBuilder("great_lakes_isles", new GreatLakeIsleSB(TernarySurfaceConfig.CODEC));
    public static final SurfaceBuilder<TernarySurfaceConfig> ERODED_SIERRA_SB = newSurfaceBuilder("eroded_sierra", new ErodedSierraSB(TernarySurfaceConfig.CODEC));
    public static final SurfaceBuilder<TernarySurfaceConfig> SIERRA_VALLEY_SB = newSurfaceBuilder("sierra_valley", new SierraValleySB(TernarySurfaceConfig.CODEC));
    public static final SurfaceBuilder<TernarySurfaceConfig> GLOWSHROOM_BAYOU_SB = newSurfaceBuilder("glowshroom_bayou", new GlowShroomBayouSB(TernarySurfaceConfig.CODEC));
    public static final SurfaceBuilder<TernarySurfaceConfig> CRAG_GARDENS = newSurfaceBuilder("crag_gardens", new CragGardens(TernarySurfaceConfig.CODEC));
    public static final SurfaceBuilder<TernarySurfaceConfig> RED_ROCK_SB = newSurfaceBuilder("red_rock", new RedRockSB(TernarySurfaceConfig.CODEC));
    public static final SurfaceBuilder<TernarySurfaceConfig> RED_ROCKLOWLAND_SB = newSurfaceBuilder("red_rock_lowlands", new RedRockLowlandsSB(TernarySurfaceConfig.CODEC));
    public static final SurfaceBuilder<TernarySurfaceConfig> REDDUNES_SB = newSurfaceBuilder("red_dunes", new RedDunesSB(TernarySurfaceConfig.CODEC));
    public static final SurfaceBuilder<TernarySurfaceConfig> DUNES_SB = newSurfaceBuilder("dunes", new DunesSB(TernarySurfaceConfig.CODEC));
    public static final SurfaceBuilder<TernarySurfaceConfig> DOVER_SB = newSurfaceBuilder("dover_mountains", new DoverMountainSB(TernarySurfaceConfig.CODEC));
    public static final SurfaceBuilder<TernarySurfaceConfig> QUAGMIRE_SB = newSurfaceBuilder("quagmire", new QuagmireSB(TernarySurfaceConfig.CODEC));
    public static final SurfaceBuilder<TernarySurfaceConfig> CANYONS = newSurfaceBuilder("canyons", new CanyonSB(TernarySurfaceConfig.CODEC));
    public static final SurfaceBuilder<TernarySurfaceConfig> MOJAVE = newSurfaceBuilder("mojave", new MojaveSB(TernarySurfaceConfig.CODEC));
    public static final SurfaceBuilder<TernarySurfaceConfig> LUSH_TUNDRA_SB = newSurfaceBuilder("lush_tundra", new LushTundraSB(TernarySurfaceConfig.CODEC));
    public static final SurfaceBuilder<TernarySurfaceConfig> FUNGAL_RAINFOREST_SB = newSurfaceBuilder("fungal_rainforest", new FungalRainforestSB(TernarySurfaceConfig.CODEC));
    public static final SurfaceBuilder<TernarySurfaceConfig> EBONY_SB = newSurfaceBuilder("ebony_woods", new EbonyWoodsSB(TernarySurfaceConfig.CODEC));
    public static final SurfaceBuilder<TernarySurfaceConfig> GLOWING_ANCIENT_FOREST_SB = newSurfaceBuilder("glowing_ancient_forest", new GlowingAncientForestSB(TernarySurfaceConfig.CODEC));
    public static final SurfaceBuilder<TernarySurfaceConfig> EMBURBOG = newSurfaceBuilder("embur_bog", new EmburBogSB(TernarySurfaceConfig.CODEC));
    public static final SurfaceBuilder<TernarySurfaceConfig> ROCKYBLACKBEACH_SB = newSurfaceBuilder("rocky_black_beach", new RockyBlackBeachSB(TernarySurfaceConfig.CODEC));
    public static final SurfaceBuilder<TernarySurfaceConfig> RAINBOWBEACH_SB = newSurfaceBuilder("rainbow_beach", new RainbowBeachSB(TernarySurfaceConfig.CODEC));
    public static final SurfaceBuilder<TernarySurfaceConfig> ROCKYBEACH_SB = newSurfaceBuilder("rocky_beach", new RockyBeachSB(TernarySurfaceConfig.CODEC));
    public static final SurfaceBuilder<TernarySurfaceConfig> WARPEDDESERT_SB = newSurfaceBuilder("warped_desert", new WarpedDesertSB(TernarySurfaceConfig.CODEC));

    //End
    public static final SurfaceBuilder<TernarySurfaceConfig> IVISFIELDS_SB = newSurfaceBuilder("ivis_fields", new IvisFieldsSB(TernarySurfaceConfig.CODEC));

    public static SurfaceBuilder<TernarySurfaceConfig> newSurfaceBuilder(String id, SurfaceBuilder<TernarySurfaceConfig> surfaceBuilder) {
        Registry.register(Registry.SURFACE_BUILDER, new Identifier(BYG.MODID, id), surfaceBuilder);
        return surfaceBuilder;
    }

    public static class BYGSBConfigList {
        public static final TernarySurfaceConfig BLACKSAND = new TernarySurfaceConfig(BYGBlockList.BLACK_SAND.getDefaultState(), BYGBlockList.BLACK_SAND.getDefaultState(), BYGBlockList.BLACK_SAND.getDefaultState());
        public static final TernarySurfaceConfig ROCKYBLACKSAND = new TernarySurfaceConfig(BYGBlockList.ROCKY_STONE.getDefaultState(), BYGBlockList.BLACK_SAND.getDefaultState(), BYGBlockList.BLACK_SAND.getDefaultState());
        public static final TernarySurfaceConfig ROCKYBLACKSAND2 = new TernarySurfaceConfig(BYGBlockList.BLACK_SAND.getDefaultState(), BYGBlockList.ROCKY_STONE.getDefaultState(), BYGBlockList.BLACK_SAND.getDefaultState());
        public static final TernarySurfaceConfig STONEBLACKSAND = new TernarySurfaceConfig(BYGBlockList.BLACK_SAND.getDefaultState(), Blocks.STONE.getDefaultState(), BYGBlockList.BLACK_SAND.getDefaultState());
        public static final TernarySurfaceConfig STONEBLACKSAND2 = new TernarySurfaceConfig(Blocks.STONE.getDefaultState(), BYGBlockList.BLACK_SAND.getDefaultState(), BYGBlockList.BLACK_SAND.getDefaultState());
        public static final TernarySurfaceConfig BLUESAND_SB = new TernarySurfaceConfig(BYGBlockList.BLUE_SAND.getDefaultState(), BYGBlockList.BLUE_SAND.getDefaultState(), BYGBlockList.BLUE_SAND.getDefaultState());
        public static final TernarySurfaceConfig PINKSAND_SB = new TernarySurfaceConfig(BYGBlockList.PINK_SAND.getDefaultState(), BYGBlockList.PINK_SAND.getDefaultState(), BYGBlockList.PINK_SAND.getDefaultState());
        public static final TernarySurfaceConfig PURPLESAND_SB = new TernarySurfaceConfig(BYGBlockList.PURPLE_SAND.getDefaultState(), BYGBlockList.PURPLE_SAND.getDefaultState(), BYGBlockList.PURPLE_SAND.getDefaultState());
        public static final TernarySurfaceConfig WHITESAND = new TernarySurfaceConfig(BYGBlockList.WHITE_SAND.getDefaultState(), BYGBlockList.WHITE_SAND.getDefaultState(), BYGBlockList.WHITE_SAND.getDefaultState());
        public static final TernarySurfaceConfig ROCKYSAND = new TernarySurfaceConfig(BYGBlockList.ROCKY_STONE.getDefaultState(), Blocks.SAND.getDefaultState(), Blocks.SAND.getDefaultState());
        public static final TernarySurfaceConfig ROCKYSAND2 = new TernarySurfaceConfig(Blocks.SAND.getDefaultState(), BYGBlockList.ROCKY_STONE.getDefaultState(), Blocks.SAND.getDefaultState());
        public static final TernarySurfaceConfig ROCKYSAND3 = new TernarySurfaceConfig(Blocks.SAND.getDefaultState(), BYGBlockList.ROCKY_STONE.getDefaultState(), BYGBlockList.ROCKY_STONE.getDefaultState());
        public static final TernarySurfaceConfig STONESAND = new TernarySurfaceConfig(Blocks.STONE.getDefaultState(), Blocks.SAND.getDefaultState(), Blocks.SAND.getDefaultState());
        public static final TernarySurfaceConfig STONESAND2 = new TernarySurfaceConfig(Blocks.SAND.getDefaultState(), Blocks.STONE.getDefaultState(), Blocks.SAND.getDefaultState());
        public static final TernarySurfaceConfig STONESAND3 = new TernarySurfaceConfig(Blocks.SAND.getDefaultState(), Blocks.STONE.getDefaultState(), Blocks.STONE.getDefaultState());
        public static final TernarySurfaceConfig SAND = new TernarySurfaceConfig(Blocks.SAND.getDefaultState(), Blocks.SAND.getDefaultState(), Blocks.SAND.getDefaultState());
        public static final TernarySurfaceConfig ROCKY = new TernarySurfaceConfig(BYGBlockList.ROCKY_STONE.getDefaultState(), BYGBlockList.ROCKY_STONE.getDefaultState(), BYGBlockList.ROCKY_STONE.getDefaultState());
        public static final TernarySurfaceConfig STONE = new TernarySurfaceConfig(Blocks.STONE.getDefaultState(), Blocks.STONE.getDefaultState(), Blocks.STONE.getDefaultState());
        public static final TernarySurfaceConfig COARSE = new TernarySurfaceConfig(Blocks.COARSE_DIRT.getDefaultState(), Blocks.COARSE_DIRT.getDefaultState(), Blocks.COARSE_DIRT.getDefaultState());
        public static final TernarySurfaceConfig GLOWSTONEGARDENS = new TernarySurfaceConfig(BYGBlockList.OVERGROWN_NETHERRACK.getDefaultState(), Blocks.NETHERRACK.getDefaultState(), Blocks.NETHERRACK.getDefaultState());


        public static final TernarySurfaceConfig SAND_CF = new TernarySurfaceConfig(Blocks.SAND.getDefaultState(), Blocks.SAND.getDefaultState(), Blocks.SAND.getDefaultState());
        public static final TernarySurfaceConfig REDSAND_CF = new TernarySurfaceConfig(Blocks.RED_SAND.getDefaultState(), Blocks.RED_SAND.getDefaultState(), Blocks.RED_SAND.getDefaultState());
        public static final TernarySurfaceConfig WARPEDDESERT = new TernarySurfaceConfig(BYGBlockList.NYLIUM_SOUL_SAND.getDefaultState(), BYGBlockList.NYLIUM_SOUL_SAND.getDefaultState(), BYGBlockList.NYLIUM_SOUL_SAND.getDefaultState());
        public static final TernarySurfaceConfig SYTHIANTORRIDS = new TernarySurfaceConfig(BYGBlockList.SYTHIAN_NYLIUM.getDefaultState(), Blocks.NETHERRACK.getDefaultState(), Blocks.NETHERRACK.getDefaultState());
        public static final TernarySurfaceConfig WARPEDDESERT_SOIL = new TernarySurfaceConfig(BYGBlockList.NYLIUM_SOUL_SOIL.getDefaultState(), BYGBlockList.NYLIUM_SOUL_SOIL.getDefaultState(), BYGBlockList.NYLIUM_SOUL_SOIL.getDefaultState());
        public static final TernarySurfaceConfig EMBURNYLIUM = new TernarySurfaceConfig(BYGBlockList.EMBUR_NYLIUM.getDefaultState(), BYGBlockList.BLUE_NETHERRACK.getDefaultState(), BYGBlockList.BLUE_NETHERRACK.getDefaultState());


        public static final TernarySurfaceConfig PODZOLDOVERMOUNTAIN_CF = new TernarySurfaceConfig(BYGBlockList.OVERGROWN_DACITE.getDefaultState(), BYGBlockList.DACITE.getDefaultState(), BYGBlockList.DACITE.getDefaultState());
        public static final TernarySurfaceConfig COARSEDIRTDOVERMOUNTAIN_CF = new TernarySurfaceConfig(Blocks.COARSE_DIRT.getDefaultState(), BYGBlockList.DACITE.getDefaultState(), BYGBlockList.DACITE.getDefaultState());
        public static final TernarySurfaceConfig GRASSDOVERMOUNTAIN_CF = new TernarySurfaceConfig(BYGBlockList.PODZOL_DACITE.getDefaultState(), BYGBlockList.DACITE.getDefaultState(), BYGBlockList.DACITE.getDefaultState());

        public static final TernarySurfaceConfig AIR_CF = new TernarySurfaceConfig(Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState());

        public static final TernarySurfaceConfig QUAGMIREPEAT_SB = new TernarySurfaceConfig(BYGBlockList.PEAT.getDefaultState(), BYGBlockList.MUD_BLOCK.getDefaultState(), BYGBlockList.MUD_BLOCK.getDefaultState());
        public static final TernarySurfaceConfig QUAGMIREMUD_CF = new TernarySurfaceConfig(BYGBlockList.MUD_BLOCK.getDefaultState(), BYGBlockList.MUD_BRICKS.getDefaultState(), BYGBlockList.MUD_BLOCK.getDefaultState());
        public static final TernarySurfaceConfig GRASSMOUNTAIN_CF = new TernarySurfaceConfig(Blocks.GRASS_BLOCK.getDefaultState(), Blocks.STONE.getDefaultState(), Blocks.STONE.getDefaultState());
        public static final TernarySurfaceConfig PEATGRASS_CF = new TernarySurfaceConfig(BYGBlockList.PEAT.getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState());
        public static final TernarySurfaceConfig MUD_CF = new TernarySurfaceConfig(BYGBlockList.MUD_BLOCK.getDefaultState(), BYGBlockList.MUD_BLOCK.getDefaultState(), BYGBlockList.MUD_BLOCK.getDefaultState());
        public static final TernarySurfaceConfig TERRACOTTA_CF = new TernarySurfaceConfig(Blocks.TERRACOTTA.getDefaultState(), Blocks.TERRACOTTA.getDefaultState(), Blocks.TERRACOTTA.getDefaultState());
        public static final TernarySurfaceConfig GLOWCELIUM_CF = new TernarySurfaceConfig(BYGBlockList.GLOWCELIUM.getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState());

        public static final TernarySurfaceConfig GREEN_CONCRETE_POWDER_CF = new TernarySurfaceConfig(BYGBlockList.OVERGROWN_STONE.getDefaultState(), BYGBlockList.MOSSY_STONE.getDefaultState(), Blocks.STONE.getDefaultState());

        public static final TernarySurfaceConfig RED_ROCK_CF = new TernarySurfaceConfig(BYGBlockList.RED_ROCK.getDefaultState(), BYGBlockList.RED_ROCK.getDefaultState(), BYGBlockList.RED_ROCK.getDefaultState());

        public static final TernarySurfaceConfig IVIS_CF = new TernarySurfaceConfig(BYGBlockList.IVIS_PHYLIUM.getDefaultState(), Blocks.END_STONE.getDefaultState(), Blocks.END_STONE.getDefaultState());
        public static final TernarySurfaceConfig END = new TernarySurfaceConfig(Blocks.END_STONE.getDefaultState(), Blocks.END_STONE.getDefaultState(), Blocks.END_STONE.getDefaultState());
        public static final TernarySurfaceConfig MYCELIUM = new TernarySurfaceConfig(Blocks.MYCELIUM.getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState());

    }
}
