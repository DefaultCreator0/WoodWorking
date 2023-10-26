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
    //Picks
    public static final Item BasicStonePick = registerItem("basicstonepickaxe", new PickaxeItem(ToolMaterials.BASICSTONE,-1,-2.8f,new FabricItemSettings()));
    public static final Item FlimsyStonePick = registerItem("flimsystonepickaxe", new PickaxeItem(ToolMaterials.FLIMSYSTONE,-1,-2.8f,new FabricItemSettings()));
    public static final Item StrongStonePick = registerItem("strongstonepickaxe", new PickaxeItem(ToolMaterials.STRONGSTONE,-1,-2.8f,new FabricItemSettings()));
    //Wooden Picks
    public static final Item BasicWoodenPick = registerItem("basicwoodenpickaxe", new PickaxeItem(ToolMaterials.BASICWOOD,-2,-2.8f,new FabricItemSettings()));
    public static final Item FlimsyWoodenPick = registerItem("flimsywoodenpickaxe", new PickaxeItem(ToolMaterials.FLIMSYWOOD,-2,-2.8f,new FabricItemSettings()));
    public static final Item StrongWoodenPick = registerItem("strongwoodenpickaxe", new PickaxeItem(ToolMaterials.STRONGWOOD,-2,-2.8f,new FabricItemSettings()));
    //Iron Picks
    public static final Item BasicIronPick = registerItem("basicironpickaxe", new PickaxeItem(ToolMaterials.BASICIRON,0,-2.8f,new FabricItemSettings()));
    public static final Item FlimsyIronPick = registerItem("flimsyironpickaxe", new PickaxeItem(ToolMaterials.FLIMSYIRON,0,-2.8f,new FabricItemSettings()));
    public static final Item StrongIronPick = registerItem("strongironpickaxe", new PickaxeItem(ToolMaterials.STRONGIRON,0,-2.8f,new FabricItemSettings()));
    //Gold Picks
    public static final Item BasicGoldPick = registerItem("basicgoldpickaxe", new PickaxeItem(ToolMaterials.BASICGOLD,0,-2.8f,new FabricItemSettings()));
    public static final Item FlimsyGoldPick = registerItem("flimsygoldpickaxe", new PickaxeItem(ToolMaterials.FLIMSYGOLD,0,-2.8f,new FabricItemSettings()));
    public static final Item StrongGoldPick = registerItem("stronggoldpickaxe", new PickaxeItem(ToolMaterials.STRONGGOLD,0,-2.8f,new FabricItemSettings()));
    //Diamond Picks
    public static final Item BasicDiamondPick = registerItem("basicdiamondpickaxe", new PickaxeItem(ToolMaterials.BASICDIAMOND,0,-2.8f,new FabricItemSettings()));
    public static final Item FlimsyDiamondPick = registerItem("flimsydiamondpickaxe", new PickaxeItem(ToolMaterials.FLIMSYDIAMOND,0,-2.8f,new FabricItemSettings()));
    public static final Item StrongDiamondPick = registerItem("strongdiamondpickaxe", new PickaxeItem(ToolMaterials.STRONGDIAMOND,0,-2.8f,new FabricItemSettings()));
    //Axes
    //Stone Axes
    public static final Item BasicStoneAxe = registerItem("basicstoneaxe", new AxeItem(ToolMaterials.BASICSTONE,-1,-2.8f,new FabricItemSettings()));
    public static final Item FlimsyStoneAxe = registerItem("flimsystoneaxe", new AxeItem(ToolMaterials.FLIMSYSTONE,-1,-2.8f,new FabricItemSettings()));
    public static final Item StrongStoneAxe = registerItem("strongstoneaxe", new AxeItem(ToolMaterials.STRONGSTONE,-1,-2.8f,new FabricItemSettings()));
    //Wooden Axes
    public static final Item BasicWoodenAxe = registerItem("basicwoodenaxe", new AxeItem(ToolMaterials.BASICWOOD,-2,-2.8f,new FabricItemSettings()));
    public static final Item FlimsyWoodenAxe = registerItem("flimsywoodenaxe", new AxeItem(ToolMaterials.FLIMSYWOOD,-2,-2.8f,new FabricItemSettings()));
    public static final Item StrongWoodenAxe = registerItem("strongwoodenaxe", new AxeItem(ToolMaterials.STRONGWOOD,-2,-2.8f,new FabricItemSettings()));
    //Iron Axes
    public static final Item BasicIronAxe = registerItem("basicironaxe", new AxeItem(ToolMaterials.BASICIRON,0,-2.8f,new FabricItemSettings()));
    public static final Item FlimsyIronAxe = registerItem("flimsyironaxe", new AxeItem(ToolMaterials.FLIMSYIRON,0,-2.8f,new FabricItemSettings()));
    public static final Item StrongIronAxe = registerItem("strongironaxe", new AxeItem(ToolMaterials.STRONGIRON,0,-2.8f,new FabricItemSettings()));
    //Gold Axes
    public static final Item BasicGoldAxe = registerItem("basicgoldaxe", new AxeItem(ToolMaterials.BASICGOLD,0,-2.8f,new FabricItemSettings()));
    public static final Item FlimsyGoldAxe = registerItem("flimsygoldaxe", new AxeItem(ToolMaterials.FLIMSYGOLD,0,-2.8f,new FabricItemSettings()));
    public static final Item StrongGoldAxe = registerItem("stronggoldaxe", new AxeItem(ToolMaterials.STRONGGOLD,0,-2.8f,new FabricItemSettings()));
    //Diamond Axes
    public static final Item BasicDiamondAxe = registerItem("basicdiamondaxe", new AxeItem(ToolMaterials.BASICDIAMOND,0,-2.8f,new FabricItemSettings()));
    public static final Item FlimsyDiamondAxe = registerItem("flimsydiamondaxe", new AxeItem(ToolMaterials.FLIMSYDIAMOND,0,-2.8f,new FabricItemSettings()));
    public static final Item StrongDiamondAxe = registerItem("strongdiamondaxe", new AxeItem(ToolMaterials.STRONGDIAMOND,0,-2.8f,new FabricItemSettings()));
    //Shovels
    //Stone Shovels
    public static final Item BasicStoneShovel = registerItem("basicstoneshovel", new ShovelItem(ToolMaterials.BASICSTONE,-1,-2.8f,new FabricItemSettings()));
    public static final Item FlimsyStoneShovel = registerItem("flimsystoneshovel", new ShovelItem(ToolMaterials.FLIMSYSTONE,-1,-2.8f,new FabricItemSettings()));
    public static final Item StrongStoneShovel = registerItem("strongstoneshovel", new ShovelItem(ToolMaterials.STRONGSTONE,-1,-2.8f,new FabricItemSettings()));
    //Wooden Shovels
    public static final Item BasicWoodenShovel = registerItem("basicwoodenshovel", new ShovelItem(ToolMaterials.BASICWOOD,-2,-2.8f,new FabricItemSettings()));
    public static final Item FlimsyWoodenShovel = registerItem("flimsywoodenshovel", new ShovelItem(ToolMaterials.FLIMSYWOOD,-2,-2.8f,new FabricItemSettings()));
    public static final Item StrongWoodenShovel = registerItem("strongwoodenshovel", new ShovelItem(ToolMaterials.STRONGWOOD,-2,-2.8f,new FabricItemSettings()));
    //Iron Shovels
    public static final Item BasicIronShovel = registerItem("basicironshovel", new ShovelItem(ToolMaterials.BASICIRON,0,-2.8f,new FabricItemSettings()));
    public static final Item FlimsyIronShovel = registerItem("flimsyironshovel", new ShovelItem(ToolMaterials.FLIMSYIRON,0,-2.8f,new FabricItemSettings()));
    public static final Item StrongIronShovel = registerItem("strongironshovel", new ShovelItem(ToolMaterials.STRONGIRON,0,-2.8f,new FabricItemSettings()));
    //Gold Shovels
    public static final Item BasicGoldShovel = registerItem("basicgoldshovel", new ShovelItem(ToolMaterials.BASICGOLD,0,-2.8f,new FabricItemSettings()));
    public static final Item FlimsyGoldShovel = registerItem("flimsygoldshovel", new ShovelItem(ToolMaterials.FLIMSYGOLD,0,-2.8f,new FabricItemSettings()));
    public static final Item StrongGoldShovel = registerItem("stronggoldshovel", new ShovelItem(ToolMaterials.STRONGGOLD,0,-2.8f,new FabricItemSettings()));
    //Diamond Shovels
    public static final Item BasicDiamondShovel = registerItem("basicdiamondshovel", new ShovelItem(ToolMaterials.BASICDIAMOND,0,-2.8f,new FabricItemSettings()));
    public static final Item FlimsyDiamondShovel = registerItem("flimsydiamondshovel", new ShovelItem(ToolMaterials.FLIMSYDIAMOND,0,-2.8f,new FabricItemSettings()));
    public static final Item StrongDiamondShovel = registerItem("strongdiamondshovel", new ShovelItem(ToolMaterials.STRONGDIAMOND,0,-2.8f,new FabricItemSettings()));
    //hoes
    //Stone hoes
    public static final Item BasicStonehoe = registerItem("basicstonehoe", new HoeItem(ToolMaterials.BASICSTONE,-1,-2.8f,new FabricItemSettings()));
    public static final Item FlimsyStonehoe = registerItem("flimsystonehoe", new HoeItem(ToolMaterials.FLIMSYSTONE,-1,-2.8f,new FabricItemSettings()));
    public static final Item StrongStonehoe = registerItem("strongstonehoe", new HoeItem(ToolMaterials.STRONGSTONE,-1,-2.8f,new FabricItemSettings()));
    //Wooden hoes
    public static final Item BasicWoodenhoe = registerItem("basicwoodenhoe", new HoeItem(ToolMaterials.BASICWOOD,-2,-2.8f,new FabricItemSettings()));
    public static final Item FlimsyWoodenhoe = registerItem("flimsywoodenhoe", new HoeItem(ToolMaterials.FLIMSYWOOD,-2,-2.8f,new FabricItemSettings()));
    public static final Item StrongWoodenhoe = registerItem("strongwoodenhoe", new HoeItem(ToolMaterials.STRONGWOOD,-2,-2.8f,new FabricItemSettings()));
    //Iron hoes
    public static final Item BasicIronhoe = registerItem("basicironhoe", new HoeItem(ToolMaterials.BASICIRON,0,-2.8f,new FabricItemSettings()));
    public static final Item FlimsyIronhoe = registerItem("flimsyironhoe", new HoeItem(ToolMaterials.FLIMSYIRON,0,-2.8f,new FabricItemSettings()));
    public static final Item StrongIronhoe = registerItem("strongironhoe", new HoeItem(ToolMaterials.STRONGIRON,0,-2.8f,new FabricItemSettings()));
    //Golden hoes
    public static final Item BasicGoldhoe = registerItem("basicgoldhoe", new HoeItem(ToolMaterials.BASICGOLD,0,-2.8f,new FabricItemSettings()));
    public static final Item FlimsyGoldhoe = registerItem("flimsygoldhoe", new HoeItem(ToolMaterials.FLIMSYGOLD,0,-2.8f,new FabricItemSettings()));
    public static final Item StrongGoldhoe = registerItem("strongholdhoe", new HoeItem(ToolMaterials.STRONGGOLD,0,-2.8f,new FabricItemSettings()));
    //Diamond hoes
    public static final Item BasicDiamondhoe = registerItem("basicdiamondhoe", new HoeItem(ToolMaterials.BASICDIAMOND,0,-2.8f,new FabricItemSettings()));
    public static final Item FlimsyDiamondhoe = registerItem("flimsydiamondhoe", new HoeItem(ToolMaterials.FLIMSYDIAMOND,0,-2.8f,new FabricItemSettings()));
    public static final Item StrongDiamondhoe = registerItem("strongdiamondhoe", new HoeItem(ToolMaterials.STRONGDIAMOND,0,-2.8f,new FabricItemSettings()));


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
        
        entries.add(BasicWoodenPick);
        entries.add(FlimsyWoodenPick);
        entries.add(StrongWoodenPick);
        entries.add(BasicStonePick);
        entries.add(FlimsyStonePick);
        entries.add(StrongStonePick);
        entries.add(FlimsyIronPick);
        entries.add(BasicGoldPick);
        entries.add(FlimsyGoldPick);
        entries.add(StrongGoldPick);
        entries.add(BasicIronPick);
        entries.add(StrongIronPick);
        entries.add(StrongDiamondPick);
        entries.add(FlimsyDiamondPick);
        entries.add(BasicDiamondPick);
        
        entries.add(BasicWoodenAxe);
        entries.add(FlimsyWoodenAxe);
        entries.add(StrongWoodenAxe);
        entries.add(BasicStoneAxe);
        entries.add(FlimsyStoneAxe);
        entries.add(StrongStoneAxe);
        entries.add(BasicGoldAxe);
        entries.add(FlimsyGoldAxe);
        entries.add(StrongGoldAxe);
        entries.add(BasicIronAxe);
        entries.add(FlimsyIronAxe);
        entries.add(StrongIronAxe);
        entries.add(BasicDiamondAxe);
        entries.add(FlimsyDiamondAxe);
        entries.add(StrongDiamondAxe);

        entries.add(BasicWoodenShovel);
        entries.add(FlimsyWoodenShovel);
        entries.add(StrongWoodenShovel);
        entries.add(BasicStoneShovel);
        entries.add(FlimsyStoneShovel);
        entries.add(StrongStoneShovel);
        entries.add(BasicGoldShovel);
        entries.add(FlimsyGoldShovel);
        entries.add(StrongGoldShovel);
        entries.add(BasicIronShovel);
        entries.add(FlimsyIronShovel);
        entries.add(StrongIronShovel);
        entries.add(BasicDiamondShovel);
        entries.add(FlimsyDiamondShovel);
        entries.add(StrongDiamondShovel);

        entries.add(BasicWoodenhoe);
        entries.add(FlimsyWoodenhoe);
        entries.add(StrongWoodenhoe);
        entries.add(BasicStonehoe);
        entries.add(FlimsyStonehoe);
        entries.add(StrongStonehoe);
        entries.add(BasicGoldhoe);
        entries.add(FlimsyGoldhoe);
        entries.add(StrongGoldhoe);
        entries.add(BasicIronhoe);
        entries.add(FlimsyIronhoe);
        entries.add(StrongIronhoe);
        entries.add(BasicDiamondhoe);
        entries.add(FlimsyDiamondhoe);
        entries.add(StrongDiamondhoe);
        
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(WoodWorking.ModId, name), item);
    }

    public static void registerModItems(){
        WoodWorking.LOGGER.info("Registering Items for Wood Working " + WoodWorking.ModId);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ItemRegistration::AddItemsToCreativeWindow);
    }

}
