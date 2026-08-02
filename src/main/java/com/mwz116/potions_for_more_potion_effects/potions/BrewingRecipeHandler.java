package com.mwz116.potions_for_more_potion_effects.potions;

import com.mwz116.potions_for_more_potion_effects.PotionsForMorePotionEffects;
import com.mwz116.potions_for_more_potion_effects.block.ModBlocks;
import com.mwz116.potions_for_more_potion_effects.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;
import net.neoforged.neoforge.registries.DeferredHolder;

@EventBusSubscriber(modid = PotionsForMorePotionEffects.MODID)
public class BrewingRecipeHandler {

    @SubscribeEvent
    public static void onRegisterBrewingRecipesEvent(RegisterBrewingRecipesEvent event){
        PotionBrewing.Builder builder = event.getBuilder();


        addPotionMix(builder,
                ModPotions.SWEET_POTION,
                Potions.WATER,
                Items.BEETROOT
                );

        addPotionMix(builder,
                ModPotions.DISGUSTING_POTION,
                Potions.WATER,
                Items.ROTTEN_FLESH);

        addPotionMix(builder,
                ModPotions.COPPER_RICH_POTION,
                Potions.WATER,
                Items.COPPER_INGOT);

        addPotionMix(builder,
                ModPotions.IRON_RICH_POTION,
                Potions.WATER,
                Items.IRON_INGOT);

        addPotionMix(builder,
                ModPotions.STATIC_LIFE_POTION,
                ModPotions.LONG_STATIC_LIFE_POTION,
                ModPotions.COPPER_RICH_POTION,
                Items.CLOCK,
                Items.CLOCK);

        addPotionMix(builder,
                ModPotions.SOLID_SHIELD_POTION,
                ModPotions.LONG_SOLID_SHIELD_POTION,
                ModPotions.STRONG_SOLID_SHIELD_POTION,
                ModPotions.IRON_RICH_POTION,
                ModBlocks.SOLID_DEEPSLATE.get().asItem(),
                Items.REDSTONE,
                ModBlocks.SOLID_DEEPSLATE.get().asItem());

        addCorruptMix(builder,
                ModPotions.SOLID_SHIELD_POTION,
                ModPotions.LONG_SOLID_SHIELD_POTION,
                ModPotions.STRONG_SOLID_SHIELD_POTION,
                ModPotions.FRAGILE_POTION,
                ModPotions.LONG_FRAGILE_POTION,
                ModPotions.STRONG_FRAGILE_POTION,
                true);

        addPotionMix(builder,
                ModPotions.INJURY_LIMITATION_POTION,
                ModPotions.LONG_INJURY_LIMITATION_POTION,
                ModPotions.STRONG_INJURY_LIMITATION_POTION,
                ModPotions.SWEET_POTION,
                Items.GOLDEN_CARROT);

        addPotionMix(builder,
                ModPotions.IMMORTAL_POTION,
                ModPotions.LONG_IMMORTAL_POTION,
                ModPotions.STRONG_IMMORTAL_POTION,
                Potions.REGENERATION,
                Items.TOTEM_OF_UNDYING,
                Items.GOLDEN_APPLE,
                Items.ENCHANTED_GOLDEN_APPLE);

        addPotionMix(builder,
                ModPotions.IMMUNE_POTION,
                ModPotions.LONG_IMMUNE_POTION,
                ModPotions.STRONG_IMMUNE_POTION,
                ModPotions.INJURY_LIMITATION_POTION,
                Items.GOLDEN_APPLE,
                Items.GOLD_INGOT,
                Items.GOLDEN_APPLE
                );
        builder.addMix(
                ModPotions.STRONG_IMMUNE_POTION,
                Items.GOLD_BLOCK,
                ModPotions.STRONGEST_IMMUNE_POTION
        );

        addPotionMix(builder,
                ModPotions.CLIMBING_POTION,
                ModPotions.LONG_CLIMBING_POTION,
                ModPotions.DISGUSTING_POTION,
                Items.STRING);

        addPotionMix(builder,
                ModPotions.GILLS_POTION,
                ModPotions.LONG_GILLS_POTION,
                ModPotions.SWEET_POTION,
                Items.INK_SAC);

        addPotionMix(builder,
                ModPotions.GILLS_POTION,
                ModPotions.LONG_GILLS_POTION,
                ModPotions.SWEET_POTION,
                Items.INK_SAC);

        addPotionMix(builder,
                ModPotions.GLOWING_GILLS_POTION,
                ModPotions.LONG_GLOWING_GILLS_POTION,
                ModPotions.SWEET_POTION,
                Items.GLOW_INK_SAC);

        addPotionMix(builder,
                ModPotions.LEECHING_POTION,
                ModPotions.LONG_LEECHING_POTION,
                Potions.HEALING,
                ModItems.SHARP_BONE.get());

        addPotionMix(builder,
                ModPotions.MELEE_DOMAIN_POTION,
                ModPotions.LONG_MELEE_DOMAIN_POTION,
                ModPotions.STRONG_MELEE_DOMAIN_POTION,
                Potions.AWKWARD,
                Items.WITHER_SKELETON_SKULL,
                Items.SOUL_SAND,
                Items.NETHER_WART);

        addPotionMix(builder,
                ModPotions.MORE_RANGE_POTION,
                ModPotions.LONG_MORE_RANGE_POTION,
                ModPotions.STRONG_MORE_RANGE_POTION,
                ModPotions.IRON_RICH_POTION,
                Items.IRON_SWORD,
                Items.IRON_INGOT,
                Items.GOLDEN_SWORD);

        addPotionMix(builder,
                ModPotions.TOUCH_POTION,
                ModPotions.LONG_TOUCH_POTION,
                ModPotions.STRONG_TOUCH_POTION,
                ModPotions.SWEET_POTION,
                Items.IRON_PICKAXE,
                Items.IRON_INGOT,
                Items.GOLDEN_PICKAXE);

        addPotionMix(builder,
                ModPotions.CALMING_POTION,
                ModPotions.LONG_CALMING_POTION,
                ModPotions.STRONG_CALMING_POTION,
                ModPotions.SWEET_POTION,
                Items.HAY_BLOCK,
                Items.WHEAT,
                Items.HAY_BLOCK);

        addPotionMix(builder,
                ModPotions.FEAR_POTION,
                ModPotions.LONG_FEAR_POTION,
                ModPotions.STRONG_FEAR_POTION,
                ModPotions.SWEET_POTION,
                Items.ECHO_SHARD);

        addCorruptMix(builder,
                ModPotions.CALMING_POTION,
                ModPotions.LONG_CALMING_POTION,
                ModPotions.STRONG_CALMING_POTION,
                ModPotions.FEAR_POTION,
                ModPotions.LONG_FEAR_POTION,
                ModPotions.STRONG_FEAR_POTION,
                true);

        addPotionMix(builder,
                ModPotions.TRUE_DAMAGE_POTION,
                ModPotions.LONG_TRUE_DAMAGE_POTION,
                ModPotions.STRONG_TRUE_DAMAGE_POTION,
                ModPotions.MORE_RANGE_POTION,
                Items.IRON_SWORD
                );
        //  添加当使用对应前置药水的不同强度变种来酿造时，所酿造出的不同的强度变种的此药水的配方
        addPotionMix(builder,
                ModPotions.LONG_TRUE_DAMAGE_POTION,
                ModPotions.LONG_MORE_RANGE_POTION,
                Items.IRON_SWORD
        );
        addPotionMix(builder,
                ModPotions.STRONG_TRUE_DAMAGE_POTION,
                ModPotions.STRONG_MORE_RANGE_POTION,
                Items.IRON_SWORD
        );

        addPotionMix(builder,
                ModPotions.SELF_HEALING_POTION,
                ModPotions.LONG_SELF_HEALING_POTION,
                ModPotions.STRONG_SELF_HEALING_POTION,
                Potions.HEALING,
                Items.BREAD);

        addPotionMix(builder,
                ModPotions.PERCENTAGE_RECOVERY_POTION,
                ModPotions.LONG_PERCENTAGE_RECOVERY_POTION,
                ModPotions.STRONG_PERCENTAGE_RECOVERY_POTION,
                Potions.HEALING,
                Items.WHEAT);

        addPotionMix(builder,
                ModPotions.HEALTH_SACRIFICE_POTION,
                ModPotions.LONG_HEALTH_SACRIFICE_POTION,
                ModPotions.STRONG_HEALTH_SACRIFICE_POTION,
                Potions.FIRE_RESISTANCE,
                Items.BLAZE_POWDER);

        addPotionMix(builder,
                ModPotions.LIGHTLY_LOADED_POTION,
                ModPotions.LONG_LIGHTLY_LOADED_POTION,
                ModPotions.STRONG_LIGHTLY_LOADED_POTION,
                ModPotions.SWEET_POTION,
                Items.LEATHER);

        addPotionMix(builder,
                ModPotions.REPAIR_POTION,
                ModPotions.LONG_REPAIR_POTION,
                ModPotions.STRONG_REPAIR_POTION,
                ModPotions.IRON_RICH_POTION,
                Items.IRON_BLOCK,
                Items.COPPER_BLOCK,
                Items.GOLD_BLOCK);

        addPotionMix(builder,
                ModPotions.FIRM_POTION,
                ModPotions.LONG_FIRM_POTION,
                ModPotions.STRONG_FIRM_POTION,
                ModPotions.IRON_RICH_POTION,
                Items.IRON_INGOT,
                Items.REDSTONE,
                Items.IRON_INGOT);

        addCorruptMix(builder,
                ModPotions.FIRM_POTION,
                ModPotions.LONG_FIRM_POTION,
                ModPotions.STRONG_FIRM_POTION,
                ModPotions.ARMOR_BROKEN_POTION,
                ModPotions.LONG_ARMOR_BROKEN_POTION,
                ModPotions.STRONG_ARMOR_BROKEN_POTION,
                true);

        addPotionMix(builder,
                ModPotions.BLEEDING_POTION,
                ModPotions.LONG_BLEEDING_POTION,
                ModPotions.STRONG_BLEEDING_POTION,
                ModPotions.DISGUSTING_POTION,
                ModItems.SHARP_BONE.get());


    }


