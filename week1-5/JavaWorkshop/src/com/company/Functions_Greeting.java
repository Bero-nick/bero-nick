package com.company;

public class Functions_Greeting {

//  From now on, create the usual class wrapper
//  and main method on your own

    // - Create a string variable named `al` and assign the value `Green Fox` to it
// - Create a function called `greet()` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings dear Green Fox`
// - Greet `al`

    static void greet(String al) {
        System.out.println("Greetings dear " + al);
    }

    public static void main(String[] args) {
        greet("Green Fox");
    }
}