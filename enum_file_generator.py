import os

# Example usage
enum = ["ItemChromaBucket",
"ItemChromaPlacer",
"ItemInventoryLinker",
"ItemLinkedTilePlacer",
"ItemAdjacencyPlacer",
"ItemManipulator",
"ItemCrystalShard",
"ItemCrystalPotion",
"ItemCluster",
"ItemPendant",
"ItemBoostedPendant",
"ItemCrystalSeeds",
"ItemEnderCrystal",
"ItemCrystalBasic",
"ItemExcavationWand",
"ItemVacuumGun",
"ItemChromaCrafting",
"ItemStorageCrystal",
"ItemConnector",
"ItemChromaBerry",
"ItemPylonFinder",
"ItemTieredResource",
"ItemElementalStone",
"ItemTransitionWand",
"ItemChromaBook",
"ItemChromaMisc",
"ItemInfoFragment",
"ItemDuplicationWand",
"ItemMobilityWand",
"ItemBuilderWand",
"ItemCaptureWand",
"ItemVoidStorage",
"ItemMultiTool",
"ItemShooWand",
"ItemOrePick",
"ItemOreSilker",
"ItemAuraPouch",
"ItemGrowthWand",
"ItemBulkMover",
"ItemChainGun",
"ItemFlightWand",
"ItemDimGen",
"ItemSplashGun",
"ItemDoorKey",
"ItemCrystalCard",
"ItemOwnerKey",
"ItemResetWand",
"ItemColoredModInteract",
"ItemLightWand",
"ItemCrystalCell",
"ItemPurifyCrystal",
"ItemEfficiencyCrystal",
"ItemKillAuraGun",
"ItemThrowableGem",
"ItemFloatstoneBoots",
"ItemWarpCapsule",
"ItemChromaBeeFrame",
"ItemStructureFinder",
"ItemMagicBranch",
"ItemUnknownArtefact",
"ItemDataCrystal",
"ItemMobSonar",
"ItemFertilitySeed",
"ItemCaveExitFinder",
"ItemSplineAttack",
"ItemShieldedCell",
"ItemBottleneckFinder",
"ItemSpawnerBypass",
"ItemT2EnderEye",
"ItemLightGun",
"ItemStructureMap",
"ItemCrystalProbe",
"ItemTeleGateLock",
"ItemEnderBucket",
"ItemWideCollector",
"ItemManipulatorFocus",
"ItemNetherKey",
"ItemAbilityFocus",
"ItemRecipeCacheCapsule",
"ItemPatternCrystal",
"ItemEtherealPendant"]

# Specify the package name and output directory
package_name = "mods.officialy.chromatica.common.item"
output_directory = "output"

# Ensure the output directory exists
os.makedirs(output_directory, exist_ok=True)

# Iterate over enum values and generate Java class files
for enum_value in enum:
    # Construct the class name and output file path
    output_file = os.path.join(output_directory, f"{enum_value}.java")

    # Create the Java class file
    with open(output_file, "w") as java_file:
        # Write package declaration
        java_file.write(f"package {package_name};\n\n")

        # Write imports or additional code if needed
        java_file.write(f"import net.minecraft.world.item.Item;\n")

        # Write the class header
        java_file.write(f"public class {enum_value} extends Item {{\n\n")

        # Write your code for this class here
        java_file.write(f"    public {enum_value}(Properties properties) {{\n")
        java_file.write(f"        super(properties);\n")
        java_file.write(f"    }}\n\n")
        
        # Write closing brace for the class
        java_file.write("}\n")

    print(f"Java class '{enum_value}' generated at {output_file}")