    // 常规配方的药水，即使用红石和荧石粉来酿造变种
    private static void addPotionMix(PotionBrewing.Builder builder, DeferredHolder<Potion, ? extends Potion> targetPotion, DeferredHolder<Potion, ? extends Potion> longTargetPotion, DeferredHolder<Potion, ? extends Potion> strongTargetPotion, Holder<Potion> basePotion, Item ingredients){
        builder.addMix(
                basePotion,
                ingredients,
                targetPotion
        );
        builder.addMix(
                targetPotion,
                Items.REDSTONE,
                longTargetPotion
        );
        builder.addMix(
                targetPotion,
                Items.GLOWSTONE_DUST,
                strongTargetPotion
        );
    }

    //  非常规配方
    private static void addPotionMix(PotionBrewing.Builder builder, DeferredHolder<Potion, ? extends Potion> targetPotion, DeferredHolder<Potion, ? extends Potion> longTargetPotion, DeferredHolder<Potion, ? extends Potion> strongTargetPotion, Holder<Potion> basePotion, Item ingredient, Item timeIncreasingIngredient, Item enhanceIngredient){
        builder.addMix(
                basePotion,
                ingredient,
                targetPotion
        );
        builder.addMix(
                targetPotion,
                timeIncreasingIngredient,
                longTargetPotion
        );
        builder.addMix(
                targetPotion,
                enhanceIngredient,
                strongTargetPotion
        );
    }

