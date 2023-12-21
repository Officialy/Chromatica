package mods.officialy.chromatica.datagen.loot;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import mods.officialy.chromatica.Chromatica;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.*;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ChromaLootTableProvider extends LootTableProvider {
    private ChromaLootTableProvider(final PackOutput output, final List<SubProviderEntry> subProviders) {
        super(output, Set.of(), subProviders);
    }

    public static ChromaLootTableProvider create(final PackOutput output) {
        return new ChromaLootTableProvider(output, ImmutableList.of(
                new SubProviderEntry(ChromaBlockLootProvider::new, LootContextParamSets.BLOCK),
                new SubProviderEntry(ChromaEntityLootProvider::new, LootContextParamSets.ENTITY),
                new SubProviderEntry(ChromaGenericLootProvider::new, LootContextParamSets.ALL_PARAMS)
        ));
    }

    @Override
    protected void validate(final Map<ResourceLocation, LootTable> map, final ValidationContext validationContext) {
        final var modLootTableIds = BuiltInLootTables
                .all()
                .stream()
                .filter(lootTable -> lootTable.getNamespace().equals(Chromatica.MOD_ID))
                .collect(Collectors.toSet());

        for (final var id : Sets.difference(modLootTableIds, map.keySet())) {
            validationContext.reportProblem("Missing mod loot table: " + id);
        }

        map.forEach((id, lootTable) -> lootTable.validate(
                validationContext
                        .setParams(lootTable.getParamSet())
                        .enterElement("{" + id + "}", new LootDataId<>(LootDataType.TABLE, id))
        ));
    }
}