package com.company;

import java.util.Scanner;

class UserInput_MileToKm {
    public static void main(String[] args) {
        Scanner m  = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter distance in miles ");

        float dInMiles  = m.nextFloat();  // Read user input

        float x = 1.60934f;
        float k = dInMiles * x;
        System.out.println ("The distance in km is: " + k);  // Output user input

    }
}
