package com.kodilla.abstracts;

public class Dog extends Animal{
    public void giveVoice(int numberOfLegs){
        super(numberOfLegs: 4);

    }
    @Override
    public void giveVoice(){
        System.out.println("Hau hau");
    }
}
