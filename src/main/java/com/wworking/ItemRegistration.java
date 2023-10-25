package com.wworking;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemRegistration {

    public static final Item Quality_Stick = registerItem("quality_stick",new Item(new FabricItemSettings()));
    public static final Item Tool_Handle = registerItem("tool_handle", new Item(new FabricItemSettings()));
    public static final Item Low_Quality_Stick = registerItem("low_quality_stick", new Item(new FabricItemSettings()));


    private static void AddItemsToCreativeWindow(FabricItemGroupEntries entries){
        entries.add(Quality_Stick);
        entries.add(Tool_Handle);
        entries.add(Low_Quality_Stick);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(WoodWorking.ModId, name), item);
    }

    public static void registerModItems(){
        WoodWorking.LOGGER.info("Registering Items for Wood Working " + WoodWorking.ModId);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ItemRegistration::AddItemsToCreativeWindow);
    }

}
