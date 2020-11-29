package com.company;

public class Main {

    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600 povrch
        // Volume: 1000 objem
        double a = 10;
        double b = 10;
        double c = 10;
        System.out.println("Surface Area: " + ((2 * ((a * b) + (a * c) + (b * c)))));
        System.out.println("Volume: " + (a * b * c));




    }
}
