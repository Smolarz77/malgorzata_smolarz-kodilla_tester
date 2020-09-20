package pl.kodilla.intro;

import java.util.Scanner;

public class Colors {

    public static String getUserSelection2() {
        Scanner scanner2 = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your first letter (B -blue, R -red, Y -yellow, G  -green):");
            String calc2 = scanner2.nextLine().trim().toUpperCase();
            switch (calc2){
                case "B" : return "Blue";
                case "R" : return "Red";
                case "Y" : return "Yellow";
                case "G" : return "Green";
                default:

                    System.out.println("Wrong letter. Try again");
            }}}
            public static void main(String[] args){

                System.out.println(getUserSelection2());



}}





