package com.kodilla.inheritance.homework.z3_1;

public class  Example2 extends OperatingSystem {

        public Example2(int yearPublication) {
            super(yearPublication);  //w trakcie kompilacji dodawane jest
        }                            //wywołanie konstruktora z nadklasy za pomocą super

        @Override
        public void turnOn() {
            System.out.println("System Example2 turns on");
        }

        @Override
        public void turnOff() {
            System.out.println("System Example2 turns off");
        }
    }
