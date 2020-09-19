public class Application {
    String name;
    double age;
    double height;

    public Application(String name, double age, double height){
        this.name = name;
        this.age=age;
        this.height=height;

    }
    public String getName() {
        return this.name;
    }
    public double getAge() {
        return this.age;
    }
    public double getHeight() {
        return this.height;
    }



            public static void main (String[]args){
                Application application = new Application("Adam", 40.5, 178);
                if (application.getName() != null) {
                    if (application.getAge() > 30 && application.getHeight() > 160) {
                        System.out.println("User is older than 30 and higher then 160cm");
                    } else {
                        System.out.println("User is younger than 30 or lower than 160cm");
                    }
                    System.out.println("Imie: " + application.name +" "+ "Wiek: "+ application.age + " Wysokosc:  " + application.height);

                }
            }

        }