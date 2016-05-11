package com.game.Characters;


import com.game.InventoryItems.Inventory;
import com.game.RegularMessages.RegularMessages;
import com.game.Rooms.Coordinate;

/**
 * Created by Shiva on 4/24/2016.
 */

abstract class Character {
    abstract void move();
    public String getName() {
        return name;
    }
    String name;
    private double health;
    private double attackStrength;
    private double defenseRating;
    private int walkingSpeed;
    private int characterLevel;
    private Coordinate currentPosition;
    private Inventory inventory = new Inventory();

    public Inventory getInventory() {
        return inventory;
    }

    //Character() {}










     void setWalkingSpeed(int walkingSpeed) { this.walkingSpeed = walkingSpeed;}

     int getCharacterLevel() {
        return characterLevel;
    }

     void setCharacterLevel(int characterLevel) {
        this.characterLevel = characterLevel;
    }

     public double getHealth() {
        return health;
    }

    void setHealth(double health) {
        this.health = health;
    }

    private double getAttackStrength() {
        return attackStrength;
    }

     void setAttackStrength(double attackStrength) {
        this.attackStrength = attackStrength;
    }

    private double getDefenseRating() {
        return defenseRating;
    }

     void setDefenseRating(double defenseRating) {
        this.defenseRating = defenseRating;
    }

     public Coordinate getCurrentPosition() {
        return currentPosition;
    }

     void setCurrentPosition(Coordinate currentPosition) {
        this.currentPosition = currentPosition;
    }

    public void attack(Character defender) {
        System.out.println(RegularMessages.BATTLEHEADER);

        if (defender.getHealth() >= 0.0d) {
            Diceroll attackDice = new Diceroll();
            int diceroll = attackDice.rolldice();

            // Damage amount is Attack Strength * Dice roll * the Character's current level.
            // Defense amount is Defense Rating * Dice Roll * the Character's current level.
            double attackStrength = Math.round((this.getAttackStrength() * this.getCharacterLevel()) * diceroll);
            double defenseRating = Math.round((defender.getDefenseRating() * defender.getCharacterLevel()) * diceroll);
            double damage = Math.round(attackStrength - defenseRating);

            // If the attack is greater than the defender's defense
            // then damage is done. Otherwise, the attack was a miss.

            if (attackStrength > defenseRating) {
                System.out.println("\n" + this.name + " attacks " + defender.name + " for " + damage + " HP of damage.\n");
                defender.health -= damage;

                if(defender.isAlive()) {

                    System.out.println("" + defender.name + "'s total health = " + defender.health + ".\n");
                } else {
                    defender.health = 0d;
                    System.out.println("" + defender.name + " has been killed!");
                }
            } else {
                System.out.println("\n" + this.name + " attacked " + defender.name + ", but the attack missed!\n");
            }
            //  }
        }
        else {
            System.out.println(defender.name + " has been killed!");
        }

    }

    void moveCharacter(String direction){
        // If you are the hero, ask for direction. Otherwise, it should be random.
        System.out.println(RegularMessages.MOVEHEADER);

        switch (direction){
            case "north":
                    System.out.println("\t" + this.name + " moves North by " + this.walkingSpeed + " moves.");
                    this.currentPosition.setYpos(this.currentPosition.getYpos() + this.walkingSpeed);
                break;
            case "south":
                System.out.println("\t" + this.name + " decides to move South by " + this.walkingSpeed + " moves.");
                this.currentPosition.setYpos(this.currentPosition.getYpos() - this.walkingSpeed);

                break;
            case "east":
                System.out.println("\t" + this.name + " takes a chance on moving East by " + this.walkingSpeed + " moves.");
                this.currentPosition.setXpos(this.currentPosition.getXpos() + this.walkingSpeed);

                break;
            case "west":
                System.out.println("\t" + this.name + " heads West by " + this.walkingSpeed + " moves.");
                this.currentPosition.setXpos(this.currentPosition.getXpos() - this.walkingSpeed);

                break;
            default:
                System.out.println("\t" + "No valid movement detected. Please type North, South, East, or West.");
                break;
        }
         System.out.println("\t" + this.name + " moves to: (" + this.getCurrentPosition().getXpos() + ", " + this.getCurrentPosition().getYpos() + ")");

    }

    public Boolean isAlive(){

       if (this.getHealth() > 0.0){
//            System.out.println("\n"+ this.name + " has " + this.getHealth() + " HP left.");
            return true;
        } else {
//            System.out.println("\n"+ this.name + " has " + this.getHealth() + " HP left, and so has died.");
            return false;
        }
    }

    public void usePotion() {

     //   System.out.println(inventory.getNumberOfHealingPotions());


/*        if (inventory.getNumberOfHealingPotions() > 0) {
            System.out.println("\nYou use a health potion!");
            this.setHealth(getHealth() + 25);
            inventory.setNumberOfHealingPotions(inventory.getNumberOfHealingPotions() - 1);
        } else {
            System.out.println("\nYou are all out of health potions.");
        }*/
    }
}
