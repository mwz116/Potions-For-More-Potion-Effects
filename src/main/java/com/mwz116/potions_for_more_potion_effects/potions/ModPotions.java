package com.mwz116.potions_for_more_potion_effects.potions;

import com.mwz116.potions_for_more_potion_effects.PotionsForMorePotionEffects;
import com.mwz116.potions_for_more_potion_effects.potions.custom.ModPotion;
import com.yixi_xun.more_potion_effects.init.MorePotionEffectsModMobEffects;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModPotions {

    public static DeferredRegister<Potion> POTIONS = DeferredRegister.create(Registries.POTION, PotionsForMorePotionEffects.MODID);

    public static DeferredHolder<Potion, ModPotion> SWEET_POTION = POTIONS.register("sweet_potion", () -> new ModPotion("sweet_potion"));

    public static DeferredHolder<Potion, ModPotion> DISGUSTING_POTION = POTIONS.register("disgusting_potion", () -> new ModPotion("disgusting_potion"));

    public static DeferredHolder<Potion, ModPotion> COPPER_RICH_POTION = POTIONS.register("copper_rich_potion", () -> new ModPotion("copper_rich_potion"));

    public static DeferredHolder<Potion, ModPotion> IRON_RICH_POTION = POTIONS.register("iron_rich_potion", () -> new ModPotion("iron_rich_potion"));

    public static DeferredHolder<Potion, ModPotion> STATIC_LIFE_POTION = POTIONS.register("static_life", () -> new ModPotion(
            "static_life", new MobEffectInstance(MorePotionEffectsModMobEffects.STATIC_LIFE, 900 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> LONG_STATIC_LIFE_POTION = POTIONS.register("long_static_life", () -> new ModPotion(
            "static_life", new MobEffectInstance(MorePotionEffectsModMobEffects.STATIC_LIFE, 1800 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> SOLID_SHIELD_POTION = POTIONS.register("solid_shield", () -> new ModPotion(
            "solid_shield", new MobEffectInstance(MorePotionEffectsModMobEffects.SOLID_SHIELD, 3600 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> LONG_SOLID_SHIELD_POTION = POTIONS.register("long_solid_shield", () -> new ModPotion(
            "solid_shield", new MobEffectInstance(MorePotionEffectsModMobEffects.SOLID_SHIELD, 9600 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> STRONG_SOLID_SHIELD_POTION = POTIONS.register("strong_solid_shield", () -> new ModPotion(
            "solid_shield", new MobEffectInstance(MorePotionEffectsModMobEffects.SOLID_SHIELD, 1800 ,1)
    ));

    public static DeferredHolder<Potion, ModPotion> INJURY_LIMITATION_POTION = POTIONS.register("injury_limitation", () -> new ModPotion(
            "injury_limitation", new MobEffectInstance(MorePotionEffectsModMobEffects.INJURY_LIMITATION, 3600 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> LONG_INJURY_LIMITATION_POTION = POTIONS.register("long_injury_limitation", () -> new ModPotion(
            "injury_limitation", new MobEffectInstance(MorePotionEffectsModMobEffects.INJURY_LIMITATION, 9600 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> STRONG_INJURY_LIMITATION_POTION = POTIONS.register("strong_injury_limitation", () -> new ModPotion(
            "injury_limitation", new MobEffectInstance(MorePotionEffectsModMobEffects.INJURY_LIMITATION, 1800 ,1)
    ));

    public static DeferredHolder<Potion, ModPotion> IMMORTAL_POTION = POTIONS.register("immortal", () -> new ModPotion(
            "immortal", new MobEffectInstance(MorePotionEffectsModMobEffects.IMMORTAL, 900 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> LONG_IMMORTAL_POTION = POTIONS.register("long_immortal", () -> new ModPotion(
            "immortal", new MobEffectInstance(MorePotionEffectsModMobEffects.IMMORTAL, 1800 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> STRONG_IMMORTAL_POTION = POTIONS.register("strong_immortal", () -> new ModPotion(
            "immortal", new MobEffectInstance(MorePotionEffectsModMobEffects.IMMORTAL, 450 ,1)
    ));

    public static DeferredHolder<Potion, ModPotion> IMMUNE_POTION = POTIONS.register("immune", () -> new ModPotion(
            "immune", new MobEffectInstance(MorePotionEffectsModMobEffects.IMMUNE, 900 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> LONG_IMMUNE_POTION = POTIONS.register("long_immune", () -> new ModPotion(
            "immune", new MobEffectInstance(MorePotionEffectsModMobEffects.IMMUNE, 1800 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> STRONG_IMMUNE_POTION = POTIONS.register("strong_immune", () -> new ModPotion(
            "immune", new MobEffectInstance(MorePotionEffectsModMobEffects.IMMUNE, 600 ,2)
    ));

    public static DeferredHolder<Potion, ModPotion> STRONGEST_IMMUNE_POTION = POTIONS.register("strongest_immune", () -> new ModPotion(
            "immune", new MobEffectInstance(MorePotionEffectsModMobEffects.IMMUNE, 760 ,4)
    ));

    public static DeferredHolder<Potion, ModPotion> CLIMBING_POTION = POTIONS.register("climbing", () -> new ModPotion(
            "climbing", new MobEffectInstance(MorePotionEffectsModMobEffects.CLIMBING, 900 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> LONG_CLIMBING_POTION = POTIONS.register("long_climbing", () -> new ModPotion(
            "climbing", new MobEffectInstance(MorePotionEffectsModMobEffects.CLIMBING, 1800 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> FRAGILE_POTION = POTIONS.register("fragile", () -> new ModPotion(
            "fragile", new MobEffectInstance(MorePotionEffectsModMobEffects.FRAGILE, 3600 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> LONG_FRAGILE_POTION = POTIONS.register("long_fragile", () -> new ModPotion(
            "fragile", new MobEffectInstance(MorePotionEffectsModMobEffects.FRAGILE, 9600 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> STRONG_FRAGILE_POTION = POTIONS.register("strong_fragile", () -> new ModPotion(
            "fragile", new MobEffectInstance(MorePotionEffectsModMobEffects.FRAGILE, 1800 ,1)
    ));

    public static DeferredHolder<Potion, ModPotion> GILLS_POTION = POTIONS.register("gills", () -> new ModPotion(
            "gills", new MobEffectInstance(MorePotionEffectsModMobEffects.GILLS, 900 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> LONG_GILLS_POTION = POTIONS.register("long_gills", () -> new ModPotion(
            "gills", new MobEffectInstance(MorePotionEffectsModMobEffects.GILLS, 1800 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> GLOWING_GILLS_POTION = POTIONS.register("glowing_gills", () -> new ModPotion(
            "glowing_gills",
            new MobEffectInstance(MorePotionEffectsModMobEffects.GILLS, 900 ,0),
            new MobEffectInstance(MobEffects.GLOWING, 450 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> LONG_GLOWING_GILLS_POTION = POTIONS.register("long_glowing_gills", () -> new ModPotion(
            "glowing_gills",
            new MobEffectInstance(MorePotionEffectsModMobEffects.GILLS, 1800 ,0),
            new MobEffectInstance(MobEffects.GLOWING, 900 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> LEECHING_POTION = POTIONS.register("leeching", () -> new ModPotion(
            "leeching", new MobEffectInstance(MorePotionEffectsModMobEffects.LEECHING, 900 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> LONG_LEECHING_POTION = POTIONS.register("long_leeching", () -> new ModPotion(
            "leeching", new MobEffectInstance(MorePotionEffectsModMobEffects.LEECHING, 1800 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> MELEE_DOMAIN_POTION = POTIONS.register("melee_domain", () -> new ModPotion(
            "melee_domain", new MobEffectInstance(MorePotionEffectsModMobEffects.MELEE_DOMAIN, 900 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> LONG_MELEE_DOMAIN_POTION = POTIONS.register("long_melee_domain", () -> new ModPotion(
            "melee_domain", new MobEffectInstance(MorePotionEffectsModMobEffects.MELEE_DOMAIN, 1800 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> STRONG_MELEE_DOMAIN_POTION = POTIONS.register("strong_melee_domain", () -> new ModPotion(
            "melee_domain", new MobEffectInstance(MorePotionEffectsModMobEffects.MELEE_DOMAIN, 450 ,1)
    ));

    public static DeferredHolder<Potion, ModPotion> MORE_RANGE_POTION = POTIONS.register("more_range", () -> new ModPotion(
            "more_range", new MobEffectInstance(MorePotionEffectsModMobEffects.MORE_RANGE, 3600 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> LONG_MORE_RANGE_POTION = POTIONS.register("long_more_range", () -> new ModPotion(
            "more_range", new MobEffectInstance(MorePotionEffectsModMobEffects.MORE_RANGE, 9600 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> STRONG_MORE_RANGE_POTION = POTIONS.register("strong_more_range", () -> new ModPotion(
            "more_range", new MobEffectInstance(MorePotionEffectsModMobEffects.MORE_RANGE, 1800 ,1)
    ));

    public static DeferredHolder<Potion, ModPotion> TOUCH_POTION = POTIONS.register("touch", () -> new ModPotion(
            "touch", new MobEffectInstance(MorePotionEffectsModMobEffects.TOUCH, 3600 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> LONG_TOUCH_POTION = POTIONS.register("long_touch", () -> new ModPotion(
            "touch", new MobEffectInstance(MorePotionEffectsModMobEffects.TOUCH, 9600 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> STRONG_TOUCH_POTION = POTIONS.register("strong_touch", () -> new ModPotion(
            "touch", new MobEffectInstance(MorePotionEffectsModMobEffects.TOUCH, 1800 ,1)
    ));

    public static DeferredHolder<Potion, ModPotion> CALMING_POTION = POTIONS.register("calming", () -> new ModPotion(
            "calming", new MobEffectInstance(MorePotionEffectsModMobEffects.CALMING, 3600 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> LONG_CALMING_POTION = POTIONS.register("long_calming", () -> new ModPotion(
            "calming", new MobEffectInstance(MorePotionEffectsModMobEffects.CALMING, 9600 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> STRONG_CALMING_POTION = POTIONS.register("strong_calming", () -> new ModPotion(
            "calming", new MobEffectInstance(MorePotionEffectsModMobEffects.CALMING, 1800 ,1)
    ));

    public static DeferredHolder<Potion, ModPotion> FEAR_POTION = POTIONS.register("fear", () -> new ModPotion(
            "fear", new MobEffectInstance(MorePotionEffectsModMobEffects.FEAR, 3600 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> LONG_FEAR_POTION = POTIONS.register("long_fear", () -> new ModPotion(
            "fear", new MobEffectInstance(MorePotionEffectsModMobEffects.FEAR, 9600 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> STRONG_FEAR_POTION = POTIONS.register("strong_fear", () -> new ModPotion(
            "fear", new MobEffectInstance(MorePotionEffectsModMobEffects.FEAR, 1800 ,1)
    ));

    public static DeferredHolder<Potion, ModPotion> TRUE_DAMAGE_POTION = POTIONS.register("true_damage", () -> new ModPotion(
            "true_damage", new MobEffectInstance(MorePotionEffectsModMobEffects.TRUE_DAMAGE, 3600 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> LONG_TRUE_DAMAGE_POTION = POTIONS.register("long_true_damage", () -> new ModPotion(
            "true_damage", new MobEffectInstance(MorePotionEffectsModMobEffects.TRUE_DAMAGE, 9600 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> STRONG_TRUE_DAMAGE_POTION = POTIONS.register("strong_true_damage", () -> new ModPotion(
            "true_damage", new MobEffectInstance(MorePotionEffectsModMobEffects.TRUE_DAMAGE, 1800 ,1)
    ));

    public static DeferredHolder<Potion, ModPotion> SELF_HEALING_POTION = POTIONS.register("self_healing", () -> new ModPotion(
            "self_healing", new MobEffectInstance(MorePotionEffectsModMobEffects.SELF_HEALING, 3600 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> LONG_SELF_HEALING_POTION = POTIONS.register("long_self_healing", () -> new ModPotion(
            "self_healing", new MobEffectInstance(MorePotionEffectsModMobEffects.SELF_HEALING, 9600 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> STRONG_SELF_HEALING_POTION = POTIONS.register("strong_self_healing", () -> new ModPotion(
            "self_healing", new MobEffectInstance(MorePotionEffectsModMobEffects.SELF_HEALING, 1800 ,1)
    ));

    public static DeferredHolder<Potion, ModPotion> PERCENTAGE_RECOVERY_POTION = POTIONS.register("percentage_recovery", () -> new ModPotion(
            "percentage_recovery", new MobEffectInstance(MorePotionEffectsModMobEffects.PERCENTAGE_RECOVERY, 3600 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> LONG_PERCENTAGE_RECOVERY_POTION = POTIONS.register("long_percentage_recovery", () -> new ModPotion(
            "percentage_recovery", new MobEffectInstance(MorePotionEffectsModMobEffects.PERCENTAGE_RECOVERY, 9600 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> STRONG_PERCENTAGE_RECOVERY_POTION = POTIONS.register("strong_percentage_recovery", () -> new ModPotion(
            "percentage_recovery", new MobEffectInstance(MorePotionEffectsModMobEffects.PERCENTAGE_RECOVERY, 1800 ,1)
    ));

    public static DeferredHolder<Potion, ModPotion> HEALTH_SACRIFICE_POTION = POTIONS.register("health_sacrifice", () -> new ModPotion(
            "health_sacrifice", new MobEffectInstance(MorePotionEffectsModMobEffects.HEALTH_SACRIFICE, 900 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> LONG_HEALTH_SACRIFICE_POTION = POTIONS.register("long_health_sacrifice", () -> new ModPotion(
            "health_sacrifice", new MobEffectInstance(MorePotionEffectsModMobEffects.HEALTH_SACRIFICE, 1800 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> STRONG_HEALTH_SACRIFICE_POTION = POTIONS.register("strong_health_sacrifice", () -> new ModPotion(
            "health_sacrifice", new MobEffectInstance(MorePotionEffectsModMobEffects.HEALTH_SACRIFICE, 450 ,1)
    ));

    public static DeferredHolder<Potion, ModPotion> LIGHTLY_LOADED_POTION = POTIONS.register("lightly_loaded", () -> new ModPotion(
            "lightly_loaded", new MobEffectInstance(MorePotionEffectsModMobEffects.LIGHTLY_LOADED, 3600 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> LONG_LIGHTLY_LOADED_POTION = POTIONS.register("long_lightly_loaded", () -> new ModPotion(
            "lightly_loaded", new MobEffectInstance(MorePotionEffectsModMobEffects.LIGHTLY_LOADED, 9600 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> STRONG_LIGHTLY_LOADED_POTION = POTIONS.register("strong_lightly_loaded", () -> new ModPotion(
            "lightly_loaded", new MobEffectInstance(MorePotionEffectsModMobEffects.LIGHTLY_LOADED, 1800 ,1)
    ));

    public static DeferredHolder<Potion, ModPotion> REPAIR_POTION = POTIONS.register("repair", () -> new ModPotion(
            "repair", new MobEffectInstance(MorePotionEffectsModMobEffects.REPAIR, 900 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> LONG_REPAIR_POTION = POTIONS.register("long_repair", () -> new ModPotion(
            "repair", new MobEffectInstance(MorePotionEffectsModMobEffects.REPAIR, 1800 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> STRONG_REPAIR_POTION = POTIONS.register("strong_repair", () -> new ModPotion(
            "repair", new MobEffectInstance(MorePotionEffectsModMobEffects.REPAIR, 450 ,1)
    ));

    public static DeferredHolder<Potion, ModPotion> FIRM_POTION = POTIONS.register("firm", () -> new ModPotion(
            "firm", new MobEffectInstance(MorePotionEffectsModMobEffects.FIRM, 3600 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> LONG_FIRM_POTION = POTIONS.register("long_firm", () -> new ModPotion(
            "firm", new MobEffectInstance(MorePotionEffectsModMobEffects.FIRM, 9600 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> STRONG_FIRM_POTION = POTIONS.register("strong_firm", () -> new ModPotion(
            "firm", new MobEffectInstance(MorePotionEffectsModMobEffects.FIRM, 1800 ,1)
    ));

    public static DeferredHolder<Potion, ModPotion> ARMOR_BROKEN_POTION = POTIONS.register("armor_broken", () -> new ModPotion(
            "armor_broken", new MobEffectInstance(MorePotionEffectsModMobEffects.ARMOR_BROKEN, 3600 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> LONG_ARMOR_BROKEN_POTION = POTIONS.register("long_armor_broken", () -> new ModPotion(
            "armor_broken", new MobEffectInstance(MorePotionEffectsModMobEffects.ARMOR_BROKEN, 9600 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> STRONG_ARMOR_BROKEN_POTION = POTIONS.register("strong_armor_broken", () -> new ModPotion(
            "armor_broken", new MobEffectInstance(MorePotionEffectsModMobEffects.ARMOR_BROKEN, 1800 ,1)
    ));

    public static DeferredHolder<Potion, ModPotion> BLEEDING_POTION = POTIONS.register("bleeding", () -> new ModPotion(
            "bleeding", new MobEffectInstance(MorePotionEffectsModMobEffects.BLEEDING, 900 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> LONG_BLEEDING_POTION = POTIONS.register("long_bleeding", () -> new ModPotion(
            "bleeding", new MobEffectInstance(MorePotionEffectsModMobEffects.BLEEDING, 1800 ,0)
    ));

    public static DeferredHolder<Potion, ModPotion> STRONG_BLEEDING_POTION = POTIONS.register("strong_bleeding", () -> new ModPotion(
            "bleeding", new MobEffectInstance(MorePotionEffectsModMobEffects.BLEEDING, 450 ,1)
    ));


    public static void register(IEventBus bus) {
        POTIONS.register(bus);
    }

}
