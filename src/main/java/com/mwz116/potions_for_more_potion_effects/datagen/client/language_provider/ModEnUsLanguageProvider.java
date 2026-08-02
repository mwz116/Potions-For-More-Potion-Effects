package com.mwz116.potions_for_more_potion_effects.datagen.client.language_provider;

import com.mwz116.potions_for_more_potion_effects.PotionsForMorePotionEffects;

import com.mwz116.potions_for_more_potion_effects.block.ModBlocks;
import com.mwz116.potions_for_more_potion_effects.item.ModItems;
import com.mwz116.potions_for_more_potion_effects.potions.ModPotions;
import com.mwz116.potions_for_more_potion_effects.potions.custom.ModPotion;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.alchemy.Potion;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModEnUsLanguageProvider extends LanguageProvider {
    public ModEnUsLanguageProvider(PackOutput output) {
        super(output, PotionsForMorePotionEffects.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {

        add("itemGroup.potions_for_more_potion_effects", "Potions For More Potion Effects");

        add(ModItems.SHARP_BONE.get(), "Sharp Bone");

        add(ModBlocks.SOLID_DEEPSLATE.get(), "Solid Deepslate");

        addPotion(ModPotions.SWEET_POTION,"Sweet");
        addPotion(ModPotions.DISGUSTING_POTION,"Disgusting");
        addPotion(ModPotions.COPPER_RICH_POTION, "Copper-Rich");
        addPotion(ModPotions.IRON_RICH_POTION, "Iron-Rich");

        addPotion(ModPotions.STATIC_LIFE_POTION, "Static Life");
        addPotion(ModPotions.SOLID_SHIELD_POTION, "Solid Shield");
        addPotion(ModPotions.INJURY_LIMITATION_POTION, "Injury Limitation");
        addPotion(ModPotions.IMMORTAL_POTION, "Immortal");
        addPotion(ModPotions.IMMUNE_POTION, "Immune");
        addPotion(ModPotions.CLIMBING_POTION, "Climbing");
        addPotion(ModPotions.FRAGILE_POTION, "fragile");
        addPotion(ModPotions.GILLS_POTION, "gills");
        addPotion(ModPotions.GLOWING_GILLS_POTION, "glowing_gills");
        addPotion(ModPotions.LEECHING_POTION, "Leeching");
        addPotion(ModPotions.MELEE_DOMAIN_POTION, "Melee Domain");
        addPotion(ModPotions.MORE_RANGE_POTION, "More Range");
        addPotion(ModPotions.TOUCH_POTION, "Touch");
        addPotion(ModPotions.CALMING_POTION, "Calming");
        addPotion(ModPotions.FEAR_POTION, "Fear");
        addPotion(ModPotions.TRUE_DAMAGE_POTION, "True Damage");
        addPotion(ModPotions.SELF_HEALING_POTION, "Self-Healing");
        addPotion(ModPotions.PERCENTAGE_RECOVERY_POTION, "Percentage Recovery");
        addPotion(ModPotions.HEALTH_SACRIFICE_POTION, "Health Sacrifice");
        addPotion(ModPotions.LIGHTLY_LOADED_POTION, "Lightly Loaded");
        addPotion(ModPotions.REPAIR_POTION, "Repair");
        addPotion(ModPotions.FIRM_POTION, "Firm");
        addPotion(ModPotions.ARMOR_BROKEN_POTION, "Armor Broken");
        addPotion(ModPotions.BLEEDING_POTION, "Bleeding");

    }


    private void addPotion(DeferredHolder<Potion, ? extends ModPotion> holder, String translation) {
        String path = holder.get().getName();

        add("item.minecraft.potion.effect." + path, "Potion of " + translation);
        add("item.minecraft.splash_potion.effect." + path , "Splash Potion of " + translation);
        add("item.minecraft.lingering_potion.effect." + path, "Lingering Potion of " + translation);
        add("item.minecraft.tipped_arrow.effect." + path, "Arrow of " + translation);
    }

    private void addPotion(String path, String translation) {
        path = path.replace(":",".").replace("/",".");

        add("item.minecraft.potion.effect." + path, "Potion of " + translation);
        add("item.minecraft.splash_potion.effect." + path , "Splash Potion of " + translation);
        add("item.minecraft.lingering_potion.effect." + path, "Lingering Potion of " + translation);
        add("item.minecraft.tipped_arrow.effect." + path, "Arrow of " + translation);
    }

}
