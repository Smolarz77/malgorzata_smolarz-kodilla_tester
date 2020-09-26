package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public class Ford implements Car {


        int speed;
    @Override
    public void increaseSpeed() {
        Random random = new Random();
        int speed2 = random.nextInt(20);
        speed = speed + speed2;
    }

        @Override
        public void decreaseSpeed() {
            speed=  speed -3;

        }
    @Override
    public int getSpeed() {
        return speed;
    }

    }


