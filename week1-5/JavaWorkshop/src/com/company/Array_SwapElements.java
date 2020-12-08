package com.company;

import java.util.Collection;

public class Array_SwapElements {

    public static void main(String[] args) {
// - Create an array variable named `orders`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `orders`

        String[] orders = {"first", "second", "third"};
        int src = 0;
        int dest = 2;
        String temp = orders[src];
        orders[0] = orders[2];
        orders[2] = temp;

        for (int i = 0; i < orders.length; i++) {
            System.out.print(orders[i] + " ");
        }
    }
}

