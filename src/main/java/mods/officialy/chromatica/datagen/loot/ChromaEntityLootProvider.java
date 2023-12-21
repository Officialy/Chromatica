package mods.officialy.chromatica.datagen.loot;

import mods.officialy.chromatica.Chromatica;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.loot.EntityLootSubProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.flag.FeatureFlags;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ChromaEntityLootProvider extends EntityLootSubProvider {

    public  ChromaEntityLootProvider() {
        super(FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    public void generate() {

    }

    @Override
    protected Stream<EntityType<?>> getKnownEntityTypes() {
        return StreamSupport.stream(BuiltInRegistries.ENTITY_TYPE.spliterator(), false)
                .filter(entry ->
                        Optional.of(BuiltInRegistries.ENTITY_TYPE.getKey(entry))
                                .filter(key -> key.getNamespace().equals(Chromatica.MOD_ID))
                                .isPresent()
                ).collect(Collectors.toSet()).stream();
    }
}
