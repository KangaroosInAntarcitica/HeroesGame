package base;

public class HealthGenerator {
    public static Health createHealth(int health) {
        return new Health(health);
    }

    public static Health createHealth(int minHealth, int maxHealth) {
        int health = minHealth + (int) (Math.random() * (maxHealth - minHealth + 1));
        return new Health(health);
    }
}
