package com.mwz116.potions_for_more_potion_effects.item;

import com.mwz116.potions_for_more_potion_effects.PotionsForMorePotionEffects;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PotionsForMorePotionEffects.MODID);



    public static final DeferredHolder<Item, Item> SHARP_BONE = ITEMS.register("sharp_bone", () -> new Item(new Item.Properties()));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
