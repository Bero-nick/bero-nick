package com.company;

import java.util.Scanner;

public class DrawTrialgle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

      Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = userInput.nextInt();


        for (int a=0; a<n; a++)
        {
            for (int b=0; b<a; b++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
