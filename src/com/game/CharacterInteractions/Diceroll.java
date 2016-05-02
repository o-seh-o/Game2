package com.game.CharacterInteractions;

import java.util.Random;

/**
 * Created by Shiva on 5/1/2016.
 */
public class Diceroll {
    private Random rand = new Random();


    public int rolldice(){
        int dice1 = rand.nextInt(6);
        int dice2 = rand.nextInt(6);
        int diceroll = dice1 + dice2;
        return diceroll;
    }

}
