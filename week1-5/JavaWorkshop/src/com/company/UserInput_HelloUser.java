package com.company;

import java.util.Scanner;

public class UserInput_HelloUser {

    public static void main(String[] args) {
        // Modify this program to greet the User instead of the World!
        // The program should ask for the name of the User
        Scanner userName  = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter your name pls ");

        String txt = userName.nextLine();  // Read user input

        System.out.println ("Hello " + txt + "!");  // Output user input

    }
}

