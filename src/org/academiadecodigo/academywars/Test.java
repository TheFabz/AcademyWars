package org.academiadecodigo.academywars;

import org.academiadecodigo.academywars.chars.Destroyable;
import org.academiadecodigo.academywars.chars.enemies.*;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.Timer;
import java.util.TimerTask;


public class Test {

    public static void main(String[] args) throws InterruptedException {
//        Rectangle field = new Rectangle(10, 10 , 1280, 720);
//        field.fill();
//        field.setColor(Color.BLACK);
        Picture field = new Picture(10, 10, "resources/space.jpeg");
        field.draw();
        Enemy[] enemies = new Enemy[1000];
        LinkedList<Enemy> enem = new LinkedList();
//        Enemy asteroids = new Asteroids(100, 40, EnemyFactory.EnemyFactory(Enemies.ASTEROIDS));
//        Enemy fire = new Asteroids(100, 40, EnemyFactory.EnemyFactory(Enemies.FIRE));

        for (int i = 0; i < enemies.length; i++) {
            enemies[i] = EnemyFactory.enemyFactory();
            enemies[i].move(32);
            TimeUnit.MILLISECONDS.sleep(3000);
        }











    }











}
