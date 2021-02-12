package org.academiadecodigo.academywars.chars.player.position;

import org.academiadecodigo.academywars.chars.player.Arena;
import org.academiadecodigo.academywars.chars.player.threadsPlayer.ThreadsShoot;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.util.concurrent.TimeUnit;

public class FireShootPosition extends Position {

        private static final int WIDTH = 5;
        private static final int HEIGHT = 20;
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
          //  System.out.println(spaceShipCenterY);
            spaceShipCenterX = spaceShipPosition.getX()+spaceShipPosition.getWIDTH()/2;
           // System.out.println(spaceShipCenterX);
            rectangle = new Rectangle(x,y,WIDTH,HEIGHT);
            isShooting = true;

        }

        public void drawFireShoot(){
            rectangle.draw();
            rectangle.setColor(Color.WHITE);
            rectangle.fill();
        }

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
        ThreadsShoot thread2 = new ThreadsShoot(1, this);
        thread2.start();
    }

    public void setShooting(boolean shooting) {
        isShooting = shooting;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }
}
