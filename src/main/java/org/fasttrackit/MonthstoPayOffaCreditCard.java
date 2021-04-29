package org.fasttrackit;
//Write a program that will help you determine how many
//        months it will take to pay off a credit card balance. The
//        program should ask the user to enter the balance of a credit
//        card and the APR of the card. The program should then
//        return the number of months needed.

import java.util.InputMismatchException;
import java.util.Scanner;

public class MonthstoPayOffaCreditCard {

    public double calculateMonthsUntilPaidOff() {
        double months;
        System.out.println("What is your balance?");
        try {
            Scanner scanner = new Scanner(System.in);
            double balance = scanner.nextDouble();
            System.out.println("What is the APR(annual percentage rate) on the card (as a percent)? ");
            double apr = scanner.nextDouble() / 36500;
            System.out.println("What is the monthly payment you can make?");
            double pay = scanner.nextDouble();

            double first = Math.log(1 + ((balance / pay) * (1 - (Math.pow((1 + apr), 30)))));

            double second = Math.log(1 + apr);

            months = Math.ceil(-(1.0 / 30.0) * (first / second));


            System.out.println("It will take you " + months + "  months to pay off this card");


        } catch (InputMismatchException e) {
            System.out.println("Please enter corectly information");
            return calculateMonthsUntilPaidOff();
        }
        return months;
    }

    public static void main(String[] args) {
        MonthstoPayOffaCreditCard monthstoPayOffaCreditCard = new MonthstoPayOffaCreditCard();
        monthstoPayOffaCreditCard.calculateMonthsUntilPaidOff();

    }
}
