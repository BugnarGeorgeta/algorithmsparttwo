package org.fasttrackit;
//Create a program that prompts for
//        your age and your resting heart rate. Use the Karvonen formula to determine the target heart rate based on a range of
//        intensities from 55% to 95%. Generate a table with the results
//        as shown in the example output. The formula is
//        TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR

import java.util.InputMismatchException;
import java.util.Scanner;

public class KarvonenHeartRate {

    public int determineTargetHeart() {
       int target=0;
        System.out.println("Enter your age :");
        Scanner scanner = new Scanner(System.in);
        try {
            int age = scanner.nextInt();
            System.out.println("Enter your resting pulse:");
            int pulse = scanner.nextInt();
            System.out.println(" For Age: " + age + " and resting pulse " + pulse + ":");
            System.out.println();
            for (int i = 55; i <= 95; i += 5) {
               target = (((220 - age) - pulse) * i / 100) + pulse;
                System.out.println(" Intensity  " + i + " %" + " Rate " + target + " bpm.");
                System.out.println();
            }
            System.out.println();
            System.out.println();

        } catch (InputMismatchException e) {
            System.out.println("Enter  the data correctly");
            return determineTargetHeart();
        }
        return target;
    }


    public static void main(String[] args) {
        KarvonenHeartRate karvonenHeartRate = new KarvonenHeartRate();
        karvonenHeartRate.determineTargetHeart();

    }
}
