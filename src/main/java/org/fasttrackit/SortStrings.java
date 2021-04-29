package org.fasttrackit;
// Arranging Strings in an Alphabetical Order

import java.util.Scanner;

public class SortStrings {

    public void sortingString() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many strings do you want to enter :");
        int count = scanner.nextInt();

        String[] strings = new String[count];
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter the Strings, one by one:");

        for (int i = 0; i < count; i++) {
            strings[i] = scanner1.nextLine();
        }
        scanner.close();
        scanner1.close();

        for(int i=0; i< count; i++){
            for(int j=i+1;j<count;j++){
                
            }
        }
    }


    public static void main(String[] args) {

    }
}
