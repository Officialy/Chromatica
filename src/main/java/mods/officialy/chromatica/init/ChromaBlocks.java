package mods.officialy.chromatica.init;

import mods.officialy.chromatica.Chromatica;
import mods.officialy.chromatica.common.block.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.neoforge.client.model.generators.BlockModelBuilder;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.client.model.generators.loaders.CompositeModelBuilder;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ChromaBlocks {
  //blocks deferred registry
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, Chromatica.MOD_ID);

    //pylon block via deferred registry
    public static final DeferredHolder<Block, BlockCrystalPylon> PYLON = BLOCKS.register("pylon", () -> new BlockCrystalPylon(BlockBehaviour.Properties.of()));

//    public static final Registrate REGISTRATE = Chromatica.registrate();

  /*  public static final BlockEntry<BlockChromaPlantTile> TILEPLANT = REGISTRATE
            .block("chromaticplant", BlockChromaPlantTile::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockChromaTile> TILEENTITY = REGISTRATE
            .block("chromatictile", BlockChromaTile::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockModelledChromaTile> TILEMODELLED = REGISTRATE
            .block("modelledchromatictile", BlockModelledChromaTile::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockCrystalRune> RUNE = REGISTRATE
            .block("crystalrune", BlockCrystalRune::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockActiveChroma> CHROMA = REGISTRATE
            .block("fluidchroma", BlockActiveChroma::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockRift> RIFT = REGISTRATE
            .block("rift", BlockRift::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockCaveCrystal> CRYSTAL = REGISTRATE
            .block("crystalcave", BlockCaveCrystal::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockRainbowCrystal> RAINBOWCRYSTAL = REGISTRATE
            .block("crystalrainbow", BlockRainbowCrystal::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockCrystalLamp> LAMP = REGISTRATE
            .block("crystallamp", BlockCrystalLamp::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockSuperCrystal> SUPER = REGISTRATE
            .block("crystalsuper", BlockSuperCrystal::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockCrystalPlant> PLANT = REGISTRATE
            .block("crystalplant", BlockCrystalPlant::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockCrystalHive> HIVE = REGISTRATE
            .block("blockcrystalhive", BlockCrystalHive::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockCrystalTile> TILECRYSTAL = REGISTRATE
            .block("crystaltile", BlockCrystalTile::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockCrystalTileNonCube> TILECRYSTALNONCUBE = REGISTRATE
            .block("crystaltilenoncube", BlockCrystalTileNonCube::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockDyeLeaf> DECAY = REGISTRATE
            .block("dyeleaf", BlockDyeLeaf::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockDyeLeaf> DYELEAF = REGISTRATE
            .block("dyeleaf", BlockDyeLeaf::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockDyeSapling> DYESAPLING = REGISTRATE
            .block("dyesapling", BlockDyeSapling::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockDye> DYE = REGISTRATE
            .block("dye", BlockDye::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockRainbowLeaf> RAINBOWLEAF = REGISTRATE
            .block("rainbowleaf", BlockRainbowLeaf::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockRainbowSapling> RAINBOWSAPLING = REGISTRATE
            .block("rainbowsapling", BlockRainbowSapling::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockDyeFlower> DYEFLOWER = REGISTRATE
            .block("dyeflower", BlockDyeFlower::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockLiquidEnder> ENDER = REGISTRATE
            .block("liquidender", BlockLiquidEnder::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockDyeGrass> DYEGRASS = REGISTRATE
            .block("dyegrass", BlockDyeGrass::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockCrystalPylon> PYLON = REGISTRATE
            .block("crystalpylon", BlockCrystalPylon::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockCrystalTank> TANK = REGISTRATE
            .block("crystaltank", BlockCrystalTank::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockCrystalFence> FENCE = REGISTRATE
            .block("crystalfence", BlockCrystalFence::new)
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockTieredPlant> TIEREDPLANT = REGISTRATE
            .block("tieredplant", BlockTieredPlant::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockTieredOre> TIEREDORE = REGISTRATE
            .block("tieredore", BlockTieredOre::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockDecoPlant> DECOPLANT = REGISTRATE
            .block("decoplant", BlockDecoPlant::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockPowerTree> POWERTREE = REGISTRATE
            .block("powertree", BlockPowerTree::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockModelledChromaTile> TILEMODELLED2 = REGISTRATE
            .block("modelledchromatile2", BlockModelledChromaTile::new)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockRangedLamp> LAMPBLOCK = REGISTRATE
            .block("lampblock", BlockRangedLamp::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockEnderTNT> TNT = REGISTRATE
            .block("endertnt", BlockEnderTNT::new)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockPath> PATH = REGISTRATE
            .block("path", BlockPath::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockStructureShield> STRUCTSHIELD = REGISTRATE
            .block("structureshield", BlockStructureShield::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockLootChest> LOOTCHEST = REGISTRATE
            .block("lootchest", BlockLootChest::new)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockChromaPortal> PORTAL = REGISTRATE
            .block("portal", BlockChromaPortal::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockLumenRelay> RELAY = REGISTRATE
            .block("relay", BlockLumenRelay::new)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockCrystalGlow> GLOW = REGISTRATE
            .block("glow", BlockCrystalGlow::new)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockHeatLamp> HEATLAMP = REGISTRATE
            .block("heatlamp", BlockHeatLamp::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockVoidRift> VOIDRIFT = REGISTRATE
            .block("voidrift", BlockVoidRift::new)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockDimensionDeco> DIMGEN = REGISTRATE
            .block("dimdeco", BlockDimensionDeco::new)
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockDimensionDecoTile> DIMGENTILE = REGISTRATE
            .block("dimdeco2", BlockDimensionDecoTile::new)
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockColoredLock> COLORLOCK = REGISTRATE
            .block("colorlock", BlockColoredLock::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockStructureDataStorage> DIMDATA = REGISTRATE
            .block("dimdata", BlockStructureDataStorage::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockLockFence> LOCKFENCE = REGISTRATE
            .block("lockfence", BlockLockFence::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockLockFreeze> LOCKFREEZE = REGISTRATE
            .block("lockfreeze", BlockLockFreeze::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockLockKey> LOCKKEY = REGISTRATE
            .block("lockkey", BlockLockKey::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockLightedLeaf> GLOWLEAF = REGISTRATE
            .block("glowleaf", BlockLightedLeaf::new)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockLightedLog> GLOWLOG = REGISTRATE
            .block("glowlog", BlockLightedLog::new)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockLightedSapling> GLOWSAPLING = REGISTRATE
            .block("glowsapling", BlockLightedSapling::new)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockHoverBlock> HOVER = REGISTRATE
            .block("hover", BlockHoverBlock::new)
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockGOLTile> GOL = REGISTRATE
            .block("gol", BlockGOLTile::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockGOLController> GOLCONTROL = REGISTRATE
            .block("golcontrol", BlockGOLController::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockMusicMemory> MUSICMEMORY = REGISTRATE
            .block("musicmem", BlockMusicMemory::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockMusicTrigger> MUSICTRIGGER = REGISTRATE
            .block("musictrigger", BlockMusicTrigger::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockShiftKey> SHIFTKEY = REGISTRATE
            .block("shiftkey", BlockShiftKey::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockShiftLock> SHIFTLOCK = REGISTRATE
            .block("shiftlock", BlockShiftLock::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockTeleport> TELEPORT = REGISTRATE
            .block("teleportblock", BlockTeleport::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockSpecialShield> SPECIALSHIELD = REGISTRATE
            .block("specialshield", BlockSpecialShield::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockColoredAltar> COLORALTAR = REGISTRATE
            .block("coloraltar", BlockColoredAltar::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockChromaDoor> DOOR = REGISTRATE
            .block("door", BlockChromaDoor::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();
    public static final BlockEntry<BlockCrystalGlass> GLASS = REGISTRATE
            .block("glass", BlockCrystalGlass::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockCrystalConsole> CONSOLE = REGISTRATE
            .block("console", BlockCrystalConsole::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockEtherealLight> LIGHT = REGISTRATE
            .block("light", BlockEtherealLight::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockMultiStorage> STORAGE = REGISTRATE
            .block("storageblock", BlockMultiStorage::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockDecoFlower> DECOFLOWER = REGISTRATE
            .block("decoflower", BlockDecoFlower::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockSelectiveGlass> SELECTIVEGLASS = REGISTRATE
            .block("selectiveglass", BlockSelectiveGlass::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockModelledChromaTile> TILEMODELLED3 = REGISTRATE
            .block("modelledchromatictile3", BlockModelledChromaTile::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockHoverPad> PAD = REGISTRATE
            .block("hoverpadaux", BlockHoverPad::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockAdjacencyUpgrade> ADJACENCY = REGISTRATE
            .block("adjacencyupgrade", BlockAdjacencyUpgrade::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockAntKey> ANTKEY = REGISTRATE
            .block("antkey", BlockAntKey::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();
    public static final BlockEntry<BlockLaserEffector> LASEREFFECT = REGISTRATE
            .block("lasereffect", BlockLaserEffector::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockPinballTile> PINBALL = REGISTRATE
            .block("pinball", BlockPinballTile::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockGravityTile> GRAVITY = REGISTRATE
            .block("gravity", BlockGravityTile::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockChromaTrail> TRAIL = REGISTRATE
            .block("trail", BlockChromaTrail::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockDynamicBridge> BRIDGE = REGISTRATE
            .block("bridge", BlockDynamicBridge::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockBridgeControl> BRIDGECONTROL = REGISTRATE
            .block("bridgecontrol", BlockBridgeControl::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockSparkle> SPARKLE = REGISTRATE
            .block("sparkle", BlockSparkle::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockEtherealLuma> LUMA = REGISTRATE
            .block("luma", BlockEtherealLuma::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockChromaTile> TILEENTITY2 = REGISTRATE
            .block("chromatictile2", BlockChromaTile::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockAvoLamp> AVOLAMP = REGISTRATE
            .block("avolamp", BlockAvoLamp::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();
    public static final BlockEntry<BlockRelayFilter> RELAYFILTER = REGISTRATE
            .block("relayfilter", BlockRelayFilter::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockRouterNode> ROUTERNODE = REGISTRATE
            .block("routernode", BlockRouterNode::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockEverFluid> EVERFLUID = REGISTRATE
            .block("everfluid", BlockEverFluid::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockLightPanel> LIGHTPANEL = REGISTRATE
            .block("lightpanel", BlockLightPanel::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockLightSwitch> PANELSWITCH = REGISTRATE
            .block("panelswitch", BlockLightSwitch::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockUnknownArtefact> ARTEFACT = REGISTRATE
            .block("artefactblock", BlockUnknownArtefact::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockDummyAux> DUMMYAUX = REGISTRATE
            .block("dummyaux", BlockDummyAux::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockCliffStone> CLIFFSTONE = REGISTRATE
            .block("cliffstone", BlockCliffStone::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockCaveIndicator> CAVEINDICATOR = REGISTRATE
            .block("caveindicator", BlockCaveIndicator::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockModelledChromaTile> TILEMODELLED4 = REGISTRATE
            .block("modelledchromatictile4", BlockModelledChromaTile::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockRepeaterLight> REPEATERLAMP = REGISTRATE
            .block("repeaterlamp", BlockRepeaterLight::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockRotatingLock> WATERLOCK = REGISTRATE
            .block("waterlock", BlockRotatingLock::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockRedstonePod> REDSTONEPOD = REGISTRATE
            .block("redstonepod", BlockRedstonePod::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockPolyCrystal> POLYCRYSTAL = REGISTRATE
            .block("polycrystal", BlockPolyCrystal::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockLiquidLumen> MOLTENLUMEN = REGISTRATE
            .block("moltenlumen", BlockLiquidLumen::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();
    public static final BlockEntry<BlockMetaAlloyLamp> METAALLOYLAMP = REGISTRATE
            .block("metaalloylamp", BlockMetaAlloyLamp::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockWarpNode> WARPNODE = REGISTRATE
            .block("warpnode", BlockWarpNode::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockFakeSky> FAKESKY = REGISTRATE
            .block("fakesky", BlockFakeSky::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockDimensionChunkloader> CHUNKLOADER = REGISTRATE
            .block("chunkloader", BlockDimensionChunkloader::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockTrapFloor> TRAPFLOOR = REGISTRATE
            .block("trapfloor", BlockTrapFloor::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockBedrockCrack> BEDROCKCRACK = REGISTRATE
            .block("bedrockcrack", BlockBedrockCrack::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockRFNode> RFPOD = REGISTRATE
            .block("rfpod", BlockRFNode::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockPistonTapeBit> PISTONBIT = REGISTRATE
            .block("pistonbit", BlockPistonTapeBit::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockPistonTarget> PISTONTARGET = REGISTRATE
            .block("pistontarget", BlockPistonTarget::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockPistonController> PISTONCONTROL = REGISTRATE
            .block("pistoncontrol", BlockPistonController::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();
    public static final BlockEntry<BlockRayblendFloor> RAYBLEND = REGISTRATE
            .block("rayblend", BlockRayblendFloor::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockEncrustedCrystal> ENCRUSTED = REGISTRATE
            .block("encrusted", BlockEncrustedCrystal::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockCastingInjectorFocus> INJECTORAUX = REGISTRATE
            .block("injectorfocus", BlockCastingInjectorFocus::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockDyeVine> DYEVINE = REGISTRATE
            .block("dyevine", BlockDyeVine::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockDyeVine> FERTILEDYEVINE = REGISTRATE
            .block("dyevinefertile", BlockDyeVine::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockNetherBypassGate> NETHERGATE = REGISTRATE
            .block("nethergate", BlockNetherBypassGate::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockVoidCave> VOIDCAVE = REGISTRATE
            .block("voidcave", BlockVoidCave::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockChromaMud> MUD = REGISTRATE
            .block("mud", BlockChromaMud::new)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();

    public static final BlockEntry<BlockPylonStructure> CRYSTALLINE_STONE = REGISTRATE
            .block("crystalline_stone", BlockPylonStructure::new)
            .properties(props -> props.strength(1.2f, 8))
            .tag(BlockTags.NEEDS_IRON_TOOL, BlockTags.MINEABLE_WITH_PICKAXE)
            .blockstate(ChromaBlocks::magicBlock)
            .item()
            .tab(ChromaTabs.CHROMATICA.getKey())
            .build()
            .register();
    public static void magicBlock(DataGenContext<Block, ? extends Block> ctx, RegistrateBlockstateProvider prov) {
        magicBlock(ctx, prov, createModel(ctx, prov, new ResourceLocation(ctx.getId().getNamespace(), "block/" + ctx.getId().getPath())));
    }

    private static void magicBlock(DataGenContext<Block, ? extends Block> ctx, RegistrateBlockstateProvider prov, ModelFile model) {
        prov.getVariantBuilder(ctx.get())
                .forAllStates(state -> ConfiguredModel
                        .builder()
                        .modelFile(model)
                        .rotationY(((int) state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot() + 180) % 360)
                        .build());
    }
    private static ModelFile createModel(DataGenContext<Block, ? extends Block> ctx, RegistrateBlockstateProvider prov, ResourceLocation model) {
        return prov.models().withExistingParent(model.getPath() , prov.mcLoc("block/block"))
                .texture("particle", new ResourceLocation(model.getNamespace(),"block/" + ctx.getName() + "_front"))
                .customLoader(CompositeModelBuilder::begin)
                .child("machine", new BlockModelBuilder(null, prov.models().existingFileHelper).parent(prov.models().getExistingFile(model)))
                .end();
   }*/
    //Class initializer
    public static void register() {
    }

}