package com.mwz116.potions_for_more_potion_effects.tag;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class BlockTags {

        public static final TagKey<Block> NEEDS_IRON_TOOL = minecraftTag("needs_iron_tool");

        public static final TagKey<Block> MINEABLE_WITH_PICKAXE = minecraftTag("mineable/pickaxe");

        private static TagKey<Block> tag(String name) {
            return net.minecraft.tags.BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
        }

        private static TagKey<Block> minecraftTag(String name) {
            return net.minecraft.tags.BlockTags.create(ResourceLocation.fromNamespaceAndPath("minecraft", name));
        }

        private static TagKey<Block> neoforgeTag(String name) {
            return net.minecraft.tags.BlockTags.create(ResourceLocation.fromNamespaceAndPath("neoforge", name));
        }
    }


}
