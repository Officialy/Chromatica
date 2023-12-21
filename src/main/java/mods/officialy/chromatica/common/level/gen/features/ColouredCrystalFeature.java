package mods.officialy.chromatica.common.level.gen.features;

import com.mojang.serialization.Codec;
import mods.officialy.chromatica.common.level.gen.features.config.ColouredCrystalFeatureConfig;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;

public class ColouredCrystalFeature extends Feature<ColouredCrystalFeatureConfig> {

    public ColouredCrystalFeature(Codec<ColouredCrystalFeatureConfig> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<ColouredCrystalFeatureConfig> config) {

        /*chunkX *= 16;
        chunkZ *= 16;
        int amt = (int)(PER_CHUNK*this.getDensityFactor(world, chunkX, chunkZ));
        for (int i = 0; i < amt; i++) {
            int posX = chunkX + random.nextInt(16);
            int posZ = chunkZ + random.nextInt(16);
            int maxy = 200;
            if (config.level() == Level.NETHER)
                maxy = 128;
            int posY = 4+random.nextInt(maxy-4);
            Block id = ChromaBlocks.CRYSTAL.get();
            CrystalColours colour = CrystalColours.random(config.random());
            if (this.canGenerateAt(world, posX, posY, posZ)) {
                world.setBlock(posX, posY, posZ, id, meta, 3);
                NeoForged.EVENT_BUS.post(new GenerateCrystalEvent(config.level(), posX, posY, posZ, config.random(), colour));
                //ReikaJavaLibrary.pConsole("Generating "+ReikaDyeHelper.dyes[meta].getName()+" Crystal at "+posX+", "+posY+", "+posZ);
            }
            int r = 3;
            for (int k = -r; k <= r; k++) {
                for (int l = -r; l <= r; l++) {
                    for (int m = -r; m <= r; m++) {
                        config.level().blockUpdated(posX, posY, posZ);
                    }
                }
            }
        }*/
        return true;
    }

}
