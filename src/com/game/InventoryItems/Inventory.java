package com.game.InventoryItems;

import com.game.Characters.Diceroll;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shiva on 5/8/2016.
 */
public class Inventory {

    private int maxSlots = 10;
    private List<Item> inventory = new ArrayList<>();


    private void addItemToInventory(Item item) {
        while(inventory.size() >= maxSlots) {
            inventory.add(item);
        }
        System.out.println("Inventory is full.");
    }

    private void findItemTypeInInventory(Item item){
        for(int i=0; i <= inventory.size(); i++){
            if(inventory.get(i).equals(item.toString())) {

            }
        }
    }






/*
    private List<Item> inventory = new ArrayList<>();
    private int numberOfHealingPotions;

    public Inventory() {
        populateHealingPotions();
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public int getNumberOfHealingPotions(){
        return numberOfHealingPotions;
    }

    public void setNumberOfHealingPotions(int numberOfHealingPotions) {

        this.numberOfHealingPotions = numberOfHealingPotions;
    }

    public void populateHealingPotions(){
        Diceroll roll = new Diceroll();
        for(int i=6; i<=roll.rolldice(); i++) {
            inventory.add(new HealthPotion());
        }
    }*/
}
