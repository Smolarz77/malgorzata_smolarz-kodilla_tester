package com.kodilla.abstracts;
public abstract class Animal {  //klasy abstrakcyjne pozwalają na
                                //utworzenie szablonu działania bez konkretnych instrukcji
    private int numberOfLegs;  //prywatna zmienną typu int

    public Animal(int numberOfLegs) {     //konstruktor Animal
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {  // getter wydobywający wartość prywatnej zmiennej numberOfLegs
        return numberOfLegs;
    }

    public abstract void giveVoice(); //metoda abstrakcyjna (nie ma ciala), stawiamy srednik
}