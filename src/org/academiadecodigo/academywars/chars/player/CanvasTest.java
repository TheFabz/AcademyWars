package org.academiadecodigo.academywars.chars.player;


import org.academiadecodigo.academywars.chars.player.position.SpaceShipPosition;

public class CanvasTest {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("here");

        Arena arena = new Arena();

        SpaceShipPosition spaceShipPosition = new SpaceShipPosition((arena.getFieldWidth()/2),arena.getFieldHeight()/2,arena);
        Controls controls = new Controls(spaceShipPosition);

        spaceShipPosition.drawSpaceShip();
        controls.activateArrowKeys();
        controls.activateSpaceKey();
        spaceShipPosition.shoot();






    }


}
