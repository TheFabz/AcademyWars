package org.academiadecodigo.academywars.chars.TextBoxes;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;

public class TextBoxes{

    private TextPlacement textPlacement ;
    private boolean isStopped;

    public TextBoxes(TextPlacement textPlacement) throws InterruptedException {

        this.textPlacement = textPlacement;
        init();
        //arena : 1208 x 650
    }

    public void init() throws InterruptedException {

        switch (textPlacement) {
            case OPENSCREEN -> openScreenInit();
            case LEVEL1 -> TextLevelInit(1);
            case LEVEL2 -> TextLevelInit(2);
            case LEVEL3 -> TextLevelInit(3);
            case LEVEL4 -> TextLevelInit(4);
            case LEVEL5 -> TextLevelInit(5);
            case TRANSITION -> transitionInit();
            case VICTORYSCREEN -> victoryInit();
            case GAMEOVER -> gameOverInit();
            case BOSS1 -> BossInit(1);
            case BOSS2 -> BossInit(2);
            case BOSS3 -> BossInit(3);
            case BOSS4 -> BossInit(4);
        }
    }

    public void Stop(){
        isStopped = true;
    }

    public void openScreenInit() throws InterruptedException {

        Text text = new Text(600,-50,"ACADEMY WARS");
        text.draw();
        text.setColor(Color.WHITE);
        text.grow(100,100);

        Picture picture = new Picture(-50,330,"resources/8BitSpaceShip.png");
        picture.draw();

        for (int i = 0; i < 200; i++) {
            Thread.sleep(15);
            if(i<=100){
                text.translate(0,3.75);
            }
            if(i>100){
                picture.translate(5,0);
            }
        }
        Thread.sleep(500);
        text.delete();
        picture.delete();

        Text text2 = new Text(600,325,"ARE YOU READY?");
        text2.draw();
        text2.setColor(Color.WHITE);
        text2.grow(50,50);

        Text text3 = new Text(605,410,"Press space to start");
        text3.setColor(Color.WHITE);
        text3.grow(50,0);

        while (!isStopped) {
            text3.draw();
            Thread.sleep(180);
            text3.delete();
            Thread.sleep(100);
        }
    }

    public void TextLevelInit( int level) throws InterruptedException {

        int levelNumber = level;

        Text text2 = new Text(630,325,"LEVEL " + levelNumber);
        text2.draw();
        text2.setColor(Color.WHITE);
        text2.grow(50,50);

        Text text3 = new Text(605,410,"Press space to start");
        text3.setColor(Color.WHITE);
        text3.grow(50,0);

        while (!isStopped) {
            text3.draw();
            Thread.sleep(180);
            text3.delete();
            Thread.sleep(100);
        }
    }

    public void transitionInit() throws InterruptedException {

        while (!isStopped) {

            Picture background = new Picture(10, 10, "resources/loading1.png");
            background.draw();
            Thread.sleep(1000);
            Picture background2 = new Picture(10, 10, "resources/loading2.png");
            background2.draw();
            Thread.sleep(1000);
            Picture background3 = new Picture(10, 10, "resources/loading3.png");
            background3.draw();
            Thread.sleep(1000);
        }
    }

    public void victoryInit(){

        Picture background = new Picture(10, 80, "resources/vimDestroyed.png");
        background.draw();

    }

    public void gameOverInit() throws InterruptedException {

        Picture background = new Picture(10, 80, "resources/gameover_2.png");
        background.draw();

        Text text = new Text(605,610,"Press space to start again");
        text.setColor(Color.WHITE);
        text.grow(80,30);

        while (!isStopped) {
            text.draw();
            Thread.sleep(180);
            text.delete();
            Thread.sleep(100);
        }

    }

    public void BossInit(int boss) throws InterruptedException {

        switch (boss){

            case 1:
                Picture background = new Picture(10, 80, "resources/boss1.png");
                background.draw();
                break;
            case 2:
                Picture background2 = new Picture(10, 80, "resources/boss2.png");
                background2.draw();
                break;
            case 3:
                Picture background3 = new Picture(10, 80, "resources/boss3.png");
                background3.draw();
                break;
            default:
                Picture background5 = new Picture(10, 80, "resources/boss4.png");
                background5.draw();
                break;
        }
    }
}
