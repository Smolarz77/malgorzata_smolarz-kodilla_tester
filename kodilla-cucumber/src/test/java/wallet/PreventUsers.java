package wallet;

import io.cucumber.java8.En;
import static org.junit.Assert.assertEquals;
public class PreventUsers implements En {
    Wallet wallet = new Wallet();
    CashSlot cashSlot = new CashSlot();
    Cashier cashier = new Cashier(cashSlot);
    String message;

    public PreventUsers (){
        Given("I have credited $100", () -> {
            wallet.deposit(100);
        });

        When("I withdraw $200", () -> {
            message = cashier.withdraw(wallet, 200);
        });

        Then("Nothing should be dispensed", () -> {
            assertEquals(100, wallet.getBalance());
            assertEquals(0, cashSlot.getContents());
        });

        Then("I should be told that I have insufficient funds in my account", () -> {
            assertEquals("I have insufficient funds in my account", message);
        });
    }
}
