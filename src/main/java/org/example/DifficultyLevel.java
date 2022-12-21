package org.example;

public class DifficultyLevel {
    private AvailableLevels level;

    public DifficultyLevel(AvailableLevels level) {
        this.level = level;
    }

    public void setLevel(AvailableLevels level) {
        this.level = level;
    }

    public AvailableLevels getLevel() {
        return level;
    }
}
