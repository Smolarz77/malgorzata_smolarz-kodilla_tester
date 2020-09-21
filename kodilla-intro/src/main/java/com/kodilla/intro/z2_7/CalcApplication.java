package com.kodilla.intro.z2_7;

import com.kodilla.intro.z2_7.Calculator;

public class CalcApplication {
    public static void main(String[] args){

        Calculator calculator2 = new Calculator();
        double area = calculator2.circleArea(10);
        System.out.println("Area of the Circle with radium 0 equals:  "+ area);

        double p = Calculator.PI;
        System.out.println("The value of a pi constant is equal to " + p);

        Calculator.calculator2 = new Calculator();
        System.out.println(calculator2.counter);
    }
}
