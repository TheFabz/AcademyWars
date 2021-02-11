package org.academiadecodigo.academywars.chars.player;

import org.academiadecodigo.academywars.chars.player.position.SpaceShipPosition;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Controls implements KeyboardHandler {

    private SpaceShipPosition spaceShipPosition;
    private Keyboard keyboard;
    private KeyboardEvent turnLeft;
    private KeyboardEvent turnRight;
    private KeyboardEvent turnUp;
    private KeyboardEvent turnDown;
    private KeyboardEvent fireShoot;

   public Controls(SpaceShipPosition platform){
        this.spaceShipPosition = platform;

        keyboard = new Keyboard(this);
        turnLeft = new KeyboardEvent();
        turnRight = new KeyboardEvent();
        turnUp = new KeyboardEvent();
        turnDown = new KeyboardEvent();
        fireShoot = new KeyboardEvent();
    }

    public void activateArrowKeys(){

        turnLeft.setKey(KeyboardEvent.KEY_LEFT);
        turnRight.setKey(KeyboardEvent.KEY_RIGHT);
        turnUp.setKey(KeyboardEvent.KEY_UP);
        turnDown.setKey(KeyboardEvent.KEY_DOWN);
        turnLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        turnRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        turnUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        turnDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(turnLeft);
        keyboard.addEventListener(turnRight);
        keyboard.addEventListener(turnDown);
        keyboard.addEventListener(turnUp);

    }

    public void activateSpaceKey(){

        fireShoot.setKey(KeyboardEvent.KEY_SPACE);
        fireShoot.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(fireShoot);


    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if(keyboardEvent == turnLeft) {
                spaceShipPosition.setTurningLeft(true);

        }if(keyboardEvent == turnRight){
            spaceShipPosition.setTurningRight(true);
        }
        if(keyboardEvent == turnUp){
            spaceShipPosition.setTurningUp(true);
        }
        if(keyboardEvent == turnDown){
            spaceShipPosition.setTurningDown(true);
        }
        if(keyboardEvent == fireShoot){

                spaceShipPosition.setShooting(true);
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

}
