package org.academiadecodigo.academywars.chars.player.position;

import org.academiadecodigo.academywars.chars.enemies.Enemy;
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
        private Enemy[] enemies;

        public FireShootPosition(int x, int y, Arena arena, SpaceShipPosition spaceShipPosition, Enemy[] enemies){
            super(x,y);
            this.arena = arena;
            this.spaceShipPosition = spaceShipPosition;
            this.enemies = enemies;
            speed = 50;
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
            spaceShipPosition.getRectangle().translate(0,+speed/5);
            TimeUnit.MILLISECONDS.sleep(100);
            spaceShipPosition.getRectangle().translate(0,-speed/5);
        }



    public void actualShoot() throws InterruptedException {
            gunRecoil(speed);
        ThreadsShoot thread2 = new ThreadsShoot(100, this, enemies);
        thread2.start();
    }

    public void setShooting(boolean shooting) {
        isShooting = shooting;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }
}
