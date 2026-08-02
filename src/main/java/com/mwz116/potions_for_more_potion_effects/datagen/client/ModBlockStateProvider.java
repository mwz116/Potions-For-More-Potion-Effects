package com.mwz116.potions_for_more_potion_effects.datagen.client;

import com.mwz116.potions_for_more_potion_effects.PotionsForMorePotionEffects;
import com.mwz116.potions_for_more_potion_effects.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PotionsForMorePotionEffects.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        simpleBlockWithItem(ModBlocks.SOLID_DEEPSLATE.get(), models().cubeTop("solid_deepslate",
                modLoc("block/solid_deepslate_side"),
                modLoc("block/solid_deepslate_top")
        ));

    }
}
