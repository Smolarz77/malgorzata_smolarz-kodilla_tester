package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {


    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Cashier cashier = new Cashier(cashSlot);

    public WalletSteps() {
        Given("I have deposited {int} in my wallet", (Integer depositValue) -> {
            wallet.deposit(depositValue);
            Assert.assertEquals("Incorrect wallet balance", (int)depositValue, wallet.getBalance());

        });

        When("I request {int}", (Integer amountValue) -> {
            cashier.withdraw(wallet, amountValue);
            Assert.assertTrue(cashSlot.getContents() <= amountValue);

        });
        Then("{int} should be dispensed", (Integer contents) -> {
            Assert.assertEquals((int)contents, cashSlot.getContents());
        });
        Then("The balance of my wallet should be {int}", (Integer balance) -> {
            Assert.assertEquals((int)balance, wallet.getBalance());
        });

    }
}