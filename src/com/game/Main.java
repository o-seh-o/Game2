package com.game;

import com.game.CharacterInteractions.Enemy;
import com.game.CharacterInteractions.Hero;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Hero hero = new Hero();
        Enemy enemy = new Enemy();


        hero.initHero();
        hero.moveCharacter();
        enemy.initEnemy();

/*        hero.attack(enemy);
        enemy.moveCharacter();
        enemy.attack(hero);
        hero.attack(enemy);
        enemy.moveCharacter();
        enemy.attack(hero);
        hero.attack(enemy);
        enemy.moveCharacter();
        enemy.attack(hero);
        hero.attack(enemy);
        enemy.moveCharacter();
        enemy.attack(hero);
        hero.attack(enemy);
        enemy.moveCharacter();
        enemy.attack(hero);
        hero.attack(enemy);
        enemy.moveCharacter();
        enemy.attack(hero);*/



    }
}
