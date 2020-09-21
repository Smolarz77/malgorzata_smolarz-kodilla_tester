package com.kodilla.inheritance.homework.z;

public class OperatingSystem {
    private int yearPublication;
    public OperatingSystem(int yearPublication){     //konstruktor przyjmujacy rok wydania
this.yearPublication = yearPublication;
    }

    public void turnOn(){
System.out.println("System turns on");


    }
    public void turnOff(){
        System.out.println("System turns off");
    }


        }
