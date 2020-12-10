package wallet;


import io.cucumber.java8.En;

import static org.junit.Assert.assertEquals;

public class DisplayBalance implements En {

    public DisplayBalance() {

        Wallet wallet = new Wallet();
        CashSlot cashSlot = new CashSlot();
        Cashier cashier = new Cashier(cashSlot);

        Given("my account has been credited with {int}", (Integer credit) -> {
            wallet.deposit(credit);
            cashier.withdraw(wallet, credit);
        });

        Then("I should see that my balance is {int}", (Integer expectedBalance) -> {
            assertEquals((int)expectedBalance, cashSlot.getContents());
        });

        When("I check my balance", () -> {
            assertEquals(0, wallet.getBalance());
        });
    }
}