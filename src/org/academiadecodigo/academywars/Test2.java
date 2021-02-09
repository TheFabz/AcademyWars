package org.academiadecodigo.academywars;
import org.academiadecodigo.academywars.chars.player.Arena;
import org.academiadecodigo.academywars.chars.player.Controls;
import org.academiadecodigo.academywars.chars.player.position.SpaceShipPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.Timer;
import java.util.TimerTask;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        Rectangle field = new Rectangle(10, 10 , 1280, 720);
        field.fill();
        field.setColor(Color.WHITE);
//        Rectangle field = new Rectangle(10, 10 , 1280, 720);
//        field.fill();
//        field.setColor(Color.WHITE);
        Picture pic = new Picture(10, 10, "resources/teste.gif");

        new Timer().scheduleAtFixedRate(new TimerTask(){
            @Override
            public void run(){
                System.out.println("tag" + "A Kiss every 5 seconds");
            }
        },0,5000);

        new Timer().scheduleAtFixedRate(new TimerTask(){
            @Override
            public void run(){
                System.out.println("tag" + "A Kiss every 1 seconds");
            }
        },0,1000);

//        Asteroids asteroids = new Asteroids();
//        asteroids.avatar();
        System.out.println("here");

        Arena arena = new Arena();

        SpaceShipPosition spaceShipPosition = new SpaceShipPosition((arena.getFieldWidth()/2),arena.getFieldHeight()/2,arena);
        Controls controls = new Controls(spaceShipPosition);

        spaceShipPosition.drawSpaceShip();
        controls.activateArrowKeys();
        controls.activateSpaceKey();
    //    spaceShipPosition.shoot();

    }
}
