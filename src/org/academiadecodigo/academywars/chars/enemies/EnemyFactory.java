package org.academiadecodigo.academywars.chars.enemies;

import org.academiadecodigo.academywars.chars.Avatar;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class EnemyFactory {
    public static Avatar EnemyFactory(){
        int x = (int) (Math.random() * 1240) + 10;
        int y = 10;
        return new Avatar(x, y);
    }
}
