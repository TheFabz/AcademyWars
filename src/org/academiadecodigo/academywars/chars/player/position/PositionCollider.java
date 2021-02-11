package org.academiadecodigo.academywars.chars.player.position;

import org.academiadecodigo.academywars.chars.enemies.Enemies;
import org.academiadecodigo.academywars.chars.enemies.Enemy;

public class PositionCollider {

        private SpaceShipPosition ship;
        private Enemy enemy;
        private boolean isColliding;
        private FireShootPosition fire;


        //COLIDING WITH ENEMIES
        public PositionCollider(SpaceShipPosition ship, Enemy enemy) {
            this.ship = ship;
            this.enemy = enemy;
            this.isColliding = false;
        }

        //COLIDING ENEMY WITH FIRESHOOT

        public PositionCollider(SpaceShipPosition ship, Enemy enemy, FireShootPosition fire) {
            this.ship = ship;
            this.enemy = enemy;
            this.isColliding = false;
            this.fire = fire;
        }




        public void collideWithEnemy() {
            System.out.println("imhereee");
            int shipY = ship.getY();
            int enemyY = enemy.getAvatar().getY()+enemy.getAvatar().getHeight();

            if(shipY != enemyY){return;}

            for(int spaceShipSurf = this.ship.getX(); spaceShipSurf <ship.getX() + ship.getWIDTH(); spaceShipSurf++) {

                for(int enemySurf = enemy.getAvatar().getX(); enemySurf<enemy.getAvatar().getWidth()+enemy.getAvatar().getX(); enemySurf++){
                    if(spaceShipSurf==enemySurf){
                        setColliding(true);
                    }
                }
            }

        }


    public void collideEnemyWithFire() {
        System.out.println("imhereee");

        int fireY = fire.getY();
        int enemyY = enemy.getAvatar().getY()+enemy.getAvatar().getHeight();

        if(fireY != enemyY){return;}

        for(int fireshootSurf = this.fire.getX(); fireshootSurf <ship.getX() + fire.getRectangle().getWidth(); fireshootSurf++) {

            for(int enemySurf = enemy.getAvatar().getX(); enemySurf<enemy.getAvatar().getWidth()+enemy.getAvatar().getX(); enemySurf++){
                if(fireshootSurf==enemySurf){
                    setColliding(true);
                }
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




