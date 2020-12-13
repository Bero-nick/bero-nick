package com.company;

import java.util.ArrayList;

public class Strings_Reverse {
    public static void main(String... args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        int count = 0;
        for (int i = 0; i < toBeReversed.length(); i++) { //Counts each character
//           if(toBeReversed.charAt(i) != ' ') // this excepts the spaces
            count++;
        }
        String reverse = "";
        for (int j = count - 1; j >= 0; j--) {
            reverse = reverse + toBeReversed.charAt(j);
        }

        System.out.println(reverse);
    }
}


//            char ch = toBeReversed.charAt(j);//returns the char value at the j index
//            System.out.print(ch);
