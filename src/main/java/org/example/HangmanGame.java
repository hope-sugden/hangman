package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class HangmanGame {
    private Scanner letterGuess = new Scanner(System.in);
    private GetWord randomWord = new GetWord();
    private DisplayResults results = new DisplayResults();

    public void playHangman() {
        String wordToGuess = randomWord.getRandomWord();
        results.displayResults(wordToGuess);


        System.out.println("Thanks for playing!");
    }


    public static void main(String[] args) {
        HangmanGame hangmanGame = new HangmanGame();
        hangmanGame.playHangman();
    }
}
