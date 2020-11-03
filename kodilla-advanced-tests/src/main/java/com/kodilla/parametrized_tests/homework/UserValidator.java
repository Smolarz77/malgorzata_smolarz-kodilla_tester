package com.kodilla.parametrized_tests.homework;
import java.util.regex.*;

public class UserValidator {
    public boolean validateUsername(String username) {
        //Pierwsza sprawdza, czy przekazana nazwa użytkownika jest prawidłowa:
        return username.matches("^[a-zA-Z0-9._-]{3,}$");
    }
    //Druga metoda sprawdza poprawność przekazanego adresu e-mail:

    public boolean validateEmail(String email) {
        if (null != email) {
            String regex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }
        return false;

    }

}