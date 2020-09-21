package com.kodilla.inheritance.homework.z;

public class Example1 extends OperatingSystem {

    public Example1 (int yearPublication){
        super(yearPublication);
    }

    @Override
    public void turnOn(){
        System.out.println("System Example1 turns on");
    }

    @Override
    public void turnOff(){
        System.out.println("System Example1 turns off");
    }
}

