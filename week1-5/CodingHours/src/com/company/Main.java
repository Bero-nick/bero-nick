package com.company;

public class Main {

    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        float a, b, c, d, e, f ;
        a = 6;       // 6 hours of daily coding
        b = 17;    // 17 week / semester
        c =  5;      // 5 working days
        d = ( a * b * c );
        System.out.println(d);

        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        a = 6;       // 6 hours of daily coding
        b = 17;      // 17 week / semester
        c =  5;      // 5 working days
        e = 52;      // average working hours / week
        f = ( ( (a * b * c ) / ( b * e ) ) *100) ;
        System.out.println(f + "%");
        
    }
}
