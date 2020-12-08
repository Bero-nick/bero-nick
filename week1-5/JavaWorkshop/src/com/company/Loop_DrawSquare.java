package com.company;

import java.util.Scanner;

public class Loop_DrawSquare {
    public static void main(String[] args) {

        //I COULD NOT FINISH DRAWING EXERCISES, I HAD TO COPY PASTE//

        // Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// The square should have as many lines as the number was
        //get an userinput

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        Integer userInput = scanner.nextInt();


        if (userInput < 3) {
            for (int i=1; i <= userInput; ++i) {
                for (int j = 1; j<= userInput; ++j)
                    System.out.print("%");
                System.out.println();
            }
        } else {
            for (int j = 1; j <= userInput; ++j) {
                System.out.print("%");
            };
            System.out.println();
            for (int k=1; k<=userInput-2; ++k) {
                System.out.print("%");
                for (int l=1; l<=userInput-2; ++l) {
                    System.out.print(" ");
                };
                System.out.print("%");
                System.out.println();
            };

            for (int j = 1; j <= userInput; ++j) {
                System.out.print("%");
            }
        }

    }
}