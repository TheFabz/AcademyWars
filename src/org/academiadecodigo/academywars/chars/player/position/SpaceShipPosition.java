package org.academiadecodigo.academywars.chars.player.position;

import org.academiadecodigo.academywars.chars.enemies.Enemy;
import org.academiadecodigo.academywars.chars.player.Arena;
import org.academiadecodigo.academywars.chars.player.Controls;
import org.academiadecodigo.academywars.chars.player.Direction;
import org.academiadecodigo.academywars.chars.player.threadsPlayer.*;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.concurrent.TimeUnit;

import static org.academiadecodigo.academywars.chars.player.Direction.*;

public class SpaceShipPosition extends Position{

    private static final int WIDTH = 40;
    private static final int HEIGHT = 20;
    private int speed;
    private Arena arena;
    private Picture rectangle;

    private FireShootPosition shoot;
    private boolean isShooting;
    private ShipMovement shipMovement;
    private Enemy[] enemies;


   public SpaceShipPosition(int x, int y, Arena arena){
        super(x,y);
        this.arena = arena;
        isShooting = false;
        rectangle = new Picture(x,y,"resources/8BitSpaceShip.png");
        speed = 20;
        shipMovement = new ShipMovement(this, arena);
        MainThread.Init(this);
        Controls controls = new Controls(this);
        this.drawSpaceShip();
        controls.activateArrowKeys();
        controls.activateSpaceKey();

    }

    public void drawSpaceShip(){
        rectangle.draw();
    }

    public ShipMovement getShipMovement() {
        return shipMovement;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public Picture getRectangle() {
        return rectangle;
    }

    public FireShootPosition getShoot() {
        return shoot;
    }

    public void fireShoot() throws InterruptedException {

        shoot = new FireShootPosition((getX()+((getWIDTH())/2)),getY()-getWIDTH()-10,arena,this, enemies);
        isShooting = false;
        shoot.drawFireShoot();
        shoot.actualShoot();

    }

    public void setShooting(boolean shooting) {
        isShooting = shooting;
    }
    public boolean isShooting() {
        return isShooting;
    }
    public void addEnemy(Enemy[] enemies){
       this.enemies = enemies;
    }



}


