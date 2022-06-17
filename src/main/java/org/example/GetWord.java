package org.example;

import java.util.Random;

public class GetWord {
    private String[] words = new String[] {"abruptly","absurd","bagpipes", "bandwagon","ivory","ivy","jackpot","jaundice","jawbreaker","puppy,","puzzling","quartz","queue"};

    public String getRandomWord() {
        return words[new Random().nextInt(words.length)];
    }

    public static void main(String[] args) {
        GetWord wordGame = new GetWord();
        System.out.println(wordGame.getRandomWord());
    }
}
