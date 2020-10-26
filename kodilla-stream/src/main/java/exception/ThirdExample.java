package exception;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();

        try {
            boolean isViennaInUse = airportRepository.isAirportInUse("Vienna");
            System.out.println("Vienna status: " + isViennaInUse);
        } catch (AirportNotFoundException e) {
            System.out.println("Sorry, this aiport cannot be served by our airlines.");

        }finally{

        System.out.println("Thank you for using Kodilla Airlines");

    }
}}
