package org.academiadecodigo.academywars.chars;

public abstract class GameChar implements Destroyable{
    //Fields
    private int health;
    private int maxDamage;
    private boolean destroyed;
    private Avatar avatar;
    private int x;
    private int y;
    private boolean isDraw;

    //Constructor
    public GameChar(int health, int maxDamage, Avatar avatar){
        this.health = health;
        this.maxDamage = maxDamage;
        this.destroyed = false;
        this.avatar = avatar;

        isDraw = false;
        //x = avatar.ge
    }

    //Getters
    public int getHealth(){
        return health;
    }

    public int getMaxDamage(){
        return maxDamage;
    }

    public Avatar getAvatar() {
        return avatar;
    }

    public boolean isDraw() {
        return isDraw;
    }



    @Override
    public boolean isDestroyed() {
        return destroyed;
    }

    //Setters
    public void setDestroyed(){
        this.destroyed = true;
    }

    public void setDraw(boolean draw) {
        isDraw = draw;
    }

    //Custom Methods
    @Override
    public void sufferDamage(int damage){ //suffer damage

    }

    public void hit(int damage){ //attack

    }
}
