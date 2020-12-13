package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class DataStructures_ListIntrod1 {
    public static void main(String... args) {
//        We are going to play with lists. Feel free to use the built-in methods where possible.
//
//        Create an empty list which will contain names (strings)
//        Print out the number of elements in the list
//        Add William to the list
//        Print out whether the list is empty or not
//        Add John to the list
//        Add Amanda to the list
//        Print out the number of elements in the list
//        Print out the 3rd element
//        Iterate through the list and print out each name
//                William
//                John
//                Amanda

//        Iterate through the list and print
//        1. William
//        2. John
//        3. Amanda

//        Remove the 2nd element
//        Iterate through the list in a reversed order and print out each name
//          Amanda
//          William
//        Remove all elements

        ArrayList<String> names = new ArrayList<String>();

        int i = names.size();
        System.out.println(i); //Print out the number of elements in the list

        names.add(0, "Wiliam"); //Add William to the list
        for (int j = 0; j < names.size(); j++) {
            System.out.println(names.get(j)); // Print out the number of elements in the list
            System.out.println();
        }
        names.add(1, "John"); //Add William to the list
        names.add(2, "Amanda"); //Add Amanda to the list
        for (int l = 0; l < names.size(); l++) {
            System.out.println(names.get(l));

        }

        System.out.println(names.size()); //Print out the number of elements in the list
        System.out.println();

        System.out.println(names.get(2));
        System.out.println();

        for (String l : names) {   //prints all one by one

        }
        System.out.println();
//        ArrayList<String> numbers = new ArrayList<String>();
//        numbers.add("1.");
//        numbers.add("2.");
//        numbers.add("3.");
//
//        String result = numbers+names;
//        System.out.println(result);
//
//
//
//        String result = numbers.concat(names);
//        System.out.println(result);
//
//
//        StringBuilder sb = new StringBuilder(numbers);
//        sb.append(names);
//        System.out.println(sb);

        names.remove(1);   //removes index 1
        for (int m = 0; m < names.size(); m++)
        {
            System.out.println(names.get(m));
            System.out.println();
        }

        //Now call this method

        Collections.reverse(names);

// iterate and print index wise

        for (String name : names) {
        System.out.println(names);
        }

    }
}