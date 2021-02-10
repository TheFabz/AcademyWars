package org.academiadecodigo.academywars.chars.player.threadsPlayer;

import org.academiadecodigo.academywars.chars.player.Arena;
import org.academiadecodigo.academywars.chars.player.position.SpaceShipPosition;

public class ThreadsShipTurnUp extends Thread {

    private int delay;

    private SpaceShipPosition ship;

    private Arena arena;


    public ThreadsShipTurnUp(int delay, SpaceShipPosition ship, Arena arena) {
        this.delay = delay;
        this.ship = ship;
        this.arena = arena;


    }

    public void run() {

        while (arena.getField().getY() != ship.getY()) {
            try {
                sleep(delay);
            } catch (Exception e) {
                System.out.println(e);
            }

            if (ship.getTurnTimerUp() >= 0) {

                ship.setY(ship.getY() - 1);

                ship.getRectangle().translate(0, -1);
                ship.drawSpaceShip();
                ship.setTurnTimerUp(ship.getTurnTimerUp() - 1);
                System.out.println(ship.getTurnTimerUp());

            }
        }

        }


}




