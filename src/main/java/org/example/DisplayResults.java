package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class DisplayResults {

    private Scanner letterGuess = new Scanner(System.in);
    public int score = 10;

    public ArrayList<String> displayResults (String word){
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> usedLetters = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            result.add("_");
        }
        System.out.println(result);
        while(true){

            System.out.println("Make your guess: ");
            String currentGuess = letterGuess.nextLine();

            if(usedLetters.contains(currentGuess)){
                System.out.println("You have already guessed this letter, try another one");
                System.out.println(result);
                System.out.println("Score: "+score);
                System.out.println("Letters guessed: "+usedLetters);
                continue;
            } else if (currentGuess.isEmpty()) {
                continue;
            } else if(word.contains(currentGuess)){
                usedLetters.add(currentGuess);
                int index = word.indexOf(currentGuess);
                while(index >= 0){
                    result.set(index, currentGuess);
                    index = word.indexOf(currentGuess,index+1);
                }
                System.out.println(result);
                System.out.println("Score: "+score);
                System.out.println("Letters guessed: "+usedLetters);
                if (String.join("",result).equals(word)) {
                    System.out.println("Congratulations you guessed the word! You final score is " + score);
                    break;
                }
            }
            else {
                usedLetters.add(currentGuess);
                score -= 1;
                System.out.println(result);
                System.out.println("Score: "+score);
                System.out.println("Letters guessed: "+usedLetters);
                if (score == 0) {
                    System.out.println("Sorry, too slow! The word was " + word);
                    break;

                }
            }
        }


        return result;
    }

    public static void main(String[] args) {
        DisplayResults displayResults = new DisplayResults();
        System.out.println(displayResults.displayResults("hello"));

    }

}
