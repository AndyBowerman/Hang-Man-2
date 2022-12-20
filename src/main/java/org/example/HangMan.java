package org.example;

/*
text file storing possible words

Classes

generate word - store word and hidden word and reveal correct guesses
guesses - store previous guesses
run game - handles souting everything

User interactions
select difficulty - easy medium hard
view word as ____
make guess
told if correct or incorrect
shown guesses made & word with correct guesses unveiled
shown hangman image
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HangMan {
    public static void main(String[] args) throws FileNotFoundException {
        SelectWord selectWord = new SelectWord();
        System.out.println(selectWord.getNumberOfWords());
    }
}