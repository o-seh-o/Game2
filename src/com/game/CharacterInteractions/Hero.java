package com.game.CharacterInteractions;

import com.game.Rooms.Coordinate;

import java.lang.*;

/**
 * Created by Shiva on 4/24/2016.
 */
public class Hero extends Character {
    Character hero = new Character();
    private Coordinate startingPosition = new Coordinate(0,0);



    public void initHero() {
//        System.out.printf("What is the name of your hero? Type it below:\n$> ");
//        Scanner in = new Scanner(System.in);
//        this.name = in.nextLine();


        this.name = "Shiva";
        this.setHealth(100);
        this.setAttackStrength(2);
        this.setDefenseRating(1);
        this.setCharacterLevel(2);
        this.setWalkingSpeed(1);
        this.setCurrentPosition(startingPosition);
        System.out.println("*-_-* *_-_* *-_-* *_-_* *-_-* *_-_* *-_-* *_-_*\n");
        System.out.println("Your name is " + this.name + ".\nYou are starting from (" + this.getCurrentPosition().getXpos() + ", " + this.getCurrentPosition().getYpos() + ").\n");
        System.out.println("*-_-* *_-_* *-_-* *_-_* *-_-* *_-_* *-_-* *_-_*\n");
    }


}
