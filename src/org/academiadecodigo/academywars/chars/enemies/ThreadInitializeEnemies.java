package org.academiadecodigo.academywars.chars.enemies;

import org.academiadecodigo.academywars.chars.player.position.SpaceShipPosition;

import java.util.concurrent.TimeUnit;

public class ThreadInitializeEnemies extends Thread {

    private Enemy[] enemies;
    private int delayTry;
    private int delayMove;
    private SpaceShipPosition ship;

    public ThreadInitializeEnemies(Enemy[] enemies, int delayMove, int delayTry, SpaceShipPosition ship){
       this.enemies = enemies;
       this.delayTry = delayTry;
       this.delayMove = delayMove;
       this.ship = ship;
    }

    public void run() {


        for (int i = 0; i < enemies.length; i++) {

            try{ sleep(delayTry); }catch(Exception e){ System.out.println(e); }

                enemies[i] = EnemyFactory.enemyFactory(ship);
                enemies[i].move(delayMove);

            }
        }


}
