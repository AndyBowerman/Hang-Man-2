package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LettersGuessed {
    private Set<String> lettersGuessed = new HashSet<>();

    public void addLetters(String letter) {
        lettersGuessed.add(letter);
    }

    public String getLettersGuessed() {
        String guesses = "Guesses: ";
        for (String letter: lettersGuessed) {
            guesses += letter.toUpperCase() + " ";
        }
        return guesses;
    }
}
