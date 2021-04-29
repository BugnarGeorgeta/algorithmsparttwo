package org.fasttrackit;
//Write a program that prompts for a first name, last name,
//        employee ID, and ZIP code. Ensure that the input is valid
//        according to these rules:
//        • The first name must be filled in.
//        • The last name must be filled in.
//        • The first and last names must be at least two characters
//        long.
//        • An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
//        • The ZIP code must be a number.

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidatingInputs {
    public void validateInput() {
        validefirstname();
        validLastName();
        validZip();
        validId();


//        if (validefirstname() == true && validLastName() == true && validZip() == true && validId() == true)
//            System.out.println("There were no errors found.");
    }


    public boolean validefirstname() {

        System.out.println("Enter the first name:");
        Scanner scanner = new Scanner(System.in);
        try {
            String firstName = scanner.nextLine();

            if (firstName.length() >= 2) {
                return true;
            } else if (firstName.length() < 2) {
                System.out.println("The first  name must be at least two characters long. ");
                return validefirstname();
            } else if (firstName.length() == 0) {
                System.out.println("The first  name must be filled in. ");
                return validefirstname();
            } else {
                System.out.println("Please enter corectly first  name. ");
                return validefirstname();
            }

        } catch (InputMismatchException e) {
            System.out.println("Please enter the corectly data.");
            return validefirstname();

        }
    }

    public boolean validLastName() {
        System.out.println("Enter the last name:");
        Scanner scanner = new Scanner(System.in);
        try {
            String lastName = scanner.nextLine();
            int b = lastName.length();


            if (b >= 2) {
                return true;
            } else if (b < 2) {
                System.out.println("The last name must be at least two characters long. ");
                return validLastName();
            } else if (b == 0) {
                System.out.println("The last  name must be filled in. ");
                return validLastName();
            } else {
                System.out.println("Please enter corectly  last name. ");
                return validLastName();
            }

        } catch (InputMismatchException e) {
            System.out.println("Please enter the corectly data.");
            return validLastName();

        }
    }

    public boolean validId() {

        System.out.println("Enter an employee ID");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();
        char[] ch = id.toCharArray();
        if (id.length() == 7) {
            if (Character.isLetter(ch[0]) && Character.isLetter(ch[1]) && Character.isDigit(ch[3])
                    && Character.isDigit(ch[4]) && Character.isDigit(ch[5]) && Character.isDigit(ch[6])
                    && Character.isSpaceChar(ch[3])) {
//            if ((id.substring(0, 2).equalsIgnoreCase(String.format("%s", " "))) &&
//                    id.substring(2, 3).equalsIgnoreCase(String.format("%c", '-')) &&
//                    id.substring(3).equalsIgnoreCase(String.format("%x"))) {
                System.out.println("ID is correct");
                System.out.println("There were no errors found.");

            } else {
                System.out.println("Employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers please.");
                return validId();
            }


        } else if (id.length() < 7 || id.length() > 7) {
            System.out.println("Employee ID must have 7 characthers.So, two letters, a hyphen, and four numbers please.");

            return validId();
        } else {
            System.out.println("Please enter de corectly data");
            return validId();
        }return true;

    }

    public boolean validZip() {
        System.out.println("Enter the ZIP code:");
        Scanner scanner = new Scanner(System.in);
        try {
            int zip = scanner.nextInt();
            System.out.println("Your ZIP code is " + zip);
            return true;

        } catch (InputMismatchException e) {
            System.out.println("  ZIP code must be a number.");
            return validZip();
        }

    }


    public static void main(String[] args) {
        ValidatingInputs validatingInputs = new ValidatingInputs();
        validatingInputs.validateInput();

    }
}
