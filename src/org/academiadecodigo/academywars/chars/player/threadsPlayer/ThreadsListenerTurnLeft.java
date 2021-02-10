package org.academiadecodigo.academywars.chars.player.threadsPlayer;

import org.academiadecodigo.academywars.chars.player.position.SpaceShipPosition;

public class ThreadsListenerTurnLeft extends Thread{

    private int delay;
    private SpaceShipPosition ship;

    public ThreadsListenerTurnLeft(int delay, SpaceShipPosition shoot) {
        this.delay = delay;
        this.ship = shoot;

    }
    public void run() {
        while (true) {
            try{ sleep(delay); }catch(Exception e){ System.out.println(e); }

            if(ship.isTurningLeft()){

                System.out.println("OLA");
                try {
                    ship.turnLeft();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }






        }


    }


}
