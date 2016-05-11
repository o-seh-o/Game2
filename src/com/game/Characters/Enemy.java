package com.game.Characters;

import java.lang.*;
import java.util.Random;

import com.game.Rooms.Coordinate;

/**
 * Created by Shiva on 4/24/2016.
 */
public class Enemy extends Character {

    @Override
    public void move(){
        String[] directions = {"North", "South", "East", "West"};
        String direction = directions[rand.nextInt(directions.length)].toLowerCase();
        super.moveCharacter(direction);
    }
    private String[] enemyList = {"Ghoul", "Goblin", "Skeleton", "Bat", "Werewolf"};
    private Random rand = new Random();
    private Coordinate startingPosition = new Coordinate(rand.nextInt(1), rand.nextInt(1));

    public Enemy() {
        double basehealth = 1.0d;
        this.name = enemyList[rand.nextInt(enemyList.length)];
        this.setCharacterLevel(rand.nextInt(3));
        this.setCurrentPosition(startingPosition);

        switch (this.name){
            case "Ghoul":
                this.setHealth(basehealth * 50.0d);
                this.setAttackStrength(1.0d);
                this.setDefenseRating(1.1d);
                this.setWalkingSpeed(1);
                break;
            case "Goblin":
                this.setHealth(basehealth * 100.0d);
                this.setAttackStrength(1.1d);
                this.setDefenseRating(1.2d);
                this.setWalkingSpeed(1);
                break;
            case "Skeleton":
                this.setHealth(basehealth * 100.0d);
                this.setAttackStrength(2.0d);
                this.setDefenseRating(1.3d);
                this.setWalkingSpeed(1);
                break;
            case "Bat":
                this.setHealth(basehealth * 25.0d);
                this.setAttackStrength(1.0d);
                this.setDefenseRating(0.3d);
                this.setWalkingSpeed(1);
                break;
            case "Werewolf":
                this.setHealth(basehealth * 200.0d);
                this.setAttackStrength(1.0d);
                this.setDefenseRating(1.5d);
                this.setWalkingSpeed(1);
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

    }

}
