package com.company;

public class Loop_FizzBuzz {
    public static void main(String[] args) {
        // Write a program that prints the numbers from 1 to 100
// but for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.


        for (int n = 1; n < 101; n++) {

            if (n % 3 == 0 && n % 5 == 0 ) {
                System.out.println("FizzBuzz");

            } else if (n % 3 == 0)
            {
                System.out.println("Fizz");

            } else if (n % 5 == 0)
            {
                System.out.println("Buzz");

            } else
                System.out.println(n);


        }

    }
}