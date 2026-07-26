package com.mwz116.potions_for_more_potion_effects.datagen.client;

import com.mwz116.potions_for_more_potion_effects.PotionsForMorePotionEffects;

import com.mwz116.potions_for_more_potion_effects.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PotionsForMorePotionEffects.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        basicItem(ModItems.SHARP_BONE.get());

    }
}
