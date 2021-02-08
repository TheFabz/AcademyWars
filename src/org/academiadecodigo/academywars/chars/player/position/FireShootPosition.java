package org.academiadecodigo.academywars.chars.player.position;

import org.academiadecodigo.bootcamp56.academywarstest.*;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.util.concurrent.TimeUnit;

public class FireShootPosition extends org.academiadecodigo.bootcamp56.academywarstest.position.Position {

        private static final int WIDTH = 10;
        private static final int HEIGHT = 50;
        private int speed;
        private Arena arena;
        private Rectangle rectangle;
        private org.academiadecodigo.bootcamp56.academywarstest.position.SpaceShipPosition spaceShipPosition;
        private int spaceShipCenterX;
        private int spaceShipCenterY;

        public FireShootPosition(int x, int y, Arena arena, org.academiadecodigo.bootcamp56.academywarstest.position.SpaceShipPosition spaceShipPosition){
            super(x,y);
            this.arena = arena;
            this.spaceShipPosition = spaceShipPosition;
            speed = 1;
            spaceShipCenterY = spaceShipPosition.getY()+10;
            System.out.println(spaceShipCenterY);
            spaceShipCenterX = spaceShipPosition.getX()+spaceShipPosition.getWIDTH()/2;
            System.out.println(spaceShipCenterX);
            rectangle = new Rectangle(spaceShipCenterX,spaceShipCenterY,WIDTH,HEIGHT);
            drawFireShoot();



        }

        public void drawFireShoot(){
            rectangle.draw();
            rectangle.setColor(Color.RED);
            rectangle.fill();
        }

    /*       public void move(Direction dir, int speed) {

             switch (dir) {
           /*  case LEFT:
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


                 case UP: {
                     if(rectangle.getY()<=0){
                         return;
                     }
                       System.out.println("here");
                     setY(getY()-speed);
                     rectangle.translate(0, -speed);
                     move(Direction.UP,speed);
                 }
             }
         }
 */
        public int getSpeed() {
            return speed;
        }


    public void fireShoot() throws InterruptedException {


        System.out.println("HEREHERE");

        while(getY()>10) {
            TimeUnit.SECONDS.sleep(100);
            setY(getY()-speed);
            rectangle.translate(0, -speed);
        }



    }
}
