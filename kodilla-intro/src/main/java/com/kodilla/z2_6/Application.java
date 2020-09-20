package com.kodilla.z2_6;

public class Application {
    public static void main(String[] args) {
        User user = new User("Adam", 40.5, 178);
        Validator.validateUser(user);
    }
}
