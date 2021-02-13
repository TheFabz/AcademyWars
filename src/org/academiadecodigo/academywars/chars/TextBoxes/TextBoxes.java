package org.academiadecodigo.academywars.chars.TextBoxes;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;

public class TextBoxes{

    private TextPlacement textPlacement ;
    private Font MineBit;
    private boolean stop = false;
    public TextBoxes(TextPlacement textPlacement) throws InterruptedException {

        this.textPlacement = textPlacement;
        MineBit = Font.getFont("resources/Minecraft.ttf");
        init();
        //arena : 1208 x 650
    }

    public void init() throws InterruptedException {

        switch (textPlacement) {

            //case OPENSCREEN ->
            case LEVEL1 -> Textlevel1init();
            case LEVEL2 -> Textlevel2init();
            //case BOSS1 ->
            //case LEVEL3 ->
            //case BOSS2 ->
            //case LEVEL4 ->
            //case BOSS3 ->
            //case LEVEL5 ->
            //case BOSS4 ->
            //case VICTORYSCREEN ->
            //case GAMEOVER ->
            //case TRANSITION1 ->

        }

    }

    public void setStop(){
        stop = true;
    }

    public void Textlevel1init() throws InterruptedException {

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

        while (stop == false) {
            text3.draw();
            Thread.sleep(180);
            text3.delete();
            Thread.sleep(100);
        }
    }

    public void Textlevel2init() throws InterruptedException {



    }
}