    // 无增强版的常规配方
    private static void addPotionMix(PotionBrewing.Builder builder, DeferredHolder<Potion, ? extends Potion> targetPotion, DeferredHolder<Potion, ? extends Potion> longTargetPotion, Holder<Potion> basePotion, Item ingredients){
        builder.addMix(
                basePotion,
                ingredients,
                targetPotion
        );
        builder.addMix(
                targetPotion,
                Items.REDSTONE,
                longTargetPotion
        );
    }

    //  无增强版的非常规配方
    private static void addPotionMix(PotionBrewing.Builder builder, DeferredHolder<Potion, ? extends Potion> targetPotion, DeferredHolder<Potion, ? extends Potion> longTargetPotion, Holder<Potion> basePotion, Item ingredient, Item timeIncreasingIngredient){
        builder.addMix(
                basePotion,
                ingredient,
                targetPotion
        );
        builder.addMix(
                targetPotion,
                timeIncreasingIngredient,
                longTargetPotion
        );
    }

    //  无增强版和加长版的配方
    private static void addPotionMix(PotionBrewing.Builder builder, DeferredHolder<Potion, ? extends Potion> targetPotion, Holder<Potion> basePotion, Item ingredient){
        builder.addMix(
                basePotion,
                ingredient,
                targetPotion
        );
    }

