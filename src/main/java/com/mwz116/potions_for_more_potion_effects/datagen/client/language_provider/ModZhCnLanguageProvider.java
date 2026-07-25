package com.mwz116.potions_for_more_potion_effects.datagen.client.language_provider;

import com.mwz116.potions_for_more_potion_effects.PotionsForMorePotionEffects;

import com.mwz116.potions_for_more_potion_effects.item.ModItems;
import com.mwz116.potions_for_more_potion_effects.potions.ModPotions;
import com.mwz116.potions_for_more_potion_effects.potions.custom.ModPotion;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.alchemy.Potion;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModZhCnLanguageProvider extends LanguageProvider {
    public ModZhCnLanguageProvider(PackOutput output) {
        super(output, PotionsForMorePotionEffects.MODID, "zh_cn");
    }

    @Override
    protected void addTranslations() {

        add(ModItems.POINTED_BONE.get(), "尖骨");

        addPotion(ModPotions.SWEET_POTION,"甘甜的");
        addPotion(ModPotions.DISGUSTING_POTION,"恶心的");
        addPotion(ModPotions.STATIC_LIFE_POTION,"生命静止");
        addPotion(ModPotions.SOLID_SHIELD_POTION, "坚盾");
        addPotion(ModPotions.INJURY_LIMITATION_POTION, "限伤");
        addPotion(ModPotions.IMMORTAL_POTION, "不死");
        addPotion(ModPotions.IMMUNE_POTION, "免疫");
        addPotion(ModPotions.CLIMBING_POTION, "攀爬");
        addPotion(ModPotions.FRAGILE_POTION, "脆弱");
        addPotion(ModPotions.GILLS_POTION, "鱼肺");
        addPotion(ModPotions.GLOWING_GILLS_POTION, "发光鱼肺");
        addPotion(ModPotions.LEECHING_POTION, "吸血");
        addPotion(ModPotions.MELEE_DOMAIN_POTION, "近战领域");
        addPotion(ModPotions.MORE_RANGE_POTION, "长距");
        addPotion(ModPotions.TOUCH_POTION, "触及");
        addPotion(ModPotions.CALMING_POTION, "镇静");
        addPotion(ModPotions.FEAR_POTION, "恐惧");
    }


    private void addPotion(DeferredHolder<Potion, ? extends ModPotion> holder, String translation) {
        String path = holder.get().getName();

        add("item.minecraft.potion.effect." + path, translation + "药水");
        add("item.minecraft.splash_potion.effect." + path , "喷溅型" + translation + "药水");
        add("item.minecraft.lingering_potion.effect." + path, "滞留型" + translation + "药水");
        add("item.minecraft.tipped_arrow.effect." + path, translation + "之箭");
    }

    private void addPotion(String path, String translation) {
        path = path.replace(":",".").replace("/",".");

        add("item.minecraft.potion.effect." + path, translation + "药水");
        add("item.minecraft.splash_potion.effect." + path, "喷溅型" + translation + "药水");
        add("item.minecraft.lingering_potion.effect." + path, "滞留型" + translation + "药水");
        add("item.minecraft.tipped_arrow.effect." + path, translation + "之箭");
    }

}
