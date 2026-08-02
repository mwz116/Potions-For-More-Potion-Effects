package com.mwz116.potions_for_more_potion_effects.datagen.server;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

import com.mwz116.potions_for_more_potion_effects.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

public class ModLootTableProvider extends LootTableProvider {
    public ModLootTableProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, Set.of(), List.of(
                new SubProviderEntry(ModBlockLootSubProvider::new, LootContextParamSets.BLOCK)
        ), lookupProvider);
    }

    public static class ModBlockLootSubProvider extends BlockLootSubProvider {
        public ModBlockLootSubProvider(HolderLookup.Provider lookupProvider) {
            super(Set.of(), FeatureFlags.DEFAULT_FLAGS, lookupProvider);
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return ModBlocks.BLOCKS.getEntries().stream().map(e -> (Block) e.value()).toList();
        }

        @Override
        protected void generate() {
            dropSelf(ModBlocks.SOLID_DEEPSLATE.get());
        }
    }
}
