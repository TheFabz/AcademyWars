package org.academiadecodigo.academywars.chars.player.threadsPlayer;

import org.academiadecodigo.academywars.chars.enemies.Enemy;
import org.academiadecodigo.academywars.chars.player.position.FireShootPosition;
import org.academiadecodigo.academywars.chars.player.position.PositionCollider;
import org.academiadecodigo.academywars.chars.player.position.SpaceShipPosition;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class ThreadsShoot extends Thread {

    private int delay;
    private FireShootPosition shoot;
    private Enemy[] enemies;

    public ThreadsShoot(int delay, FireShootPosition shoot, Enemy[] enemies) {
        this.delay = delay;
        this.shoot = shoot;
        this.enemies = enemies;
    }

    public void run() {

        while (true) {
            try {
                sleep(delay);
            } catch (Exception e) {
                System.out.println(e);
            }

            try {
                for (int i = 0; i < enemies.length; i++) {
                    if (enemies[i].isDraw()) {
                        PositionCollider colider = new PositionCollider(enemies[i], shoot);

                        colider.collideFireshootWithEnemy(enemies[i]);
                        try {
                            Thread.sleep(0);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (NullPointerException n) {
                System.out.println("LINHA 389888888888888888888888888888888888888888888888888888888888888888888888888");
            }





/*
                if(colider.isColliding()){
                    enemy.getAvatar().getEnemy().delete();
                    enemy.setDraw(false);
                    return;
                }*/
            try {
                if (shoot.getRectangle().getY() > -50) {


                    shoot.setY(shoot.getY() - shoot.getSpeed());

                    shoot.getRectangle().translate(0, -shoot.getSpeed());
                    shoot.drawFireShoot();
                }
            } catch (NullPointerException n) {
                System.out.println("LINHA 66666666666666666666666666666666666666666666666666666666666666666666666666666");
            }

        }


               /*    shoot.drawFireShoot();
                    System.out.println("ADEUS");
                    shoot.setY(shoot.getY()- shoot.getSpeed());
                    shoot.getRectangle().translate(0, -shoot.getSpeed());
*/
    }
}








