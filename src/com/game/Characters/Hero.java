package com.game.Characters;

import com.game.Rooms.Coordinate;

import java.lang.*;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Shiva on 4/24/2016.
 */
public class Hero extends Character {
    private Coordinate startingPosition = new Coordinate(0,0);
    private Random rand = new Random();



    public Hero() {
//        System.out.printf("What is the name of your hero? Type it below:\n$> ");
//        Scanner in = new Scanner(System.in);
//        this.name = in.nextLine();
        name = "Shiva";
        setHealth(100);
        setAttackStrength(2);
        setDefenseRating(1);
        setCharacterLevel(2);
        setWalkingSpeed(1);

        setCurrentPosition(startingPosition);
        System.out.println("*-_-* *_-_* *-_-* *_-_* *-_-* *_-_* *-_-* *_-_*\n");
        System.out.println("Your name is " + this.name + ".\nYou are starting from (" + this.getCurrentPosition().getXpos() + ", " + this.getCurrentPosition().getYpos() + ").\n");
        System.out.println("*-_-* *_-_* *-_-* *_-_* *-_-* *_-_* *-_-* *_-_*\n");

    }

    @Override
    public void move(){



        System.out.println("\nWhat direction do you want to move? North, South, East, or West?");
        Scanner getDirection = new Scanner(System.in);
        String direction = getDirection.next().toLowerCase();

       // String[] directions = {"North", "South", "East", "West"};
      //  String direction = directions[rand.nextInt(directions.length)].toLowerCase();
        super.moveCharacter(direction);
    }


    public void levelUp(){
        setCharacterLevel(getCharacterLevel() + 1);
    }
}
