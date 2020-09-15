public class ApplicationTest {
    public static void  main(String[] args){
        Application application = new Application("Adam", 40.5,178);
        System.out.println (application.name + "  " + application.age + "  " + application.height);
        application.checkAge();
    }
}
