package org.example;

import java.util.Arrays;

public class PasswordValidator {
    private static boolean isLenthMoreThan8Chars(String input) {
        return input.length() > 8;
    }

    private static boolean hasAtLeast1Number(String input) {
        return input.matches(".*\\d.*");
    }

    private static boolean hasUppercase(String input) {
        return !input.equals(input.toLowerCase());
    }

    private static boolean hasLowercase(String input) {
        return !input.equals(input.toUpperCase());
    }

    private static boolean hasSpecialchar(String input) {
        String[] specialChars = {"_","$","@","#","+","-"};
        return Arrays.stream(specialChars).anyMatch(input::contains);
    }

    public static boolean isValidPassword(String input) {
        return isLenthMoreThan8Chars(input)
                && hasAtLeast1Number(input)
                && hasUppercase(input)
                && hasLowercase(input)
                && hasSpecialchar(input);
    }
}
