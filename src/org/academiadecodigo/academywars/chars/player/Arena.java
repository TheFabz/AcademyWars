package org.academiadecodigo.academywars.chars.player;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Arena {

    private static final int PADDING=10;
    private Picture field;
    private int FIELD_WIDTH;
    private int FIELD_HEIGHT;

    public Arena(){
        field = new Picture(PADDING,PADDING, "resources/space.jpeg");
        initArena();
        FIELD_HEIGHT = field.getHeight()+PADDING;
        FIELD_WIDTH = field.getWidth()+PADDING;
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
