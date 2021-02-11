package org.academiadecodigo.academywars.chars.enemies;

import java.util.concurrent.TimeUnit;

public class InitializeEnemies {




    InitializeEnemies(){

    }

    public static void initialize(Enemy[] enemies, int delayMove, int delayTry){
        new ThreadInitializeEnemies(enemies, delayMove, delayTry).start();


    }


}
