package org.academiadecodigo.academywars.chars.enemies;

import org.academiadecodigo.academywars.chars.Avatar;
import org.academiadecodigo.academywars.chars.Destroyable;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class EnemyFactory {
    public static Enemy enemyFactory(Enemies enemy){
        int x = (int) (Math.random() * 1200) + 20;
        int y = 10;
        switch (enemy){
            case BOSS:
                return null;
            case ASTEROIDS:
                return new Asteroids(100, 40, new Avatar(x, y, "resources/asteroids.png", 3));
            case ENEMYSHIP:
                return new EnemyShip(100, 40, new Avatar(x, y,"resources/enemyship.png", 2));
            default:
                return new Asteroids(100, 40, new Avatar(x, y, "resources/fire.png", 2));
        }
    }

    public static Enemy enemyFactory(){
        int x = (int) (Math.random() * 1240) + 10;
        int y = 10;
        double luck = Math.random();

        if(luck > 0.8) {
            return new Asteroids(100, 40, new Avatar(x, y, "resources/asteroids.png", 4));
        } else if(luck > 0.5){
            return new Asteroids(100, 40, new Avatar(x, y,"resources/enemyship.png", 3));
        } else {
            return new Asteroids(100, 40, new Avatar(x, y, "resources/fire.png", 2));
        }
    }
}
