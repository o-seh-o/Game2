package com.game.Characters;

import com.game.RegularMessages.RegularMessages;
/**
 * Created by Shiva on 5/7/2016.
 */
public class Narrator extends Character{

    @Override
    void move(){
    }

    public void narrate(int messageID){


        switch (messageID) {
            case 1:
                System.out.println("Welcome adventurer!");
                break;
            case 2:
                System.out.println("Your quest begins!");
                break;
            case 3:
                System.out.println(RegularMessages.BATTLEHEADER);
                break;
            case 4:
                System.out.println(RegularMessages.MOVEHEADER);
                break;
            default:
                System.out.println("Don't ask me, I'm just the narrator.");
        }


    }

}
