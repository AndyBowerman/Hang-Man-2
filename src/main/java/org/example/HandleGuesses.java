package org.example;

public class HandleGuesses {
    LettersGuessed lettersGuessed = new LettersGuessed();

    public String checkGuesses(String word) {
        StringBuilder output = new StringBuilder();
        String[] splitWord = word.split("");
        for (String s : splitWord) {
            if(lettersGuessed.getLettersGuessed().contains(s)) {
                output.append(s);
            } else {
                output.append("_");
            }
        }
        return output.toString();
    }
}
