package com.company;

public class CondtionalVariableMutation {

        public static void main(String[] args) {
            double a = 24;
            int output1 = 0;
            // if a is even increment out by one
            if (a%2==0)
                System.out.print(output1 + 1);


            int b = 13;
            String output2 = "";
            // if b is between 10 and 20 set out2 to "Sweet!"
            // if less than 10 set out2 to "Less!",
            // if more than 20 set out2 to "More!"
            if (b > 10 && b < 20)
            {
                System.out.println("Sweet!");

            } else if (b < 10)
            {
                System.out.println("Less!");

            } else { System.out.println("More!");}


            int c = 123;
            int credits = 10;
            boolean isBonus = true;
            // if credits are at least 50,
            // and isBonus is false decrement c by 2

            // if credits are smaller than 50,
            // and isBonus is false decrement c by 1

            // if isBonus is true c should remain the same
            if (credits >= 50 && isBonus == false)
            {
                System.out.println(c-2);

            } else if (credits < 50 && isBonus == false)
            {
                System.out.println(c-1);

            } else if (isBonus == true)
            {
                System.out.println(c);

            } else { System.out.println("");}


            int d = 8;
            int time = 120;
            String output3 = "";
            // if d is dividable by 4
            // and time is not more than 200
            // set out3 to "check"

            // if time is more than 200
            // set out3 to "Time out"

            // otherwise set out3 to "Run Forest Run!"
            if (d%4 ==  0 && time < 200)
            {
                System.out.println("check");

            } else if (time > 200)
            {
                System.out.println("Time out");

            } else { System.out.println("RUN Forest run!");}

        }
}
