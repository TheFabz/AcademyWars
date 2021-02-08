package org.academiadecodigo.academywars.chars.enemies;

import org.academiadecodigo.academywars.chars.Avatar;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class EnemyFactory {
    public static Avatar EnemyFactory(Enemies enemy){
        int x = (int) (Math.random() * 1240) + 10;
        int y = 10;
        switch (enemy){
            case BOSS:
                return new Avatar(x, y, "teste");
            case ASTEROIDS:
                return new Avatar(x, y, "/Users/joaolucianno/Developer/Github/Meusprojetos/AcademyWars/resources/asteroids.png");
            case SPACESHIP:
                return new Avatar(x, y,"/Users/joaolucianno/Developer/Github/Meusprojetos/AcademyWars/resources/spaceship.png");
            default:
                return new Avatar(x, y, "/Users/joaolucianno/Developer/Github/Meusprojetos/AcademyWars/resources/fire.png");
        }
    }
}
