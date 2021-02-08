package org.academiadecodigo.academywars.chars;

import org.academiadecodigo.academywars.chars.enemies.Enemy;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Avatar {
    //Fields
    private Picture enemy;
    private int x;
    private int y;

    //Constructor
    public Avatar(int x, int y, String path){
        enemy = new Picture(x, y, path );
        this.x = x;
        this.y = y;
        enemy.draw();
        //enemy.fill();
        //.setColor(Color.WHITE);
    }

    //Getters
    public Picture getEnemy() {
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
