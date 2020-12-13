package com.company;

public class Strings_TakesLonger {
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occurred. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)


        String string = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String[] parts = string.split("It");
        String part1 = parts[0]; // Hofstadter's Law: It
        String part2 = parts[1]; // you expect, even when you take into account Hofstadter's Law.

        System.out.println(part1 + " It always takes longer than" + part2);



    }
}