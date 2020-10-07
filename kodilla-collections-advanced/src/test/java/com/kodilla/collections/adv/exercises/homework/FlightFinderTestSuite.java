package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {
    @Test
    public void testFindFlightsFrom() {
        //given, w tej sekcji przygotowujemy dane testowe
        FlightFinder flightFinder = new FlightFinder();


        //when, wywołanie metody, którą testuje nasz test
List<Flight> flightFinderList  = flightFinder.findFlightsFrom("Waszawa");

        //then, sekcja poświęcona sprawdzeniu, czy testowana klasa zachowała się poprawnie –
        // tutaj zamieszczamy wszystkie asercje.
        List<Flight>expectedList = new ArrayList<>();
        expectedList.add(new Flight("Berlin", "Warszawa"));
        expectedList.add(new Flight("Paryz","Barcelona"));
        assertEquals(expectedList,flightFinderList );
        assertEquals(2, flightFinderList);

    }
    @Test
    public void findFlightsTo(){
        //given, w tej sekcji przygotowujemy dane testowe
        FlightFinder flightFinder = new FlightFinder();

        //when, wywołanie metody, którą testuje nasz test
        List<Flight> flightFinderList = flightFinder.findFlightsTo("Warszawa");

        //then
        List<Flight>expectedList = new ArrayList<>();
        expectedList.add(new Flight("Mediolan","Warszawa"));
        assertEquals(expectedList,flightFinderList );
        assertEquals(1,flightFinderList);



    }
}