package com.kodilla.parametrized_tests;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringValidatorTestSuite {

    private StringValidator validator = new StringValidator();

    @Test
    public void shouldReturnFalseIfStringIsNotEmpty() {
        assertFalse(validator.isBlank("Text"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "   "})
    public void shouldReturnTrueIfStringIsEmpty(String text) {
        assertTrue(validator.isBlank(text));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsNullOrEmpty(String text) {
        System.out.println("|" + text + "|");
        assertTrue(validator.isBlank(text));
    }
}