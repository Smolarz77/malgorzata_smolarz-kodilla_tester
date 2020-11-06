package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;

public class PersonSources {

    static Stream<Arguments> BMI() {
        return Stream.of(
                Arguments.of("Very severely underweight", new Person(1.8,40.0).getBMI()),
                Arguments.of("Severely underweight", new Person(1.82,50.0).getBMI()),
                Arguments.of("Underweight", new Person(1.82,60.0).getBMI()),
                Arguments.of("Normal (healthy weight)", new Person(71.2,80.0).getBMI()),
                Arguments.of("Overweight", new Person(61.0,90.0).getBMI()),
                Arguments.of("Obese Class I (Moderately obese)", new Person(1.70,110.0).getBMI())
        );

    }
}