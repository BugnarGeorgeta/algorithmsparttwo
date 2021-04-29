package org.fasttrackit;
//Create a program that generates multiplication tables for
//        the numbers 0 through 12

public class MultiplicationTable {
    public void multiplication() {

        for (int i = 0; i <= 12; ++i) {

            for (int j = 0; j <= 12; ++j) {
                int multi = i * j;
                System.out.println(i + "x" + j + "=" + multi);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        }




    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.multiplication();

    }
}
