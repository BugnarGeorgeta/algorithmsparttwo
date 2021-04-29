package org.fasttrackit;

import java.util.Scanner;

//Create a program that compares two strings and determines
//        if the two strings are the same strings. The program should prompt
//        for both input strings and display the output as shown in
//        the example that follows.
public class TheSame {

    public void areTheSame() {
        System.out.println(" Enter two strings and I'll tell you if they are the same:");
        System.out.println(" Enter the first string:");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println("Enter the second string:");
        String b = scanner.nextLine();
        if (a.length() != b.length()) {
            System.out.println("' " + a + " '" + " ' " + b + " '" + " are not the same.");
        }

        for (int i = 0; i < a.length(); i++) {
            if (a.length() == b.length() && a.equalsIgnoreCase(b)) {
                System.out.println("' " + a + " '" + " '" + b + " '" + " are  the same.");
                break;
            } else {
                System.out.println(" ' " + a + " ' " + "  ' " + b + " ' " + " are not the same.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        TheSame theSame = new TheSame();
        theSame.areTheSame();
    }
}
