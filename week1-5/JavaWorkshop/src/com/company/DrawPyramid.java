package com.company;

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

        for (int a=1; a<8; a += 2)
        {
            for (int b=0; b < (4 - a / 2); b++)
            {
                System.out.print(" ");
            }
            for (int c=0; c<a; c++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
    }
