package org.academiadecodigo.academywars;

import org.academiadecodigo.academywars.chars.Destroyable;
import org.academiadecodigo.academywars.chars.TextBoxes.TextBoxes;
import org.academiadecodigo.academywars.chars.TextBoxes.TextPlacement;
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
        Enemy[] enemies = new Enemy[0];
        SpaceShipPosition ship = new SpaceShipPosition((arena.getFieldWidth() / 2), arena.getFieldHeight() / 2, arena);

        for(int i=0; i<enemies.length; i++ ) {
            enemies[i] = EnemyFactory.enemyFactory(ship);
        }
        ship.addEnemy(enemies);
        // System.out.println(enemies[5].getClass().getSimpleName());
        //Enemy enemy = EnemyFactory.enemyFactory(Enemies.FIRE,ship);
        //  enemy.setX(arena.getFieldWidth() / 2);
        // enemy.getAvatar().getEnemy().draw();
        //  field.draw();
        Controls controls = new Controls(ship);
        ship.drawSpaceShip();
        controls.activateArrowKeys();
        controls.activateSpaceKey();
        //SpaceShipPosition spaceShipPositionTest = new SpaceShipPosition((100), 100, arena);

        MainThread.Init(ship);

        InitializeEnemies.initialize(enemies, 16, 1000, ship);

        /** teste gaio:
         *
         *
         */

        //TextBoxes textBoxes1 = new TextBoxes(TextPlacement.OPENSCREEN);
        //TextBoxes textBoxes2 = new TextBoxes(TextPlacement.LEVEL1);
        //TextBoxes textBoxes3 = new TextBoxes(TextPlacement.TRANSITION);
        //TextBoxes textBoxes4 = new TextBoxes(TextPlacement.VICTORYSCREEN);
        //TextBoxes textBoxes4 = new TextBoxes(TextPlacement.GAMEOVER);
        //TextBoxes textBoxes5 = new TextBoxes(TextPlacement.BOSS1);
        //TextBoxes textBoxes6 = new TextBoxes(TextPlacement.BOSS2);
        //TextBoxes textBoxes7 = new TextBoxes(TextPlacement.BOSS3);
        //TextBoxes textBoxes8 = new TextBoxes(TextPlacement.BOSS4);

    }
}
