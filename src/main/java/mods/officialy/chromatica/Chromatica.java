package mods.officialy.chromatica;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import mods.officialy.chromatica.common.level.gen.biome.ChromaOWRegion;
import mods.officialy.chromatica.init.ChromaBlockStateProviderTypes;
import mods.officialy.chromatica.init.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.event.level.LevelEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import org.slf4j.Logger;
import terrablender.api.Regions;

@Mod(Chromatica.MOD_ID)
public class Chromatica {

    public static final String MOD_ID = "chromatica";
    //    private static final NonNullSupplier<Registrate> REGISTRATE = NonNullSupplier.lazy(() -> Registrate.create(MOD_ID));
    public static final Logger LOGGER = LogUtils.getLogger();

    static DeferredRegister<Codec<? extends BiomeModifier>> BIOME_MODIFIER_SERIALIZERS =
            DeferredRegister.create(NeoForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MOD_ID);

    public static final DeferredHolder<Codec<? extends BiomeModifier>, Codec<ChromaBiomeModifier>> EXAMPLE_CODEC = BIOME_MODIFIER_SERIALIZERS.register("example", () ->
            RecordCodecBuilder.create(builder -> builder.group(
                    // declare fields
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(ChromaBiomeModifier::biomes),
                    PlacedFeature.LIST_CODEC.fieldOf("features").forGetter(ChromaBiomeModifier::features),
                    GenerationStep.Decoration.CODEC.fieldOf("step").forGetter(ChromaBiomeModifier::step)
            ).apply(builder, ChromaBiomeModifier::new)));

    public Chromatica() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        ChromaTabs.CREATIVE_MODE_TABS.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);
        ChromaBlocks.BLOCKS.register(modEventBus);
        ChromaParticleTypes.PARTICLES.register(modEventBus);
        ChromaItems.register();
        ChromaFoliagePlacerTypes.FOLIAGE_PLACER_TYPES.register(modEventBus);
        ChromaFeatures.FEATURE_REGISTRY.register(modEventBus);
        ChromaPlacedFeatures.PLACED_FEATURE_REGISTRY.register(modEventBus);
        ChromaCarvers.CARVER_CONFIGURATIONS.register(modEventBus);
        ChromaCarvers.CARVERS.register(modEventBus);
        ChromaBlockStateProviderTypes.BLOCK_STATE_PROVIDER_TYPES.register(modEventBus);
        ChromaBlockEntities.BLOCK_ENTITIES.register(modEventBus);
        ChromaDim.register();
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);


    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            Regions.register(new ChromaOWRegion(new ResourceLocation(MOD_ID, "overworld"), 42));

        });
    }

    @SubscribeEvent
    public void loadLevelEvent(LevelEvent.Load event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    public static ResourceLocation rl(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    /*public static Registrate registrate() {
        return REGISTRATE.get();
    }*/
}
