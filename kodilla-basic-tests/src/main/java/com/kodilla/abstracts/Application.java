package com.kodilla.abstracts;

public class Application {


     /*  Dog dog = new Dog();    tutaj tworze obiekty dog i duck i wywoluje metode giveVoice
         dog.giveVoice();
        Duck duck = new Duck();
        duck.giveVoice();
        ponizej druga metoda: poliformizm (wielopostaciowośc) */

    public static void main(String[] args) {
        Animal duck = new Duck();
        Animal dog = new Dog();

        AnimalProcessor processor= new AnimalProcessor();
     processor.process(dog);
    }}