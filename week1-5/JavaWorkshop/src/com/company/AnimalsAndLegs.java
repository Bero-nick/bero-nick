package com.company;

import java.util.Scanner;

public class AnimalsAndLegs {

            public static void main(String[] args) {
                // Write a program that asks for two integers
                // The first represents the number of chickens the farmer has
                // The second represents the number of pigs owned by the farmer
                // It should print how many legs all the animals have

                Scanner chickens  = new Scanner(System.in);
                System.out.print("How many chickens the farmer has? ");
                int numberOfChic  = chickens.nextInt();

                Scanner pigs  = new Scanner(System.in);
                System.out.print("How many pigs the farmer has? ");
                int numberOfPigs  = pigs.nextInt();

                int chickenLegs = 2;
                int pigsLegs = 4;
                int legsTotal = numberOfChic * chickenLegs + numberOfPigs * pigsLegs;
                System.out.println ("There are " + legsTotal + " legs on farm!");

            }
}
