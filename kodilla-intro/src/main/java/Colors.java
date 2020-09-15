import java.util.Scanner;

public class Colors {

    public static String getUserSelection2() {
        Scanner scanner2 = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your first letter (B, R, Y, G):");
            String calc2 = scanner2.nextLine().trim().toUpperCase();
            switch (calc2){
                case "B" : return "Blue";
                case "R" : return "Red";
                case "Y" : return "Yellow";
                case "G" : return "Green";
                default:

                    System.out.println("Wrong letter. Try again");
            }}}
            public static int getValue2() {
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Enter first letter: ");
                int val2 = scanner2.nextInt();
                return val2;

            }
}





