package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//W katalogu z testami stwórz odpowiedni pakiet oraz przetestuj powyższe metody.

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void shouldReturnCorrectAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double value = bean.add(20, 10);
        Assertions.assertEquals(30, value, 0.01);
    }

    @Test
    public void shouldReturnCorrectSubtract() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double value = bean.subtract(20, 10);
        Assertions.assertEquals(10, value, 0.01);
    }

    @Test
    public void shouldReturnCorrectMultiply() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double value = bean.multiply(20, 10);
        Assertions.assertEquals(200, value, 0.01);
    }

    @Test
    public void shouldReturnCorrectDivide() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double value = bean.divide(20, 10);
        Assertions.assertEquals(2, value, 0.01);
    }
}
