package character;

import base.HealthGenerator;
import base.PowerGenerator;

public class King extends Character {
    public King() {
        super(PowerGenerator.createPower(5, 15), HealthGenerator.createHealth(5, 15));
    }
}
