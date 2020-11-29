package com.company;

public class Main {

    public static void main(String[] args) {
        // String
        String sayhello = "Hello, World";
        System.out.println(sayhello);

        // Boolean
        boolean isAwesome = false;
        System.out.println(isAwesome);

        // Whole number
        // integer (32 bit; min: -2 147 483 648; max: 2 147 483 647)
        int theMeaningOfLifeAndTheUniverse = 42;
        System.out.println(theMeaningOfLifeAndTheUniverse);

        // Floating point number
        // Double (64 bit, double precision IEEE 754)
        double pi = 3.141592;
        System.out.println(pi);

        // Other mentioned types
        byte b = 2;                // Byte (8 bit; min:-128; max: +127)
        short s = 567;             // Short (16 bit; min: -32768 ; max: +32 767)
        long l = 30000000000000L;  // Long (64 bit; min: -9 223 372 036 854 775 808 ;max: 9 223 372 036 854 775 807)
        float f = 1.3f;
        float f2 = 45f;            // Float (32 bit single precision IEEE 754)

        // Declaring a variable
        int number;

        // Assigning a value to a variable, (define its value)
        number = 12;

        // Mutating a variable, (redefine its value)
        number = 23;
    }
}