package wallet;

//Klasa CashSlot zawiera dwie metody:
//    getContents – zwracana jest zawartość slotu z pieniędzmi,
//    dispense – uzupełniany jest slot z pieniędzmi określona kwotą

public class CashSlot {
    private int contents;

    public int getContents() {
        return contents;
    }

    public void dispense(int amount) {
        this.contents = amount;
    }
}