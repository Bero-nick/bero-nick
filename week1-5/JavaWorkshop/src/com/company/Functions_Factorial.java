package com.company;

import java.util.Scanner;

public class Functions_Factorial {

//  Create the usual class wrapper and main method on your own

// - Create a function called `calculateFactorial()`
//   that returns the factorial of its input

    public static void main(String[] args) {
        Scanner x  = new Scanner(System.in);
        System.out.print("Enter a number ");

        int result = factorial (x.nextInt());
        System.out.println(result);
    }


    public static int factorial(int k) {
        if (k > 0) {
            return k * factorial(k - 1);
        } else {
            return 0;
        }
    }
}


