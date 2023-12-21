package mods.officialy.chromatica.init;

import mods.officialy.chromatica.Chromatica;
import mods.officialy.chromatica.common.item.*;

public class ChromaItems {

//    private static final Registrate REGISTRATE = Chromatica.registrate();
//    public static final ItemEntry<ItemChromaBucket> BUCKET = REGISTRATE.item("bucket", ItemChromaBucket::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemChromaPlacer> PLACER = REGISTRATE.item("placer", ItemChromaPlacer::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemInventoryLinker> LINK = REGISTRATE.item("invlink", ItemInventoryLinker::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemLinkedTilePlacer> RIFT = REGISTRATE.item("rift", ItemLinkedTilePlacer::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemAdjacencyPlacer> ADJACENCY = REGISTRATE.item("adjacency", ItemAdjacencyPlacer::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemManipulator> WAND = REGISTRATE.item("wand", ItemManipulator::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemCrystalShard> SHARD = REGISTRATE.item("shard", ItemCrystalShard::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();

//    public static final ItemEntry<ItemCrystalPotion> POTION = REGISTRATE.item("potion", ItemCrystalPotion::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemCluster> CLUSTER = REGISTRATE.item("cluster", ItemCluster::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemPendant> PENDANT = REGISTRATE.item("pendant", ItemPendant::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemBoostedPendant> PENDANT3 = REGISTRATE.item("pendant3", ItemBoostedPendant::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemCrystalSeeds> SEED = REGISTRATE.item("seeds", ItemCrystalSeeds::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemEnderCrystal> ENDERCRYSTAL = REGISTRATE.item("endercrystal", ItemEnderCrystal::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemCrystalBasic> DYE = REGISTRATE.item("dye", ItemCrystalBasic::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemExcavationWand> EXCAVATOR = REGISTRATE.item("excavator", ItemExcavationWand::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemVacuumGun> VACUUMGUN = REGISTRATE.item("vac", ItemVacuumGun::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemChromaCrafting> CRAFTING = REGISTRATE.item("craft", ItemChromaCrafting::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemCrystalBasic> LENS = REGISTRATE.item("lens", ItemCrystalBasic::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemStorageCrystal> STORAGE = REGISTRATE.item("storage", ItemStorageCrystal::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemConnector> LINKTOOL = REGISTRATE.item("linker", ItemConnector::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemChromaBerry> BERRY = REGISTRATE.item("berry", ItemChromaBerry::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemPylonFinder> FINDER = REGISTRATE.item("finder", ItemPylonFinder::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemTieredResource> TIERED = REGISTRATE.item("tiered", ItemTieredResource::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemElementalStone> ELEMENTAL = REGISTRATE.item("elemental", ItemElementalStone::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemTransitionWand> TRANSITION = REGISTRATE.item("transition", ItemTransitionWand::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemChromaBook> HELP = REGISTRATE.item("helpitem", ItemChromaBook::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemChromaMisc> MISC = REGISTRATE.item("misc", ItemChromaMisc::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemInfoFragment> FRAGMENT = REGISTRATE.item("fragment", ItemInfoFragment::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemDuplicationWand> DUPLICATOR = REGISTRATE.item("duplicator", ItemDuplicationWand::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemMobilityWand> TELEPORT = REGISTRATE.item("teleport", ItemMobilityWand::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemBuilderWand> BUILDER = REGISTRATE.item("builder", ItemBuilderWand::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemCaptureWand> CAPTURE = REGISTRATE.item("capture", ItemCaptureWand::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemVoidStorage> VOIDCELL = REGISTRATE.item("aecell", ItemVoidStorage::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemChromaMisc> MODINTERACT = REGISTRATE.item("modinteract", ItemChromaMisc::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemMultiTool> MULTITOOL = REGISTRATE.item("multitool", ItemMultiTool::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemShooWand> SHOO = REGISTRATE.item("shoo", ItemShooWand::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemOrePick> OREPICK = REGISTRATE.item("orepick", ItemOrePick::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemOreSilker> ORESILK = REGISTRATE.item("oresilk", ItemOreSilker::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemAuraPouch> AURAPOUCH = REGISTRATE.item("aurapouch", ItemAuraPouch::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemGrowthWand> GROWTH = REGISTRATE.item("growth", ItemGrowthWand::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//    public static final ItemEntry<ItemKillAuraGun> KILLAURAGUN = REGISTRATE.item("killauragun", ItemKillAuraGun::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemThrowableGem> THROWGEM = REGISTRATE.item("throwgem", ItemThrowableGem::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemFloatstoneBoots> FLOATBOOTS = REGISTRATE.item("floatboots", ItemFloatstoneBoots::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemWarpCapsule> WARPCAPSULE = REGISTRATE.item("warpitem", ItemWarpCapsule::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemChromaBeeFrame> BEEFRAME = REGISTRATE.item("beeframe", ItemChromaBeeFrame::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemStructureFinder> STRUCTUREFINDER = REGISTRATE.item("structfind", ItemStructureFinder::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemMagicBranch> MAGICBRANCH = REGISTRATE.item("branch", ItemMagicBranch::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemUnknownArtefact> ARTEFACT = REGISTRATE.item("artefact", ItemUnknownArtefact::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemDataCrystal> DATACRYSTAL = REGISTRATE.item("datacrystal", ItemDataCrystal::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemMobSonar> MOBSONAR = REGISTRATE.item("mobsonar", ItemMobSonar::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemFertilitySeed> FERTILITYSEED = REGISTRATE.item("fertileseed", ItemFertilitySeed::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemCaveExitFinder> CAVEPATHER = REGISTRATE.item("cavepather", ItemCaveExitFinder::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemSplineAttack> SPLINEATTACK = REGISTRATE.item("splineattack", ItemSplineAttack::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemShieldedCell> SHIELDEDCELL = REGISTRATE.item("shieldedcell", ItemShieldedCell::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemBottleneckFinder> BOTTLENECK = REGISTRATE.item("bottleneck", ItemBottleneckFinder::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemSpawnerBypass> SPAWNERBYPASS = REGISTRATE.item("spawnerbypass", ItemSpawnerBypass::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemT2EnderEye> ENDEREYE = REGISTRATE.item("endereye", ItemT2EnderEye::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemLightGun> LIGHTGUN = REGISTRATE.item("lightgun", ItemLightGun::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemStructureMap> STRUCTMAP = REGISTRATE.item("structmap", ItemStructureMap::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemCrystalProbe> PROBE = REGISTRATE.item("probe", ItemCrystalProbe::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemTeleGateLock> TELEGATELOCK = REGISTRATE.item("telegatelock", ItemTeleGateLock::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemEnderBucket> ENDERBUCKET = REGISTRATE.item("enderbucket", ItemEnderBucket::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemWideCollector> WIDECOLLECTOR = REGISTRATE.item("widecollector", ItemWideCollector::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemManipulatorFocus> MANIPFOCUS = REGISTRATE.item("manipfocus", ItemManipulatorFocus::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemNetherKey> NETHERKEY = REGISTRATE.item("netherkey", ItemNetherKey::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemAbilityFocus> ABILITYFOCUS = REGISTRATE.item("abilityfocus", ItemAbilityFocus::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemRecipeCacheCapsule> RECIPECACHE = REGISTRATE.item("recipecapsule", ItemRecipeCacheCapsule::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemPatternCrystal> MULTIPATTERN = REGISTRATE.item("patterncrystal", ItemPatternCrystal::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();
//
//    public static final ItemEntry<ItemEtherealPendant> ETHERPENDANT = REGISTRATE.item("etherpendant", ItemEtherealPendant::new)
//            .tab(ChromaTabs.CHROMATICA.getKey())
//            .register();

    public static void register() {
    }
}