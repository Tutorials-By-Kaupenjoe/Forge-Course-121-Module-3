package net.kaupenjoe.mccourse.util;

import net.kaupenjoe.mccourse.MCCourseMod;
import net.kaupenjoe.mccourse.component.ModDataComponentTypes;
import net.kaupenjoe.mccourse.item.ModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;

public class ModItemProperties {
    public static void addCustomItemProperties() {
        ItemProperties.register(ModItems.DATA_TABLET.get(), ResourceLocation.fromNamespaceAndPath(MCCourseMod.MOD_ID, "on"),
                (itemStack, clientLevel, livingEntity, i) -> itemStack.get(ModDataComponentTypes.FOUND_BLOCK.get()) != null ? 1f : 0f);
    }
}
