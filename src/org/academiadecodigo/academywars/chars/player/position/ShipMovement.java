package org.academiadecodigo.academywars.chars.player.position;

import org.academiadecodigo.academywars.chars.player.Arena;
import org.academiadecodigo.academywars.chars.player.Direction;
import org.academiadecodigo.academywars.chars.player.threadsPlayer.ThreadsShipTurnDown;
import org.academiadecodigo.academywars.chars.player.threadsPlayer.ThreadsShipTurnLeft;
import org.academiadecodigo.academywars.chars.player.threadsPlayer.ThreadsShipTurnRight;
import org.academiadecodigo.academywars.chars.player.threadsPlayer.ThreadsShipTurnUp;

import static org.academiadecodigo.academywars.chars.player.Direction.*;
import static org.academiadecodigo.academywars.chars.player.Direction.LEFT;

public class ShipMovement {

    private int speed;
    private Arena arena;
    private SpaceShipPosition ship;


    private boolean isTurningLeft;
    private boolean isTurningRight;
    private boolean isTurningUp;
    private boolean isTurningDown;
    private int turnTimerLeft;
    private int turnTimerRight;
    private int turnTimerUp;
    private int turnTimerDown;
    private int getTurnTimerUp;
    private int getTurnTimerDown;
    private PositionCollider colider;



   public ShipMovement(SpaceShipPosition ship, Arena arena){
        this.ship = ship;
        this.arena = arena;
       speed = 30;
       isTurningLeft = false;
       isTurningRight = false;
       isTurningDown =false;
       isTurningUp = false;
       turnTimerLeft = speed;
       turnTimerRight = speed;
       turnTimerDown = speed;
       turnTimerUp = speed;

   }


    public  PositionCollider getColider() {
        return colider;
    }

    public void move(Direction dir, int speed) throws InterruptedException {

        switch (dir){
            case LEFT:

                ThreadsShipTurnLeft threadTurnLeft = new ThreadsShipTurnLeft(1, ship, arena);
                threadTurnLeft.start();
                turnTimerLeft = speed;
                return;


            case RIGHT:
                ThreadsShipTurnRight threadsTurnRight = new ThreadsShipTurnRight(1, ship, arena);
                threadsTurnRight.start();
                turnTimerRight = speed;
                return;

            case DOWN:

                ThreadsShipTurnDown threadsTurnDown = new ThreadsShipTurnDown(1, ship, arena);
                threadsTurnDown.start();
                turnTimerDown = speed;
                return;


            case UP:

                ThreadsShipTurnUp threadUp = new ThreadsShipTurnUp(1, ship, arena);
                threadUp.start();
                turnTimerUp =speed;

                return;
        }
    }


    //TURN METHODS

    public void turnUp() throws InterruptedException {

        isTurningUp = false;

        move(UP,speed);

    }
    public void turnDown() throws InterruptedException {

        isTurningDown = false;

        move(DOWN,speed);

    }
    public void turnRight() throws InterruptedException {

        isTurningRight = false;

        move(RIGHT,speed);

    }
    public void turnLeft() throws InterruptedException {

        isTurningLeft = false;

        move(LEFT,speed);

    }
    //SET TURNS

    public void setTurningUp(boolean turningUp) {
        isTurningUp = turningUp;
    }
    public void setTurningDown(boolean turningDown) {
        isTurningDown = turningDown;
    }
    public void setTurningRight(boolean turningRight) {
        isTurningRight = turningRight;
    }
    public void setTurningLeft(boolean turningLeft) {
        isTurningLeft = turningLeft;
    }

    //BOOLEANS FOR DIRECTIONS

    public boolean isTurningUp() {
        return isTurningUp;
    }
    public boolean isTurningDown() {
        return isTurningDown;
    }
    public boolean isTurningRight() {
        return isTurningRight;
    }
    public boolean isTurningLeft(){
        return isTurningLeft;
    }

    //GET TURNTIMERS


    public int getTurnTimerUp() {
        return turnTimerUp;
    }
    public int getTurnTimerDown() {
        return turnTimerDown;
    }

    public int getTurnTimerRight() {
        return turnTimerRight;
    }

    public int getTurnTimerLeft() {
        return turnTimerLeft;
    }


    //SET TURNTIMERS

    public void setTurnTimerUp(int turnTimerUp) {
        this.turnTimerUp = turnTimerUp;
    }

    public void setTurnTimerDown(int turnTimerDown) {
        this.turnTimerDown = turnTimerDown;
    }
    public void setTurnTimerRight(int turnTimerRight) {
        this.turnTimerRight = turnTimerRight;
    }
    public void setTurnTimerLeft(int turnTimerLeft) {
        this.turnTimerLeft = turnTimerLeft;
    }


}
