package character;

import base.HealthGenerator;
import base.PowerGenerator;

public class Hobbit extends Character {
    public Hobbit() {
        super(PowerGenerator.createPower(0), HealthGenerator.createHealth(3));
    }

    public void kick(Character other) {
        cry();
    }

    private void cry() {
        System.out.println("Sob sob :(");
    }
}
