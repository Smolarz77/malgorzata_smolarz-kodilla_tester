package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public class Toyota implements Car{

        int speed;
    @Override
    public void increaseSpeed() {
        Random random = new Random();
        int speed2 = random.nextInt(30);
        speed = speed + speed2;
    }



        @Override
        public void decreaseSpeed() {
            speed=  speed -9;

        }
    @Override
    public int getSpeed() {
        return speed;


        }}



