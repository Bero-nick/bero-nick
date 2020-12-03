package com.company;

public class BMI {

    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;
        double square = Math.pow ( heightInM, 2);
        // Print the Body mass index (BMI) based on these values kg/m2
        System.out.printf ("%.2f", massInKg / ( square) );

    }
}
