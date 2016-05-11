package com.game.InventoryItems;

/**
 * Created by seharris on 5/9/16.
 */
abstract class Item {
    protected String itemName;
    protected double itemValue;
    public PotionSize size;
    public enum ItemType {
        POTION, WEAPON, SHIELD, DECORATION, CLOTHING, QUEST_ITEM, MISC_ITEM
    }

    public Item() {

    }

    public String getItemName() {
        return itemName;
    }

    public double getItemValue() {
        return itemValue;
    }

    public enum PotionSize {
        SMALL{
            @Override
            public void setPotionSize(){
                // do something
            }
        }, MEDIUM{
            @Override
            public void setPotionSize(){
                //do something
            }

        }, LARGE {
            @Override
            public void setPotionSize(){

            }
        };
        abstract void setPotionSize();
    }

    @Override
    public String toString(){
        return "\nItem Name: " + itemName + "\nValue of item: " + itemValue;

    }
}
