package org.academiadecodigo.academywars;

import org.academiadecodigo.academywars.chars.Destroyable;
import org.academiadecodigo.academywars.chars.enemies.*;
import org.academiadecodigo.academywars.chars.player.Arena;
import org.academiadecodigo.academywars.chars.player.Controls;
import org.academiadecodigo.academywars.chars.player.position.PositionCollider;
import org.academiadecodigo.academywars.chars.player.position.SpaceShipPosition;
import org.academiadecodigo.academywars.chars.player.threadsPlayer.*;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.Timer;
import java.util.TimerTask;

/*

public class Test {

    public static void main(String[] args) throws InterruptedException {
//        Rectangle field = new Rectangle(10, 10 , 1280, 720);
//        field.fill();
//        field.setColor(Color.BLACK);
      //  Picture field = new Picture(10, 10, "resources/space.jpeg");
        Arena arena = new Arena();
        Enemy[] enemies = new Enemy[50];
        SpaceShipPosition ship = new SpaceShipPosition((arena.getFieldWidth() / 2), arena.getFieldHeight() / 2, arena);

        for(int i=0; i<enemies.length; i++ ) {
            enemies[i] = EnemyFactory.enemyFactory(ship);
        }
        ship.addEnemy(enemies);


        InitializeEnemies.initialize(enemies, 16, 1000, ship);
    }

*/

/*
}*/
