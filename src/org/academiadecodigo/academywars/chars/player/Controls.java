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
            spaceShipPosition.move(Direction.LEFT, spaceShipPosition.getSpeed());
        }if(keyboardEvent == turnRight){
            spaceShipPosition.move(Direction.RIGHT, spaceShipPosition.getSpeed());
        }
        if(keyboardEvent == turnUp){
            spaceShipPosition.move(Direction.UP, spaceShipPosition.getSpeed());
        }
        if(keyboardEvent == turnDown){
            spaceShipPosition.move(Direction.DOWN, spaceShipPosition.getSpeed());
        }
        if(keyboardEvent == fireShoot){
            try {
                spaceShipPosition.shoot();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }





    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }


    public Keyboard getKeyboard() {
        return keyboard;
    }

    public KeyboardEvent getKeyEvent() {
        return turnLeft;
    }
    public KeyboardEvent getTurnRight() {
        return turnRight;
    }

    public KeyboardEvent getTurnDown() {
        return turnDown;
    }

    public KeyboardEvent getTurnUp() {
        return turnUp;
    }
}
