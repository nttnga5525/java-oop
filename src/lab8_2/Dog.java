package lab8_2;

public class Dog extends Animal {
    public Dog() {
        this.setMAX(60);
        this.setName(getClass().getSimpleName());
    }
}
