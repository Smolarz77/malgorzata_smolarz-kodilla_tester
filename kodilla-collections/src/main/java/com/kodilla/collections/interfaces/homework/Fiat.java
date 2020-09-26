package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public class Fiat implements Car {

        int speed;
    @Override
    public void increaseSpeed() {
        Random random = new Random();
        int speed2 = random.nextInt(50);
        speed = speed + speed2;
    }



        @Override
        public void decreaseSpeed() {
            speed=  speed - 2;

        }
    @Override
    public int getSpeed() {
        return speed;
    }

    }






