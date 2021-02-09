package org.academiadecodigo.academywars.chars.player;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Arena {

    private static final int PADDING=10;
    private Rectangle field;
    private static final int FIELD_WIDTH = 1280;
    private static final int FIELD_HEIGHT = 720;

    public Arena(){
        field = new Rectangle(PADDING,PADDING, FIELD_WIDTH,FIELD_HEIGHT);
        initArena();
    }


    public void initArena(){
        field.draw();
        field.fill();
        field.setColor(Color.BLACK);


    }

    public Rectangle getField() {
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
