package org.academiadecodigo.academywars.chars.enemies;

import org.academiadecodigo.academywars.chars.Avatar;
import org.academiadecodigo.academywars.chars.GameChar;
import org.academiadecodigo.academywars.chars.player.position.SpaceShipPosition;

import java.util.concurrent.TimeUnit;

public abstract class Enemy extends GameChar {
    
    
    private SpaceShipPosition ship;
    
    //Constructor
    public Enemy(int health, int maxDamage, Avatar avatar, SpaceShipPosition ship){
        super(health, maxDamage, avatar);
        this.ship = ship;
        
    }

    //Custom Methods
    public void move(int delay) {
        new ThreadMoveEnemy(delay, this, ship).start();

    }
}
