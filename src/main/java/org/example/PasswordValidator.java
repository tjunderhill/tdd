package org.example;

public class PasswordValidator {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  public boolean passwordIsValid(String password) {
    if (password.length() > 8){
      return true;
    } else {
      return false;
    }
  }
}