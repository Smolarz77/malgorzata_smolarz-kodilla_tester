package com.kodilla.intro.z2_6;

public class Validator {
    public static void validateUser(User user){
        if (user.getName() != null) {
            if (user.getAge() > 30 && user.getHeight() > 160) {
                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is younger than 30 or lower than 160cm");
            }
            System.out.println("Imie: " + user.getName() + " " + "Wiek: " + user.getAge() + " Wzrost:  " + user.getHeight());

        }
    }
}
