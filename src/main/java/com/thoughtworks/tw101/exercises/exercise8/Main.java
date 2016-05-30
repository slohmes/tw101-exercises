package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.


public class Main {
    public static void main(String[] args) {
        Program program  = new Program();

        int currentGuess = 0;

        while(currentGuess != program.number) {

            try {
                currentGuess = program.askForGuess();

                if(currentGuess > program.number) {
                    System.out.println("Too high.");
                }
                else if(currentGuess < program.number) {
                    System.out.println("Too low.");
                }

            } catch (Exception e) {
                System.out.println("That input isn't parsable. Please enter a number between 1 and 100.");
            }
        }
        System.out.println("Correct! You win!");
        System.out.println(program.getGuesses());
                
    }
}
