package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LettersUsed {
   private Scanner letterGuess = new Scanner(System.in);

    public ArrayList<String> usedLetters(){
        ArrayList<String> guessedLetters = new ArrayList<>();
        System.out.println("Please guess a letter");
        String currentGuess = letterGuess.nextLine();
        System.out.println("Your guess is "+currentGuess);
        if(guessedLetters.contains(currentGuess)){
            System.out.println("You have already guessed this letter, try another one");

        }
        else {
            guessedLetters.add(currentGuess);
            System.out.println("Letters guessed: ");

        }
        return guessedLetters;
    }

    public static void main(String[] args) {
        LettersUsed lettersUsed = new LettersUsed();
        System.out.println(lettersUsed.usedLetters());
    }
}
