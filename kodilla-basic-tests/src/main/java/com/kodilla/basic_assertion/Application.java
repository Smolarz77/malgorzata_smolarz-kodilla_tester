package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();   //tworze obiekt typu Calculator
        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb" + a + "i" + b);
        }

        int subtractResult = calculator.subtract(a, b);
        boolean subtractCorrect = ResultChecker.assertEquals(-2, subtractResult);
        if (subtractCorrect) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int squareResult = calculator.square(a);
        boolean squareCorrect = ResultChecker.assertEquals(26, subtractResult);
        if (squareCorrect){
            System.out.println("Metoda square działa poprawnie dla liczb " + a );}
        else{
            System.out.println("Metoda square nie działa poprawnie dla liczb " + a );
        }
    }
    }






