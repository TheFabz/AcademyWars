package org.academiadecodigo.academywars.chars;

public abstract class GameChar implements Destroyable{
    //Fields
    private int health;
    private int maxDamage;
    private boolean destroyed;
    private Avatar avatar;

    //Constructor
    public GameChar(int health, int maxDamage, Avatar avatar){
        this.health = health;
        this.maxDamage = maxDamage;
        this.destroyed = false;
        this.avatar = avatar;
    }

    //Getters
    public int getHealth(){
        return health;
    }

    public int getMaxDamage(){
        return maxDamage;
    }

    @Override
    public boolean isDestroyed() {
        return destroyed;
    }

    //Setters
    public void setDestroyed(){
        this.destroyed = true;
    }

    //Custom Methods
    @Override
    public void sufferDamage(int damage){ //suffer damage

    }

    public void hit(int damage){ //attack

    }
}
