package org.example;

public class Lives {
    private int lives = 6;
    private int correctGuesses = 0;

    public int getLives() {
        return lives;
    }

    public int getCorrectGuesses() {
        return correctGuesses;
    }

    public void reduceLives() {
        lives--;
    }

    public void incrementCorrectGuesses() {
        correctGuesses++;
    }
}
