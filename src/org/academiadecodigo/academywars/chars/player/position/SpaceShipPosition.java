package org.academiadecodigo.academywars.chars.player.position;

import org.academiadecodigo.academywars.chars.player.Arena;
import org.academiadecodigo.academywars.chars.player.Direction;
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

        speed = 20;
        previousDir = Direction.UPRIGHT;
        boundaryDirection = Direction.DOWN;
        isShooting = false;
        isTurningLeft = false;
        isTurningRight = false;
        isTurningDown =false;
        isTurningUp = false;
        rectangle = new Picture(x,y,"resources/8BitSpaceShip.png");
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

                if(arena.getField().getX() != getX()) {

                    while(turnTimerLeft !=0) {

                        TimeUnit.MILLISECONDS.sleep(10);
                        setX(getX()-1);

                        rectangle.translate(-1, 0);
                        drawSpaceShip();
                        turnTimerLeft--;
                    }
                    turnTimerLeft =speed;

                }
                return;

            case RIGHT:
                if(arena.getField().getX()+arena.getFieldWidth() != getX()+WIDTH) {

                    while (turnTimerRight != 0) {

                        TimeUnit.MILLISECONDS.sleep(10);
                        setX(getX() + 1);
                        rectangle.translate(+1, 0);
                        drawSpaceShip();
                        turnTimerRight--;
                    }
                    turnTimerRight = speed;
                }
                return;

            case DOWN:
                if(arena.getField().getY()+arena.getFieldHeight() != getY()+HEIGHT) {

                    while(turnTimerDown !=0) {
                        TimeUnit.MILLISECONDS.sleep(10);
                    setY(getY()+1);
                    rectangle.translate(0,1);
                    drawSpaceShip();
                    turnTimerDown--;

                }
                    turnTimerDown =speed;
                }
                return;


            case UP:
                if(arena.getField().getY() != getY()) {
                    while(turnTimerUp !=0) {
                        TimeUnit.MILLISECONDS.sleep(10);
                        setY(getY() - 1);
                    rectangle.translate(0, -1);
                    drawSpaceShip();
                    turnTimerUp--;
                }
                    turnTimerUp =speed;
                }
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



    public void fireShoot() throws InterruptedException {

        shoot = new FireShootPosition((getX()+((getWIDTH())/2)),getY()-getWIDTH()-10,arena,this);
        isShooting = false;
        shoot.drawFireShoot();
        shoot.actualShoot();

    }

    public void turnLeft() throws InterruptedException {

        isTurningLeft = false;

        move(LEFT,speed);

    }

    public void turnRight() throws InterruptedException {

        isTurningRight = false;

        move(RIGHT,speed);

    }
    public void turnDown() throws InterruptedException {

        isTurningDown = false;

        move(DOWN,speed);

    }

    public void turnUp() throws InterruptedException {

        isTurningUp = false;

        move(UP,speed);

    }


    public void setTurningLeft(boolean turningLeft) {
        isTurningLeft = turningLeft;
    }

    public void setTurningRight(boolean turningRight) {
        isTurningRight = turningRight;
    }

    public void setTurningDown(boolean turningDown) {
        isTurningDown = turningDown;
    }

    public void setTurningUp(boolean turningUp) {
        isTurningUp = turningUp;
    }




    public void setShooting(boolean shooting) {
        isShooting = shooting;
    }

    public boolean isShooting() {
        return isShooting;
    }

    public boolean isTurningLeft(){
       return isTurningLeft;
    }

    public boolean isTurningRight() {
        return isTurningRight;
    }

    public boolean isTurningDown() {
        return isTurningDown;
    }

    public boolean isTurningUp() {
        return isTurningUp;
    }

    public Picture getRectangle() {
        return rectangle;
    }



}
