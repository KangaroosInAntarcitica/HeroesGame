import character.CharacterFactory;
import character.Character;
import game.GameManager;

public class Main {
    public static void main(String[] args) {
        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();

        GameManager.fight(c1, c2);
    }
}
