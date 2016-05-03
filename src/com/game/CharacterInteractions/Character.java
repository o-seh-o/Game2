package com.game.CharacterInteractions;

import java.util.Random;
import java.util.Scanner;
import com.game.RegularMessages.RegularMessages;
import com.sun.org.glassfish.gmbal.ManagedObjectManager;

/**
 * Created by Shiva on 4/24/2016.
 */

class Character {
    public RegularMessages msg = new RegularMessages();
    String name;
    private double health;
    private double attackStrength;
    private double defenseRating;
    private Random rand = new Random();
     int walkingSpeed;
    private int characterLevel;
    Coordinate currentPosition;
    private Boolean isAlive = true;

    Character() {
    }

    private Boolean isAlive(){
        if (this.getHealth() >= 90){
            System.out.println(this.name + " has " + this.getHealth() + " HP left.");
            return true;
        } else {
            System.out.println(this.name + " has died.");
            return false;
        }
    }

     void setWalkingSpeed(int walkingSpeed) { this.walkingSpeed = walkingSpeed;}

     int getCharacterLevel() {
        return characterLevel;
    }

     void setCharacterLevel(int characterLevel) {
        this.characterLevel = characterLevel;
    }

     private double getHealth() {
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

     Coordinate getCurrentPosition() {
        return currentPosition;
    }

     void setCurrentPosition(Coordinate currentPosition) {
        this.currentPosition = currentPosition;
    }

    public void attack(Character defender) {
        System.out.println(RegularMessages.BATTLEHEADER);

      //  msg.battleHeader();
     //   while (defender.isAlive()) {
            Diceroll attackDice = new Diceroll();
            int diceroll = attackDice.rolldice();

            // Damage amount is Attack Strength * Dice roll * the Character's current level.
            // Defense amount is Defense Rating * Dice Roll * the Character's current level.
            double attackStrength = Math.round((this.getAttackStrength() * this.getCharacterLevel()) * diceroll);
            double defenseRating = Math.round((defender.getDefenseRating() * defender.getCharacterLevel()) * diceroll);
            double damage = Math.round(attackStrength - defenseRating);

            System.out.println("\n" + this.name + " attacks for " + attackStrength + " hit points.");
            System.out.println("\n" + defender.name + " defends for " + defenseRating + " defense points.");

        /*
        // Tracers
        System.out.println("\tThe value of the DICE is: " + diceroll);
        System.out.println("\tThe value of ATTACK is: " + attackStrength + " (" + this.getAttackStrength() + " * " + diceroll + ")");
        System.out.println("\tThe value of DEFENSE is: " + defenseRating + " (" + defender.getDefenseRating() + " * " + diceroll + ")");
        System.out.println("\tThe value of DAMAGE is: " + damage + " (" + attackStrength + " - " + defenseRating + ")");
        // end tracers
        */


            // If the attack is greater than the defender's defense
            // then damage is done. Otherwise, the attack was a miss.

            if (attackStrength > defenseRating) {
                System.out.println("\n" + this.name + " attacks " + defender.name + " for " + damage + " HP of damage.\n");
                defender.health -= damage;
                System.out.println("" + defender.name + "'s total health = " + defender.health + ".\n");
            } else {
                System.out.println("\n" + this.name + " attacked " + defender.name + ", but the attack missed!\n");
            }
      //  }
    }

    public void moveCharacter(){
        // If you are the hero, ask for direction. Otherwise, it should be random.

        System.out.println("What direction do you want to move? North, South, East, or West?");
        Scanner getDirection = new Scanner(System.in);
        String direction = getDirection.next().toLowerCase();

        System.out.println(RegularMessages.MOVEHEADER);
       // msg.moveHeader();
        switch (direction){
            case "north":
                System.out.println("\t" + this.name + " moves North by " + this.walkingSpeed + " moves.");
                this.currentPosition.setYpos(this.currentPosition.getYpos()+this.walkingSpeed);
                break;
            case "south":
                System.out.println("\t" + this.name + " decides to move South by " + this.walkingSpeed + " moves.");
                this.currentPosition.setYpos(this.currentPosition.getYpos()-this.walkingSpeed);

                break;
            case "east":
                System.out.println("\t" + this.name + " takes a chance on moving East by " + this.walkingSpeed + " moves.");
                this.currentPosition.setXpos(this.currentPosition.getXpos()+this.walkingSpeed);

                break;
            case "west":
                System.out.println("\t" + this.name + " heads West by " + this.walkingSpeed + " moves.");
                this.currentPosition.setXpos(this.currentPosition.getXpos()-this.walkingSpeed);

                break;
            default:
                System.out.println("\t" + "No valid movement detected. Please type North, South, East, or West.");
                break;
        }
        System.out.println("\t" + this.name + " moves to: (" + this.getCurrentPosition().getXpos() + ", " + this.getCurrentPosition().getYpos() + ")");

    }


}
