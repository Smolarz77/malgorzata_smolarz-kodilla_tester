package com.kodilla.inheritance.homework.z;

public class  Example2 extends OperatingSystem {

        public Example2(int yearPublication) {
            super(yearPublication);
        }

        @Override
        public void turnOn() {
            System.out.println("System Example 2 turns on");
        }

        @Override
        public void turnOff() {
            System.out.println("System Example2 turns off");
        }
    }
