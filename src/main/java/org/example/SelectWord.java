package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SelectWord {
    private String word;
    private String hiddenWord;
    private int numberOfWords = 0;
    File file = new File("src/main/resources/words.txt");
    Scanner scanner;

    public SelectWord() {
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                numberOfWords++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found");
        }
    }

    public int getNumberOfWords() {
        return numberOfWords;
    }
}
