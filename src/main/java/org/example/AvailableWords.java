package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AvailableWords {
    private List<String> beginnerWords = new ArrayList<>();
    private List<String> intermediateWords = new ArrayList<>();
    private List<String> advancedWords = new ArrayList<>();
    private List<String> expertWords = new ArrayList<>();

    public AvailableWords() {
        try {
            File file = new File("src/main/resources/words.txt");
            Scanner scanner = new Scanner(file);
            List<String> availableWords = new ArrayList<>();
            while (scanner.hasNextLine()) {
                availableWords.add(scanner.next());
            }

            beginnerWords = availableWords.stream().filter(word -> word.length() <= 4).collect(Collectors.toList());
            intermediateWords = availableWords.stream().filter(word -> word.length() >= 5 && word.length() <= 6).collect(Collectors.toList());
            advancedWords = availableWords.stream().filter(word -> word.length() >= 7 && word.length() <= 9).collect(Collectors.toList());
            expertWords = availableWords.stream().filter(word -> word.length() > 9).collect(Collectors.toList());

        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found");
        }
    }

    public List<String> getBeginnerWords() {
        return beginnerWords;
    }

    public List<String> getIntermediateWords() {
        return intermediateWords;
    }

    public List<String> getAdvancedWords() {
        return advancedWords;
    }

    public List<String> getExpertWords() {
        return expertWords;
    }
}
