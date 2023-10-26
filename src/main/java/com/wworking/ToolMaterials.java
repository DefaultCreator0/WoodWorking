package com.wworking;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ToolMaterials implements ToolMaterial {

    BASICWOOD(MiningLevels.WOOD, 59, 2,2,15, () -> Ingredient.ofItems(Items.OAK_PLANKS)),
    FLIMSYWOOD(MiningLevels.WOOD,25,2,2,15, () -> Ingredient.ofItems(Items.OAK_PLANKS)),
    STRONGWOOD(MiningLevels.WOOD, 75,2,2,15,() -> Ingredient.ofItems(Items.OAK_PLANKS)),
    //Stone Materials
    BASICSTONE(MiningLevels.STONE, 132, 1,3,5, () -> Ingredient.ofItems(Items.STONE)),
    FLIMSYSTONE(MiningLevels.STONE,100,1,3,5, () -> Ingredient.ofItems(Items.STONE)),
    STRONGSTONE(MiningLevels.STONE, 164,1,3,5,() -> Ingredient.ofItems(Items.STONE)),
    //Iron Materials
    BASICIRON(MiningLevels.IRON,250,6,4,14,() -> Ingredient.ofItems(Items.IRON_INGOT)),
    FLIMSYIRON(MiningLevels.IRON,200,6,4,14,() -> Ingredient.ofItems(Items.IRON_INGOT)),
    STRONGIRON(MiningLevels.IRON,300,6,4,14,() -> Ingredient.ofItems(Items.IRON_INGOT)),
    //Gold Materials
    BASICGOLD(MiningLevels.WOOD,32,12,2,22,() -> Ingredient.ofItems(Items.GOLD_INGOT)),
    FLIMSYGOLD(MiningLevels.WOOD,16,12,2,22,() -> Ingredient.ofItems(Items.GOLD_INGOT)),
    STRONGGOLD(MiningLevels.WOOD,64,12,2,22,() -> Ingredient.ofItems(Items.GOLD_INGOT)),
    //Diamond Materials
    BASICDIAMOND(MiningLevels.DIAMOND,1561,8,5,10,() -> Ingredient.ofItems(Items.DIAMOND)),
    FLIMSYDIAMOND(MiningLevels.DIAMOND,1361,8,5,10,() -> Ingredient.ofItems(Items.DIAMOND)),
    STRONGDIAMOND(MiningLevels.DIAMOND,1761,8,5,10,() -> Ingredient.ofItems(Items.DIAMOND));


    private final int mininglevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ToolMaterials(int mininglevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.mininglevel = mininglevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }


    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.mininglevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
