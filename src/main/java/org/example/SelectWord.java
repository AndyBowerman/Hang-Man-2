package org.example;

public class SelectWord {
    private String word;
    AvailableWords availableWords = new AvailableWords();

    public SelectWord(AvailableLevels level) {
        if (level.equals(AvailableLevels.BEGINNER)) {
            word = availableWords.getBeginnerWords().get((int) Math.floor(Math.random() * availableWords.getBeginnerWords().size()));
        } else if (level.equals(AvailableLevels.INTERMEDIATE)) {
            word = availableWords.getIntermediateWords().get((int) Math.floor(Math.random() * availableWords.getIntermediateWords().size()));
        } else if (level.equals(AvailableLevels.ADVANCED)) {
            word = availableWords.getAdvancedWords().get((int) Math.floor(Math.random() * availableWords.getAdvancedWords().size()));
        } else if (level.equals(AvailableLevels.EXPERT)) {
            word = availableWords.getExpertWords().get((int) Math.floor(Math.random() * availableWords.getExpertWords().size()));
        }
    }

    public String getWord() {
        return word;
    }
}
