package org.fasttrackit;
//Create a small program that contains a list of employee
//        names. Print out the list of names when the program runs
//        the first time. Prompt for an employee name and remove
//        that specific name from the list of names. Display the
//        remaining employees, each on its own line.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeListRemoval {

    public void removeEmployee() {
        List<String> employee = new ArrayList<String>();

        employee.add("Pop Alexandru");
        employee.add("David Petru");
        employee.add("Buzila Ioan");
        employee.add("Stefan Dominic");
        employee.add("Stan Vlad");
        System.out.println("There are 5 employees:");

        for (String em : employee) {
            System.out.println(em);
        }
        System.out.println("Enter an employee name to remove:");
        Scanner scanner = new Scanner(System.in);
        String rem = scanner.nextLine();

        if (employee.contains(rem)) {
            employee.remove(rem);
            for (String em2 : employee) {
                System.out.println(em2);
            }
        } else {
            System.out.println("Please enter an employee from the list.");
        }

    }

    public static void main(String[] args) {
        EmployeeListRemoval employeeListRemoval = new EmployeeListRemoval();
        employeeListRemoval.removeEmployee();

    }
}
