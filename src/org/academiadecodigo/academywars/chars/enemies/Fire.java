package org.academiadecodigo.academywars.chars.enemies;

import org.academiadecodigo.academywars.chars.Avatar;

public class Fire extends Enemy{
    //Constructor
    public Fire(int health, int maxDamage, Avatar avatar){
        super(health, maxDamage, avatar);
    }

    //Custom Methods
    public void hit(int damage){ //Fire can't attack, BTW hit must be Override

    }
}
