package character;

import base.Health;
import base.Power;

public abstract class Character {
    protected Power power;
    protected Health health;

    protected Character(Power power, Health health) {
        this.power = power;
        this.health = health;
    }

    public Power getPower() { return power; }
    public Health getHealth() { return health; }
    public int getPowerValue() { return power.getValue(); }
    public int getHealthValue() { return health.getValue(); }

    public boolean isAlive() {
        return health.getValue() > 0;
    }

    public void kick(Character other) {
        other.getHealth().add(-getPowerValue());
    }

    public String toString() {
        return String.format("%s, %s, %s, %s",
                this.getClass().getSimpleName(),
                isAlive() ? "alive" : "dead",
                getPower(),
                getHealth());
    }
}
