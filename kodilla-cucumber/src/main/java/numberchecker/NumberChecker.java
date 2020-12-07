package numberchecker;

public class NumberChecker {

    public String checkIfDivisible(int number) {
        // Jeżeli liczba podzielna jest przez 5, zwróć "Buzz".
        if (number % 5 == 0) {
            return "Buzz";

        }
        //Jeżeli liczba podzielna jest przez 3, zwróć "Fizz".
        else if (number % 3 == 0) {
            return "Fizz";
        }
        //   Jeżeli liczba podzielna jest przez 3 i przez 5, zwróć "FizzBuzz".
        else if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        //  W każdym innym wypadku, zwróć "None".
        return "None";
    }
}
