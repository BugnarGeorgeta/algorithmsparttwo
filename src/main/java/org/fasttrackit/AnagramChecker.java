package org.fasttrackit;
//Create a program that compares two strings and determines
//        if the two strings are anagrams. The program should prompt
//        for both input strings and display the output as shown in
//        the example that follows.

import java.util.*;

public class AnagramChecker {

    public boolean isAnagram() {

        System.out.println("Enter two strings and I'll tell you if they are anagrams");
        System.out.println("Enter the first string:");
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        System.out.println("Enter the second string:");
        String second = scanner.nextLine();

        if (first.length() != second.length()) {
            System.out.println(first + " and " + second + " are not anagrams.");
            return false;
        }

        char[] c1 = first.toCharArray();
        char[] c2 = second.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String sc1 = new String(c1);
        String sc2 = new String(c2);

        if (sc1.equals(sc2))
            System.out.println(first + " and " + second + " are anagrams.");

        else
            System.out.println(first + " and " + second + " are not  anagrams.");
        return true;

    }

    public static void main(String[] args) {
        AnagramChecker anagramChecker = new AnagramChecker();
        anagramChecker.isAnagram();

    }
}
