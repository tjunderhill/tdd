package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorTest {

    @Test
    public void firstTest(){
        //this
        PasswordValidator passwordValidator = new PasswordValidator();

        //when
        assertTrue(passwordValidator.passwordIsValid("Password"));
    }
}
