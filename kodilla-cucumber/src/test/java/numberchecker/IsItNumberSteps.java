package numberchecker;

import io.cucumber.java8.En;
import static org.junit.Assert.assertEquals;

public class IsItNumberSteps implements En {
    private int number;
    private String answer;

    public IsItNumberSteps() {
        Given("Game has number 24", () -> {
            this.number = 24;
        });
        Given("Game has number 60", () -> {
            this.number = 60;
        });
        Given("Game has number 10", () -> {
            this.number = 10;
        });
        Given("Game has number 11", () -> {
            this.number = 11;
        });

        When("Checking if number is divisible by 3 and 5", () -> {
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.checkIfDivisible(this.number);
        });

        Then("Game should return {string}", (String string) -> {
            assertEquals(string, this.answer);
        });
    }
}