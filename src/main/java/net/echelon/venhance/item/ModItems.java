package net.echelon.venhance.item;

import net.echelon.venhance.VEnhance;
import net.echelon.venhance.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static void addItemsToIngredientTab(FabricItemGroupEntries entries) {

        entries.add(ModBlocks.RUSTIC_OAK_PLANKS);

    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(VEnhance.MOD_ID, name), item);
    }
    public static void registerModItems() {
        VEnhance.LOGGER.info("Registering Mod Items for" + VEnhance.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTab);
    }
}
