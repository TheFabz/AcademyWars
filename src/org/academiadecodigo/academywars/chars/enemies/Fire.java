package org.academiadecodigo.academywars.chars.enemies;

import org.academiadecodigo.academywars.chars.Avatar;
import org.academiadecodigo.academywars.chars.player.position.SpaceShipPosition;

public class Fire extends Enemy{
    //Constructor
    public Fire(int health, int maxDamage, Avatar avatar, SpaceShipPosition ship){
        super(health, maxDamage, avatar, ship);
    }

    //Custom Methods
    public void hit(int damage){ //Fire can't attack, BTW hit must be Override

    }
}
