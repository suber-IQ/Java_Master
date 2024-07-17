package com.guessnumber.game;


import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    private int numberToGuess;
    private int numberOfAttempts;
    private final int maxRange;

    public GuessNumberGame(int maxRange){
        Random random = new Random();
        this.maxRange = maxRange;
        this.numberToGuess = random.nextInt(maxRange) + 1;
//        System.out.println(numberToGuess);
        this.numberOfAttempts = 0;
    }
    public boolean guessNumber(int guessedNumber){
        numberOfAttempts++;
        if(guessedNumber > numberToGuess){
            System.out.println("Too high! Try again.");
            return false;
        }else if(guessedNumber < numberToGuess){
            System.out.println("Too low! Try again.");
            return false;
        }else{
            System.out.println("Congratulations! You've guessed the Number in " + numberOfAttempts + " attempts.");
            return true;
        }
    }
    public static void main(String[] ags){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("Enter the maximum range for the number to guess: ");
        int maxRange = scanner.nextInt();

        GuessNumberGame game = new GuessNumberGame(maxRange);

        boolean hasGuessedCorrectly = false;
        while(!hasGuessedCorrectly){
            System.out.println("Enter your guess: ");
            int guess = scanner.nextInt();
            hasGuessedCorrectly= game.guessNumber(guess);
        }
        scanner.close();
    }
}
