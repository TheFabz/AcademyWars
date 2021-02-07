package org.academiadecodigo.academywars.chars.enemies;

import org.academiadecodigo.academywars.chars.Avatar;

public class Asteroids extends Enemy{
    //Constructor
    public Asteroids(int health, int maxDamage, Avatar avatar){ //Asteroids can't attack, BTW hit must be Override
        super(health, maxDamage, avatar);
    }

    //Custom Methods
    public void hit(int damage){ //attack

    }
}
