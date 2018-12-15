package base;

public class Health {
    private int health;

    public int getValue() {
        return health;
    }

    public void setValue(int health) {
        this.health = health > 0 ? health : 0;
    }

    public void add(int value) {
        setValue(health + value);
    }

    Health(int health) {
        setValue(health);
    }

    public String toString() {
        return String.format("%d hp", health);
    }
}
