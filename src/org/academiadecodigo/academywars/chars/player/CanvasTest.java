package org.academiadecodigo.academywars.chars.player;


import org.academiadecodigo.academywars.chars.player.position.SpaceShipPosition;
import org.academiadecodigo.academywars.chars.player.threadsPlayer.*;

public class CanvasTest {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("here");

        Arena arena = new Arena();

        SpaceShipPosition spaceShipPosition = new SpaceShipPosition((arena.getFieldWidth() / 2), arena.getFieldHeight() / 2, arena);
        Controls controls = new Controls(spaceShipPosition);

        spaceShipPosition.drawSpaceShip();
        controls.activateArrowKeys();
        controls.activateSpaceKey();

        SpaceShipPosition spaceShipPositionTest = new SpaceShipPosition((100), 100, arena);

        ThreadsListenerShoot thread = new ThreadsListenerShoot(10, spaceShipPosition);
       thread.start();
        ThreadsListenerTurnLeft threadLeft = new ThreadsListenerTurnLeft(10,spaceShipPosition);
        threadLeft.start();
        ThreadsListenerTurnRight threadRight = new ThreadsListenerTurnRight(10, spaceShipPosition);
        threadRight.start();
        ThreadsListenerTurnUp threadUp  = new ThreadsListenerTurnUp(10,spaceShipPosition);
        threadUp.start();
        ThreadsListenerTurnDown threadDown = new ThreadsListenerTurnDown(10,spaceShipPosition);
        threadDown.start();

/*  while (true) {

           if (spaceShipPosition.isTurningLeft()) {
                spaceShipPosition.turnLeft();
            }

            if (spaceShipPosition.isTurningRight()) {
                spaceShipPosition.turnRight();
            }

            if (spaceShipPosition.isTurningDown()) {
                spaceShipPosition.turnDown();
            }

            if (spaceShipPosition.isTurningUp()) {
                spaceShipPosition.turnUp();
            }




        if(spaceShipPosition.isShooting()){
               System.out.println("SHOOT");
              spaceShipPosition.fireShoot();
           }

           else{

               System.out.println("NOT SHOOTING");
               System.out.println("NOT TURNING LEFT");
           }

    }
 */

        }


    }


