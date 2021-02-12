package org.academiadecodigo.academywars.chars.enemies;

import org.academiadecodigo.academywars.chars.Avatar;
import org.academiadecodigo.academywars.chars.player.position.SpaceShipPosition;

public class EnemyShip extends Enemy{
    //Constructor
    public EnemyShip(int health, int maxDamage, Avatar avatar, SpaceShipPosition ship){
        super(health, maxDamage, avatar, ship);
    }

    //Custom Methods
    public void hit(int damage){ //attack

    }
}
