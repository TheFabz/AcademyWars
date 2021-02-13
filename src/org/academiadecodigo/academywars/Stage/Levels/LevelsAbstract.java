package org.academiadecodigo.academywars.Stage.Levels;

import org.academiadecodigo.academywars.Stage.StageAbstract;
import org.academiadecodigo.academywars.chars.enemies.Enemy;
import org.academiadecodigo.academywars.chars.enemies.EnemyFactory;
import org.academiadecodigo.academywars.chars.enemies.InitializeEnemies;
import org.academiadecodigo.academywars.chars.player.Arena;
import org.academiadecodigo.academywars.chars.player.position.SpaceShipPosition;

public abstract class LevelsAbstract extends StageAbstract {

    private boolean isLevelComplete;
    private boolean isGameOver;

    public LevelsAbstract(String backGroundPath, String musicPath) {

        super(backGroundPath,musicPath);



    }


    public boolean isGameOver(){
        return isGameOver;
    }


    public boolean isLevelComplete(){
        return isLevelComplete;
    }

}
