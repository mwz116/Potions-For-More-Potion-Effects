package com.mwz116.potions_for_more_potion_effects.potions.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;

import javax.annotation.Nullable;

public class ModPotion extends Potion {

    private final String name;

    public ModPotion(@Nullable String name, MobEffectInstance... effects) {
        super(name, effects);
        this.name = name;
    }

    public String getName() {
        return this.name == null ? "nameless" : this.name;
    }
}
