package org.academiadecodigo.academywars.chars.player;

import org.academiadecodigo.bootcamp56.academywarstest.position.SpaceShipPosition;

public class CanvasTest {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("here");

        org.academiadecodigo.bootcamp56.academywarstest.Arena arena = new org.academiadecodigo.bootcamp56.academywarstest.Arena();
        SpaceShip spaceShip = new SpaceShip(arena);

        SpaceShipPosition spaceShipPosition = new SpaceShipPosition((arena.getFieldWidth()/2),arena.getFieldHeight()/2,arena,spaceShip);
        Controls controls = new Controls(spaceShipPosition);

        spaceShipPosition.drawSpaceShip();
        controls.activateArrowKeys();
        controls.activateSpaceKey();
        spaceShipPosition.shoot();






    }


}
