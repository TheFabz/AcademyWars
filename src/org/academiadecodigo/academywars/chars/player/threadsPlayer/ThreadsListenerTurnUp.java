package org.academiadecodigo.academywars.chars.player.threadsPlayer;

import org.academiadecodigo.academywars.chars.player.position.SpaceShipPosition;

public class ThreadsListenerTurnUp extends Thread{

    private int delay;
    private SpaceShipPosition ship;

    public ThreadsListenerTurnUp(int delay, SpaceShipPosition shoot) {
        this.delay = delay;
        this.ship = shoot;

    }
    public void run() {
        while (true) {
            try{ sleep(delay); }catch(Exception e){ System.out.println(e); }

            if(ship.getShipMovement().isTurningUp()){

               // System.out.println("OLA");
                try {
                    ship.getShipMovement().turnUp();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }






        }


    }


}
