package character;

import base.HealthGenerator;
import base.PowerGenerator;

public class Elf extends Character {
    public Elf() {
        super(PowerGenerator.createPower(10), HealthGenerator.createHealth(10));
    }

    public void kick(Character other) {
        if (other.getPowerValue() < getPowerValue()) {
            other.getHealth().setValue(0);
        } else {
            other.getPower().add(-1);
        }
    }
}
