package org.academiadecodigo.academywars.chars.enemies;


import org.academiadecodigo.academywars.chars.player.position.PositionCollider;
import org.academiadecodigo.academywars.chars.player.position.SpaceShipPosition;

public class ThreadMoveEnemy extends Thread{
    //Fields
    private int delay;
    private Enemy enemy;
    private int x1;
    private int y1;
    private SpaceShipPosition ship;

    //Constructor
    public ThreadMoveEnemy(int delay, Enemy enemy, SpaceShipPosition ship){
        this.delay = delay;
        this.enemy = enemy;
        this.x1 = enemy.getAvatar().getX();
        this.y1 = enemy.getAvatar().getY();
        this.ship = ship;
    }

    //Custom Methods
    public void run(){
        PositionCollider colider = new PositionCollider(ship,enemy);

        while(true){
            try {sleep(delay);} catch (Exception error){}
            colider.collideWithEnemy(enemy);

           if(colider.isColliding()){
                enemy.getAvatar().getEnemy().delete();
                return;
            }

            if(enemy.getAvatar().getY() >= 670){
                enemy.getAvatar().setDeleted();
                enemy.getAvatar().getEnemy().delete();
                return;
            }
            double move =  Math.random();

            /*
            //X
            if( move > 0.99){
                enemy.getAvatar().getEnemy().translate(enemy.getAvatar().getSpeed(), 0);
                enemy.getAvatar().setX(enemy.getAvatar().getSpeed());
                continue;
            }
            if(move < 0.005){
                enemy.getAvatar().getEnemy().translate(-(enemy.getAvatar().getSpeed()), 0);
                enemy.getAvatar().setX(-(enemy.getAvatar().getSpeed()));
                continue;
            }*/
            if(x1 > 0 && x1 < 400){
                //X
                enemy.getAvatar().getEnemy().translate(enemy.getAvatar().getSpeed() - 1, 0);
                enemy.getAvatar().setX(enemy.getAvatar().getSpeed());

                //Y
                enemy.getAvatar().getEnemy().translate(0, (enemy.getAvatar().getSpeed()));
                enemy.getAvatar().setY(enemy.getAvatar().getSpeed());
                continue;
            }

            if(x1 > 600 && x1 < 1000){
                //X
                enemy.getAvatar().getEnemy().translate(-enemy.getAvatar().getSpeed() + 1, 0);
                enemy.getAvatar().setX(-enemy.getAvatar().getSpeed());

                //Y
                enemy.getAvatar().getEnemy().translate(0, (enemy.getAvatar().getSpeed()));
                enemy.getAvatar().setY(enemy.getAvatar().getSpeed());
                continue;
            }
            //Y
            enemy.getAvatar().getEnemy().translate(0, (enemy.getAvatar().getSpeed()));
            enemy.getAvatar().setY(enemy.getAvatar().getSpeed());

        }
    }
}


