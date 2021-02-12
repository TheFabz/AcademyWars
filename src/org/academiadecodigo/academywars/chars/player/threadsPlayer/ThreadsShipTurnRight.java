package org.academiadecodigo.academywars.chars.player.threadsPlayer;

import org.academiadecodigo.academywars.chars.player.Arena;
import org.academiadecodigo.academywars.chars.player.position.SpaceShipPosition;

public class ThreadsShipTurnRight extends Thread {

    private int delay;

    private SpaceShipPosition ship;

    private Arena arena;


    public ThreadsShipTurnRight(int delay, SpaceShipPosition ship, Arena arena) {
        this.delay = delay;
        this.ship = ship;
        this.arena = arena;


    }

    public void run() {

        while (arena.getField().getX()+arena.getFieldWidth() != ship.getX()+ship.getWIDTH()) {
            try {
                sleep(delay);
            } catch (Exception e) {
                System.out.println(e);
            }
            if (ship.getRectangle().getX() + ship.getRectangle().getWidth() != arena.getFieldWidth()) {

            if (ship.getShipMovement().getTurnTimerRight() >= 0) {

                ship.setX(ship.getX() + 1);

                ship.getRectangle().translate(1, 0);
                ship.drawSpaceShip();
                ship.getShipMovement().setTurnTimerRight(ship.getShipMovement().getTurnTimerRight() - 1);
           //     System.out.println(ship.getShipMovement().getTurnTimerRight());
            }
            }
        }

        }


}




