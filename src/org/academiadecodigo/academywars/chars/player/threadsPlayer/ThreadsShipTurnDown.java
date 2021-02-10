package org.academiadecodigo.academywars.chars.player.threadsPlayer;

import org.academiadecodigo.academywars.chars.player.Arena;
import org.academiadecodigo.academywars.chars.player.position.SpaceShipPosition;

public class ThreadsShipTurnDown extends Thread {

    private int delay;

    private SpaceShipPosition ship;

    private Arena arena;


    public ThreadsShipTurnDown(int delay, SpaceShipPosition ship, Arena arena) {
        this.delay = delay;
        this.ship = ship;
        this.arena = arena;


    }

    public void run() {


        while (ship.getTurnTimerDown() != 0) {
            try {
                sleep(delay);
            } catch (Exception e) {
                System.out.println(e);
            }
            if (ship.getRectangle().getY() + ship.getRectangle().getHeight() != arena.getFieldWidth()) {
                if (ship.getTurnTimerDown() >= 0) {
                    System.out.println("HERE");
                    ship.setY(ship.getY() + 1);

                    ship.getRectangle().translate(0, 1);
                    ship.drawSpaceShip();
                    ship.setTurnTimerDown(ship.getTurnTimerDown() - 1);
                    System.out.println(ship.getTurnTimerDown());

                }
            }
        }


    }
}




