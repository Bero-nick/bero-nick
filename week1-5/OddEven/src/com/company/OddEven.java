package com.company;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // then prints "Odd" if the number is odd, or "Even" if it is even

        Scanner userInput = new Scanner(System.in);
        System.out.println("Input a number!");
        int input, x;
        input = userInput.nextInt();
        x = input % 2;
        if (x == 0)
            System.out.println("Number " + input + " is even.");
        else
            System.out.println("Number " + input + " is odd.");
    }
}

