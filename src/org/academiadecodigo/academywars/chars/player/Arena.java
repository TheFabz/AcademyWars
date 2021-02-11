package org.academiadecodigo.academywars.chars.player;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Arena {

    private static final int PADDING=10;
    private Picture field;
    private static final int FIELD_WIDTH = 1280;
    private static final int FIELD_HEIGHT = 720;

    public Arena(){
        field = new Picture(PADDING,PADDING, "resources/space.jpeg");
        initArena();
    }


    public void initArena(){
        field.draw();


    }

    public Picture getField() {
        return field;
    }

    public  int getFieldHeight() {
        return FIELD_HEIGHT;
    }

    public  int getPADDING() {
        return PADDING;
    }

    public  int getFieldWidth() {
        return FIELD_WIDTH;
    }

}
