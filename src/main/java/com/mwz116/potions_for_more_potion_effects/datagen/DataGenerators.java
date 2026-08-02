package com.mwz116.potions_for_more_potion_effects.datagen;

import com.mwz116.potions_for_more_potion_effects.PotionsForMorePotionEffects;
import com.mwz116.potions_for_more_potion_effects.datagen.client.*;
import com.mwz116.potions_for_more_potion_effects.datagen.client.language_provider.ModEnUsLanguageProvider;
import com.mwz116.potions_for_more_potion_effects.datagen.client.language_provider.ModZhCnLanguageProvider;
import com.mwz116.potions_for_more_potion_effects.datagen.server.*;
import com.mwz116.potions_for_more_potion_effects.datagen.server.tags_provider.ModBlockTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = PotionsForMorePotionEffects.MODID)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new ModRecipeProvider(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new ModLootTableProvider(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new ModBlockTagsProvider(packOutput, lookupProvider, existingFileHelper));

        generator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModEnUsLanguageProvider(packOutput));
        generator.addProvider(event.includeClient(), new ModZhCnLanguageProvider(packOutput));

    }
}
