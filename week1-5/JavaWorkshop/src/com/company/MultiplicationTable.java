package com.company;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a program that asks for a number and prints the multiplication table with that number
//
// Example:
// The number 15 should print:
//
// 1 * 15 = 15
// 2 * 15 = 30
// 3 * 15 = 45
// 4 * 15 = 60
// 5 * 15 = 75
// 6 * 15 = 90
// 7 * 15 = 105
// 8 * 15 = 120
// 9 * 15 = 135
// 10 * 15 = 150

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int nr = userInput.nextInt();
        int a = nr;
        int b = 1;
            while (b < 11) {
            int c = (a * b);
            System.out.println(b + " * " + a + " = " + c);
            b++;

        }
    }
}

