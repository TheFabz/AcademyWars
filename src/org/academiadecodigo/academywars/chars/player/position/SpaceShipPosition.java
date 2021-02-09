package org.academiadecodigo.academywars.chars.player.position;

import org.academiadecodigo.bootcamp56.academywarstest.Arena;
import org.academiadecodigo.bootcamp56.academywarstest.Direction;
import org.academiadecodigo.bootcamp56.academywarstest.SpaceShip;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class SpaceShipPosition extends Position{

    private static final int WIDTH = 40;
    private static final int HEIGHT = 20;
    private SpaceShip spaceShip;
    private int speed;
    private Arena arena;
    private Rectangle rectangle;
    private Direction previousDir;
    private Direction boundaryDirection;

   public SpaceShipPosition(int x, int y, Arena arena, SpaceShip spaceShip){
        super(x,y);
        this.arena = arena;
        this.spaceShip = spaceShip;
        speed = 10;
        previousDir = Direction.UPRIGHT;
        boundaryDirection = Direction.DOWN;

        rectangle = new Rectangle(x,y,WIDTH,HEIGHT);

    }

    public void drawSpaceShip(){
        rectangle.draw();
        rectangle.setColor(Color.YELLOW);
        rectangle.fill();

    }

    public void move(Direction dir, int speed){

        switch (dir){
            case LEFT:
                if(arena.getField().getX() != getX()) {
                    setX(getX() - speed);
                    rectangle.translate(-speed,0);
                    return;
                }
                return;

            case RIGHT:
                if(arena.getField().getX()+arena.getFieldWidth() != getX()+WIDTH) {
                    setX(getX() +speed);
                    rectangle.translate(speed,0);
                    return;
                }
                return;
            case DOWN:
                if(arena.getField().getY()+arena.getFieldHeight() != getY()+HEIGHT) {
                    setY(getY()+speed);
                    rectangle.translate(0,speed);
                    return;
                }
                return;


            case UP:
                if(arena.getField().getY() != getY()) {
                    setY(getY()-speed);
                    rectangle.translate(0,-speed);
                    return;
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

    public void shoot() throws InterruptedException {
        FireShootPosition fireShootPosition = new FireShootPosition(getX(), getY(),arena,this);
        fireShootPosition.fireShoot();



    }




}
