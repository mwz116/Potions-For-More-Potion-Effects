package com.mwz116.potions_for_more_potion_effects;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(value = PotionsForMorePotionEffects.MODID, dist = Dist.CLIENT)
public class PotionsForMorePotionEffectsClient {
    public PotionsForMorePotionEffectsClient(ModContainer container) {
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }
}
