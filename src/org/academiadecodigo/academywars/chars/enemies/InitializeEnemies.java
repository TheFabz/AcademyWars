package org.academiadecodigo.academywars.chars.enemies;

import org.academiadecodigo.academywars.chars.player.position.SpaceShipPosition;

import java.util.concurrent.TimeUnit;

public class InitializeEnemies {



    InitializeEnemies(){

    }

    public static void initialize(Enemy[] enemies, int delayMove, int delayTry, SpaceShipPosition spaceShipPosition){
        new ThreadInitializeEnemies(enemies, delayMove, delayTry, spaceShipPosition).start();


    }


}
