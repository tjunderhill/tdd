package org.example;

public class PasswordValidator {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  public boolean passwordIsValid(String password) {
    if (!checkPasswordLength(password)) {
      return false;
    }

    if (!containsAtLeastOneNumber(password)) {
      return false;
    }

    return true;
  }


  private boolean containsAtLeastOneNumber(String password) {
    if (!password.matches(".*\\d.*")) {
      return false;
    }

    return true;
  }


  private boolean checkPasswordLength(String password) {
    if (!(password.length() > 8)) {
      return false;
    }

    return true;
  }
}