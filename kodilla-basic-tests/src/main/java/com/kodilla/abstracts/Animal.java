package com.kodilla.abstracts;

public abstract class Animal { // klasa abstrakcyjna o nazwie Animal
    private int numberOfLegs; // deklaracja zmiennej ilosc nog

    public Animal(int numberOfLegs) { // tworzymy konstruktor
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() { // dodajemy Gatter dla ilosc nog, to pozwoli dostac sie do tej zmiennej
        return numberOfLegs; // Gatter powstal bo zmienna byla deklarowana jako Private
    }
    public abstract void giveVoice();
}