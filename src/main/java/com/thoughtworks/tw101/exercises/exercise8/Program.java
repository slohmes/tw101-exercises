package com.thoughtworks.tw101.exercises.exercise8;


/**
 * Created by sarqhlohmeier on 5/29/16.
 *
 * Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
 // once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
 // where the user entered a String that is not parseable.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    int number;
    ArrayList<Integer> guesses;

    public Program() {
        number = (int) Math.ceil(Math.random() * 100);
        guesses = new ArrayList<>();
    }

    public int askForGuess() throws Exception {

        Scanner reader = new Scanner(System.in);
        System.out.println("Guess a number: ");

        int newGuess = 0;
        newGuess = reader.nextInt();
        guesses.add(newGuess);
        return newGuess;
    }
    public String getGuesses() {
        StringBuilder s = new StringBuilder();
        s.append("Your guesses: ");

        for (int i : guesses) {
            s.append(i);
            s.append(" ");
        }
        return s.toString();
    }

}
