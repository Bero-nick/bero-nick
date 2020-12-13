package com.company;

import java.util.ArrayList;

public class Strings_ToDoPrint {
    public static void main(String... args) {
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo


        ArrayList<String> todos = new ArrayList<String>();

        todos.add(" - Buy milk");
        todos.add(" - Download games");
        todos.add("     - Diablo");

        todos.add(0, "My todo:"); //insert a string on index 0

        for (int i = 0; i < todos.size(); i++) {
            System.out.println(todos.get(i));

        }
    }
}