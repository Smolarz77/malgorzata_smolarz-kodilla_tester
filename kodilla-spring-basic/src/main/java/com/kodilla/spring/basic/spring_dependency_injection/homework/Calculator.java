package com.kodilla.spring.basic.spring_dependency_injection.homework;
import org.springframework.stereotype.Component;

//utwórz klasę Calculator, która będzie komponentem Springa i będzie posiadała pole Display display.
// Użyj wstrzykiwania przez konstruktor do powiązania obiektów klas Calculator oraz Display ze sobą.
//Użyj wstrzykiwania przez konstruktor do powiązania obiektów klas Calculator oraz Display ze sobą.



//Jednym ze sposobów wskazania klasy jako beana jest dodanie adnotacji @Component nad klasą:
@Component
public class Calculator {
    private Display display;

    public Calculator(Display display){
    this.display = display;

}
//    add(double a, double b)
    public double add(double a, double b) {
        double add = a+b;
        display.display(add);
        return add;
    }
//    subtract(double a, double b)
    public double subtract (double a, double b){
        double  subtract = a-b;
        display.display(subtract);
        return subtract;
    }

    //    multiply(double a, double b)
    public double multiply (double a, double b){
        double multiply = a*b;
        display.display(multiply);
        return multiply;
    }
    //    divide(double a, double b)
    public double divide(double a, double b){
        double divide = a/b;
        display.display(divide);
        return divide;
    }
}
