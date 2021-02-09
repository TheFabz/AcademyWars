package org.academiadecodigo.academywars.chars.player.position;

import org.academiadecodigo.academywars.chars.player.Arena;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.util.concurrent.TimeUnit;

public class FireShootPosition extends Position {

        private static final int WIDTH = 1;
        private static final int HEIGHT = 10;
        private int speed;
        private Arena arena;
        private Rectangle rectangle;
        private SpaceShipPosition spaceShipPosition;
        private int spaceShipCenterX;
        private int spaceShipCenterY;
        private boolean isShooting;

        public FireShootPosition(int x, int y, Arena arena, SpaceShipPosition spaceShipPosition){
            super(x,y);
            this.arena = arena;
            this.spaceShipPosition = spaceShipPosition;
            speed = 1;
            spaceShipCenterY = spaceShipPosition.getY()+10;
            System.out.println(spaceShipCenterY);
            spaceShipCenterX = spaceShipPosition.getX()+spaceShipPosition.getWIDTH()/2;
            System.out.println(spaceShipCenterX);
            rectangle = new Rectangle(x,y,WIDTH,HEIGHT);
            isShooting = true;




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

        public void gunRecoil(int speed) throws InterruptedException {
            spaceShipPosition.getRectangle().translate(0,+speed*4);
            TimeUnit.MILLISECONDS.sleep(100);
            spaceShipPosition.getRectangle().translate(0,-speed*4);
        }



    public void actualShoot() throws InterruptedException {

            gunRecoil(speed);

        while(rectangle.getY()>0) {

            System.out.println("SHOOT");
            TimeUnit.MILLISECONDS.sleep(1);
            setY(getY()-speed);

            rectangle.translate(0, -speed);
            drawFireShoot();
        }


    }

    public void setShooting(boolean shooting) {
        isShooting = shooting;
    }
}
