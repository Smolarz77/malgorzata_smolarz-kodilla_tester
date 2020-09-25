package com.kodilla.intro.z2_6;

public class Application {
    public static void main(String[] args) {
        User user = new User("Henryk", 43.5, 172);
        Validator.validateUser(user);
    }
}
