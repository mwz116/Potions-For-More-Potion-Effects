package com.mwz116.potions_for_more_potion_effects.datagen.server;

import com.mwz116.potions_for_more_potion_effects.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SHARP_BONE.get(), 2)
                .requires(Items.BONE)
                .requires(Items.FLINT)
                .unlockedBy("has_bone", has(Items.BONE))
                .save(output);

    }
}
