package org.academiadecodigo.academywars.Stage.Transitions;

import org.academiadecodigo.academywars.Stage.StageAbstract;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;


public abstract class TransitionAbstract extends StageAbstract {


    public boolean isTransitionOver;

    public TransitionAbstract(String backGroundPath, String musicPath ) {
        super(backGroundPath,musicPath);
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if(keyboardEvent.getKey() == KeyboardEvent.KEY_SPACE){
            isTransitionOver = true;
            System.out.println(isTransitionOver);
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }

    public boolean isTransitionOver(){
        return isTransitionOver;
    }


}
