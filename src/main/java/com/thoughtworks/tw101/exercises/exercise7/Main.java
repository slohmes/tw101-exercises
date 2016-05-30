package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.


public class Main {

    public static void main(String[] args) {

        Program prog1  = new Program();

        int guess = 0;

        while(guess != prog1.number) {
            guess = prog1.askForGuess();

            if(guess > prog1.number) {
                System.out.println("Too high.");
            }
            else if(guess < prog1.number) {
                System.out.println("Too low.");
            }
        }
        System.out.println("Correct! You win!");

    }
}
