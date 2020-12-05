package com.company;

import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {

        //I COULD NOT FINISH DRAWING EXERCISES, I HAD TO COPY PASTE//

        // Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");

        int userInput = scanner.nextInt();
        int nr = 0;

        for (int i = 1; i <= userInput; i++, nr = i) {
            for (int k = 1; k <= userInput; k++) {
                if (k == 1 || k == userInput || i == 1 || i == userInput || i == k) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

