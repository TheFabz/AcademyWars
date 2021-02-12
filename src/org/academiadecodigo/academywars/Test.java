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


public class Test {

    public static void main(String[] args) throws InterruptedException {
//        Rectangle field = new Rectangle(10, 10 , 1280, 720);
//        field.fill();
//        field.setColor(Color.BLACK);
      //  Picture field = new Picture(10, 10, "resources/space.jpeg");
        Arena arena = new Arena();
        SpaceShipPosition ship = new SpaceShipPosition((arena.getFieldWidth() / 2), arena.getFieldHeight() / 2, arena);

        //Enemy enemy = EnemyFactory.enemyFactory(Enemies.FIRE,ship);
      //  enemy.setX(arena.getFieldWidth() / 2);




       // enemy.getAvatar().getEnemy().draw();






      //  field.draw();


        Controls controls = new Controls(ship);

        ship.drawSpaceShip();
        controls.activateArrowKeys();
        controls.activateSpaceKey();

        //SpaceShipPosition spaceShipPositionTest = new SpaceShipPosition((100), 100, arena);

        ThreadsListenerShoot thread = new ThreadsListenerShoot(10, ship);
        thread.start();
        ThreadsListenerTurnLeft threadLeft = new ThreadsListenerTurnLeft(10,ship);
        threadLeft.start();
        ThreadsListenerTurnRight threadRight = new ThreadsListenerTurnRight(10, ship);
        threadRight.start();
        ThreadsListenerTurnUp threadUp  = new ThreadsListenerTurnUp(10,ship);
        threadUp.start();
        ThreadsListenerTurnDown threadDown = new ThreadsListenerTurnDown(10,ship);
        threadDown.start();

        Enemy[] enemies = new Enemy[20];

        InitializeEnemies.initialize(enemies, 32, 3000, ship);
    }











}
