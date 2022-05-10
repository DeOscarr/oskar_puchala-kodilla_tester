package com.kodilla.parametrized_tests.homework;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Oskar.97", "alfred888", "shot_10", "order-001"})
    public void shouldReturnTrueForCorrectUsernames(String username) {
        boolean result = validator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"oskar.97@gmail.com", "alfred888@onet.pl", "shot_10@outlook.com", "order-001@wp.pl"})
    public void shouldReturnTrueForCorrectEmails(String email) {
        boolean result = validator.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Oskar.97", "alfred888", "shot_10", "order-001"})
    public void shouldReturnFalseForCorrectUsernames(String username) {
        boolean result = validator.validateUsername(username);
        assertTrue(result);
    }
}