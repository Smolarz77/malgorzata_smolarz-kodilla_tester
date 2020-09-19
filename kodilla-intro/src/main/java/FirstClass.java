package pl.kodilla.intro;

public class FirstClass {
    public static void main(String[] args) {

Notebook notebook = new Notebook( 600, 1000, 2010);
System.out.println("Waga: "+notebook.weight + " Cena:  " + notebook.price + " Rok:  " +notebook.year);
notebook.checkPrise();notebook.checkWeight();notebook.checkYearAndPrice();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2012);
        System.out.println("Waga: " + heavyNotebook.weight + " Cena:  "+ heavyNotebook.price + " Rok: " +heavyNotebook.year);
        heavyNotebook.checkPrise();heavyNotebook.checkWeight();heavyNotebook.checkYearAndPrice();


        Notebook oldNotebook = new Notebook(1600, 500, 2000);
        System.out.println("Waga "+ oldNotebook.weight + " Cena:  " + oldNotebook.price+ "Rok:  " + oldNotebook.year);
        oldNotebook.checkPrise();oldNotebook.checkWeight();oldNotebook.checkYearAndPrice();

    }
}

