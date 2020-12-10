package com.company;

import java.util.Scanner;

public class Functions_Summing {

// Create the usual class wrapper and main method on your own

    // Write a function called `sum()` that returns the sum of numbers from zero to the given parameter



    public static void main(String[] args) {
        Scanner x  = new Scanner(System.in);
        System.out.print("Enter a number ");

        int result = sum(x.nextInt());
        System.out.println(result);
    }


    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}


