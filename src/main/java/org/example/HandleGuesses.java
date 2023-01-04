package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class HandleGuesses {
    LettersGuessed lettersGuessed = new LettersGuessed();

    public String checkGuesses(String word) {
        StringBuilder output = new StringBuilder();
        ArrayList<String> splitWord = new ArrayList<>(Arrays.asList(word.split("")));
        for (String letter : splitWord) {
            if(!lettersGuessed.getLettersGuessed().contains(letter.toUpperCase())) {
                output.append("_");
            } else {
                output.append(letter.toUpperCase());
            }

        }
        return output.toString();
    }
}
