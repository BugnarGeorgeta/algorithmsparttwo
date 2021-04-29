package org.fasttrackit;
//Write a quick calculator that prompts for the rate of return
//        on an investment and calculates how many years it will take
//        to double your investment.
//        The formula is
//        years = 72 /r
//        where r is the stated rate of return

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingBadInput {

    public int calculYear() {
        System.out.println("What is the rate of return? ");
        Scanner scanner = new Scanner(System.in);
        try {
            int rate = scanner.nextInt();
            int year = 72 / rate;
            System.out.println("It will take " + year + " years to double your initial investment.");
            return year;

        } catch (InputMismatchException e) {
            System.out.println("Sorry. That's not a valid input.");
            return calculYear();

        } catch (ArithmeticException e) {
            System.out.println("Sorry. That's not a valid input. Please enter another value than 0.");
            return calculYear();
        }

    }

    public static void main(String[] args) {
        HandlingBadInput handlingBadInput = new HandlingBadInput();
        handlingBadInput.calculYear();

    }
}
