package com.thoughtworks.tw101.exercises.exercise7;


/**
 * Created by sarqhlohmeier on 5/29/16.
 */

import java.util.Scanner;

public class Program {
    int number;

    public Program() {
        number = (int) Math.ceil(Math.random() * 100);
    }

    public int askForGuess() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Guess a number: ");
        return reader.nextInt();

    }

}
