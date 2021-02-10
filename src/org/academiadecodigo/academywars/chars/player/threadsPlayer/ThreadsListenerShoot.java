package org.academiadecodigo.academywars.chars.player.threadsPlayer;

import org.academiadecodigo.academywars.chars.player.position.SpaceShipPosition;

public class ThreadsListenerShoot extends Thread {

    private int delay;
    private SpaceShipPosition ship;

    public ThreadsListenerShoot(int delay, SpaceShipPosition shoot) {
        this.delay = delay;
        this.ship = shoot;

    }
        public void run() {
            while (true) {
                try{ sleep(delay); }catch(Exception e){ System.out.println(e); }

                if(ship.isShooting()) {

                    System.out.println("OLA");
                    try {
                        ship.fireShoot();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }



            }


        }
    }


