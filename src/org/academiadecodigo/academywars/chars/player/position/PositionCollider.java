package org.academiadecodigo.academywars.chars.player.position;

import org.academiadecodigo.academywars.chars.enemies.Enemy;

public class PositionCollider {

    private SpaceShipPosition ship;
    private Enemy enemy;
    private boolean isColliding;
    private FireShootPosition shoot;


    //COLIDING WITH ENEMIES
    public PositionCollider(SpaceShipPosition ship, Enemy enemy) {
        this.ship = ship;
        this.enemy = enemy;
        this.isColliding = false;
    }

    //COLIDING ENEMY WITH FIRESHOOT

    public PositionCollider(Enemy enemy, FireShootPosition fire) {
        this.enemy = enemy;
        this.isColliding = false;
        this.shoot = fire;
    }


    public void collideWithEnemy(Enemy enemy) {

        int padding = 30;
        int shipX = ship.getX();
        int enemyX = enemy.getAvatar().getX();
        System.out.println();
        int shipY = ship.getY();
        int enemyY = enemy.getAvatar().getY();

        if (shipX + padding + ship.getWIDTH() >= enemyX - padding && shipX + ship.getWIDTH() - padding <= enemyX + enemy.getAvatar().getWidth() + ship.getWIDTH() + padding) {
            if (shipY <= enemyY + enemy.getAvatar().getHeight() && shipY + ship.getHEIGHT() >= enemyY - padding) {


                System.out.println("COLIDERR XXXXXXXXXXXXXXXXXXXXXXXX AND YYYYYYYYYYYYYYYYYYYYYYYYYYYYYY");
                isColliding = true;
            }
        }


    }

    public void collideFireshootWithEnemy(Enemy enemy) {

        int padding = 30;
        int shootX = shoot.getX();
        int enemyX = enemy.getAvatar().getX();
        System.out.println();
        int shootY = shoot.getY();
        int enemyY = enemy.getAvatar().getY();

        if (shootX + padding + shoot.getRectangle().getWidth() >= enemyX - padding && shootX + shoot.getRectangle().getWidth() - padding <= enemyX + enemy.getAvatar().getWidth() + shoot.getRectangle().getWidth() + padding) {
            if (shootY <= enemyY + enemy.getAvatar().getHeight() && shootY + shoot.getRectangle().getHeight() >= enemyY - padding) {


                System.out.println("COLIDERR XXXXXXXXXXXXXXXXXXXXXXXX AND YYYYYYYYYYYYYYYYYYYYYYYYYYYYYY");
                isColliding = true;
                enemy.setDestroyed();
            }
        }


    }


    public void setColliding(boolean colliding) {
        this.isColliding = colliding;
    }

    public boolean isColliding() {
        return isColliding;
    }
}




