package com.kodilla.inheritance.homework.z;

import com.kodilla.inheritance.homework.z.Example1;
import com.kodilla.inheritance.homework.z.Example2;
import com.kodilla.inheritance.homework.z.OperatingSystem;

public class OperatingSystemAction {
    public static void main(String[]args){

        OperatingSystem operatingSystem = new OperatingSystem(2020);

        Example1 example1 = new Example1(2010);
        Example2 example2 = new Example2(2012);


        operatingSystem.turnOff();
        example1.turnOff();
        example2.turnOff();

        operatingSystem.turnOn();
        example1.turnOn();
        example2.turnOn();
    }
}
