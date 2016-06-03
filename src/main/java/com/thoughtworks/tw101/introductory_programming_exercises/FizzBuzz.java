package com.thoughtworks.tw101.introductory_programming_exercises;

//FizzBuzz Exercise
//        FizzBuzz is a simple number game where you count, but say "Fizz" and/or "Buzz" instead of numbers adhering to
//        certain rules.
//
//        Create a fizzBuzz() method that prints out the numbers 1 through 100.
//        Instead of numbers divisible by three print "Fizz".
//        Instead of numbers divisible by five print "Buzz".
//        Instead of numbers divisible by three and five print "FizzBuzz".
//
//        Sample Output:
//        1
//        2
//        Fizz
//        4
//        Buzz
//        Fizz
//        7
//        8
//        Fizz
//        Buzz
//        11
//        Fizz
//        13
//        14
//        FizzBuzz

import java.util.ArrayList;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz();
    }

    private static void fizzBuzz() {

        ArrayList<Object> numbersList = new ArrayList<>();

        for(int i = 1; i <= 100; i++) {
            numbersList.add(i);
        }
        for(int i = 2; i < 100; i += 3) {
            numbersList.set(i, "Fizz");
        }
        for(int i = 4; i < 100; i += 5) {
            if (numbersList.get(i) == "Fizz") {
                numbersList.set(i, "FizzBuzz");
            }
            else {
                numbersList.set(i, "Buzz");
            }
        }
        for(Object element : numbersList) {
            System.out.println(element);
        }
    }
}
