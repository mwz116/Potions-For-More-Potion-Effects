package com.mwz116.potions_for_more_potion_effects.item;

import com.mwz116.potions_for_more_potion_effects.PotionsForMorePotionEffects;
import com.mwz116.potions_for_more_potion_effects.potions.ModPotions;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionContents;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PotionsForMorePotionEffects.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> POTIONS_FOR_MORE_POTION_EFFECTS_TAB = CREATIVE_MODE_TAB.register("potions_for_more_potion_effects_tab", () -> CreativeModeTab.builder()
            .icon(() -> PotionContents.createItemStack(Items.POTION, ModPotions.STATIC_LIFE_POTION))
            .title(Component.translatable("itemGroup.potions_for_more_potion_effects"))
            .displayItems((parameters, output) -> {
                output.accept(ModItems.SHARP_BONE.get());
                acceptPotion(output, ModPotions.SWEET_POTION);
                acceptPotion(output, ModPotions.DISGUSTING_POTION);
                acceptPotion(output, ModPotions.STATIC_LIFE_POTION, ModPotions.LONG_STATIC_LIFE_POTION);
                acceptPotion(output, ModPotions.SOLID_SHIELD_POTION, ModPotions.LONG_SOLID_SHIELD_POTION, ModPotions.STRONG_SOLID_SHIELD_POTION);
                acceptPotion(output, ModPotions.INJURY_LIMITATION_POTION, ModPotions.LONG_INJURY_LIMITATION_POTION, ModPotions.STRONG_INJURY_LIMITATION_POTION);
                acceptPotion(output, ModPotions.IMMORTAL_POTION, ModPotions.LONG_IMMORTAL_POTION, ModPotions.STRONG_IMMORTAL_POTION);
                acceptPotion(output, ModPotions.IMMUNE_POTION, ModPotions.LONG_IMMUNE_POTION, ModPotions.STRONG_IMMUNE_POTION);
                acceptPotion(output, ModPotions.CLIMBING_POTION, ModPotions.LONG_CLIMBING_POTION);
                acceptPotion(output, ModPotions.FRAGILE_POTION, ModPotions.LONG_FRAGILE_POTION, ModPotions.STRONG_FRAGILE_POTION);
                acceptPotion(output, ModPotions.GILLS_POTION, ModPotions.LONG_GILLS_POTION);
                acceptPotion(output, ModPotions.GLOWING_GILLS_POTION, ModPotions.LONG_GLOWING_GILLS_POTION);
                acceptPotion(output, ModPotions.LEECHING_POTION, ModPotions.LONG_LEECHING_POTION);
                acceptPotion(output, ModPotions.MELEE_DOMAIN_POTION, ModPotions.LONG_MELEE_DOMAIN_POTION, ModPotions.STRONG_MELEE_DOMAIN_POTION);
                acceptPotion(output, ModPotions.MORE_RANGE_POTION, ModPotions.LONG_MORE_RANGE_POTION, ModPotions.STRONG_MORE_RANGE_POTION);
                acceptPotion(output, ModPotions.TOUCH_POTION, ModPotions.LONG_TOUCH_POTION, ModPotions.STRONG_TOUCH_POTION);
                acceptPotion(output, ModPotions.CALMING_POTION, ModPotions.LONG_CALMING_POTION, ModPotions.STRONG_CALMING_POTION);
                acceptPotion(output, ModPotions.FEAR_POTION, ModPotions.LONG_FEAR_POTION, ModPotions.STRONG_FEAR_POTION);

            })
            .build()

    );


    // 添加常规药水
    private static void acceptPotion(CreativeModeTab.Output output, DeferredHolder<Potion, ? extends Potion> basicPotion, DeferredHolder<Potion, ? extends Potion> longPotion, DeferredHolder<Potion, ? extends Potion> strongPotion) {
        output.accept(PotionContents.createItemStack(Items.POTION, basicPotion));
        output.accept(PotionContents.createItemStack(Items.POTION, longPotion));
        output.accept(PotionContents.createItemStack(Items.POTION, strongPotion));
        output.accept(PotionContents.createItemStack(Items.SPLASH_POTION, basicPotion));
        output.accept(PotionContents.createItemStack(Items.SPLASH_POTION, longPotion));
        output.accept(PotionContents.createItemStack(Items.SPLASH_POTION, strongPotion));
        output.accept(PotionContents.createItemStack(Items.LINGERING_POTION, basicPotion));
        output.accept(PotionContents.createItemStack(Items.LINGERING_POTION, longPotion));
        output.accept(PotionContents.createItemStack(Items.LINGERING_POTION, strongPotion));
    }

    // 添加无强度变种药水
    private static void acceptPotion(CreativeModeTab.Output output, DeferredHolder<Potion, ? extends Potion> basicPotion, DeferredHolder<Potion, ? extends Potion> longPotion) {
        output.accept(PotionContents.createItemStack(Items.POTION, basicPotion));
        output.accept(PotionContents.createItemStack(Items.POTION, longPotion));
        output.accept(PotionContents.createItemStack(Items.SPLASH_POTION, basicPotion));
        output.accept(PotionContents.createItemStack(Items.SPLASH_POTION, longPotion));
        output.accept(PotionContents.createItemStack(Items.LINGERING_POTION, basicPotion));
        output.accept(PotionContents.createItemStack(Items.LINGERING_POTION, longPotion));
    }

    // 添加无任何变种药水
    private static void acceptPotion(CreativeModeTab.Output output, DeferredHolder<Potion, ? extends Potion> potion) {
        output.accept(PotionContents.createItemStack(Items.POTION, potion));
        output.accept(PotionContents.createItemStack(Items.SPLASH_POTION, potion));
        output.accept(PotionContents.createItemStack(Items.LINGERING_POTION, potion));
    }


    public static void register(IEventBus bus){
        CREATIVE_MODE_TAB.register(bus);
    }


}
