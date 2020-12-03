package com.company;

public class PrintEven {
    public static void main(String[] args) {
        // Create a program that prints all the even numbers between 0 and 500

        int e = 0;
        while (e < 501) {
            if (e%2 ==0)
            System.out.println(e);
            e++;
        }

    }
}
