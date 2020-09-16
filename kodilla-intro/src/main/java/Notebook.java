public class Notebook {
    int weight;
    int price;
    int year;


    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrise() {
        if (this.price < 600) {

            System.out.println("Ten notebook jest bardzo tani.");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("Cena jest dobra");
        } else if (this.price > 1000) {
            System.out.println("Notebook jest drogi");
        }
    }

    public void checkWeight() {

        if (this.weight <= 600) {
            System.out.println("Urzadzenie jest lekkie");
        } else if (this.weight > 660 && this.weight < 2000) {
            System.out.println("Urzadzenie jest niezbyt ciezkie");
        } else if
        (this.weight >= 2000) {
            System.out.println("Urzadzenie jest bardzo ciezkie");
        }
    }

    public void checkYearAndPrice() {
        if (this.year >= 2015 && this.price < 1500) {
            System.out.println("Ten notebook to dobry wybor");
        }
        else if (this.year <= 2015 && this.price < 1500) {
            System.out.println("Ten notebook ma dobra cene, ale jest stary");
        }

                else if  (this.year >= 2015 && this.price > 1500){
                    System.out.println(" Ten notebok to nie jest dobry wybor");

                }
            }

}