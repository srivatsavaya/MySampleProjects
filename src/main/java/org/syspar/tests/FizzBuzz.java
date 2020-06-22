package org.syspar.tests;

/*
Problem:    Write a short program that prints each number from 1 to 100 on a new line.
            For each of multiple 3, print "Fizz" instead of the number
            For each of multiple 5, print "Buzz" instead of the number
            For each which are muliples of 3 and 5, print "FizzBuzz" instead of the number
Scoring:    Your score is (200 - number of characters in your source code)/100
*/

public class FizzBuzz {

    public static void evaluateFizzBuzz(int num) {

        for (int i = 1; i <= num; i++) {
            if (i%3 == 0 && i%5 == 0)
                System.out.println("FizzBuzz");
            else if (i%3 == 0)
                System.out.println("Fizz");
            else if (i%5 == 0)
                System.out.println("Buzz");
            else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        evaluateFizzBuzz(50);
    }
}