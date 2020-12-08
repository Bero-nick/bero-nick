package com.company;

import java.util.Scanner;

public class UserInput_AverageOfInput {

    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        // Sum: 22, Average: 4.4
        // Function that return average of an array.

        Scanner userInput = new Scanner(System.in);
        System.out.println("The system calculates sum and average of your 5 numbers.");
        System.out.println("Enter nr.1: ");
        int nr1  = userInput.nextInt();

        System.out.println("Enter nr.2: ");
        int nr2  = userInput.nextInt();

        System.out.println("Enter nr.3: ");
        int nr3  = userInput.nextInt();

        System.out.println("Enter nr.4: ");
        int nr4  = userInput.nextInt();

        System.out.println("Enter nr.5: ");
        int nr5 = userInput.nextInt();

        int sum = nr1 + nr2 + nr3 + nr4 + nr5;
        int avg = (nr1 + nr2 + nr3 + nr4 + nr5)/5;
        System.out.println ("The sum of your numbers is " + sum);
        System.out.println ("The average of your numbers is " + avg);

    }
}