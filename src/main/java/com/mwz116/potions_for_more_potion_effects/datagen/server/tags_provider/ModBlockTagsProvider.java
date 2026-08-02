package com.mwz116.potions_for_more_potion_effects.datagen.server.tags_provider;

import com.mwz116.potions_for_more_potion_effects.PotionsForMorePotionEffects;
import com.mwz116.potions_for_more_potion_effects.block.ModBlocks;
import com.mwz116.potions_for_more_potion_effects.tag.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, PotionsForMorePotionEffects.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {

        tag(ModTags.BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SOLID_DEEPSLATE.get());

        tag(ModTags.BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SOLID_DEEPSLATE.get());
    }
}
