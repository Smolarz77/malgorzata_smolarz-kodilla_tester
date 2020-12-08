package numberchecker;

import io.cucumber.java8.En;
import static org.junit.Assert.assertEquals;

public class IsItNumberSteps implements En {
    private int number;
    private String answer;

    public IsItNumberSteps() {
        Given("Game has a {int}",(Integer int1) -> {
            this.number = int1;
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