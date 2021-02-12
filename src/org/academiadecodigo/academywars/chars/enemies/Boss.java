package org.academiadecodigo.academywars.chars.enemies;

import org.academiadecodigo.academywars.chars.Avatar;
import org.academiadecodigo.academywars.chars.player.position.SpaceShipPosition;

public class Boss extends Enemy{



    //Constructor
    public Boss(int health, int maxDamage, Avatar avatar, SpaceShipPosition ship){ //Boss have more health
        super(health, maxDamage, avatar,ship);
    }

    //Custom Methods
    public void hit(int damage){ //attack

    }
}
