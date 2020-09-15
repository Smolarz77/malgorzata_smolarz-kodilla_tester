

public class FirstClass {
    public static void main(String[] args) {

Notebook notebook = new Notebook ( 600, 1000, 2010);
System.out.println(notebook.weight + " " + notebook.price + "  " +notebook.year);
notebook.checkPrise();notebook.checkWeight();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2012);
        System.out.println(heavyNotebook.weight + "  "+ heavyNotebook.price + " " +heavyNotebook.year);
        heavyNotebook.checkPrise();heavyNotebook.checkWeight();


        Notebook oldNotebook = new Notebook (1600, 500, 2000);
        System.out.println(oldNotebook.weight + "  " + oldNotebook.price+ "  " + oldNotebook.year);
        oldNotebook.checkPrise();oldNotebook.checkWeight();

    }
}

