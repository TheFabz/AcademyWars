package org.academiadecodigo.academywars.chars.enemies;


public class ThreadMoveEnemy extends Thread{
    //Fields
    private int delay;
    private Enemy enemy;
    private int x1;
    private int y1;

    //Constructor
    public ThreadMoveEnemy(int delay, Enemy enemy){
        this.delay = delay;
        this.enemy = enemy;
        this.x1 = enemy.getAvatar().getX();
        this.y1 = enemy.getAvatar().getY();
    }

    //Custom Methods
    public void run(){
        while(true){
            try {sleep(delay);} catch (Exception error){}
            if(enemy.isDestroyed()){
                //enemy.getAvatar().setDeleted();
                enemy.getAvatar().getEnemy().delete();
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


