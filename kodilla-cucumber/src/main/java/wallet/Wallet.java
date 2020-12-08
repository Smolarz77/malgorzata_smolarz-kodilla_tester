package wallet;

public class Wallet {
    private int balance = 0;

    public Wallet() {
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public int getBalance() {
        return balance;
    }

    public int debit(int money) {
        if (balance >= money) {
            this.balance = this.balance - money;
            return money;
        } else {
            int temp = this.balance;
            this.balance = 0;
            return temp;
        }
    }
}