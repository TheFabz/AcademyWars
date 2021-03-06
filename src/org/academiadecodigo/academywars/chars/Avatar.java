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
    private int speed;
    private boolean deleted;
    private  int width;
    private  int height;

    //Constructor
    public Avatar(int x, int y, String path, int speed){
        enemy = new Picture(x, y, path );
        this.x = x;
        this.y = y;
        this.speed = speed;
       // enemy.draw();
        width = enemy.getWidth();
        height = enemy.getHeight();
        System.out.println("WIDTH: "+width);
        System.out.println("HEIGHT: "+height);


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

    public int getSpeed(){
        return speed;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    //Setters
    public void setX(int x){
        this.x += x;
      //  this.x = x;
    }

    public void setY(int y){
        this.y += y;
        //  this.y = y;
    }

    public void setDeleted() {
        this.deleted = true;
    }

}
