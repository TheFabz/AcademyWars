package org.academiadecodigo.academywars.chars.enemies;

import java.util.concurrent.TimeUnit;

public class ThreadInitializeEnemies extends Thread {

    private Enemy[] enemies;
    private int delayTry;
    private int delayMove;

    public ThreadInitializeEnemies(Enemy[] enemies, int delayMove, int delayTry){
       this.enemies = enemies;
       this.delayTry = delayTry;
       this.delayMove = delayMove;
    }

    public void run() {


        for (int i = 0; i < enemies.length; i++) {

            try{ sleep(delayTry); }catch(Exception e){ System.out.println(e); }

                enemies[i] = EnemyFactory.enemyFactory();
                enemies[i].move(delayMove);

            }
        }


}
