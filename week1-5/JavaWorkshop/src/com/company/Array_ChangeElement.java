package com.company;

import java.lang.reflect.Array;

public class Array_ChangeElement {

    public static void main(String[] args) {
// - Create an array variable named `numbers`
//   with the following content: `[1, 2, 3, 8, 5, 6]`
// - Change the value of the fourth element (8) to 4
// - Print the fourth element

        int numbers[] = {1, 2, 3, 8, 5, 6};
//       one method
//        numbers[3] = 4;

//        second method
        Array.set(numbers, 3, 4);

        System.out.println(numbers[3]);
    }

}