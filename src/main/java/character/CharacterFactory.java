package character;

public class CharacterFactory {
    private static Class<?>[] characterClasses = {Hobbit.class, Elf.class, King.class, Knight.class};

    public static Character createCharacter() {
        int index = (int) (Math.random() * characterClasses.length);
        Class<?> characterClass = characterClasses[index];
        Character character = null;

        try {
             character = (Character) characterClass.newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
            throw new Error("WTF: Failed initiating an object. :(");
        }

        return character;
    }
}
