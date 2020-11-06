package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    //Klasę FlightRepository z metodą statyczną getFlightsTable(), która zwraca listę lotów
    // obsługiwanych przez dane lotnisko (wypełnij tę listę przykładowymi lotami).

    public static List<Flight>getFlightsTable(){
        List<Flight> flightList = new ArrayList<>();

        flightList.add(new Flight("Berlin", "Warszawa"));
        flightList.add(new Flight("Paryz" , "Barcelona"));
        flightList.add(new Flight("Mediolan", "Warszawa"));
        flightList.add(new Flight("Gran Vanaria", "Warszawa"));
        flightList.add(new Flight("Barcelona", "Warszawa"));

return flightList;
    }
}
