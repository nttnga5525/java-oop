package lab9;

import java.util.Arrays;
import java.util.List;

import static lab9.Animal.*;

public class TestAnimalBuilder {
    public static void main(String[] args) {
        Animal tiger = new Builder().withName("Tiger").withSpeed(100).withWings(false).build();
        Animal falcon = new Builder().withName("Falcon").withSpeed(200).withWings(true).build();
        Animal snake = new Builder().withName("Snake").withSpeed(80).withWings(false).build();
        Animal horse = new Builder().withName("Horse").withSpeed(75).withWings(false).build();
        Animal dog = new Builder().withName("dog").withSpeed(60).withWings(false).build();
        TestAnimalBuilder.getMaxSpeed(Arrays.asList(tiger, falcon, snake, horse, dog));

    }

    private static void getMaxSpeed(List<Animal> animalList) {
        lab8_2.Animal animalMaxSpeed = new lab8_2.Animal();
        for (Animal animal : animalList) {
            if (!animal.isFlyable() && animal.getSpeed() > animalMaxSpeed.getSpeed()) {
                animalMaxSpeed.setSpeed(animal.getSpeed());
                animalMaxSpeed.setName(animal.getName());
            }
        }
        System.out.println("Winner is " + animalMaxSpeed.getName()
                + ", with speed: " + animalMaxSpeed.getSpeed());
    }
}
