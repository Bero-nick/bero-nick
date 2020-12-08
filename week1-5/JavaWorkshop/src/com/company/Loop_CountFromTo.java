package com.company;

import java.util.Scanner;

public class Loop_CountFromTo {
    public static void main(String[] args) {

        // Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter nr.1: ");
        int nr1 = userInput.nextInt();

        System.out.println("Enter nr.2: ");
        int nr2 = userInput.nextInt();

        int a = nr1;
        int b = nr2;
        if (b < a) {
            System.out.println("The second number should be bigger.");
        }
        else {
            for (int c = a; c < b; c++) {
                System.out.println(c);

            }
        }
    }
}
