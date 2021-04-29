package org.fasttrackit;
//Write a program that prompts the userforfive numbers and
//        computes the total of the numbers.
//Modify the program to prompt for how many numbers
//        to add, instead of hard-coding the value

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddingNumbers {

    public void addNumber() {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            int num[] = new int[5];
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter a number :");
                num[i] = scanner.nextInt();
                sum += num[i];
            }
            System.out.println("The total is " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Please enter only numbers.");
        }
    }

    public void addNumbers() {
        int sum = 0;
        int n;
        System.out.println("How many numbers do you want to add?");
        Scanner scanner = new Scanner(System.in);
        try {
            n = scanner.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter a number:");
                a[i] = scanner.nextInt();
                sum += a[i];
            }
            System.out.println("The total is " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Please enter only numbers.");
        }
    }


    public static void main(String[] args) {
        AddingNumbers addingNumbers = new AddingNumbers();
        addingNumbers.addNumber();
        addingNumbers.addNumbers();

    }
}
