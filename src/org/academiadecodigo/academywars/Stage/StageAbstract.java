package org.academiadecodigo.academywars.Stage;

import org.academiadecodigo.academywars.chars.player.Arena;
import org.academiadecodigo.bootcamp.Sound;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class StageAbstract extends Arena implements KeyboardHandler {

    private final Picture backGround;
    private final Sound music;

    public StageAbstract(String backGroundPath, String musicPath){

        backGround = new Picture(0,0,backGroundPath);

        music = new Sound(musicPath);

        Keyboard keyboard = new Keyboard(this);
        KeyboardEvent spaceBarPress = new KeyboardEvent();

        spaceBarPress.setKey(KeyboardEvent.KEY_SPACE);
        spaceBarPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(spaceBarPress);
    }

    public void start(){
        backGround.draw();
        music.play(false);
    }

    public void end(){
        backGround.delete();
        music.stop();
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) { }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) { }

}
