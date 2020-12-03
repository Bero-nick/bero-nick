package com.company;

public class TwoNumbers {

    public static void main(String[] args) {
        // Create a program that prints a few operations on two numbers: 22 and 13

        // Print the result of 13 added to 22
        float a, b, c, d, e, f ;
        a = 13;
        b = 22;
        c = a + b;
        System.out.println (c);

        // Print the result of 13 substracted from 22
        a = 13;
        b = 22;
        d = b - a;
        System.out.println (d);

        // Print the result of 22 multiplied by 13
        a = 13;
        b = 22;
        e = a * b;
        System.out.println (e);

        // Print the result of 22 divided by 13 (as a decimal fraction)
        a = 13;
        b = 22;
        f = b / a;
        System.out.println (f);

        // Print the integer part of 22 divided by 13
        int g;
        a = 13;
        b = 22;
        g = (int)(b / a);
        System.out.println (g);

        // Print the remainder of 22 divided by 13
        float remainder = b % a;
        System.out.println (remainder);

    }
}
