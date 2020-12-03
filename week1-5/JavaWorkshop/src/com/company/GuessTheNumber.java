package com.company;

import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        // Write a program that stores a number and the user has to figure it out
// The user can input guesses
// After each guess the program would tell one of the following:
//
// The stored number is higher
// The stored number is lower
// You found the number: 8
        int secretNumber;
        int numberIn;
        boolean done = false;
        Scanner in = new Scanner(System.in);

        secretNumber = (int)(Math.random()*1000);

        while (!done) {
            System.out.print("Enter your guess (between 0 and 999): ");
            numberIn = in.nextInt();
            if (numberIn == secretNumber) {
                System.out.println("You found the number " + secretNumber);
                done = true;
            } else if (numberIn < secretNumber) {
                System.out.println("The stored number is higher");
            } else {
                System.out.println("The stored number is lower");
            }
        }
    }
}