package com.kodilla.intro;

public class DebugExample {
    public static void main(String[] args) {
        int firstNumber = 11;
        int secondNumber = 22;
        System.out.println(firstNumber);
        System.out.println(secondNumber);

        if ( firstNumber > secondNumber) {
            subtractAndDisplay(firstNumber, secondNumber);
        }
        else {
            sumAndDisplay(firstNumber, secondNumber);
        }}
    private static void sumAndDisplay (int firstNumber, int secondNumber){
        int result = firstNumber + secondNumber;
        System.out.println(result);
    }
    private static void subtractAndDisplay (int firstNumber, int secondNumber){
        int result = firstNumber - secondNumber;
        System.out.println(result);
    }
}


