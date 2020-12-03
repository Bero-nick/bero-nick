package com.company;

public class SecondInADay {

    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int secPerDay = 86400;
        int minPerHour = 60;
        int secPerMin = 60;


        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables above
        System.out.println(secPerDay - (currentHours*minPerHour*secPerMin + currentMinutes*secPerMin + currentSeconds));
    }
}
