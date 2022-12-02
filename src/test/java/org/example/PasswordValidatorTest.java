package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class PasswordValidatorTest {
    /*
     * - Password Validator. 
     * - Write a function that takes a password as a string  and returns true if the password meets certain criteria.
     *  - The password needs to have more than 8 characters
     */

    @Test
    public void firstTest(){
        //this
        PasswordValidator passwordValidator = new PasswordValidator();

        //when
        assertTrue(passwordValidator.passwordIsValid("Password1"));
    }

    @Test
    public void passwordLengthCheck() {
        //this
        PasswordValidator passwordValidator = new PasswordValidator();

        assertFalse(passwordValidator.passwordIsValid("Passwor"));
    }

    @Test 
    public void passwordLengthEqualsEight() {
        //this
        PasswordValidator passwordValidator = new PasswordValidator();

        assertFalse(passwordValidator.passwordIsValid("Password"));
    }
}
