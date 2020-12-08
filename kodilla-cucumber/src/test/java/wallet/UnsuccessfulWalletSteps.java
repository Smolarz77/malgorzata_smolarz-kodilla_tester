
package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class UnsuccessfulWalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Cashier cashier = new Cashier(cashSlot);

    public UnsuccessfulWalletSteps() {

        Then("{int} not should be dispensed", (Integer contentsValue) -> {
            Assert.assertTrue(cashSlot.getContents() <= contentsValue);
        });

        Then("The balance of my wallet is now {int}", (Integer balanceValue) -> {
            wallet.deposit(balanceValue);
            Assert.assertEquals((int)balanceValue, wallet.getBalance());
        });
    }
}