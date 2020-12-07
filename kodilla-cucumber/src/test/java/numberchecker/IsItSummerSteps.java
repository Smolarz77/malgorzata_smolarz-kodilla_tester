package numberchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsItSummerSteps implements En {

    private int number;
    private String answer;

    public IsItSummerSteps() {
        Given("^number is (.*)$",  (String number) -> this.number = Integer.parseInt(number));

        When("I ask number is divisible", () -> {
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.checkIfDivisible(this.number);

        });

        Then("I should be told {string}", (String string) -> Assert.assertEquals(string, this.answer));

    }
}