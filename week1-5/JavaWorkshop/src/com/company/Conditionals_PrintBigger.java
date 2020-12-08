package com.company;

import java.util.Scanner;

public class Conditionals_PrintBigger {

    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter nr.1: ");
        int nr1  = userInput.nextInt();

        System.out.println("Enter nr.2: ");
        int nr2  = userInput.nextInt();

        int a = nr1;
        int b = nr2;

        if ( a > b )
        {
            System.out.println(a);

        } else { System.out.println("The bigger number is: " + b);}

    }
}
