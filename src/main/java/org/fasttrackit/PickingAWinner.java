package org.fasttrackit;
//Create a program that picks a winner for a contest or prize
//        drawing. Prompt for names of contestants until the user
//        leaves the entry blank. Then randomly select a winner

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PickingAWinner {

    public void getWinner() {

        System.out.println("Enter a name:");
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        while (true) {

            for (int i = 0; i < list.size(); i++) {
                String name = scanner.nextLine();

                list.add(i, name);
                System.out.println(list.get(i));

                if (name.isEmpty()) {
                    break;
                }
                System.out.println(list.size());
            }

        }
    }


    public static void main(String[] args) {
        PickingAWinner pickingAWinner = new PickingAWinner();
        pickingAWinner.getWinner();

    }
}
