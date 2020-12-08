package com.company;

public class Loop_DrawChessTable {

    public static void main(String[] args) {

        //I COULD NOT FINISH DRAWING EXERCISES, I HAD TO COPY PASTE//

        // Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//

        for (int y = 0; y < 8; ++y) {
            for (int x = 0; x < 8; ++x) {
                if (y%2 == 0) {
                    if (x%2 == 0) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }

                } else {
                    if (x % 2 == 1) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }
                }
            };
            System.out.println();
        }
    }
}