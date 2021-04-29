package org.fasttrackit;
//Create a Magic 8 Ball game that prompts for a question and
//        then displays either “Yes,” “No,” “Maybe,” or “Ask again
//        later.”

import java.sql.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Magic8Balls {
    public void getAnswer() {
        System.out.println("What's your question?");
        Scanner scanner = new Scanner(System.in);
        try {
            scanner.nextLine();
            String[] answer = {"Yes", "No", " Maybe", "Ask again later"};

            Random random = new Random();
            int i = random.nextInt((4) + 1);

            System.out.println(answer[i]);
        } catch (InputMismatchException e) {
            System.out.println("Enter a question.");
        }
    }


    public static void main(String[] args) {
        Magic8Balls magic8Balls = new Magic8Balls();
        magic8Balls.getAnswer();

    }
}
