package lab8_2;

import java.security.SecureRandom;

public class Animal {
    private int speed;
    private String name;
    private int MAX;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return this.name;
    }

    public void setMAX(int MAX) {
        this.MAX = MAX;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speed() {
        this.speed = new SecureRandom().nextInt(MAX);
    }
}
