package base;



public class Power {
    private int minPower;
    private int maxPower;

    public int getValue() {
        return minPower + (int) (Math.random() * (maxPower - minPower + 1));
    }

    public int getMinValue() {
        return minPower;
    }

    public int getMaxValue() {
        return maxPower;
    }

    private void setValue(int minPower, int maxPower) {
        this.maxPower = maxPower > 0 ? maxPower : 0;
        this.minPower = minPower > 0 ? minPower : 0;
        if (this.maxPower < this.minPower)
            throw new Error(String.format("Min power %d should be less than max power %d.", minPower, maxPower));
    }

    public void add(int value) {
        this.setValue(minPower + value, maxPower + value);
    }

    Power(int minPower, int maxPower) {
        this.setValue(minPower, maxPower);
    }

    public String toString() {
        if (maxPower == minPower) return String.format("%d pow", minPower);
        return String.format("(%d-%d) pow", minPower, maxPower);
    }
}
