package com.game.InventoryItems;

import java.util.Random;

/**
 * Created by seharris on 5/9/16.
 */
public class HealthPotion extends Item {

    private int potionHealingPower;

    private PotionSize randomSize() {
        int randomSize = new Random().nextInt(PotionSize.values().length);
        return PotionSize.values()[randomSize];
    }


    public HealthPotion() {
        ItemType type = ItemType.POTION;
        this.size = randomSize();
        switch (size) {
            case LARGE:
                this.potionHealingPower = 50;
                this.itemValue = 15;
                this.itemName = "Large Health Potion";
                break;
            case MEDIUM:
                this.potionHealingPower = 35;
                this.itemValue = 10;
                this.itemName = "Medium Health Potion";
                break;
            case SMALL:
                this.potionHealingPower = 25;
                this.itemValue = 5;
                this.itemName = "Small Health Potion";
                break;
        }
        System.out.println("You got a " + this.getItemName() + ".");
        System.out.println("It heals " + this.getPotionHealingPower() + " HP.");
        System.out.println("And it is worth " + this.getItemValue() + " rupees.");
        System.out.println("\n");

    }
    public PotionSize getSize() {
        return size;
    }

    public int getPotionHealingPower() {
        return potionHealingPower;
    }

}
