package com.game;

import com.game.Characters.Hero;
import com.game.InventoryItems.HealthPotion;
import com.game.InventoryItems.ManaPotion;

public class Main {

    public static void main(String[] args) {
	// write your code here

/*
            Narrator narrator = new Narrator();
            Hero hero = new Hero();
            Enemy enemy = new Enemy();
            narrator.narrate(1);
            narrator.narrate(2);

            Boolean running = true;
        GAME:
            while (running) {

                do {
                    enemy.move();
                    hero.move();
                }
                while ((hero.getCurrentPosition().getXpos() != enemy.getCurrentPosition().getXpos()) || (hero.getCurrentPosition().getYpos() != enemy.getCurrentPosition().getYpos()));

                while (enemy.isAlive()) {
                    System.out.println(RegularMessages.ANENEMYAPPEARS);
                    System.out.println(RegularMessages.HEROMOVE);
                    Scanner d = new Scanner(System.in);
                    int decision = d.nextInt();

                    switch(decision) {
                        case 1:
                            hero.attack(enemy);
                            break;
                        case 2:
                            hero.move();
                            continue GAME;
                        case 3:
                          //  hero.useItem();
                            break;
                        case 4:

                    }
                }
                hero.levelUp();
                running = false;


}
*/

                HealthPotion newPotion = new HealthPotion();
        ManaPotion newManaPotion = new ManaPotion();


                Hero hero = new Hero();
        //Inventory inventory = new Inventory();
       // System.out.println(inventory.getInventory().toString());

        hero.usePotion();
























    }
}
