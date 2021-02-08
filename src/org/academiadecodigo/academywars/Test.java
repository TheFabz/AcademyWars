package org.academiadecodigo.academywars;

import org.academiadecodigo.academywars.chars.enemies.*;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.util.concurrent.TimeUnit;
import java.util.Timer;
import java.util.TimerTask;


public class Test {
    public static void main(String[] args) throws InterruptedException {
        Rectangle field = new Rectangle(10, 10 , 1280, 720);
        field.fill();
        field.setColor(Color.BLACK);
        Boss[] bosses = new Boss[1000];


        for(int i = 0; i < bosses.length; i++){
            bosses[i] = new Boss(100, 40, EnemyFactory.EnemyFactory());
            move(bosses[i]);
        }









    }

    public static void move(Enemy boss) throws InterruptedException {
        while(boss.getAvatar().getY() < 690 && boss.getAvatar().getX() < 1250 &&  boss.getAvatar().getX() != 10) {
            TimeUnit.MILLISECONDS.sleep(4);
            double move =  Math.random();

            if( move > 0.9){
                boss.getAvatar().getEnemy().translate(4, 0);
                boss.getAvatar().setX(4);
                continue;
            }
            if(move < 0.1){
                boss.getAvatar().getEnemy().translate(-4, 0);
                boss.getAvatar().setX(-4);
                continue;
            }
            boss.getAvatar().getEnemy().translate(0, 4);
            boss.getAvatar().setY(4);
        }
        boss.getAvatar().getEnemy().delete();
    }







}