    // 发酵蛛眼腐化常规配方 （即有强度变种）
    private static void addCorruptMix(PotionBrewing.Builder builder, DeferredHolder<Potion, ? extends Potion> originalPotion, DeferredHolder<Potion, ? extends Potion> longOriginalPotion, DeferredHolder<Potion, ? extends Potion> strongOriginalPotion, DeferredHolder<Potion, ? extends Potion> targetPotion, DeferredHolder<Potion, ? extends Potion> longTargetPotion, DeferredHolder<Potion, ? extends Potion> strongTargetPotion, boolean canConvertedBack){
        builder.addMix(
                originalPotion,
                Items.FERMENTED_SPIDER_EYE,
                targetPotion
        );
        builder.addMix(
                longOriginalPotion,
                Items.FERMENTED_SPIDER_EYE,
                longTargetPotion
        );
        builder.addMix(
                strongOriginalPotion,
                Items.FERMENTED_SPIDER_EYE,
                strongTargetPotion
        );

        if (canConvertedBack){
            builder.addMix(
                    targetPotion,
                    Items.FERMENTED_SPIDER_EYE,
                    originalPotion
            );
            builder.addMix(
                    longTargetPotion,
                    Items.FERMENTED_SPIDER_EYE,
                    longOriginalPotion
            );
            builder.addMix(
                    strongTargetPotion,
                    Items.FERMENTED_SPIDER_EYE,
                    strongOriginalPotion
            );
        }
    }

    // 发酵蛛眼腐化无强度变种配方
    private static void addCorruptMix(PotionBrewing.Builder builder, DeferredHolder<Potion, ? extends Potion> originalPotion, DeferredHolder<Potion, ? extends Potion> longOriginalPotion, DeferredHolder<Potion, ? extends Potion> targetPotion, DeferredHolder<Potion, ? extends Potion> longTargetPotion, boolean canConvertedBack){
        builder.addMix(
                originalPotion,
                Items.FERMENTED_SPIDER_EYE,
                targetPotion
        );
        builder.addMix(
                longOriginalPotion,
                Items.FERMENTED_SPIDER_EYE,
                longTargetPotion
        );

        if (canConvertedBack){
            builder.addMix(
                    targetPotion,
                    Items.FERMENTED_SPIDER_EYE,
                    originalPotion
            );
            builder.addMix(
                    longTargetPotion,
                    Items.FERMENTED_SPIDER_EYE,
                    longOriginalPotion
            );
        }
    }
}
