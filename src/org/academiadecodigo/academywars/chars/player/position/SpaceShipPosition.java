package org.academiadecodigo.academywars.chars.player.position;

import org.academiadecodigo.academywars.chars.player.Arena;
import org.academiadecodigo.academywars.chars.player.Direction;
import org.academiadecodigo.academywars.chars.player.threadsPlayer.*;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.concurrent.TimeUnit;

import static org.academiadecodigo.academywars.chars.player.Direction.*;

public class SpaceShipPosition extends Position{

    private static final int WIDTH = 40;
    private static final int HEIGHT = 20;
    private int speed;
    private Arena arena;
    private Picture rectangle;
    private Direction previousDir;
    private Direction boundaryDirection;
    private FireShootPosition shoot;
    private boolean isShooting;
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

   public SpaceShipPosition(int x, int y, Arena arena){
        super(x,y);
        this.arena = arena;


        previousDir = Direction.UPRIGHT;
        boundaryDirection = Direction.DOWN;
        isShooting = false;

        rectangle = new Picture(x,y,"resources/8BitSpaceShip.png");

       speed = 20;
       isTurningLeft = false;
       isTurningRight = false;
       isTurningDown =false;
       isTurningUp = false;
        turnTimerLeft = speed;
        turnTimerRight = speed;
        turnTimerDown = speed;
        turnTimerUp = speed;

    }

    public void drawSpaceShip(){
        rectangle.draw();

    }

    public void move(Direction dir, int speed) throws InterruptedException {

        switch (dir){
            case LEFT:

                ThreadsShipTurnLeft threadTurnLeft = new ThreadsShipTurnLeft(1, this, arena);
                threadTurnLeft.start();
                turnTimerLeft = speed;
                return;


            case RIGHT:
                ThreadsShipTurnRight threadsTurnRight = new ThreadsShipTurnRight(1, this, arena);
                threadsTurnRight.start();
                turnTimerRight = speed;
                return;

            case DOWN:

                ThreadsShipTurnDown threadsTurnDown = new ThreadsShipTurnDown(1, this, arena);
                threadsTurnDown.start();
                turnTimerDown = speed;
                return;


            case UP:

                ThreadsShipTurnUp threadUp = new ThreadsShipTurnUp(1, this, arena);
                threadUp.start();
                turnTimerUp =speed;

                return;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public Picture getRectangle() {
        return rectangle;
    }

    public FireShootPosition getShoot() {
        return shoot;
    }

    public void fireShoot() throws InterruptedException {

        shoot = new FireShootPosition((getX()+((getWIDTH())/2)),getY()-getWIDTH()-10,arena,this);
        isShooting = false;
        shoot.drawFireShoot();
        shoot.actualShoot();

    }

    public void setShooting(boolean shooting) {
        isShooting = shooting;
    }

    public boolean isShooting() {
        return isShooting;
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


