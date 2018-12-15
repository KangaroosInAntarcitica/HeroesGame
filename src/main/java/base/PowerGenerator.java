package base;

public class PowerGenerator {
    public static Power createPower(int power) {
        return new Power(power, power);
    }

    public static Power createPower(int minPower, int maxPower) {
        return new Power(minPower, maxPower);
    }
}
