package com.kodilla.abstracts;

public class Dog extends Animal{ //klasa dziedzichy z klasy Animal
    public Dog() {           //uzywam funkcji implements methods: giveVoice
           super (4);
    }

    @Override
    public void giveVoice() {
        System.out.println("Hau hau");

    }
}