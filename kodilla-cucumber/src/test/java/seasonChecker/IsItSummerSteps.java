package seasonChecker;

import io.cucumber.java8.En;
import org.junit.Assert;

import java.time.MonthDay;

public class IsItSummerSteps implements En {
    private MonthDay today;
    private String answer;

    public IsItSummerSteps() {
        Given("today is last day of December", () -> {
            this.today = MonthDay.of(24,31);
        });

        Given("today is first day of August", () -> {
            this.today = MonthDay.of(8, 1);
        });

        Given("today is second day of January", () -> {
            this.today = MonthDay.of(1, 2);
        });

        Given("today is 10th day of February", () -> {
            this.today = MonthDay.of(2, 10);
        });


        When("I ask whether it's Summer", () -> {
            SeasonChecker seasonChecker = new SeasonChecker();
            this.answer = seasonChecker.checkIfSummer(this.today);
        });

        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}