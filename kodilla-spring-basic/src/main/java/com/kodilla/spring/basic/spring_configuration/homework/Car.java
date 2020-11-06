package com.kodilla.spring.basic.spring_configuration.homework;
import java.time.LocalTime;

    //Wewnątrz pakietu utwórz interfejs Car, zawierający metodę zwracającą boolean o nazwie
    // hasHeadlightsTurnedOn. Metoda powinna zwracać true lub false w zależności od tego,
// czy pojazd ma włączone światła.


public interface Car {

    default boolean hasHeadlightsTurnedOn() {
        LocalTime time = LocalTime.now();
        return time.isAfter(LocalTime.of(20, 0)) || time.isBefore(LocalTime.of(7, 0));
    }

    String getCarType(); //Dodaj drugą metodę, getCarType(), zwracającą Stringa – typ samochodu.
}