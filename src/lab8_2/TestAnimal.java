package lab8_2;

import java.util.Arrays;
import java.util.List;

public class TestAnimal {
    public static void main(String[] args) {

        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dog = new Dog();

        TestAnimal.getMaxSpeed(Arrays.asList(horse, tiger, dog));

    }

    private static void getMaxSpeed(List<Animal> animalList) {
        Animal animalMaxSpeed = new Animal();
        for (Animal animal : animalList) {
            animal.speed();
            if (animal.getSpeed() > animalMaxSpeed.getSpeed()) {
                animalMaxSpeed.setSpeed(animal.getSpeed());
                animalMaxSpeed.setName(animal.getName());
            }
        }
        System.out.println("Winner is " + animalMaxSpeed.getName()
                + ", with speed: " + animalMaxSpeed.getSpeed());
    }

}
