package com.game.CharacterInteractions;

import java.lang.*;
import java.util.Random;

/**
 * Created by Shiva on 4/24/2016.
 */
public class Enemy extends Character {
    public String[] enemylist = {"Ghoul", "Goblin", "Skeleton", "Bat", "Werewolf"};
    public double basehealth = 1.0d;
    Random rand = new Random();
    Coordinate startingPosition = new Coordinate(rand.nextInt(10), rand.nextInt(10));

    public String initEnemy() {
        this.name = enemylist[rand.nextInt(enemylist.length)];
        this.setCharacterLevel(rand.nextInt(3)+1);
        this.setCurrentPosition(startingPosition);

        switch (this.name){
            case "Ghoul":
                this.setHealth(basehealth * 50.0d);
                this.setAttackStrength(1.0d);
                this.setDefenseRating(1.1d);
                this.setWalkingSpeed(2);
                break;
            case "Goblin":
                this.setHealth(basehealth * 100.0d);
                this.setAttackStrength(1.1d);
                this.setDefenseRating(1.2d);
                this.setWalkingSpeed(3);
                break;
            case "Skeleton":
                this.setHealth(basehealth * 100.0d);
                this.setAttackStrength(2.0d);
                this.setDefenseRating(1.3d);
                this.setWalkingSpeed(4);
                break;
            case "Bat":
                this.setHealth(basehealth * 25.0d);
                this.setAttackStrength(1.0d);
                this.setDefenseRating(0.3d);
                this.setWalkingSpeed(2);
                break;
            case "Werewolf":
                this.setHealth(basehealth * 200.0d);
                this.setAttackStrength(1.0d);
                this.setDefenseRating(1.5d);
                this.setWalkingSpeed(2);
                break;
            default:
                this.setHealth(100.0d);
                this.setAttackStrength(1.0d);
                this.setDefenseRating(1.0d);
                break;

        }
        System.out.println("\n*-_-* *_-_* *-_-* *_-_* *-_-* *_-_* *-_-* *_-_*");
        System.out.println("\n\t\tA level " + this.getCharacterLevel() + " " + this.name + " has appeared!!" + "\n\t\t" + this.name + " starts out at (" + this.getCurrentPosition().getXpos() + ", " + this.getCurrentPosition().getYpos() + ")." );
        System.out.println();
        System.out.println("*-_-* *_-_* *-_-* *_-_* *-_-* *_-_* *-_-* *_-_*\n");

        return this.name;
    }


    public void moveCharacter(){
        String[] directions = {"North", "South", "East", "West"};
        String direction = directions[rand.nextInt(directions.length)];

        switch (direction){
            case "North":
                System.out.println("\t" + this.name + " moves North by " + this.walkingSpeed + " moves.");
                this.currentPosition.setYpos(this.currentPosition.getYpos()+this.walkingSpeed);
                break;
            case "South":
                System.out.println("\t" + this.name + " decides to move South by " + this.walkingSpeed + " moves.");
                this.currentPosition.setYpos(this.currentPosition.getYpos()-this.walkingSpeed);

                break;
            case "East":
                System.out.println("\t" + this.name + " takes a chance on moving East by " + this.walkingSpeed + " moves.");
                this.currentPosition.setXpos(this.currentPosition.getXpos()+this.walkingSpeed);

                break;
            case "West":
                System.out.println("\t" + this.name + " heads West by " + this.walkingSpeed + " moves.");
                this.currentPosition.setXpos(this.currentPosition.getXpos()-this.walkingSpeed);

                break;
            default:
                System.out.println("\t" + "No valid movement detected. Please type North, South, East, or West.");
                break;
        }
        System.out.println("\t" + this.name + " moves to: (" + this.getCurrentPosition().getXpos() + ", " + this.getCurrentPosition().getYpos() + ")"); ;

    }




}
