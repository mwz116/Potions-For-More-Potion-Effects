package com.mwz116.potions_for_more_potion_effects;

import com.mwz116.potions_for_more_potion_effects.block.ModBlocks;
import com.mwz116.potions_for_more_potion_effects.item.ModCreativeModeTabs;
import com.mwz116.potions_for_more_potion_effects.item.ModItems;
import com.mwz116.potions_for_more_potion_effects.potions.ModPotions;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.config.ModConfig;

@Mod(PotionsForMorePotionEffects.MODID)
public class PotionsForMorePotionEffects {
    public static final String MODID = "potions_for_more_potion_effects";
    public static final Logger LOGGER = LogUtils.getLogger();

    public PotionsForMorePotionEffects(IEventBus modEventBus, ModContainer modContainer) {
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModPotions.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
    }
}
