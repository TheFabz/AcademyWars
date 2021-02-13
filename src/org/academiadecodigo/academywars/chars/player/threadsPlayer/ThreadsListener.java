package org.academiadecodigo.academywars.chars.player.threadsPlayer;

import org.academiadecodigo.academywars.chars.player.Direction;
import org.academiadecodigo.academywars.chars.player.position.SpaceShipPosition;

public class ThreadsListener extends Thread{

    private int delay;
    private SpaceShipPosition ship;
    private Direction direction;


    public ThreadsListener(int delay, SpaceShipPosition shoot) {
        this.delay = delay;
        this.ship = shoot;
        direction = Direction.DOWN;


    }
    public void run() {
        while (true) {
            try{ sleep(delay); }catch(Exception e){ System.out.println(e); }


                    if(ship.getShipMovement().isTurningRight()){

                        //       System.out.println("OLA");
                        try {

                            ship.getShipMovement().turnRight();
                            continue;
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if(ship.getShipMovement().isTurningLeft()){

                        //    System.out.println("OLA");
                        try {
                            ship.getShipMovement().turnLeft();
                            continue;
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }


                    if(ship.getShipMovement().isTurningUp()){

                        // System.out.println("OLA");
                        try {
                            ship.getShipMovement().turnUp();
                            continue;
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }


                    if(ship.getShipMovement().isTurningDown()){

                        //    System.out.println("OLA");
                        try {
                            ship.getShipMovement().turnDown();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

            }









        }


    }



