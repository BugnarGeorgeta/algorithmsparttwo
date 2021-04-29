package org.fasttrackit;
//Java Program to check Leap Year

import java.util.Scanner;

public class LeapYear {
    public void giveYear() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = scan.nextInt();
        scan.close();
        boolean isLeap = false;

        if (year % 4 == 0) {

            if (year % 100 == 0) {

                if (year % 400 == 0) {
                    isLeap = true;

                } else {
                    isLeap = false;

                }
            } else {
                isLeap = true;
            }
        } else {
            isLeap = false;
        }

        if (isLeap == true) {
            System.out.println("The year " + year + " is leap.");
        } else {
            System.out.println(" The Year " + year + " in not leap.");
        }


    }

    public static void main(String[] args) {
        LeapYear leap = new LeapYear();
        leap.giveYear();

    }
}
