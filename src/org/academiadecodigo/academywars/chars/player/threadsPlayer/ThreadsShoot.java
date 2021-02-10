package org.academiadecodigo.academywars.chars.player.threadsPlayer;

import org.academiadecodigo.academywars.chars.player.position.FireShootPosition;
import org.academiadecodigo.academywars.chars.player.position.SpaceShipPosition;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class ThreadsShoot extends Thread{

        private int delay;

        private FireShootPosition shoot;


    public ThreadsShoot(int delay, FireShootPosition shoot) {
            this.delay = delay;
            this.shoot = shoot;


        }
        public void run() {

            while (true) {
                try{ sleep(delay); }catch(Exception e){ System.out.println(e); }

                if(shoot.getRectangle().getY()>0){




                    shoot.setY(shoot.getY()-shoot.getSpeed());

                            shoot.getRectangle().translate(0, -shoot.getSpeed());
                            shoot.drawFireShoot();
                        }

                    }


               /*    shoot.drawFireShoot();
                    System.out.println("ADEUS");
                    shoot.setY(shoot.getY()- shoot.getSpeed());
                    shoot.getRectangle().translate(0, -shoot.getSpeed());
*/
                }
            }








