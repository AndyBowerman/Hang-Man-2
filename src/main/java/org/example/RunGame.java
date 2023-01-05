package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class RunGame {
    Scanner scanner = new Scanner(System.in);
    HandleGuesses handleGuesses = new HandleGuesses();
    SelectWord selectWord;
    Lives lives = new Lives();

    public void startGame() {
        System.out.println("Welcome to Hang-Man!");
        System.out.println("Select difficulty: Type 1 for Beginner, 2 for Intermediate, 3 for Advanced or 4 for Expert");
        checkLevelInput(scanner.next());
    }

    public void checkLevelInput(String level) {
        Pattern pattern = Pattern.compile("[1-4]");
        Matcher matcher = pattern.matcher(level);
        if (matcher.find()) {
            selectLevel(level);
        } else {
            System.out.println("Invalid input, please enter a number between 1 and 4");
            checkLevelInput(scanner.next());
        }
    }

    public void selectLevel(String level) {
        if (parseInt(level) == 1) {
            System.out.println("Level: Beginner");
            selectWord = new SelectWord(AvailableLevels.BEGINNER);
        } else if (parseInt(level) == 2) {
            System.out.println("Level: Intermediate");
            selectWord = new SelectWord(AvailableLevels.INTERMEDIATE);
        } else if (parseInt(level) == 3) {
            System.out.println("Level: Advanced");
            selectWord = new SelectWord(AvailableLevels.ADVANCED);
        } else {
            System.out.println("Level: Expert");
            selectWord = new SelectWord(AvailableLevels.EXPERT);
        }
        System.out.println("Here's your word: " + handleGuesses.checkGuesses(selectWord.getWord()));
        checkGuesses(selectWord.getWord());
    }

    public boolean checkGuessInput(String input) {
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(input.toUpperCase());
        if (matcher.find()) {
            return true;
        } else {
            return false;
        }
    }

    public void checkGuesses(String selectWord) {
        while (lives.getLives() > 0 && lives.getCorrectGuesses() < selectWord.length()) {
            System.out.println(Drawings.drawHangMan(lives.getLives()));
            System.out.println("Remaining lives: " + lives.getLives());
            System.out.println(handleGuesses.lettersGuessed.printLettersGuessed());
            System.out.println("Make your next guess");
            String input = scanner.next();
            if(!checkGuessInput(input)) {
                System.out.println("Invalid input, please enter a letter!");
            } else if (handleGuesses.lettersGuessed.getLettersGuessed().contains(input.toUpperCase())) {
                System.out.println("You've already tried this letter!");
            } else {
                handleGuesses.lettersGuessed.addLetters(input);
                System.out.println(handleGuesses.checkGuesses(selectWord));
                if (selectWord.contains(input)) {
                    lives.incrementCorrectGuesses();
                } else {
                    lives.reduceLives();
                }
            }
        }
        declareResult();
    }

    public void declareResult() {
        if (lives.getLives() > 0) {
            System.out.println("Correct");
            System.out.println("You win!");
        } else {
            System.out.println(Drawings.drawHangMan(lives.getLives()));
            System.out.println("You lose!");
            System.out.println("The answer was " + selectWord.getWord().toUpperCase());
        }
    }
}

