package com.company;

public class Functions_Doubling {

    // - Create an integer variable named `baseNumber` and assign the value `123` to it
// - Create a function called `doubleNumber()` that doubles its integer input parameter
//   and returns the doubled value
// - Print the result of `doubleNumber(baseNumber)`
    static int doubleNumber(int baseNumber) {
        return 2 * baseNumber;
    }

    public static void main(String[] args) {
        System.out.println(doubleNumber(123));
    }
}