package org.example;

public class Drawings {
    public static String drawHangMan(int lives) {
        if (lives == 6) {
            return "";
        } else if (lives == 5) {
            return "\n   |         \n   |         \n   |        \n   |       \n   |       \n   |      \n   |  \n";
        } else if (lives == 4) {
            return "   ___________\n   |         \n   |         \n   |        \n   |       \n   |       \n   |      \n   |  \n";
        } else if (lives == 3) {
            return "   ___________\n   |         \n   |         \n   |        \n   |       \n  /|\\       \n / | \\     \n/  |  \\\n";
        } else if (lives == 2) {
            return "   ___________\n   |         |\n   |         O\n   |        \n   |       \n  /|\\       \n / | \\     \n/  |  \\\n";
        } else if (lives == 1) {
            return "   ___________\n   |         |\n   |         O\n   |        /|\\\n   |       / | \\\n  /|\\       \n / | \\     \n/  |  \\\n";
        } else {
            return "   ___________\n   |         |\n   |         O\n   |        /|\\\n   |       / | \\\n  /|\\       / \\\n / | \\     /   \\\n/  |  \\\n";
        }
    }
}
