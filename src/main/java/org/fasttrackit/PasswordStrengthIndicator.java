package org.fasttrackit;

import java.util.Scanner;

//Create a program that determines the complexity of a given
//        password based on these rules:
//        • A very weak password contains only numbers and is
//        fewer than eight characters.
//        • A weak password contains only letters and is fewerthan
//        eight characters.
//        • A strong password contains letters and at least one
//        number and is at least eight characters.
//        • A very strong password contains letters, numbers, and
//        special characters and is at least eight characters
public class PasswordStrengthIndicator {

    public void passwordValidator() {
        String password;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password:");
        password = scanner.next();

        boolean hasLetter = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (int i = 0; i < password.length(); i++) {
            char x = password.charAt(i);


            if (Character.isLetter(x)) {
                hasLetter = true;
            } else if (Character.isDigit(x)) {
                hasDigit = true;
            } else if (Character.isSpaceChar(x)) {
                hasSpecialChar = true;
            }

            if (hasLetter && hasDigit) {

                break;

            } else if (hasLetter && hasDigit && hasSpecialChar) {

                break;
            }
        }
        if (password.length() < 8) {
            if (hasDigit && hasLetter) {
                System.out.println(" The password" + " ' " + password + " ' " + "  is a  weak password.");
            } else if (hasLetter) {
                System.out.println(" The password" + " ' " + password + " ' " + "  is a  weak password.");
            } else if (hasDigit) {
                System.out.println(" The password" + " ' " + password + " ' " + "  is a very weak password.");
            } else {
                System.out.println(" The password" + " ' " + password + " ' " + "  is a  weak password.");
            }

        } else if (password.length() >= 8) {
            if (hasDigit && hasLetter) {
                System.out.println(" The password" + " ' " + password + " ' " + "  is a strong  password.");
            } else if (hasDigit && hasLetter && hasSpecialChar) {
                System.out.println(" The password" + " ' " + password + " ' " + "  is a very strong password.");
            } else {
                System.out.println(" The password" + " ' " + password + " ' " + "  is a  weak password.");
            }

        } else {
            System.out.println("Enter a correct password");
        }

    }

    public static void main(String[] args) {
        PasswordStrengthIndicator passwordStrengthIndicator = new PasswordStrengthIndicator();
        passwordStrengthIndicator.passwordValidator();

    }
}
