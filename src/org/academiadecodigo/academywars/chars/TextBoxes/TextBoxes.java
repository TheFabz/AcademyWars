package org.academiadecodigo.academywars.chars.TextBoxes;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;

public class TextBoxes{

    private TextPlacement textPlacement ;
    private boolean isStopped = false;

    public TextBoxes(TextPlacement textPlacement) throws InterruptedException {

        this.textPlacement = textPlacement;
        init();
        //arena : 1208 x 650
    }

    public void init() throws InterruptedException {

        switch (textPlacement) {

            case OPENSCREEN -> openScreenInit();
            case LEVEL1 -> TextlevelInit(1);
            case LEVEL2 -> TextlevelInit(2);
            case LEVEL3 -> TextlevelInit(3);
            case LEVEL4 -> TextlevelInit(4);
            case LEVEL5 -> TextlevelInit(5);
            case TRANSITION1 -> transition();
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

        Text text3 = new Text(605,410,"Press tab to start");
        text3.setColor(Color.WHITE);
        text3.grow(50,0);

        while (!isStopped) {
            text3.draw();
            Thread.sleep(180);
            text3.delete();
            Thread.sleep(100);
        }
    }

    public void TextlevelInit( int level) throws InterruptedException {

        int levelNumber = level;

        Text text2 = new Text(630,325,"LEVEL " + levelNumber);
        text2.draw();
        text2.setColor(Color.WHITE);
        text2.grow(50,50);

        Text text3 = new Text(605,410,"Press tab to start");
        text3.setColor(Color.WHITE);
        text3.grow(50,0);

        while (!isStopped) {
            text3.draw();
            Thread.sleep(180);
            text3.delete();
            Thread.sleep(100);
        }

    }

    public void transition() throws InterruptedException {

        while (isStopped == false) {

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
}
