package org.academiadecodigo.academywars.chars;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Avatar {
    //Fields
    private Ellipse enemy;
    private int x;
    private int y;

    //Constructor
    public Avatar(int x, int y){
        enemy = new Ellipse(x, y, 40, 40 );
        this.x = x;
        this.y = y;
        enemy.fill();
        enemy.setColor(Color.WHITE);
    }

    //Getters
    public Ellipse getEnemy() {
        return enemy;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    //Setters
    public void setX(int x){
        this.x += x;
    }

    public void setY(int y){
        this.y += y;
    }

}
