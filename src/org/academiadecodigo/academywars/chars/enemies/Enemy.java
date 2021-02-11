package org.academiadecodigo.academywars.chars.enemies;

import org.academiadecodigo.academywars.chars.Avatar;
import org.academiadecodigo.academywars.chars.GameChar;

import java.util.concurrent.TimeUnit;

public abstract class Enemy extends GameChar {
    //Constructor
    public Enemy(int health, int maxDamage, Avatar avatar){
        super(health, maxDamage, avatar);
    }

    //Custom Methods
    public void move(int delay) {
        new ThreadMoveEnemy(delay, this).start();

    }
}
