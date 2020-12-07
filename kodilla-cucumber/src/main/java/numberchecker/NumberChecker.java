package numberchecker;

public class NumberChecker {

    public String checkIfDivisible(int number) {
        // Jeżeli liczba podzielna jest przez 5, zwróć "Buzz".
        //Jeżeli liczba podzielna jest przez 3, zwróć "Fizz".
        //   Jeżeli liczba podzielna jest przez 3 i przez 5, zwróć "FizzBuzz".
        //  W każdym innym wypadku, zwróć "None"

        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return "None";
    }
}
