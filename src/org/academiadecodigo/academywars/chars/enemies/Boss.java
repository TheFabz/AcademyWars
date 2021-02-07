package org.academiadecodigo.academywars.chars.enemies;

import org.academiadecodigo.academywars.chars.Avatar;

public class Boss extends Enemy{
    //Constructor
    public Boss(int health, int maxDamage, Avatar avatar){ //Boss have more health
        super(health, maxDamage, avatar);
    }

    //Custom Methods
    public void hit(int damage){ //attack

    }
}
