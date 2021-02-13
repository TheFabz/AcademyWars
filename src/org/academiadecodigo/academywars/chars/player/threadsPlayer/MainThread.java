package org.academiadecodigo.academywars.chars.player.threadsPlayer;

import org.academiadecodigo.academywars.chars.player.position.SpaceShipPosition;

public class MainThread {


    public static void Init(SpaceShipPosition ship){
        ThreadsListener threadRight = new ThreadsListener(10, ship);
        threadRight.start();
        ThreadsListenerShoot thread = new ThreadsListenerShoot(10, ship);
        thread.start();
      /*  ThreadsListenerTurnRight threadLeft = new ThreadsListenerTurnRight(10,ship, Direction.LEFT);
        threadLeft.start();

        ThreadsListenerTurnRight threadUp  = new ThreadsListenerTurnRight(10,ship,Direction.UP);
        threadUp.start();
        ThreadsListenerTurnRight threadDown = new ThreadsListenerTurnRight(10,ship, Direction.RIGHT);
        threadDown.start();*/
    }


}
