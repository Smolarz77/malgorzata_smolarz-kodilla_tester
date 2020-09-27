package com.kodilla.intro.z2_6;

public class Application {
    public static void main(String[] args) {
        User user = new User("Henryk", 43.5, 172);   //Tworzenie obiektu: typ zmiennej: User, nazwa zmiennej: user
        Validator.validateUser(user);

    }
}
