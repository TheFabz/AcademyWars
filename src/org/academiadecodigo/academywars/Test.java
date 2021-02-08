package org.academiadecodigo.academywars;

import org.academiadecodigo.academywars.chars.enemies.*;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.util.concurrent.TimeUnit;
import java.util.Timer;
import java.util.TimerTask;


public class Test {
    public static void main(String[] args) throws InterruptedException {
        Rectangle field = new Rectangle(10, 10 , 1280, 720);
        field.fill();
        field.setColor(Color.BLACK);
        Enemy[] asteroids = new Enemy[5];


        for(int i = 0; i < asteroids.length; i++){
            double j = Math.random();
            if(j > 0.7){
                asteroids[i] = new Asteroids(100, 40, EnemyFactory.EnemyFactory(Enemies.ASTEROIDS));
            } else if(j > 0.3){
                asteroids[i] = new Asteroids(100, 40, EnemyFactory.EnemyFactory(Enemies.FIRE));
            } else{
                asteroids[i] = new Asteroids(100, 40, EnemyFactory.EnemyFactory(Enemies.SPACESHIP));
            }
        }

        for (int i = 0; i < asteroids.length; i++) {
            move(asteroids[i]);
        }

    }

    public static void move(Enemy asteroids) throws InterruptedException {
        while(asteroids.getAvatar().getY() < 670 && asteroids.getAvatar().getX() < 1250 &&  asteroids.getAvatar().getX() != 10) {
            Thread.sleep(8);
            double move =  Math.random();

            if( move > 0.9){
                asteroids.getAvatar().getEnemy().translate(4, 0);
                asteroids.getAvatar().setX(4);
                continue;
            }
            if(move < 0.1){
                asteroids.getAvatar().getEnemy().translate(-4, 0);
                asteroids.getAvatar().setX(-4);
                continue;
            }
            asteroids.getAvatar().getEnemy().translate(0, 4);
            asteroids.getAvatar().setY(4);
        }
        //asteroids.getAvatar().getEnemy().delete();
    }







}
