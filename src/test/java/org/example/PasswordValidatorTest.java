package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidatorTest {
    /*
    Write a function "isValidPassword(String password)" that returns true if the following criteria are met:

        The password needs to have more than 8 characters
        At least 1 number
        At least 1 uppercase letter
        at least 1 lowercase letter
        at least 1 of the following special characters: _$@#+-
     */

    private static Stream<Arguments> provideStringsForIsValidPassword() {
        return Stream.of(
                Arguments.of("Psword1$", false), // length = 8 too short
                Arguments.of("Pswor1$", false), // length = 7 too short
                Arguments.of("Password$", false), // has no number
                Arguments.of("password1$", false), // has no uppercase
                Arguments.of("PASSWORD1$", false), // has no lower case
                Arguments.of("Password1", false),// has no special char
                Arguments.of("Password1_", true), // valid
                Arguments.of("Password1$", true), // valid
                Arguments.of("Password1@", true), // valid
                Arguments.of("Password1#", true), // valid
                Arguments.of("Password1+", true), // valid
                Arguments.of("Password1-", true) // valid
        );
    }
    @ParameterizedTest
    @MethodSource("provideStringsForIsValidPassword")
    void isValidPassword_ShouldReturnExpectedForInput(String input, boolean expected) {
        assertEquals(expected, PasswordValidator.isValidPassword(input));
    }


}
