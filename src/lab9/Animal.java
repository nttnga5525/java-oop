package lab9;

import java.security.SecureRandom;

public class Animal {
    private final String name;
    private final int speed;
    private final boolean flyable;

    protected Animal(Builder builder) {
        name = builder.name;
        speed = builder.speed;
        flyable = builder.flyable;

    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }


    public boolean isFlyable() {
        return flyable;
    }

    public static class Builder {
        private String name;
        private int speed;
        private boolean flyable;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSpeed(int MAX) {
            this.speed = new SecureRandom().nextInt(MAX);
            return this;
        }

        public Builder withWings(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }
}
