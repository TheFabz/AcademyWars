package org.academiadecodigo.academywars;
import org.academiadecodigo.academywars.chars.player.Arena;
import org.academiadecodigo.academywars.chars.player.Controls;
import org.academiadecodigo.academywars.chars.player.position.SpaceShipPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.Timer;
import java.util.TimerTask;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        Move move1 = new Move(1000, "Test1");
        Move move2 = new Move(3000, "Test2");
        Move move3 = new Move(500, "test3");

    }





    public static class Move extends Thread{
        //Fields
        private int delay;
        private String test;

        //Contructor
        public Move(int delay, String test){
            this.delay = delay;
            this.test = test;
        }

        public void run(){
            while (true){
                try{sleep(delay);} catch (Exception error){}
                System.out.println(test);
            }
        }
    }
}
