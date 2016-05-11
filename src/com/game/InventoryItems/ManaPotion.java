package com.game.InventoryItems;

import java.util.Random;

/**
 * Created by Shiva on 5/10/2016.
 */
public class ManaPotion extends Item {


        private int potionManaPower;



        private PotionSize randomSize() {
            int randomSize = new Random().nextInt(PotionSize.values().length);
            return PotionSize.values()[randomSize];
        }


        public ManaPotion() {
            ItemType type = ItemType.POTION;
            this.size = randomSize();
            switch (size) {
                case LARGE:
                    this.potionManaPower = 50;
                    this.itemValue = 15;
                    this.itemName = "Large Mana Potion";
                    break;
                case MEDIUM:
                    this.potionManaPower = 35;
                    this.itemValue = 10;
                    this.itemName = "Medium Mana Potion";
                    break;
                case SMALL:
                    this.potionManaPower = 25;
                    this.itemValue = 5;
                    this.itemName = "Small Mana Potion";
                    break;
            }
            System.out.println("You got a " + this.getItemName() + ".");
            System.out.println("It restores " + this.getPotionManaPower() + " MP.");
            System.out.println("And it is worth " + this.getItemValue() + " rupees.");
            System.out.println("\n");

        }
        public com.game.InventoryItems.HealthPotion.PotionSize getSize() {
            return size;
        }

        public int getPotionManaPower() {
            return potionManaPower;
        }





    }
