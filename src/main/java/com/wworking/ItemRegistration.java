package com.wworking;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemRegistration {

    public static final Item Quality_Stick = registerItem("quality_stick",new Item(new FabricItemSettings()));
    public static final Item Tool_Handle = registerItem("tool_handle", new Item(new FabricItemSettings()));
    public static final Item Low_Quality_Stick = registerItem("low_quality_stick", new Item(new FabricItemSettings()));
    public static final Item Nail = registerItem("nail", new Item(new FabricItemSettings()));
    public static final Item Hammer = registerItem("hammer", new Item(new FabricItemSettings()));
    public static final Item Sickel = registerItem("sickle", new Item(new FabricItemSettings()));
    public static final Item Box_Of_Nails = registerItem("box_of_nails", new Item(new FabricItemSettings()));
    public static final Item Wedge = registerItem("wedge", new Item(new FabricItemSettings()));
    public static final Item Plant_Fiber = registerItem("plant_fiber", new Item(new FabricItemSettings()));
    public static final Item Dried_Plant_Fiber = registerItem("dried_plant_fiber", new Item(new FabricItemSettings()));


    //Custom Tool Materials


    //Tools affects by quality changes
    public static final Item BasicStonePick = registerItem("basicstonepickaxe", new PickaxeItem(ToolMaterials.STONE,1,2,new FabricItemSettings()));

    private static void AddItemsToCreativeWindow(FabricItemGroupEntries entries){
        entries.add(Quality_Stick);
        entries.add(Tool_Handle);
        entries.add(Low_Quality_Stick);
        entries.add(Nail);
        entries.add(Sickel);
        entries.add(Hammer);
        entries.add(Box_Of_Nails);
        entries.add(Wedge);
        entries.add(Plant_Fiber);
        entries.add(Dried_Plant_Fiber);

        entries.add(BasicStonePick);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(WoodWorking.ModId, name), item);
    }

    public static void registerModItems(){
        WoodWorking.LOGGER.info("Registering Items for Wood Working " + WoodWorking.ModId);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ItemRegistration::AddItemsToCreativeWindow);
    }

}
