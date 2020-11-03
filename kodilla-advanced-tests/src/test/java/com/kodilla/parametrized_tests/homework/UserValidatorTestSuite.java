package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTestSuite {

    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Gosia", "gosia1", "awTa26._-", "Sa_-.l5m"})
    public void shouldValidateUsername(String userName) {
        boolean result = userValidator.validateUsername(userName);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"@@guj", "    ", "$tujk$@", "~//zhz"})
    public void shouldNotValidateUsername(String userName) {
        boolean result = userValidator.validateUsername(userName);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Go6@wp.pl", "go9@wp.pl", "GO9@wp.pl", "KAld5@onet.com.pl"})
    public void shouldValidateEmails(String email) {
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Gi#9@gmx.pl", " ", "&%%%%$%^.pl", "mokito"})
    public void shouldNotValidateEmails(String email) {
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }


}