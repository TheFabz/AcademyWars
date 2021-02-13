package org.academiadecodigo;

import org.academiadecodigo.academywars.Stage.Levels.*;
import org.academiadecodigo.academywars.Stage.Transitions.*;
import org.academiadecodigo.academywars.chars.enemies.Enemy;
import org.academiadecodigo.academywars.chars.enemies.EnemyFactory;
import org.academiadecodigo.academywars.chars.enemies.InitializeEnemies;
import org.academiadecodigo.academywars.chars.player.Arena;
import org.academiadecodigo.academywars.chars.player.position.SpaceShipPosition;

public class Game {


    private boolean isGameFinished;

    private final StartScreen startScreen = new StartScreen();
    private final GameVictoryScreen gameVictoryScreen = new GameVictoryScreen();
    private final GameOverScreen gameOverScreen = new GameOverScreen();
    private final Transition1 transition1 = new Transition1();
    private final Transition2 transition2 = new Transition2();
    private final Transition3 transition3 = new Transition3();
    private final Transition4 transition4 = new Transition4();
    private final Transition5 transition5 = new Transition5();
    private final Level1 level1 = new Level1();
    private final Level2 level2 = new Level2();
    private final Level3 level3 = new Level3();
    private final Level4 level4 = new Level4();
    private final Level5 level5 = new Level5();
    private final Level6 level6 = new Level6();
    private final Boss1 boss1 = new Boss1();
    private final Boss2 boss2 = new Boss2();
    private final Boss3 boss3 = new Boss3();
    private final Boss4 boss4 = new Boss4();


    public Game() {
     /*   Arena arena = new Arena();
        Enemy[] enemies = new Enemy[50];
        SpaceShipPosition ship = new SpaceShipPosition((arena.getFieldWidth() / 2), arena.getFieldHeight() / 2, arena);*/
    }


    public void gameStoryStart(){

        while(!isGameFinished){

            while(!startScreen.isTransitionOver()){
                startScreen.start();
            }

            while(!level1.isLevelComplete()){
                System.out.println(startScreen.isTransitionOver());
                startScreen.end();
                level1.start();

                if(level1.isGameOver()){
                    while(!gameOverScreen.isTransitionOver())
                        gameOverScreen.start();
                }
            }

            while(!transition1.isTransitionOver()){
                level1.end();
                transition1.start();
            }

            while(!level2.isLevelComplete()){
                transition1.end();
                level2.start();

                if(level2.isGameOver()){
                    while(!gameOverScreen.isTransitionOver())
                        gameOverScreen.start();
                }
            }

            while(!transition2.isTransitionOver()){
                level2.end();
                transition2.start();
            }

            while(!level3.isLevelComplete()){
                transition2.end();
                level3.start();

                if(level3.isGameOver()){
                    while(!gameOverScreen.isTransitionOver())
                        gameOverScreen.start();
                }
            }

            while(!boss1.isLevelComplete()){
                level3.end();
                boss1.start();
                if(boss1.isGameOver()){
                    while(!gameOverScreen.isTransitionOver())
                        gameOverScreen.start();
                }
            }

            while(!transition3.isTransitionOver()){
                boss1.end();
                transition3.start();
            }

            while(!level4.isLevelComplete()){
                transition3.end();
                level4.start();

                if(level4.isGameOver()){
                    while(!gameOverScreen.isTransitionOver())
                        gameOverScreen.start();
                }
            }

            while(!boss2.isLevelComplete()){
                level4.end();
                boss2.start();
                if(boss2.isGameOver()){
                    while(!gameOverScreen.isTransitionOver())
                        gameOverScreen.start();
                }
            }

            while(!transition4.isTransitionOver()){
                boss2.end();
                transition4.start();
            }

            while(!level5.isLevelComplete()){
                transition4.end();
                level5.start();

                if(level5.isGameOver()){
                    while(!gameOverScreen.isTransitionOver())
                        gameOverScreen.start();
                }
            }

            while(!boss3.isLevelComplete()){
                level5.end();
                boss3.start();
                if(boss3.isGameOver()){
                    while(!gameOverScreen.isTransitionOver())
                        gameOverScreen.start();
                }
            }

            while(!transition5.isTransitionOver()){
                boss3.end();
                transition5.start();
            }

            while(!level6.isLevelComplete()){
                transition5.end();
                level6.start();

                if(level6.isGameOver()){
                    while(!gameOverScreen.isTransitionOver())
                        gameOverScreen.start();
                }
            }

            while(!boss4.isLevelComplete()){
                level6.end();
                boss4.start();
                if(boss4.isGameOver()){
                    while(!gameOverScreen.isTransitionOver())
                        gameOverScreen.start();
                }
            }
            while(!gameVictoryScreen.isTransitionOver){
                boss4.end();
                gameVictoryScreen.start();
                isGameFinished=true;
            }

        }

    }


}

