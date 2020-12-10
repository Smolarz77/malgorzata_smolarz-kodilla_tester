package wallet;

import io.cucumber.java8.En;
import static org.junit.Assert.assertEquals;
public class PreventUsers implements En {
    Wallet wallet = new Wallet();
    CashSlot cashSlot = new CashSlot();
    Cashier cashier = new Cashier(cashSlot);
    String message;

    public PreventUsers (){
        Given("I have credited $200", () -> {
            wallet.deposit(200);
        });

        When("I withdraw $400", () -> {
            message = cashier.withdraw(wallet, 400);
        });

        Then("Nothing should be dispensed", () -> {
            assertEquals(200, wallet.getBalance());
            assertEquals(0, cashSlot.getContents());
        });

        Then("I should be told that I have insufficient funds in my account", () -> {
            assertEquals("I have insufficient funds in my account", message);
        });
    }
}
