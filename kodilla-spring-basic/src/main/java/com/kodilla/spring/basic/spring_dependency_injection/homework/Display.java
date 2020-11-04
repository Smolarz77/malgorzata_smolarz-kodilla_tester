package com.kodilla.spring.basic.spring_dependency_injection.homework;


import org.springframework.stereotype.Component;

//Klasa Display powinna mieć metodę display(double value), która otrzymaną wartość wyświetla na ekranie konsoli.
//Jednym ze sposobów wskazania klasy jako beana jest dodanie adnotacji @Component nad klasą:

@Component
public class Display {
    public String display(double value) {
        return "Value[" + value + "]";
    }}
