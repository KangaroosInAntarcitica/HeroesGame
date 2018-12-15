package game;
import character.Character;

public class GameManager {
    public static void fight(Character c1, Character c2) {
        int turnCount = 0;

        System.out.println("=== Game start ===");
        printCharacters(c1, c2);

        while (!hasFinished(c1, c2)) {
            singleTurn(c1, c2, ++turnCount);
        }

        printResults(c1, c2);
    }

    private static void singleTurn(Character c1, Character c2, int turnCount) {
        int player = (int) (Math.random() * 2);
        System.out.format("=== Turn %d: Character %d starts!\n", turnCount, player + 1);

        if (player == 0) {
            c1.kick(c2);
            if (!hasFinished(c1, c2)) c2.kick(c1);
        }
        else {
            c2.kick(c1);
            if (!hasFinished(c1, c2)) c1.kick(c2);
        }

        printCharacters(c1, c2);
    }

    private static boolean hasFinished(Character c1, Character c2) {
        if (!c1.isAlive() || !c2.isAlive()) {
            return true;
        }
        if (c1.getPower().getMaxValue() == 0 && c2.getPower().getMaxValue() == 0) {
            return true;
        }
        return false;
    }

    private static void printResults(Character c1, Character c2) {
        System.out.println("=== Result ===");
        if (c2.getHealthValue() == 0) {
            System.out.println("Character 1 won!");
        }
        else if (c1.getHealthValue() == 0) {
            System.out.println("Character 2 won!");
        }
        else {
            System.out.println("The game ended peacefully!");
        }

        System.out.println("=== Stats ===");
        printCharacters(c1, c2);
    }

    private static void printCharacters(Character c1, Character c2) {
        System.out.format("Character 1: %s\nCharacter 2: %s\n", c1, c2);
    }
}
