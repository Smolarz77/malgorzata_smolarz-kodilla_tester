public class Notebook {
    int weight;
    int price;
    int year;


    public Notebook (int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
            }
            public void checkPrise(){
        if(this.price < 600){

            System.out.println("This notebook is very cheap.");
        }
        else  if (this.price  > 600 && this.price < 1000){
            System.out.println("The price is good");
        }
        else if(this.price> 1000){
            System.out.println ("This notebook is expensive");
                }
            }

            public void checkWeight () {

                if (this.weight <= 600) {
                    System.out.println("Urzadzenie jest lekkie");
                }
                    else if (this.weight > 660 && this.weight < 2000) {
                        System.out.println("Urzadzenie jest niezbyt ciezkie");
                    }
                    else if
                (this.weight>= 2000){
                        System.out.println("Urzadzenie jest bardzo ciezkie");
                    }



                }
            }