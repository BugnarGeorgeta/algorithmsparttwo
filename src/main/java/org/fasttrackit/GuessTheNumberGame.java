package org.fasttrackit;
//Write a Guess the Number game that has three levels of
//        difficulty. The first level of difficulty would be a number
//        between 1 and 10. The second difficulty set would be
//        between 1 and 100. The third difficulty set would be between
//        1 and 1000.
//        Prompt for the difficulty level, and then start the game. The
//        computer picks a random numberin thatrange and prompts
//        the player to guess that number. Each time the player
//        guesses, the computer should give the player a hint as to
//        whether the number is too high or too low. The computer
//        should also keep track of the number of guesses. Once the
//        player guesses the correct number, the computer should
//        present the number of guesses and ask if the player would
//        like to play again.


import jdk.internal.util.xml.impl.Input;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    int level;

    public void guessNumber() {

        System.out.println("Let's play Guess the Number.");
        System.out.println("Pick a difficulty level (1, 2, or 3): ");
        Scanner scanner = new Scanner(System.in);
        try {
            level = scanner.nextInt();


            Random random = new Random();
            int att = 0;
            int x = 0;

            if (level == 1) x += 10;
            else if (level == 2) x += 100;
            else if (level == 3) x += 1000;

            int number = random.nextInt(x) + 1;
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < 50; i++) {

                System.out.println("I have my number.The number is between 1 and " + x + "  .What's your guess?");
                Scanner scanner1 = new Scanner(System.in);
                int lev = scanner1.nextInt();
                if (!list.contains(lev)) {
                    att += 1;
                    list.add(lev);
                }
                if (lev == number) {
                    System.out.println("Yes, this is the number!");
                    System.out.println("You got it in " + att + " guesses! Play again?");
                    Scanner scanner2 = new Scanner(System.in);
                    String again = scanner2.nextLine();
                    if (again.equalsIgnoreCase("y") || again.equalsIgnoreCase("yes")) {
                        guessNumber();
                    } else if (again.equalsIgnoreCase("n") || again.equalsIgnoreCase("no")) {
                        System.out.println("Goodbye!");
                    } else {
                        System.out.println("Please enter yes or no.");
                    }
                    break;

                } else if (lev > number) {
                    System.out.println("Too high. Guess again:");
                } else {
                    System.out.println("Too low. Guess again:");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Please enter correctly information");
            guessNumber();
        }
    }

    public static void main(String[] args) {
        GuessTheNumberGame guessTheNumberGame = new GuessTheNumberGame();
        guessTheNumberGame.guessNumber();

    }
}
