package org.academiadecodigo.academywars.chars.player.position;

import org.academiadecodigo.academywars.chars.enemies.Enemies;
import org.academiadecodigo.academywars.chars.enemies.Enemy;

import java.awt.*;

public class PositionCollider {

    private SpaceShipPosition ship;
    private Enemy enemy;
    private boolean isColliding;
    private FireShootPosition fire;


    //COLIDING WITH ENEMIES
    public PositionCollider(SpaceShipPosition ship, Enemy enemy) {
        this.ship = ship;
        this.enemy = enemy;
        this.isColliding = false;
    }

    //COLIDING ENEMY WITH FIRESHOOT

    public PositionCollider(SpaceShipPosition ship, Enemy enemy, FireShootPosition fire) {
        this.ship = ship;
        this.enemy = enemy;
        this.isColliding = false;
        this.fire = fire;
    }


    public void collideWithEnemy(Enemy enemy) {

        int padding = 30;
        int shipX = ship.getX();
        int enemyX = enemy.getAvatar().getX();
        System.out.println();
        int shipY = ship.getY();
        int enemyY = enemy.getAvatar().getY();

        /*
          System.out.println("enemyY: "+enemyY);
         System.out.println("                ShipX: :"+shipX);
           System.out.println("                enemyX: "+enemyX);
         if (shipY == enemyY) {
            System.out.println("COLIDER YYYYYYYYYYYYYYYYYYYYY");
        if(enemyX == shipX){
        */

      //  if (shipX >= enemyX && shipX <= enemyX + enemy.getAvatar().getWidth()) {
            if(shipX+padding+ship.getWIDTH()>=enemyX-padding && shipX + ship.getWIDTH()-padding <= enemyX+enemy.getAvatar().getWidth()+ship.getWIDTH()+padding){
            if (shipY <= enemyY+enemy.getAvatar().getHeight() && shipY+ship.getHEIGHT() >= enemyY-padding) {


                System.out.println("COLIDERR XXXXXXXXXXXXXXXXXXXXXXXX AND YYYYYYYYYYYYYYYYYYYYYYYYYYYYYY");
                isColliding = true;
            }
        }

       //
    }



    public void setColliding(boolean colliding) {
        this.isColliding = colliding;
    }

    public boolean isColliding() {
        return isColliding;
    }
}




