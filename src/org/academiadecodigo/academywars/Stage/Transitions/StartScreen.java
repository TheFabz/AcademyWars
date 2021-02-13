package org.academiadecodigo.academywars.Stage.Transitions;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class StartScreen extends TransitionAbstract{


    public StartScreen() {
        super("resources/img/backgrounds/Level1.jpg", "/resources/Sound/StarWarsMain.wav");
    }
}
