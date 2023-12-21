package mods.officialy.chromatica;

import com.mojang.logging.LogUtils;
import mods.officialy.chromatica.common.level.gen.biome.ChromaOWRegion;
import mods.officialy.chromatica.init.*;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;
import terrablender.api.RegionType;
import terrablender.api.Regions;

@Mod(Chromatica.MOD_ID)
public class Chromatica {

    public static final String MOD_ID = "chromatica";
//    private static final Lazy<Registrate> REGISTRATE = Lazy.of(() -> Registrate.create(MOD_ID));
    public static final Logger LOGGER = LogUtils.getLogger();

    public Chromatica() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);

        ChromaTabs.CREATIVE_MODE_TABS.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);
        ChromaBlocks.register();
        ChromaItems.register();
        ChromaFeatures.PLACED_FEATURE_REGISTRY.register(modEventBus);
//        ChromaCarvers.CARVER_CONFIGURATIONS.register(modEventBus);
        ChromaCarvers.CARVERS.register(modEventBus);
        ChromaDim.register();
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            Regions.register(new ChromaOWRegion(new ResourceLocation(MOD_ID, "overworld"),5));

        } );
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
//    public static Registrate registrate() {
//        return REGISTRATE.get();
//    }
}
