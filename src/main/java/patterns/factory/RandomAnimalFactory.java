package patterns.factory;

import java.util.Random;

//Concrete Creator
public class RandomAnimalFactory implements AnimalFactory {

    //Factory Method
    public Animal createAnimal() {
        //logic to randomize the object
        int randomNumber = new Random().ints(1, 4).findFirst().getAsInt();
        if(randomNumber == 1) {
            return new Dog();
        } else if (randomNumber == 2) {
            return new Cat();
        }
        return new Duck();
    }
}
