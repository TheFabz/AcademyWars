package org.academiadecodigo.academywars.chars.player.threadsPlayer;

import org.academiadecodigo.academywars.chars.player.position.SpaceShipPosition;

public class ThreadsHover extends Thread {

    private int delay;
    private SpaceShipPosition ship;

    public ThreadsHover(int delay, SpaceShipPosition shoot) {
        this.delay = delay;
        this.ship = shoot;

    }
        public void run() {

            while (true) {

                try{ sleep(delay); }catch(Exception e){ System.out.println(e); }

               // if(ship.hoverCycle == )
                    ship.setY(ship.getY()-ship.getSpeed());
                    ship.getRectangle().translate(0, -ship.getSpeed());

                }

            }

        }



