package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{

int speed;
public Ford (int speed){
    this.speed=speed;
}
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 8;

    }

    @Override
    public void decreaseSpeed() {
        speed = speed -9;

    }
}




