package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTestSuite {

    @ParameterizedTest     //W teście, aby jej użyć, musimy wykorzystać adnotację @MethodSource:  zamiast samej nazwy metody podajemy nazwaKlasy#nazwaMetody
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#BMI") //nazwa metody:
    public void shouldCalculateBMI(String expected, String BMI){  //Wtedy wystarczy tylko kropkę przed nazwą metody zamienić na znak #
        assertEquals (expected, BMI);
    }
}