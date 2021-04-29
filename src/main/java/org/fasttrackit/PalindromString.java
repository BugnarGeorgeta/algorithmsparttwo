package org.fasttrackit;
//Programs to check whether the given String is Palindrome or not

import java.util.Scanner;

public class PalindromString {

    public void checkPalindrom() {

        String reverseStr = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string to check if it is a palindrome:. ");
        String str = scanner.nextLine();
        scanner.close();

        int n = str.length() - 1;
        for (int i = n; i >= 0; i--) {

            reverseStr += str.charAt(i);
        }

        if (str.equals(reverseStr)) {
            System.out.println("The string " + str + " is Palindrome.");
        } else {
            System.out.println("The string " + str + " is  not Palindrome.");
        }
    }


    public static void main(String[] args) {
        PalindromString palindromString = new PalindromString();
        palindromString.checkPalindrom();

    }
}
