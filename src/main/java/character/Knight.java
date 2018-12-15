package character;

import base.HealthGenerator;
import base.PowerGenerator;

public class Knight extends Character{
    public Knight() {
        super(PowerGenerator.createPower(2, 12), HealthGenerator.createHealth(2, 12));
    }
}
