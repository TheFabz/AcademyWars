package org.academiadecodigo.academywars;
import java.util.Timer;
import java.util.TimerTask;

public class Test2 {
    public static void main(String[] args) {
        new Timer().scheduleAtFixedRate(new TimerTask(){
            @Override
            public void run(){
                System.out.println("tag" + "A Kiss every 5 seconds");
            }
        },0,5000);

        new Timer().scheduleAtFixedRate(new TimerTask(){
            @Override
            public void run(){
                System.out.println("tag" + "A Kiss every 1 seconds");
            }
        },0,1000);


    }
}
