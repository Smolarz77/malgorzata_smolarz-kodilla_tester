package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class CarConfigurationTestSuite {

    @Test
    public void shouldLightsTurnedOn() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = context.getBean("randomCar", Car.class);
        //When
        boolean lights = car.hasHeadlightsTurnedOn();
        //Then
        Assertions.assertTrue(lights);
    }

    @Test
    public void shouldCreateRandomCar() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = context.getBean("randomCar", Car.class);
        //When
        String type = car.getCarType();
        System.out.println(type);
        //Then
        List<String> Types = Arrays.asList("Cabrio", "Sedan", "SUV");
        Assertions.assertTrue(Types.contains(type));
    }
}