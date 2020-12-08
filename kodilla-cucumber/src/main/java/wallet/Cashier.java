package wallet;

public class Cashier {

    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {

        this.cashSlot = cashSlot;
    }

    public String withdraw(Wallet wallet, int amount) {
        if (wallet.getBalance() >= amount) {
            int debit = wallet.debit(amount);
            cashSlot.dispense(debit);
            return "Cash withdrawn";
        } else {
            return "Insufficient money in my account";
        }
    }


}
