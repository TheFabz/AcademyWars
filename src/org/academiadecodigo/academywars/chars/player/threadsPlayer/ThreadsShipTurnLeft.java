package org.academiadecodigo.academywars.chars.player.threadsPlayer;

import org.academiadecodigo.academywars.chars.player.Arena;
import org.academiadecodigo.academywars.chars.player.position.SpaceShipPosition;

import static java.lang.Thread.sleep;

public class ThreadsShipTurnLeft extends Thread {

    private int delay;

    private SpaceShipPosition ship;

    private Arena arena;


    public ThreadsShipTurnLeft(int delay, SpaceShipPosition ship, Arena arena) {
        this.delay = delay;
        this.ship = ship;
        this.arena = arena;


    }

    public void run() {

        while (arena.getField().getX() != ship.getX()) {
            try {
                sleep(delay);
            } catch (Exception e) {
                System.out.println(e);
            }
            if (ship.getRectangle().getX() != arena.getPADDING()) {

            if (ship.getShipMovement().getTurnTimerLeft() >= 0) {

                ship.setX(ship.getX() - 1);

                ship.getRectangle().translate(-1, 0);
                ship.drawSpaceShip();
                ship.getShipMovement().setTurnTimerLeft(ship.getShipMovement().getTurnTimerLeft() - 1);
    //            System.out.println(ship.getShipMovement().getTurnTimerLeft());

            }}
        }

        }


}




