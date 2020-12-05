package com.company;

import java.util.Scanner;
public class ParametricAverage {
    public static void main(String[] args) {
// Write a program that asks for a number
// It would ask this many times to enter an integer
// If all the integers are entered it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

        Scanner userInput0 = new Scanner(System.in);
        System.out.println("How many numbers would you like to calculate?");
        Integer nrx = userInput0.nextInt();

        int i = nrx;
        int sum = 0;

        do {
        System.out.println("Insert one more number:");
        Integer input = userInput0.nextInt();
        sum += input;
        --i;

        } while (i > 0);
        System.out.println("Sum is: " + sum );
        System.out.println("Average is: " + sum/nrx);

        }
        }